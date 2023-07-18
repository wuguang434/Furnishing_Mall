package com.hspedu.furns.test;

import com.hspedu.furns.dao.FurnDAO;
import com.hspedu.furns.dao.impl.FurnDAOImpl;
import com.hspedu.furns.entity.Furn;
import org.testng.annotations.Test;

import java.util.List;

public class FurnDAOTest {
    private FurnDAO furnDAO = new FurnDAOImpl();

    @Test
    public void queryFurns() {
        List<Furn> furns = furnDAO.queryFurns();
        for (Furn furn : furns) {
            System.out.println(furn);
        }
    }

    @Test
    public void getTotalRow() {
        System.out.println(furnDAO.getTotalRow());
    }

    @Test
    public void getPageItems() {
        List<Furn> pageTiems = furnDAO.getPageitems(0, 3);
        for (Furn furn : pageTiems) {
            System.out.println(furn);
        }
    }
}
