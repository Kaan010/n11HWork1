package com.kaankln.dao;

import com.kaankln.base.BaseDao;
import com.kaankln.dto.CommantCountsOfProductsDto;
import com.kaankln.dto.ProductCommantAllInfoDto;
import com.kaankln.dto.CustomerCommantsDto;
import com.kaankln.entity.Urun;
import com.kaankln.entity.Customer;
import org.hibernate.query.Query;

import java.util.List;

public class ProductCommantDao extends BaseDao {
    public List<ProductCommantAllInfoDto> findAllCommandsAndTheirAdditionalInfosByUrun(Urun urun) {

        String sql="";

        Query query = getCurrentSession().createQuery(sql);


        return query.list();

    }

    public List<CommantCountsOfProductsDto> findAllCommandsCountsOfProducts() {
        String sql="";

        Query query = getCurrentSession().createQuery(sql);


        return query.list();
    }

    public List<CustomerCommantsDto> findAllCommandsOfProductsByCustomer(Customer customer) {
        String sql="";

        Query query = getCurrentSession().createQuery(sql);


        return query.list();
    }
}
