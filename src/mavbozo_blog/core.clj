(ns mavbozo-blog.core
  (:require [net.cgrand.enlive-html :as en]
            [markdown.core :refer [md-to-html md-to-html-string]]
            [clojure.java.io :as io]
            [clojure.edn :as edn]))



(defn get-writing
  "wp: path of writing file. the path is relative to resource(s) path"
  [wp]
  (-> wp io/resource slurp))


(defn writing->enlive
  ""
  [wp]
  (en/html-snippet wp))


