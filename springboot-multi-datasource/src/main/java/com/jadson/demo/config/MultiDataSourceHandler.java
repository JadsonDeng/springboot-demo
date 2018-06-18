package com.jadson.demo.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultiDataSourceHandler extends AbstractRoutingDataSource {


    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDs();
    }
}
