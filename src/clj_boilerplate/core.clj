(ns clj-boilerplate.core
  (:use compojure.core)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]))

(defroutes main-routes
  (GET "/" [] "All good. Start hacking")  
  (route/resources "/")
  (route/not-found "Not found"))

(def app
  (handler/site main-routes))



