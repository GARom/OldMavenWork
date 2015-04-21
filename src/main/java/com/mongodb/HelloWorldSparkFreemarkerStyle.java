package com.mongodb;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * Created by annelromero on 4/15/15.
 */
public class HelloWorldSparkFreemarkerStyle {
    public static void main(String[] args) {
        Spark.get("/", new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                return "Hello World from Spark";
            }
        });
    }
}
