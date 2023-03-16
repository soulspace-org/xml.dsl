;;
;;   Copyright (c) Ludger Solbach. All rights reserved.
;;   The use and distribution terms for this software are covered by the
;;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;;   which can be found in the file license.txt at the root of this distribution.
;;   By using this software in any fashion, you are agreeing to be bound by
;;   the terms of this license.
;;   You must not remove this notice, or any other, from this software.
;;

(ns org.soulspace.xml.dsl.xsd-dsl
  (:refer-clojure :exclude [import key list sequence])
  (:require [org.soulspace.xml.dsl.builder :as dsl]))

(def schema-types 
  ["anyURI" "base64Binary" "boolean" "byte" "date" "dateTime" "decimal"
   "double" "duration" "ENTITY" "ENTITIES" "float" "gDay" "gMonth" "gMonthDay"
   "gYear" "gYearMonth" "hexBinary" "ID" "IDREF" "IDREFS" "int" "integer"
   "language" "long" "Name" "NCName" "NMTOKEN" "NMTOKENS" "NOTATION"
   "negativeInteger" "nonNegativeInteger" "nonPositiveInteger"
   "normalizedString" "positiveInteger" "QName" "short" "string" "time"
   "token" "unsignedByte" "unsignedShort" "unsignedInt" "unsignedLong"])

(dsl/deftags "xs"
  ["all" "annotation" "any" "anyAttribute" "appinfo" "attribute"
   "attributeGroup" "choice" "complexContent" "complexType" "documentation"
   "element" "enumeration" "extension" "field" "group" "import" "include"
   "key" "keyref" "length" "list" "maxInclusive" "minInclusive" "maxLength"
   "minLength" "pattern" "redefine" "restriction" "selector"
   "sequence" "simpleContent" "simpleType" "union" "unique"])

(dsl/defroottags "xs" "http://www.w3.org/2001/XMLSchema" ["schema"])
