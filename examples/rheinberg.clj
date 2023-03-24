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

(ns rheinberg
  "Create Rheinberg and darkfield filters for microscopy."
  (:require [org.soulspace.xml.dsl.svg-dsl :as svg]
            [clojure.data.xml :as xml]))

(defn dual-filter
  "Generates a filter with an inner and an outer circle."
  [center-x center-y r-inner r-outer col-inner col-outer]
  (svg/circle {:cx center-x :cy center-y :r r-outer
               :style (str "stroke:black; fill:" col-outer)})
  (svg/circle {:cx center-x :cy center-y :r r-inner
               :style (str "stroke:black; fill:" col-inner)})
  )

(defn triple-filter
  "Generates a filter with inner, middle and an outer rings."
  [center-x center-y r-inner r-middle r-outer col-inner col-middle col-outer]
  (svg/circle {:cx center-x :cy center-y :r r-outer
               :style (str "stroke:black; fill:" col-outer)})
  (svg/circle {:cx center-x :cy center-y :r r-middle
               :style (str "stroke:black; fill:" col-middle)})
  (svg/circle {:cx center-x :cy center-y :r r-inner
               :style (str "stroke:black; fill:" col-inner)}))

; TODO segmented filter


(defn darkfield-filter
  "Generates a darkfield filter with a center patch of the given inner and outer radius."
  [center-x center-y r-inner r-outer]
  (dual-filter center-x center-y r-inner r-outer "black" "none"))

(defn svg-rheinberg
  []
  (svg/svg
   {:width "2100" :height "2970"}
   (svg/circle {:cx "200" :cy "200" :r "160" :style "stroke:black; fill:none"})))

(defn svg-str [f]
  (println (xml/emit-str (f))))
