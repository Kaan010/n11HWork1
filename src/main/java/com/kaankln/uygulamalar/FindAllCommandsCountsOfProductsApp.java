package com.kaankln.uygulamalar;

import com.kaankln.dto.CommantCountsOfProductsDto;
import com.kaankln.dto.CustomerCommantsDto;
import com.kaankln.dto.CustomerDto;
import com.kaankln.entityservice.CustomerEntityService;
import com.kaankln.entityservice.ProductCommantEntityService;
import com.kaankln.entityservice.UrunEntityService;

import java.util.List;
import java.util.Optional;


public class FindAllCommandsCountsOfProductsApp {

    public static void main(String[] args) throws Exception {

        UrunEntityService urunEntityService=new UrunEntityService();

        List<CommantCountsOfProductsDto> commantCountsOfProductsDtos = urunEntityService.findAllCommandsCountsOfProducts();

        for (CommantCountsOfProductsDto commantsDto : commantCountsOfProductsDtos) {
            System.out.println(commantsDto);
        }

    }
}
