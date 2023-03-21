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

(ns org.soulspace.xml.dsl.xsl-dsl
  (:refer-clojure :exclude [comment import key sort when])
  (:require [org.soulspace.xml.dsl.builder :as dsl]))

; TODO XSL-1.0, check xsl elements here
(dsl/deftags "xsl"
  ["apply-imports" "apply-templates" "attribute" "attribute-set" "call-template"
   "choose" "comment" "copy" "copy-of" "decimal-format" "element" "fallback"
   "for-each" "if" "import" "include" "key" "message" "namespace-alias" "number"
   "otherwise" "output" "param" "preserve-space" "processing-instruction" "sort"
   "strip-space" "template" "text" "transform" "value-of" "variable" "when"
   "with-param"])

(dsl/defroottags "xsl" "http://www.w3.org/1999/XSL/Transform" ["stylesheet"])
