package com.student.placement.portal.dao.sharding;

import com.student.placement.portal.dao.context.SpringContext;
import com.student.placement.portal.dao.config.DbConfig;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Arrays;
import java.util.Collection;

public class TableShardingAlgorithm implements ComplexKeysShardingAlgorithm<String> {

    public Collection<String> doSharding( Collection<String> availableTargetNames,
                                          ComplexKeysShardingValue<String> shardingValue) {
        DbConfig dbConfig = SpringContext.getBean(DbConfig.class);
        int tableCount = dbConfig.getTableCount();
        String logicalTableName = shardingValue.getLogicTableName();
        String data = shardingValue.getColumnNameAndShardingValuesMap().entrySet().iterator().next().getValue().iterator().next();
        int shardingBit = Integer.parseInt(data.substring(data.length() - 1)) % tableCount;
        logicalTableName = logicalTableName.concat("_" + shardingBit);
        return Arrays.asList(logicalTableName);
    }
}
