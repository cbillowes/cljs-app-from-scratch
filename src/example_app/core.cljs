(ns example-app.core
  (:require [axios]
            [moment]))

;; Use mock REST API to get data to output to the browser
(-> (.. axios (get "https://jsonplaceholder.typicode.com/todos/1"))
    (.then #(js/console.log %)))


(js/console.log (.format (moment) "dddd"))
