(ns cipherize.core
    (:require [reagent.core :as reagent :refer [atom]])


    )

(enable-console-print!)

(println "This text is printed from src/cipherize/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defn alphabet-cipher-form []
  [:center
   [:h1 "Alphabet Cipher"]
   [:form {:action "submit" :method "post"}
    [:input {:id "GET-secret" :type "text" :placeholder "Enter your secret here"}]
    [:input {:id "GET-msg" :type "text" :placeholder "Enter your message here"}]
    [:input {:type "submit" :value "Get cipher"}]
   ]])



(reagent/render-component [alphabet-cipher-form]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
