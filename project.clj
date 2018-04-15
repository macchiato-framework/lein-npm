(defproject macchiato/lein-npm "0.6.6"
  :description "Manage npm dependencies for CLJS projects"
  :url "https://github.com/macchiato-framework/lein-npm"
  :license {:name "Apache License, version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[cheshire "5.8.0"]
                 [org.clojure/clojure "1.9.0" :scope "provided"]]
  :profiles {:test {:dependencies [[fixturex "0.3.2"]]}}
  :eval-in-leiningen true)
