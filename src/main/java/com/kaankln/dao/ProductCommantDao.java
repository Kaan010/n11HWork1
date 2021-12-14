package com.kaankln.dao;

import com.kaankln.base.BaseDao;
import com.kaankln.dto.CommantCountsOfProductsDto;
import com.kaankln.dto.CustomerDto;
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

    public List<CustomerCommantsDto> findAllCommandsOfProductsByCustomer(CustomerDto customer) {
        String sql=" select " +
                "new com.kaankln.dto.CustomerCommantsDto(customer.id, customer.name, urun.adi, commend.comment, commend.commantDate) " +
                "from ProductComment commend " +
                "left join Customer customer on commend.customerId = customer.id " +
                "left join Urun urun on commend.productId = urun.id " +
                "where customer.id = :paramCustomerId ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("paramCustomerId",customer.getId());

        return query.list();
    }
}
