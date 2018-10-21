
(ns app.chapter2)

(println "chapter2：nil, true, false, Truthiness, Equality, and Boolean Expressions")

(println "nil？操作符")
(println (nil? 1))
(println (nil? nil))

(println "=操作符")
(println (= 1 1))
(println (= nil nil))
(println (= 1 2))

(println "or操作符")
(println (or 0 1))
(println (or nil 1))

(println "and操作符")
(println (and 0 1))
(println (and nil 1))