package com.kaankln.entityservice;

import com.kaankln.dao.CustomerDao;
import com.kaankln.dto.CustomerDto;
import com.kaankln.entity.Customer;

import java.util.List;

public class CustomerEntityService {

    private CustomerDao customerDao;

    public CustomerEntityService() {
        this.customerDao = new CustomerDao();
    }

    public List<CustomerDto> findAll(){
        return customerDao.findAll();
    }

    public CustomerDto findByName(String name){
        return customerDao.findByName(name);
    }


}
