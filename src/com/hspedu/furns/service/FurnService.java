package com.hspedu.furns.service;

import com.hspedu.furns.entity.Furn;

import java.util.List;

public interface FurnService {
    public List<Furn> queryFurns();


    int addFurn(Furn furn);

    public int deleteFurnById(int id);

    public Furn queryFurnById(int id);

    public int updateFurn(Furn furn);
}
