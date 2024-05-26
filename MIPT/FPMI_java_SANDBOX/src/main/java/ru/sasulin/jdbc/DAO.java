package ru.sasulin.jdbc;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO<T> {
    Connection con;
    Class<T> clz;

    public DAO(Connection con, Class<T> clz) {
        this.con = con;
        this.clz = clz;
    }

    @SneakyThrows
    public List<T> get() {
        List<T> objs = new ArrayList<>();
        Statement stm = con.createStatement();
        PreparedStatement pstm = con.prepareStatement("SELECT * FROM " + clz.getSimpleName());
        ResultSet res = pstm.executeQuery();
        Constructor<T> constructor = clz.getDeclaredConstructor();
        Field[] fields = clz.getDeclaredFields();
        while (res.next()) {
            T obj = constructor.newInstance();
            for (Field f : fields){
                f.setAccessible(true);
                f.set(obj, res.getString(f.getName()));
            }
            objs.add(obj);
        }
        return objs;
    }


}
