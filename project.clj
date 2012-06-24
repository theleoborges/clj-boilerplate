(defproject clj-boilerplate "1.0.0-SNAPSHOT"
  :description "A starting point for clojure [web] applications."
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [korma "0.3.0-beta7"]
                 [postgresql "9.0-801.jdbc4"]
                 [lobos "1.0.0-SNAPSHOT"]
                 [compojure "1.1.0"]
                 [com.stuartsierra/lazytest "1.2.3"]]
  :dev-dependencies [[midje "1.4.0"]
                     [ring-mock "0.1.2"]]
  :plugins [[lein-ring "0.7.1"]]
  :ring {:handler clj-boilerplate.core/app}
  :repositories {"stuart" "http://stuartsierra.com/maven2"})