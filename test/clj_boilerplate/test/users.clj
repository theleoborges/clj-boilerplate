(ns clj-boilerplate.test.users
  (:require [korma.core :as korma])
  (:use clj-boilerplate.users)
  (:use midje.sweet)
  (:use lobos.core lobos.connectivity lobos.migration lobos.migrations))

(use 'clj-boilerplate.users :reload)

(background 
 (before :facts (migrate)
         :after (rollback :all)))

(fact "Inserts a user and makes sure it has been correctly inserted"
      (korma/insert users
              (korma/values {:name "Jame"}))
      (-> (korma/select users) first :name) => "Jame")




