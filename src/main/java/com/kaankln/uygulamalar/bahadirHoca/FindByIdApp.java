package com.kaankln.uygulamalar.bahadirHoca;

import com.kaankln.entity.Urun;
import com.kaankln.entityservice.UrunEntityService;

public class FindByIdApp {

    public static void main(String[] args) {
        UrunEntityService service = new UrunEntityService();
        Urun urun = service.findById(1L);

        System.out.println(urun);
    }
}
