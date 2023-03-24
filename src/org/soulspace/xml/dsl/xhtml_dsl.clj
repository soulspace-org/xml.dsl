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

(ns org.soulspace.xml.dsl.xhtml-dsl
  (:refer-clojure :exclude [map meta])
  (:require [org.soulspace.xml.dsl.builder :as dsl]))

(dsl/deftags "xhtml"
  ["a" "abbr" "acronym" "address" "area" "b" "base" "bdo" "big" "blockquote" "body" "br" "button" "caption"
   "cite" "code" "col" "colgroup" "dd" "del" "dfn" "div" "dl" "dt" "em" "fieldset" "form" "frame" "frameset"
   "h1" "h2" "h3" "h4" "h5" "h6" "head" "hr" "i" "iframe" "img" "input" "ins" "insert" "kbd" "label" "legend" "li"
   "link" "map" "meta" "noframes" "noscript" "object" "ol" "optgroup" "option" "p" "param" "pre" "q" "samp"
   "script" "select" "small" "span" "strong" "style" "sub" "sup" "table" "tbody" "td" "textarea" "tfoot" "th" "thead"
   "title" "tr" "tt" "u" "ul" "var"])

(dsl/defroottags "xhtml" "http://www.w3.org/1999/xhtml" ["html"])

; Example
(comment
  (clojure.data.xml/emit-str (html {} (body {} (h1 {} "Hello World"))))
  )
