(defproject clj-boilerplate/clj-boilerplate "1.0.0-SNAPSHOT" 
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [korma "0.3.0-beta11"]
                 [postgresql "9.1-901.jdbc4"]
                 [org.clojars.leonardoborges/lobos "1.0.3-SNAPSHOT"]                 
                 [compojure "1.1.0"]
                 [com.stuartsierra/lazytest "1.2.3"]
                 [org.clojure/tools.nrepl "0.2.0-beta9"]]
  :ring {:handler clj-boilerplate.core/app}
  :profiles {:dev
             {:dependencies [[midje "1.4.0"] [ring-mock "0.1.2"]]
              :plugins [[lein-midje "2.0.0-SNAPSHOT"]]}}
  :repositories {"stuart" "http://stuartsierra.com/maven2"}
  :min-lein-version "2.0.0"
  :plugins [[lein-ring "0.7.1"]]
  :description "A starting point for clojure [web] applications.")