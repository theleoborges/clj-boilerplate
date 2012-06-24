(ns clj-boilerplate.test.core
  (:use [clj-boilerplate.core])
  (:use midje.sweet
        ring.mock.request))
;;lobos.core lobos.connectivity lobos.migration lobos.migrations


(fact "Root route is successful"
      (:status (clj-boilerplate.core/app
                (request :get "/"))) => 200)

