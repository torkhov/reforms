package com.reforms.orm.select.bobj.reader;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import com.reforms.orm.select.SelectedColumn;

/**
 * Контракт на чтение значения Time из выборки ResultSet
 * @author evgenie
 */
class TimeColumnValueConverter implements IParamRsReader<Time> {

    @Override
    public Time readValue(SelectedColumn column, ResultSet rs, Class<?> toBeClass) throws SQLException {
        java.sql.Time value = rs.getTime(column.getIndex());
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

}
