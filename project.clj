;;; this file only exists to allow me using Cursive to edit the code
;;; it is not required for any of the examples
(defproject lavsurgut/lavblog "0.0.0"
  :description "My pesonal website"
  :url "https://github.com/lavsurgut/lavblog"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies
  [[org.clojure/clojure "1.10.1"]
   [thheller/shadow-cljs "2.8.39"]
   [re-frame "0.10.6"]
   [day8.re-frame/tracing "0.5.1"]
   [day8.re-frame/re-frame-10x "0.4.0"]
   [binaryage/devtools "0.9.10"]
   [cider/cider-nrepl "0.16.0"]
   [secretary "1.2.3"]
   [venantius/accountant "0.2.3"]]

  :source-paths
  ["src/dev" "src/main" "src/test"])
