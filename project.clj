(defproject ring-undertow-adapter "0.2.3"
  :description "Ring Underow adapter."
  :url "http://github.com/piranha/ring-adapter-undertow"
  :license {:name "ISC License"
            :url "http://opensource.org/licenses/ISC"}
  :dependencies [[io.undertow/undertow-core "1.3.20.Final"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.8.0"]
                                  [clj-http "2.1.0"]]}})
