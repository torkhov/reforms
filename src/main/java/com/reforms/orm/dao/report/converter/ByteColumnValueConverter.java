package com.reforms.orm.dao.report.converter;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.reforms.orm.dao.column.SelectedColumn;

/**
 * Контракт на преобразование значения из выборки ResultSet в строковое значение
 * @author evgenie
 */
class ByteColumnValueConverter implements IColumnValueConverter {

    @Override
    public String convertValue(SelectedColumn column, ResultSet rs) throws SQLException {
        byte value = rs.getByte(column.getIndex());
        if (rs.wasNull()) {
            return null;
        }
        return String.valueOf(value);
    }

}
