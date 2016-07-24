package com.smart.demo1.implement;
import com.smart.demo1.dao.IPersonDao;

/**
 * Created by LENOVO on 2016/7/24.
 */
public class PersonDao implements IPersonDao {

    public void save() {
        System.out.println("------------from PersonDao.save()");
    }
}
