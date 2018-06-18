package com.jadson.demo.config;

public class DataSourceHolder {

    private static final ThreadLocal<String> dsKey = new ThreadLocal<>();

    public static String getDs() {
        return dsKey.get();
    }

    public static void setDs(String ds) {
        dsKey.set(ds);
    }
}
