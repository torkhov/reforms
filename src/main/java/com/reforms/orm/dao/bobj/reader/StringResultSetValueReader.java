package com.reforms.orm.dao.bobj.reader;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.reforms.orm.dao.column.SelectedColumn;

/**
 * Контракт на чтение значения String из выборки ResultSet
 * @author evgenie
 */
class StringResultSetValueReader implements IResultSetValueReader<String> {

    @Override
    public String readValue(SelectedColumn column, ResultSet rs, Class<?> toBeClass) throws SQLException {
        String value = rs.getString(column.getIndex());
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

}
