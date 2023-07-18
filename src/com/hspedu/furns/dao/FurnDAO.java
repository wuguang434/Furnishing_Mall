package com.hspedu.furns.dao;

import com.hspedu.furns.entity.Furn;

import java.util.List;

public interface FurnDAO {
    public List<Furn> queryFurns();

    public int addFurn(Furn furn);

    public int deleteFurnById(int id);

    public Furn queryFurnById(int id);

    public int updateFurn(Furn furn);

    public int getTotalRow();

    //获取当前页要显示的数据
    public List<Furn> getPageitems(int begin,int pageSize);
}
