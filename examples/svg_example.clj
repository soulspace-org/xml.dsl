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

(ns svg-example
  "Example for using the SVG DSL"
  (:require [org.soulspace.xml.dsl.svg-dsl :as svg]
            [clojure.data.xml :as xml]))

(defn svg-circles
  []
  (svg/svg
    {:width "400" :height "400"}
    (svg/circle {:r "100" :cx "200" :cy "200" :style "stroke:black; stroke-width:5; fill:none"})
    (svg/circle {:r "50" :cx "100" :cy "100" :style "stroke:black; fill:green"})))

(defn svg-image
  []
  (svg/svg
    {:width "300" :height "200"}
    (svg/filter
      {:id "filtereffect1"}
      (svg/fe-gaussian-blur {:in "SourceAlpha" :stdDeviation "4" :result "img1"})
      (svg/fe-offset {:in "img1" :dx "3" :dy "3" :result "img2"})
      (svg/fe-specular-lighting {:in "img1" :surfaceScale "4" :specularExponent "10" :result "img3"}
                              (svg/fe-point-light {:x "-100" :y "-100" :z "100"}))
      (svg/fe-composite {:in "SourceGraphic" :in2 "img3" :operator "arithmetic" :k1 "0" :k2 "1" :k3 "1" :k4 "0" :result "img4"})
      (svg/fe-merge {}
                   (svg/fe-merge-node {:in "img2"})
                   (svg/fe-merge-node {:in "img4"})))
    (svg/g {:style "filter: url(#filtereffect1)"}
           (svg/circle {:r "80" :cx "120" :cy "90" :style "fill: gray"})
           (svg/circle {:r "10" :cx "20" :cy "90" :style "fill: gray"})
           (svg/circle {:r "10" :cx "220" :cy "90" :style "fill: gray"})
           (svg/text {:x "65" :y "75" :style "fill: white; stroke: black; font-family: sans-serif; font-size: 25; font-weight: bold"} "Scalable")
           (svg/text {:x "75" :y "100" :style "fill: white; stroke: black; font-family: sans-serif; font-size: 25; font-weight: bold"} "Vector")
           (svg/text {:x "60" :y "125" :style "fill: white; stroke: black; font-family: sans-serif; font-size: 25; font-weight: bold"} "Graphics"))))

(defn svg-str [f]
  (println (xml/emit-str (f))))

; (svg-str svg-circles)
; (svg-str svg-image)
