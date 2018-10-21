
(ns app.chapter1)

(println "chapter1：if do when等语句")

;if可以根据条件执行语句
(println "if条件判断")
(if true
    (do (println "1") 
    (println "2")))

;do可以连续执行
(println "do语句")
(do (println "1") 
    (println "2"))

;when可以根据条件连续执行
(println "when语句")
(when true
    (println "1") 
    (println "2"))