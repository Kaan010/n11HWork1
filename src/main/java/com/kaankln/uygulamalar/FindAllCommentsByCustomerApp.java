package com.kaankln.uygulamalar;


import com.kaankln.dao.CustomerDao;
import com.kaankln.dto.CustomerCommantsDto;
import com.kaankln.dto.CustomerDto;
import com.kaankln.entity.Customer;
import com.kaankln.entity.Urun;
import com.kaankln.entityservice.ProductCommantEntityService;
import com.kaankln.entityservice.CustomerEntityService;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

//Question 4
/*Sample Outcome of Query according to sample data(insert files located in resources)
Hibernate: select customer0_.ID as col_0_0_, customer0_.NAME as col_1_0_, customer0_.LAST_NAME as col_2_0_, customer0_.EMAIL as col_3_0_, customer0_.TELEPHONE as col_4_0_ from CUSTOMER customer0_ where customer0_.NAME=?
Hibernate: select customer1_.ID as col_0_0_, customer1_.NAME as col_1_0_, urun2_.ADI as col_2_0_, productcom0_.COMMENT as col_3_0_, productcom0_.COMMANT_DATE as col_4_0_ from PRODUCT_COMMENT productcom0_ left outer join CUSTOMER customer1_ on (productcom0_.CUSTOMER_ID=customer1_.ID) left outer join URUN urun2_ on (productcom0_.PRODUCT_ID=urun2_.ID) where customer1_.ID=?
CustomerCommantsDto{customerId='2', customerName='mert', productName='Kırmızı Elbise', commant='cokiyiurun', commantTime='2021-12-15 00:58:42.76825'}
CustomerCommantsDto{customerId='2', customerName='mert', productName='Mavi Gömlek', commant='mükoürün', commantTime='2021-12-15 00:58:42.76825'}
CustomerCommantsDto{customerId='2', customerName='mert', productName='Sarı Gömlek', commant='kocamaaldımiyi', commantTime='2021-12-15 00:58:42.76825'}
 */

public class FindAllCommentsByCustomerApp {

    public static void main(String[] args) throws Exception {

        CustomerEntityService customerEntityService = new CustomerEntityService();
        ProductCommantEntityService productCommantEntityService = new ProductCommantEntityService();

        String name="mert";  //--> "..." adlı kullanıcının yorumlarını arıyoruz
        CustomerDto customer= Optional.ofNullable(findAUserByName(customerEntityService, name))
                                        .orElseThrow(()->new Exception("There is no customer with name of "+name));


        List<CustomerCommantsDto> allCommandsOfProductsByCustomer = productCommantEntityService.findAllCommandsOfProductsByCustomer(customer);
        for (CustomerCommantsDto commantsDto : allCommandsOfProductsByCustomer) {
            System.out.println(commantsDto);
        }

    }

    private static CustomerDto findAUserByName(CustomerEntityService customerEntityService, String name) {
        return customerEntityService.findByName(name);
    }

    private static List<CustomerDto> extracted(CustomerEntityService customerEntityService) { //just to try
        List<CustomerDto> customers = customerEntityService.findAll(); //gets all users
        System.out.println("------USERS-----");
        for (CustomerDto customer : customers) {
            System.out.println(customer.getName());
        }
        System.out.println("------USERS-----");
        return customers;
    }
}
