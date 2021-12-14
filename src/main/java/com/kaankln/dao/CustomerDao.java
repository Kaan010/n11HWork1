package com.kaankln.dao;

import com.kaankln.base.BaseDao;
import com.kaankln.dto.CustomerDto;
import com.kaankln.entity.Customer;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerDao extends BaseDao {
    public List<CustomerDto> findAll() {

        Query query = getCurrentSession().createQuery(
                "select " +
                        "new com.kaankln.dto.CustomerDto( customer.id,customer.name,customer.lastname,customer.email,customer.telephone)" +
                        "from Customer customer");

        return query.list();
    }
}
