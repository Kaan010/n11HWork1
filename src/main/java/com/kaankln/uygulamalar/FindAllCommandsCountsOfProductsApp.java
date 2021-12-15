package com.kaankln.uygulamalar;

import com.kaankln.dto.CommantCountsOfProductsDto;
import com.kaankln.dto.CustomerCommantsDto;
import com.kaankln.dto.CustomerDto;
import com.kaankln.entityservice.CustomerEntityService;
import com.kaankln.entityservice.ProductCommantEntityService;
import com.kaankln.entityservice.UrunEntityService;

import java.util.List;
import java.util.Optional;


//Question 4
/*
Hibernate: select urun0_.ID as col_0_0_, urun0_.ADI as col_1_0_, urun0_.FIYAT as col_2_0_, count(productcom1_.PRODUCT_ID) as col_3_0_ from URUN urun0_ left outer join PRODUCT_COMMENT productcom1_ on (urun0_.ID=productcom1_.PRODUCT_ID) group by urun0_.ID
CommantCountsOfProductsDto{productId='5', productName='HP ', price=15000.00, commantCount=4}
CommantCountsOfProductsDto{productId='4', productName='Sarı Gömlek', price=450.00, commantCount=3}
CommantCountsOfProductsDto{productId='6', productName='MSI', price=20000.00, commantCount=0}
CommantCountsOfProductsDto{productId='2', productName='Kırmızı Elbise', price=300.00, commantCount=1}
CommantCountsOfProductsDto{productId='7', productName='Orta Sehpa', price=600.00, commantCount=0}
CommantCountsOfProductsDto{productId='1', productName='Mavi Elbise', price=200.00, commantCount=0}
CommantCountsOfProductsDto{productId='3', productName='Mavi Gömlek', price=500.00, commantCount=1}
*/

public class FindAllCommandsCountsOfProductsApp {

    public static void main(String[] args) {

        UrunEntityService urunEntityService=new UrunEntityService();

        List<CommantCountsOfProductsDto> commantCountsOfProductsDtos = urunEntityService.findAllCommandsCountsOfProducts();

        for (CommantCountsOfProductsDto commantsDto : commantCountsOfProductsDtos) {
            System.out.println(commantsDto);
        }

    }
}
