package com.reforms.orm.dao.bobj.reader;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.reforms.orm.dao.column.SelectedColumn;

/**
 * Контракт на чтение значения Double из выборки ResultSet
 * @author evgenie
 */
class DoubleResultSetValueReader implements IResultSetValueReader<Double> {

    @Override
    public Double readValue(SelectedColumn column, ResultSet rs, Class<?> toBeClass) throws SQLException {
        double value = rs.getDouble(column.getIndex());
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

}
