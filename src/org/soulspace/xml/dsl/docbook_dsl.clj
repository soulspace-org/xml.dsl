;;
;;   Copyright (c) Ludger Solbach. All rights reserved.
;;   The use and distribution terms for this software are covered by the
;;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;;   which can be found in the file license.txt at the root of this distribution.
;;   By using this software in any fashion, you are agreeing to be bound by
;;   the terms of this license.
;;   You must not remove this notice, or any other, from this software.
;;

(ns org.soulspace.xml.dsl.docbook-dsl
  (:refer-clojure :exclude [keyword set symbol type])
  (:require [org.soulspace.xml.dsl.builder :as dsl]))

; Docbook 5
(dsl/deftags "db"
  ["abbrev" "abstract" "accel" "acknowledgements" "acronym" "address"
   "affiliation" "alt" "anchor" "annotation" "answer" "appendix" "application"
   "arc" "area" "areaset" "areaspec" "arg" "article" "articleinfo" "artpagenums"
   "attribution" "audiodata" "audioobject" "author" "authorgroup" "authorinitials"
   "bibliocoverage" "bibliodiv" "biblioentry" "bibliography" "biblioid"
   "bibliolist" "bibliomisc" "bibliomixed" "bibliomset" "biblioref"
   "bibliorelation" "biblioset" "bibliosource" "blockquote" "book" "bridgehead"
   "callout" "calloutlist" "caption" "caution" "chapter" "citation"
   "citebiblioid" "citerefentry" "citetitle" "city" "classname" "classsynopsis"
   "classsynopsisinfo" "cmdsynopsis" "co" "code" "col" "colgroup" "collab"
   "colophon" "colspec" "command" "computeroutput" "confdates" "confgroup"
   "confnum" "confsponsor" "conftitle" "constant" "constraint" "constraintdef"
   "constructorsynopsis" "contractnum" "contractsponsor" "contrib" "copyright"
   "coref" "country" "cover" "database" "date" "dedication" "destructorsynopsis"
   "edition" "editor" "email" "emphasis" "entry" "entrytbl" "envar" "epigraph"
   "equation" "errorcode" "errorname" "errortext" "errortype" "example"
   "exceptionname" "extendedlink" "fax" "fieldsynopsis" "figure" "filename"
   "firstname" "firstterm" "footnote" "footnoteref" "foreignphrase" "formalpara"
   "funcdef" "funcparams" "funcprototype" "funcsynopsis" "funcsynopsisinfo"
   "function" "glossary" "glossdef" "glossdiv" "glossentry" "glosslist"
   "glosssee" "glossseealso" "glossterm" "group" "guibutton" "guiicon"
   "guilabel" "guimenu" "guimenuitem" "guisubmenu" "hardware" "holder"
   "honorific" "imagedata" "imageobject" "imageobjectco" "important" "index"
   "indexdiv" "indexentry" "indexterm" "info" "informalequation"
   "informalexample" "informalfigure" "informaltable" "initializer"
   "inlineequation" "inlinemediaobject" "interfacename" "issuenum"
   "itemizedlist" "itermset" "jobtitle" "keycap" "keycode" "keycombo" "keysym"
   "keyword" "keywordset" "label" "legalnotice" "lhs" "lineage" "lineannotation"
   "link" "listitem" "literal" "literallayout" "locator" "manvolnum" "markup"
   "mathphrase" "mediaobject" "member" "menuchoice" "methodname" "methodparam"
   "methodsynopsis" "modifier" "mousebutton" "msg" "msgaud" "msgentry"
   "msgexplan" "msginfo" "msglevel" "msgmain" "msgorig" "msgrel" "msgset"
   "msgsub" "msgtext" "nonterminal" "note" "olink" "ooclass" "ooexception"
   "oointerface" "option" "optional" "orderedlist" "org" "orgdiv" "orgname"
   "otheraddr" "othercredit" "othername" "package" "pagenums" "para" "paramdef"
   "parameter" "part" "partintro" "person" "personblurb" "personname" "phone"
   "phrase" "pob" "postcode" "preface" "primary" "primaryie" "printhistory"
   "procedure" "production" "productionrecap" "productionset" "productname"
   "productnumber" "programlisting" "programlistingco" "prompt" "property"
   "pubdate" "publisher" "publishername" "qandadiv" "qandaentry" "qandaset"
   "question" "quote" "refclass" "refdescriptor" "refentry" "refentrytitle"
   "reference" "refmeta" "refmiscinfo" "refname" "refnamediv" "refpurpose"
   "refsect1" "refsect2" "refsect3" "refsection" "refsynopsisdiv" "releaseinfo"
   "remark" "replaceable" "returnvalue" "revdescription" "revhistory" "revision"
   "revnumber" "revremark" "rhs" "row" "sbr" "screen" "screenco" "screenshot"
   "secondary" "secondaryie" "sect1" "sect2" "sect3" "sect4" "sect5" "section"
   "see" "seealso" "seealsoie" "seeie" "seg" "seglistitem" "segmentedlist"
   "segtitle" "seriesvolnums" "set" "setindex" "shortaffil" "shortcut" "sidebar"
   "simpara" "simplelist" "simplemsgentry" "simplesect" "spanspec" "state"
   "step" "stepalternatives" "street" "subject" "subjectset" "subjectterm"
   "subscript" "substeps" "subtitle" "superscript" "surname" "symbol"
   "synopfragment" "synopfragmentref" "synopsis" "systemitem" "table" "tag"
   "task" "taskprerequisites" "taskrelated" "tasksummary" "tbody" "td" "term"
   "termdef" "tertiary" "tertiaryie" "textdata" "textobject" "tfoot" "tgroup"
   "th" "thead" "tip" "title" "titleabbrev" "toc" "tocdiv" "tocentry" "token"
   "tr" "trademark" "type" "uri" "userinput" "varargs" "variablelist"
   "varlistentry" "varname" "videodata" "videoobject" "void" "volumenum"
   "warning" "wordasword" "xref" "year"])

; TODO add other root tags, if any
(dsl/defroottags "db" "http://docbook.org/ns/docbook" ["article" "book" "set"])

; Example
(comment
  (clojure.data.xml/emit-str (article {} (articleinfo {} (authorinitials {} "lso")))))
