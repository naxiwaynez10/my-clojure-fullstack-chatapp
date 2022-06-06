(ns chatapp.routes.home
  (:require [chatapp.db.core :as db]
            [chatapp.layout :as layout]
            [chatapp.middleware :as middleware] ;;  [ring.handle.dump :refer [handle-dump]]
            [chatapp.routes.apis :refer [api-routes]]
            [clojure.java.io :as io]
            [ring.util.http-response :as response]
            [ring.util.response]))

(defn home-page [request]
  (layout/render request "home.html"))
(defn get-message [request]
  (db/create-user! {:params request})
  (response/found "https://www.facebook.com")
  )
(defn home-routes []
  [""
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats]}
   ["/" home-page]
   ["/save" {:post get-message}]
   ["/docs" {:get (fn [_]
                    (-> (response/ok (-> "docs/docs.md" io/resource slurp))
                        (response/header "Content-Type" "text/plain; charset=utf-8")))}]
  (api-routes home-page)
  ])

