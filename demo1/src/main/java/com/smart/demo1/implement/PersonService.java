package com.smart.demo1.implement;

import com.smart.demo1.dao.IPersonDao;
import com.smart.demo1.service.IPersonService;

/**
 * Created by LENOVO on 2016/7/24.
 */
public class PersonService implements IPersonService {

    private IPersonDao personDao;

    public void setPersonDao(IPersonDao personDao) {

        this.personDao = personDao;
    }

    @Override
    public void processSave() {
        System.out.println("-------------from PersonService.processSave()");

        personDao.save();
    }
}
