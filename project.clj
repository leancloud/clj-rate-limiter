(defproject leancloud/clj-rate-limiter "0.1.9-SNAPSHOT"
  :description "Rate limiter for clojure that supports a rolling window, either in-memory or backed by redis"
  :url "https://github.com/killme2008/clj-rate-limiter"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :deploy-repositories {"releases" :clojars}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/core.cache "0.6.4"]
                 [com.taoensso/carmine "2.4.4"]])
