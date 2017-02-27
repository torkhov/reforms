package com.reforms.orm.select.bobj.reader;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.reforms.orm.select.SelectedColumn;

/**
 * Контракт на чтение значения Integer из выборки ResultSet
 * @author evgenie
 */
class IntParamRsReader implements IParamRsReader<Integer> {

    @Override
    public Integer readValue(SelectedColumn column, ResultSet rs, Class<?> toBeClass) throws SQLException {
        int value = rs.getInt(column.getIndex());
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

}
