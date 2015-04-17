(defproject mavbozo-blog "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-beta1"]
                 [enlive "1.1.5"]
                 [me.raynes/fs "1.4.6"]
                 [markdown-clj "0.9.65"]]
  :main ^:skip-aot mavbozo-blog.core
  :target-path "target/%s"
  :resources-paths ["resources"]
  :repl-options {:init-ns user}
  :jvm-opts ["-Xms256M" "-Xmx512M" "-server" "-XX:MaxPermSize=128m"] 
  :profiles {:dev {:dependencies [[com.stuartsierra/component "0.2.2"]
                                  [org.clojure/tools.namespace "0.2.9"]
                                  [clojure-watch "0.1.10"]]
                   :source-paths ["dev"]}
             :uberjar {:aot :all}})
