package com.reforms.orm.select.bobj.reader;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.ResultSet;

import com.reforms.orm.select.SelectedColumn;

/**
 * Контракт на чтение значения AsciiStream из выборки ResultSet
 * @author evgenie
 */
class AsciiStreamParamRsReader implements IParamRsReader<byte[]> {

    @Override
    public byte[] readValue(SelectedColumn column, ResultSet rs, Class<?> toBeClass) throws Exception {
        try (InputStream stream = rs.getAsciiStream(column.getIndex())) {
            if (rs.wasNull()) {
                return null;
            }
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] chunk = new byte[1024];
            int wasRead = -1;
            while ((wasRead = stream.read(chunk)) > 0) {
                baos.write(chunk, 0, wasRead);
            }
            return baos.toByteArray();
        }
    }

}
