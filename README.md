# Scala.js React boilerplate

## Start

* Install Node.js
* Install Scala
* Install JDK
* Install IntelliJ
* Install SBT (Scala Build Tool)

```sh
git clone https://github.com/shashkovdanil/scalajs-react-boilerplate
cd scalajs-react-boilerplate
```
for dev
```sh
sbt > ~fastOptJS
```
for prod
```sh
sbt > fullOptJS
```

Open project in IntelliJ -> right click on index.html -> Run 'index-dev.html' or 'index-prod.html' (to start the web server)

## TODO

* Update scala.js (ver. 1.0.0)
* Use [sbt-web-scalajs](https://github.com/vmunier/sbt-web-scalajs)
* Use [scalajs-bundler](https://scalacenter.github.io/scalajs-bundler/)