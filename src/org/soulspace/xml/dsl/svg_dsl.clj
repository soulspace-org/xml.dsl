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

(ns org.soulspace.xml.dsl.svg-dsl
  (:refer-clojure :exclude [filter set symbol use])
  (:require [org.soulspace.xml.dsl.builder :as dsl]))

(dsl/deftags "svg" 
  ["a" "altGlyph" "altGlyphDef" "altGlyphItem" "animate" "animateColor" "animateMotion"
   "animateTransform" "circle" "clipPath" "color-profile" "cursor" "defs" "desc" "ellipse"
   "feBlend" "feColorMatrix" "feComponentTransfer" "feComposite" "feConvolveMatrix"
   "feDiffuseLighting" "feDisplacementMap" "feDistantLight" "feFlood" "feFuncA" "feFuncB"
   "feFuncG" "feFuncR" "feGaussianBlur" "feImage" "feMerge" "feMergeNode" "feMorphology"
   "feOffset" "fePointLight" "feSpecularLighting" "feSpotLight" "feTile" "feTurbulence"
   "filter" "font" "font-face" "font-face-format" "font-face-name" "font-face-src"
   "font-face-uri" "foreignObject" "g" "glyph" "glyphRef" "hkern" "image" "line"
   "linearGradient" "marker" "mask" "metadata" "missing-glyph" "mpath" "path" "pattern"
   "polygon" "polyline" "radialGradient" "rect" "script" "set" "stop" "style"
   "switch" "symbol" "text" "textPath" "title" "tref" "tspan" "use" "view" "vkern"])

(dsl/defroottags "svg" "http://www.w3.org/2000/svg" ["svg"])
