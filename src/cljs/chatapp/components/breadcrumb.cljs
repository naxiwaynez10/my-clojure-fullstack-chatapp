(ns chatapp.components.breadcrumb)


(defn main []
 [:div.breadcrumb-header.justify-content-between
    [:div.my-auto
     [:div.d-flex
      [:h4.content-title.mb-0.my-auto "Pages"]
      [:span.text-muted.mt-1.tx-13.ml-2.mb-0 "/ Empty"]]]
    [:div.d-flex.align-items-end.flex-wrap.my-auto.right-content.breadcrumb-right
     [:button.btn.btn-warning.btn-icon.mr-3.mt-2.mt-xl-0
      {:type "button"}
      [:i.mdi.mdi-download]]
     [:button.btn.btn-danger.btn-icon.mr-3.mt-2.mt-xl-0
      {:type "button"}
      [:i.mdi.mdi-clock]]
     [:button.btn.btn-success.btn-icon.mr-3.mt-2.mt-xl-0
      {:type "button"}
      [:i.mdi.mdi-plus]]
     [:button.btn.btn-primary.mt-2.mt-xl-0 "Download report"]]])