(ns clj-boilerplate.env)

(def config
  (let [env (or (System/getenv "ENVIRONMENT") "development")]
    ((keyword env)
     {:development
      {
       :database-url "postgres://lborges:@localhost/clj-boilerplate"
       }
      :test
      {
       :database-url "postgres://lborges:@localhost/clj-boilerplate-test"
       }
      :production
      {
       :database-url (System/getenv "DATABASE_URL")
       }
      })))