package com.hspedu.furns.service;

import com.hspedu.furns.entity.Furn;
import com.hspedu.furns.entity.Page;

import java.util.List;

public interface FurnService {
    public List<Furn> queryFurns();


    int addFurn(Furn furn);

    public int deleteFurnById(int id);

    public Furn queryFurnById(int id);

    public int updateFurn(Furn furn);

    /**
     * 根据传入的begin和pageSize,返回对应的page对象
     * @param pageNo
     * @param pageSize
     * @return
     */
    public Page<Furn> page(int pageNo, int pageSize);

}
