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

(ns org.soulspace.xml.dsl.xhtml5-dsl
  (:refer-clojure :exclude [map meta time])
  (:require [org.soulspace.xml.dsl.builder :as dsl]))

; HTML5 according to Candidate Recommendation: http://www.w3.org/TR/html5/
(dsl/deftags "xhtml5"
  ["a" "abbr" "address" "area" "article" "aside" "audio" "b" "base" "bdi"
   "bdo" "blockquote" "body" "br" "button" "canvas" "caption" "cite" "code"
   "col" "colgroup" "command" "data" "datalist" "dd" "del" "details" "dfn"
   "dialog" "div" "dl" "dt" "em" "embed" "fieldset" "figcaption" "figure"
   "footer" "form" "h1" "h2" "h3" "h4" "h5" "h6" "head" "header" "hgroup"
   "hr" "i" "iframe" "img" "input" "ins" "kbd" "keygen" "label" "legend"
   "li" "link" "map" "mark" "menu" "meta" "meter" "nav" "noscript" "object"
   "ol" "optgroup" "option" "output" "p" "param" "pre" "progress" "q" "rp"
   "rt" "ruby" "s" "samp" "script" "section" "select" "small" "source" "span"
   "strong" "style" "sub" "summary" "sup" "table" "tbody" "td" "textarea"
   "tfoot" "th" "thead" "time" "title" "tr" "track" "u" "ul" "var" "video"
   "wbr"])

(dsl/defroottags "xhtml5" "http://www.w3.org/1999/xhtml" ["html"])

; Example
(comment
  ;(clojure.data.xml/emit-str (html {} (body {} (h1 {} "Hello World"))))
  )
