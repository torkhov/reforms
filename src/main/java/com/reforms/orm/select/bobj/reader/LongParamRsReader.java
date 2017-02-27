package com.reforms.orm.select.bobj.reader;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.reforms.orm.select.SelectedColumn;

/**
 * Контракт на чтение значения Long из выборки ResultSet
 * @author evgenie
 */
class LongParamRsReader implements IParamRsReader<Long> {

    @Override
    public Long readValue(SelectedColumn column, ResultSet rs, Class<?> toBeClass) throws SQLException {
        long value = rs.getLong(column.getIndex());
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

}
