(ns clj-boilerplate.db
  (:require [clojure.string :as str]
            [clj-boilerplate.env :as env])
  (:use korma.db)
  (:import java.net.URI))


(defn db-spec
  "Generate the db map according to the db URI scheme."
  [db-url]
  (when db-url
    (let [url (URI. db-url)
          host (.getHost url)
          port (if (pos? (.getPort url)) (.getPort url) 5432)
          path (.getPath url)]
      (merge
       {:subname (str "//" host ":" port path)}
       (when-let [user-info (.getUserInfo url)]
         {:user (first (str/split user-info #":"))
          :password (second (str/split user-info #":"))})))))



(defdb clj-boilerplate-db (postgres
                           (db-spec (:database-url env/config))))




