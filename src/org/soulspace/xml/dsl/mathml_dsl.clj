;;
;;   Copyright (c) Ludger Solbach. All rights reserved.
;;   The use and distribution terms for this software are covered by the
;;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;;   which can be found in the file license.txt at the root of this distribution.
;;   By using this software in any fashion, you are agreeing to be bound by
;;   the terms of this license.
;;   You must not remove this notice, or any other, from this software.
;;

(ns org.soulspace.xml.dsl.mathml-dsl
  (:refer-clojure :exclude [and apply declare fn int list max min not or rem set vector])
  (:require [org.soulspace.xml.dsl.builder :as dsl]))

; MathMl 3.0
(dsl/deftags "mathml"
  ["abs" "and" "annotation" "annotation-xml" "apply" "approx" "arccos" "arccosh"
   "arccot" "arccoth" "arccsc" "arccsch" "arcsec" "arcsech" "arcsin" "arcsinh"
   "arctan" "arctanh" "arg" "bind" "bvar" "card" "cartesianproduct" "cbytes"
   "ceiling" "cerror" "ci" "cn" "codomain" "complexes" "compose" "condition"
   "conjugate" "cos" "cosh" "cot" "coth" "cs" "csc" "csch" "csymbol" "curl"
   "declare" "degree" "determinant" "diff" "divergence" "divide" "domain"
   "domainofapplication" "el" "emptyset" "eq" "equivalent" "eulergamma"
   "exists" "exp" "exponentiale" "factorial" "factorof" "false" "floor" "fn"
   "forall" "gcd" "geq" "grad" "gt" "ident" "image" "imaginary" "imaginaryi"
   "implies" "in" "infinity" "int" "integers" "intersect" "interval" "inverse"
   "lambda" "laplacian" "lcm" "leq" "limit" "list" "ln" "log" "logbase"
   "lowlimit" "lt" "maction" "malign" "maligngroup" "malignmark" "malignscope"
   "matrix" "matrixrow" "max" "mean" "median" "menclose" "merror"
   "mfenced" "mfrac" "mfraction" "mglyph" "mi" "min" "minus" "mlabeledtr"
   "mlongdiv" "mmultiscripts" "mn" "mo" "mode" "moment" "momentabout" "mover"
   "mpadded" "mphantom" "mprescripts" "mroot" "mrow" "ms" "mscarries" "mscarry"
   "msgroup" "msline" "mspace" "msqrt" "msrow" "mstack" "mstyle" "msub"
   "msubsup" "msup" "mtable" "mtd" "mtext" "mtr" "munder" "munderover"
   "naturalnumbers" "neq" "none" "not" "notanumber" "note" "notin" "notprsubset"
   "notsubset" "or" "otherwise" "outerproduct" "partialdiff" "pi" "piece"
   "piecewise" "plus" "power" "primes" "product" "prsubset" "quotient"
   "rationals" "real" "reals" "reln" "rem" "root" "scalarproduct" "sdev" "sec"
   "sech" "selector" "semantics" "sep" "set" "setdiff" "share" "sin" "sinh"
   "subset" "sum" "tan" "tanh" "tendsto" "times" "transpose" "true" "union"
   "uplimit" "variance" "vector" "vectorproduct" "xor"])

(dsl/defroottags "mathml" "http://www.w3.org/1998/Math/MathML" ["math"])
