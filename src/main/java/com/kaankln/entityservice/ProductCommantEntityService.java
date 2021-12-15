package com.kaankln.entityservice;

import com.kaankln.dao.ProductCommantDao;
import com.kaankln.dto.CommantCountsOfProductsDto;
import com.kaankln.dto.CustomerDto;
import com.kaankln.dto.ProductCommantAllInfoDto;
import com.kaankln.dto.CustomerCommantsDto;
import com.kaankln.entity.Urun;
import com.kaankln.entity.Customer;

import java.util.List;

public class ProductCommantEntityService {

    private ProductCommantDao productCommantDao;

    public ProductCommantEntityService() {
        productCommantDao=new ProductCommantDao();
    }

    public List<ProductCommantAllInfoDto> findAllCommandsAndTheirAdditionalInfosByUrun(Urun urun){
        return productCommantDao.findAllCommandsAndTheirAdditionalInfosByUrun(urun);
    }

    public List<CustomerCommantsDto> findAllCommandsOfProductsByCustomer(CustomerDto customer){
        return productCommantDao.findAllCommandsOfProductsByCustomer(customer);
    }



}
