(ns chatapp.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [ajax.core :refer [GET, POST]]
            [clojure.core.async :as async :refer [timeout go]]))

(defn loader []
  
   (let [resp (GET "/" {:handler (fn [response] response)})]
     (.log js/console resp))
     [:div.bouncing-loader [:div ][:div ][:div ]])


(defn ^:dev/after-load mount-components []
  (rdom/render [loader] (.getElementById js/document "app"))
  )

(defn init! []
  
  (timeout 20000)
  (mount-components))
