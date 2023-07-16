package com.hspedu.furns.dao;

import com.hspedu.furns.entity.Furn;

import java.util.List;

public interface FurnDAO {
    public List<Furn> queryFurns();
    public int addFurn(Furn furn);
    public int deleteFurnById(int id);
}
