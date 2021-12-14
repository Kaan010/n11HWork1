package com.kaankln.uygulamalar;


import com.kaankln.dto.CustomerDto;
import com.kaankln.entity.Customer;
import com.kaankln.entity.Urun;
import com.kaankln.entityservice.ProductCommantEntityService;
import com.kaankln.entityservice.CustomerEntityService;

import java.util.List;

//Question 4
public class FindAllCommentsByCustomerApp {

    public static void main(String[] args) {

        CustomerEntityService customerEntityService = new CustomerEntityService();
        ProductCommantEntityService service = new ProductCommantEntityService();

        List<CustomerDto> customers = customerEntityService.findAll();
        System.out.println("----------------");
        for (CustomerDto customer : customers) {
            System.out.println(customer.getName());
        }
        System.out.println("----------------");

    }
}



    /*    List<Urun> urunList = service.findAllCommandsOfProductsByUser()

        for (Urun urun : urunList) {
            System.out.println(urun);
        }
    */
