xml.dsl
=======
The xml.dsl library contains a DSL builder for XML and DSLs for common some XML Dialects.

The DSLs make it easy to programmatically create XML using all the functions and control structures of Clojure.

Included are DSLs for the following dialects:
* BPMN
* Docbook
* XSL-FO
* MathML
* RDF
* SVG
* XHTML
* XSD
* XSL

[![Clojars Project](https://img.shields.io/clojars/v/org.soulspace.clj/xml.dsl.svg)](https://clojars.org/org.soulspace.clj/xml.dsl)

Usage
-----
Leiningen dependency

```
[org.soulspace.clj/xml.dsl "0.5.2]
```

Here is an example for the usage of the SVG DSL:

```
(ns svg-example
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
  (println (xml/svgemit-str (f))))

; (svg-str svg-circles)
; (svg-str svg-image)

```

Emmiting the svg-circles function will create the following SVG document:

```
<?xml version="1.0" encoding="UTF-8"?>
<svg:svg xmlns:svg="http://www.w3.org/2000/svg" width="400" height="400">
  <svg:circle r="100" cx="200" cy="200" style="stroke:black; stroke-width:5; fill:none"></svg:circle>
  <svg:circle r="50" cx="100" cy="100" style="stroke:black; fill:green"></svg:circle>
</svg:svg>
```

The provided DSLs for the other XML dialects can be used in a similar fashion.

Feel free to contribute further DSLs via pull requests.

Copyright
---------
© 2011-2020 Ludger Solbach

License
-------
[Eclipse Public License 1.0](http://www.eclipse.org/legal/epl-v10.html)

Code Repository
---------------
[CljXML on GitHub](https://github.com/soulspace-org/xml.dsl)
