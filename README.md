Yet another Maven archetype for Clojure
=======================================

This archetype provides a quickstart [Clojure](http://clojure.org) project for Maven,
using the [`clojure-maven-plugin`](https://github.com/talios/clojure-maven-plugin).
To create a new Clojure project with this archetype, do the following:

    mvn archetype:generate -DarchetypeArtifactId=clojure-maven-archetype \
                           -DarchetypeGroupId=tk.skuro \
                           -DarchetypeVersion=1.1

This very archetype offers the following features:

* A bare JAR artifact setup (default Maven lifecycle)
* Manual clojure plugin goal bindings
* AOT compilation and inclusion of all namespaces
* A sample Java interop code

Happy Clojure coding!