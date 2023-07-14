package com.hspedu.furns.dao.impl;

import com.hspedu.furns.dao.BasicDAO;
import com.hspedu.furns.dao.FurnDAO;
import com.hspedu.furns.entity.Furn;

import java.util.List;

public class FurnDAOImpl extends BasicDAO<Furn> implements FurnDAO {
    @Override
    public List<Furn> queryFurns() {
        String sql = "SELECT id,NAME,maker,price,sales,stock,img_path imgPath FROM furn";
        return queryMulti(sql,Furn.class);
    }

    @Override
    public int addFurn(Furn furn) {
        return 0;
    }
}
