(ns chatapp.core
  (:require [chatapp.components.top-menu :as top-menu]
  [chatapp.components.left-side-menu :as left-menu]
            [clojure.core.async :as async :refer [timeout]]
            [reagent.dom :as rdom]))

(defn baseview []
  [:<>
   [left-menu/main]
   [top-menu/main]])

(defn ^:dev/after-load mount-components []
  (rdom/render [baseview] (.getElementById js/document "app"))
  )

(defn init! []
  ;; (timeout 20000)
  (mount-components))
