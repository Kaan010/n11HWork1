package com.kaankln.dao;

import com.kaankln.base.BaseDao;
import com.kaankln.entity.Kategori;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public class KategoriDao extends BaseDao {

    public List<Kategori> findAll(){

        Query query = getCurrentSession().createQuery(
                "select kategori from Kategori kategori");

        return query.list();
    }
}
