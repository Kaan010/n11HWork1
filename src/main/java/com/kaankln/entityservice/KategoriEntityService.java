package com.kaankln.entityservice;

import com.kaankln.dao.KategoriDao;
import com.kaankln.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class KategoriEntityService {

    private KategoriDao kategoriDao;

    public KategoriEntityService() {
        kategoriDao = new KategoriDao();
    }

    public List<Kategori> findAll(){
        return kategoriDao.findAll();
    }
}
