(defproject clj-train "0.1.0-SNAPSHOT"
  :description "My repository to train Clojure."
  :url "https://github.com/ybbond/clj-train"
  :license {:name "EPL-3.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot clj-train.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
