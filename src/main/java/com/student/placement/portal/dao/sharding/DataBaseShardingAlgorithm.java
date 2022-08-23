package com.student.placement.portal.dao.sharding;

import com.student.placement.portal.dao.config.DbConfig;
import com.student.placement.portal.dao.context.SpringContext;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Arrays;
import java.util.Collection;

public class DataBaseShardingAlgorithm implements ComplexKeysShardingAlgorithm<String> {

    @Override
    public Collection<String> doSharding ( Collection<String> collection, ComplexKeysShardingValue<String> shardingValue ) {
        DbConfig dbConfig = SpringContext.getBean(DbConfig.class);
        int dbCount = dbConfig.getDbCount();
        String data = shardingValue.getColumnNameAndShardingValuesMap().entrySet().iterator().next().getValue().iterator().next();
        int shardingBit = Integer.parseInt(data.substring(data.length() - 2, data.length() - 1)) % dbCount;
        String dataSource = dbConfig.getActualDataSource().concat(shardingBit+"");
        return Arrays.asList(dataSource);
    }
}
