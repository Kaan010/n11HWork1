package com.kaankln.uygulamalar;

import com.kaankln.dto.CommantCountsOfProductsDto;
import com.kaankln.dto.ProductCommantAllInfoDto;
import com.kaankln.dto.UrunDetayDto;
import com.kaankln.entity.Urun;
import com.kaankln.entityservice.ProductCommantEntityService;
import com.kaankln.entityservice.UrunEntityService;

import java.util.List;


//Question 2
/*Sample Outcome of Query according to sample data(insert files located in resources)
Hibernate: select urun0_.ID as id1_3_, urun0_.ADI as adi2_3_, urun0_.FIYAT as fiyat3_3_, urun0_.ID_KATEGORI as id_kateg5_3_, urun0_.KAYIT_TARIHI as kayit_ta4_3_ from URUN urun0_ where urun0_.ID=?
Hibernate: select urun2_.ADI as col_0_0_, kategori3_.ADI as col_1_0_, urun2_.FIYAT as col_2_0_, customer1_.NAME as col_3_0_, customer1_.LAST_NAME as col_4_0_, customer1_.EMAIL as col_5_0_, customer1_.TELEPHONE as col_6_0_, productcom0_.COMMENT as col_7_0_, productcom0_.COMMANT_DATE as col_8_0_ from PRODUCT_COMMENT productcom0_ left outer join CUSTOMER customer1_ on (productcom0_.CUSTOMER_ID=customer1_.ID) left outer join URUN urun2_ on (productcom0_.PRODUCT_ID=urun2_.ID) cross join KATEGORI kategori3_ where urun2_.ID_KATEGORI=kategori3_.ID and urun2_.ID=?
ProductCommantAllInfoDto{productName='Sarı Gömlek', categoriName='Gömlek', productPrice=450.00, customerName='mert', customerLastName='koc', customerEmail='mert@outlook', customerTelephone='1234235', commant='kocamaaldımiyi', commantTime=2021-12-15 00:58:42.76825}
ProductCommantAllInfoDto{productName='Sarı Gömlek', categoriName='Gömlek', productPrice=450.00, customerName='bahadir', customerLastName='memis', customerEmail='bahadir@gmail', customerTelephone='456345', commant='esimbeyendi', commantTime=2021-12-15 00:58:42.76825}
ProductCommantAllInfoDto{productName='Sarı Gömlek', categoriName='Gömlek', productPrice=450.00, customerName='kubra', customerLastName='sasasa', customerEmail='kbrkbrkbr@outlook', customerTelephone='345213', commant='hünkarbeyendi', commantTime=2021-12-15 00:58:42.76825}
*/
public class FindCommentInfosByProductApp {

    public static void main(String[] args) throws Exception {
        UrunEntityService urunEntityService=new UrunEntityService();
        ProductCommantEntityService productCommantEntityService=new ProductCommantEntityService();
        Urun urunById = urunEntityService.findById(4L); //get a product by name (2 is jsut for tast)

        List<ProductCommantAllInfoDto> allCommandsAndTheirAdditionalInfosByUrun = productCommantEntityService.findAllCommandsAndTheirAdditionalInfosByUrun(urunById);
        for (ProductCommantAllInfoDto commantsDto : allCommandsAndTheirAdditionalInfosByUrun) {
            System.out.println(commantsDto);
        }

    }
}
