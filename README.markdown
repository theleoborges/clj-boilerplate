## clj-boilerplate

**clj-boilerplate** is a clojure application skeleton that's been helping me bootstrap my personal projects. It's opinionated in it's framework choices but if you think the same way I do, this should provide you with a great head start.

Here's what's included:

* [compojure](https://github.com/weavejester/compojure/) - A concise routing DSL for Ring/Clojure
* [midje](https://github.com/marick/Midje/) - My favourite clojure testing framework
* [korma](http://sqlkorma.com/) - A SQL DSL for Clojure
* [lobos](http://budu.github.com/lobos/) - Database migrations. If you're familiar with Rails migrations, this will ring a bell
* [ring-mock](https://github.com/weavejester/ring-mock) - Create ring request mocks for your unit tests
* [lazytest](https://github.com/stuartsierra/lazytest) - Watches your test files and reloads the ones you touch


### Before starting

The app understands different environments out of the box. By default it assumes it's running in `development` mode - look at the `env.clj` file. All your environment specific configuration should probably go in there.


This means every lein command such as `lein repl`, `lein ring server` etc need to know which environment they're supposed to run under - or they will default to `development`. That's simple enough though. So if you want to, say, run your tests against the `test` environment, just provide the `ENVIRONMENT` env variable:


`ENVIRONMENT=test lein midje`


You will also need at least two databases `clj-boilerplate` and `clj-boilerplate-test`, corresponding respectively to a `development` and a `test` database. `production` will by default read it's configuration from the `DATABASE_URL` environment variable. The app ships with the postgresql driver but it should be easy to change it to any database supported by both `korma` and `lobos`.


Make sure you have the `lein-midje` plugin installed in order to run your facts and get a better/prettier output:


`lein plugin install lein-midje 1.0.9`


## License

Copyright (C) 2012 Leonardo Borges

Distributed under the Eclipse Public License, the same as Clojure.
