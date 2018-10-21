
; (ns app.main
;   (:require [app.lib :as lib]
;             [hsl.core :as hsl-core]
;             ["hsl" :as npm-hsl]))

; (println "Loading main.cljs")

; (defn render! []
;   (println lib/lib-data)
;   (println "Trying jar" (hsl-core/hsl 10 20 30 0.3))
;   (println "Trying npm" (npm-hsl 10 20 30 0.3))
;   (set! js/document.body.innerHTML lib/lib-data))

; (defn init []
;   (println "init"))

; (defn start []
;   (println "start")
;   (render!)
;   {::app true})

; (defn stop [app]
;   (prn [:stop app]))

(ns app.main
    (:require [app.chapter1 :as chapter1])
    (:require [app.chapter2 :as chapter2]))