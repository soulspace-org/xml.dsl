;;;;
;;;;   Copyright (c) Ludger Solbach. All rights reserved.
;;;;
;;;;   The use and distribution terms for this software are covered by the
;;;;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;;;;   which can be found in the file license.txt at the root of this distribution.
;;;;   By using this software in any fashion, you are agreeing to be bound by
;;;;   the terms of this license.
;;;;
;;;;   You must not remove this notice, or any other, from this software.
;;;;

(ns org.soulspace.xml.dsl.builder
  "Contains macros to build a DSL for a XML dialact."
  (:require [clojure.data.xml :as xml]
            [clojure.string :as str]
            [org.soulspace.clj.string :as sstr]))

(defn- fn-name [tag]
  "Converts the 'tag' to a valid function name"
  (sstr/to-kebab-case tag))

; TODO use optional named argument for attr map
(defmacro deftag
  "Defines a function for the given tag that generates the xml representation."
  ([tag]
   (let [xml-fn-name (symbol (fn-name tag))
         docstring (str "Generates a " tag " element with the attributes given as map (required) and other given forms as content.")]
     `(defn ~xml-fn-name 
        {:doc ~docstring}
        [& [attrs# & content#]]
        (xml/element (keyword ~tag)
                 (or attrs# {})
                 (remove #(or (nil? %) (empty? %)) content#)))))
  ([ns-prefix tag & [attrs]]
   (let [xml-fn-name (symbol (fn-name tag))
         docstring (str "Generates a " tag " element with the attributes given as map (required) and the given content.")]
     `(defn ~xml-fn-name
        {:doc ~docstring}
        [& [attrs# & content#]]
        (xml/element (keyword (str ~ns-prefix ":" ~tag))
                 (merge (or ~attrs {}) (or attrs# {}))
                 (remove #(or (nil? %) (empty? %)) content#))))))

(defmacro deftags
  "Defines functions for the given 'tags' that generate the XML representation per tag.
  Optionally takes a namespace prefix as 'ns-prefix', which is prepended to the generated tags."
  ([tags]
   `(do ~@(map (fn [tag] `(deftag ~tag)) tags)))
  ([ns-prefix tags]
   `(do ~@(map (fn [tag] `(deftag ~ns-prefix ~tag)) tags))))

(defmacro defroottags
  "Defines functions for the given 'root-tags' that generate the XML representations per tag.
  The macro needs a namespace prefix as 'ns-prefix' and a namespace URI as 'ns-uri'
  to generate a namespace declaration for a root tag. If no namespace declaration is wanted,
  just add the root tag to the collection passed todeftags."
  [ns-prefix ns-uri root-tags]
  `(do ~@(map (fn [tag] `(deftag ~ns-prefix ~tag {(keyword (str "xmlns:" ~ns-prefix)) ~ns-uri})) root-tags)))
