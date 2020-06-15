package com.ignite.example.udf;

import org.apache.ignite.cache.query.annotations.QuerySqlFunction;

public class MyCustomFunction {

    @QuerySqlFunction
    public static boolean Is_Pass(int score) {
        if (score > 50) {
            return true;
        } else {
            return false;
        }
    }

}