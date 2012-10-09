(ns test.app
  (:use clojure.test
        app))

(deftest test-main
  (let [result (with-out-str (-main))]
    (is
      (= "Hello, World!" result))))