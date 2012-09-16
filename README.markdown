## clj-boilerplate

### Please note

The master branch is **lein 2.x compatible only**. If you're after the older version of this project, check out the `lein1.x` branch.
* * * 


**clj-boilerplate** is a clojure application skeleton that's been helping me bootstrap my personal projects. It's opinionated in it's framework choices but if you think the same way I do, this should provide you with a great head start.

Here's what's included:

* [compojure](https://github.com/weavejester/compojure/) - A concise routing DSL for Ring/Clojure
* [midje](https://github.com/marick/Midje/) - My favourite clojure testing framework
* [korma](http://sqlkorma.com/) - A SQL DSL for Clojure
* [lobos](http://budu.github.com/lobos/) - Database migrations. If you're familiar with Rails migrations, this will ring a bell
* [ring-mock](https://github.com/weavejester/ring-mock) - Create ring request mocks for your unit tests
* [lazytest](https://github.com/stuartsierra/lazytest) - Watches your test files and reloads the ones you touch


### Getting Started

We're using [leiningen](https://github.com/technomancy/leiningen/) for project management so the first thing you will want to do is download all the dependencies:


`lein deps`


You will also need at least two databases `clj-boilerplate` and `clj-boilerplate-test`, corresponding respectively to a `development` and a `test` database. `production` will by default read it's configuration from the `DATABASE_URL` environment variable. The app ships with the **postgresql** driver but it should be easy to change it to any database supported by both `korma` and `lobos`.


Then start the web server:


`lein ring server`


You should be ready to go.


### More

The app understands different environments out of the box. By default it assumes it's running in `development` mode - look at the `env.clj` file. All your environment specific configuration should probably go in there. It's simple and it works but if you need something more elaborate or would like to use another format for the config files, then [milieu](https://github.com/drakerlabs/milieu) might be worth a try.


This means every lein command such as `lein repl`, `lein ring server` etc needs to know which environment they're supposed to run under - or they will default to `development`. That's simple enough though. So if you want to, say, run your tests against the `test` environment, just provide the `ENVIRONMENT` env variable:


`ENVIRONMENT=test lein midje`


Make sure you have the `lein-midje` plugin installed in order to run your facts and get a better/prettier output:


`lein plugin install lein-midje 1.0.9`

### Database migrations

clj-boilerplate uses `lobos` to evolve your database schems. Have a look at the `migrations.clj` file to see the default migration that ships with the app. One of the included facts - see below - shows how to run and rollback migrations.


### Included facts

In midje, tests are usually referred to as `facts` and clj-boilerplate includes two of them. One can be found in `core.clj` under the `test` directory. It shows we have compojure configure correctly and also demonstrates how to use `ring-mock` to generate a valid request maps for facts.

The other fact is located in `users.clj` and shows how we can integrate `lobos` with midje's background feature to reset the database between facts.


## License

Copyright (C) 2012 Leonardo Borges

Distributed under the Eclipse Public License, the same as Clojure.
