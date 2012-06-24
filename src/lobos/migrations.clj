(ns lobos.migrations
  (:refer-clojure :exclude [alter drop
                            bigint boolean char double float time])
  (:use (lobos [migration :only [defmigration]] core schema
               config)))

(defn datetime-tracked [table]
  (-> table
      (timestamp :updated-on)
      (timestamp :created-on (default (now)))))

(defmigration add-users-table
  (up [] (create
          (table :users
                 (integer :id :auto-inc :primary-key)
                 (varchar :name         50 :not-null)
                 (datetime-tracked))))
  (down [] (drop (table :users))))

