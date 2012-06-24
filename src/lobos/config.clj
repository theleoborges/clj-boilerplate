(ns lobos.config
  (:require [clj-boilerplate.env :as env])
  (:use lobos.connectivity
        clj-boilerplate.db))


(def db-for-lobos
  (merge
   {:classname "org.postgresql.Driver"
    :subprotocol "postgresql"}
   (db-spec (:database-url env/config))))

(open-global db-for-lobos)