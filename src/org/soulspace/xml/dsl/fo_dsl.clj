;;
;;   Copyright (c) Ludger Solbach. All rights reserved.
;;   The use and distribution terms for this software are covered by the
;;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;;   which can be found in the file license.txt at the root of this distribution.
;;   By using this software in any fashion, you are agreeing to be bound by
;;   the terms of this license.
;;   You must not remove this notice, or any other, from this software.
;;

(ns org.soulspace.xml.dsl.fo-dsl
  (:refer-clojure :exclude [float])
  (:require [org.soulspace.xml.dsl.builder :as dsl]))

(dsl/deftags "fo"
  ["basic-link" "block" "block-container" "character" "color-profile"
   "conditional-page-master-reference"
   "declarations" "external-graphic" "float" "flow" "inline"
   "instream-foreign-object" "layout-master-set" "leader" "list-block"
   "list-item" "list-item-body" "list-item-label" "marker" "page-number"
   "page-number-citation" "page-sequence" "page-sequence-master"
   "page-sequences" "region-after" "region-before" "region-body"
   "region-end" "region-start" "repeatable-page-master-alternatives"
   "repeatable-page-master-reference" "retrieve-marker"
   "simple-page-master" "single-page-master-reference" "static-content"
   "table" "table-and-caption" "table-body" "table-cell" "table-column"
   "table-footer" "table-header" "table-row" "title" "wrapper"])

(dsl/defroottags "fo" "http://www.w3.org/1999/XSL/Format" ["root"])

; Example
(comment
  (clojure.data.xml/emit-str (fo {})))
