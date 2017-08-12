(ns cipherize.core
    (:require [reagent.core :as reagent :refer [atom]]
              [alphabet-cipher.core :as alpha]
              [dommy.core :refer-macros [sel sel1]]
              ))


(enable-console-print!)


(println "This text is printed from src/cipherize/core.cljs. Go ahead and edit it and see reloading in action.")


(defn alphabet-cipher-form []
  [:center
   [:h1 "Alphabet Cipher"]
   [:form {:action "submit" :method "post"}
    [:input {:id "GET-secret" :type "text" :placeholder "Enter your secret here"}]
    [:input {:id "GET-msg" :type "text" :placeholder "Enter your message here"}]
    [:input {:type "submit" :value "Get cipher"
             :onClick (prn (alpha/encode (sel1 :#GET-secret) (sel1 :GET-msg) ) )}]
   ]])


(reagent/render-component [alphabet-cipher-form]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
