package com.kaankln.dao;

import com.kaankln.dto.CommantCountsOfProductsDto;
import com.kaankln.dto.ProductCommantAllInfoDto;
import com.kaankln.dto.UserCommantsDto;
import com.kaankln.entity.Urun;
import com.kaankln.entity.User;

import java.util.List;

public class ProductCommantDao {
    public List<ProductCommantAllInfoDto> findAllCommandsAndTheirAdditionalInfosByUrun(Urun urun) {
        return null;
    }

    public List<CommantCountsOfProductsDto> findAllCommandsCountsOfProducts() {
        return null;
    }

    public List<UserCommantsDto> findAllCommandsOfProductsByUser(User user) {
        return null;
    }
}
