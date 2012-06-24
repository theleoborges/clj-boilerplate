(ns clj-boilerplate.users
  (:use [korma.core]
        [clj-boilerplate.db]))


(defentity users
  (entity-fields :id
                 :name
                 :updated-on
                 :created-on)
  (database clj-boilerplate.db/clj-boilerplate-db))