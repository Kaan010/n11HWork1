package com.kaankln.entityservice;

import com.kaankln.dao.ProductCommantDao;
import com.kaankln.dto.CommantCountsOfProductsDto;
import com.kaankln.dto.ProductCommantAllInfoDto;
import com.kaankln.dto.UserCommantsDto;
import com.kaankln.entity.Urun;
import com.kaankln.entity.User;

import java.util.List;

public class ProductCommantEntityService {

    private ProductCommantDao productCommantDao;

    public ProductCommantEntityService() {
        productCommantDao=new ProductCommantDao();
    }

    public List<ProductCommantAllInfoDto> findAllCommandsAndTheirAdditionalInfosByUrun(Urun urun){
        return productCommantDao.findAllCommandsAndTheirAdditionalInfosByUrun(urun);
    }

    public List<CommantCountsOfProductsDto> findAllCommandsCountsOfProducts(){
        return productCommantDao.findAllCommandsCountsOfProducts();
    }

    public List<UserCommantsDto> findAllCommandsOfProductsByUser(User user){
        return productCommantDao.findAllCommandsOfProductsByUser(user);
    }



}
