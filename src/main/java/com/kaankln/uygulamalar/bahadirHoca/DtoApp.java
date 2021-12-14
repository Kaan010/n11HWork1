package com.kaankln.uygulamalar.bahadirHoca;

import com.kaankln.dto.UrunDetayDto;
import com.kaankln.entityservice.UrunEntityService;

import java.util.List;

public class DtoApp {

    public static void main(String[] args) {

        UrunEntityService service = new UrunEntityService();
        List<UrunDetayDto> urunList = service.findAllUrunDetayDtoByKategoriKirilim(3L);

        for (UrunDetayDto urunDetayDto : urunList) {
            System.out.println(urunDetayDto);
        }
    }
}
