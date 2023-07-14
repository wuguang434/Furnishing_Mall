package com.hspedu.furns.test;

import com.hspedu.furns.entity.Furn;
import com.hspedu.furns.service.FurnService;
import com.hspedu.furns.service.impl.FurnServiceImpl;
import org.testng.annotations.Test;

import java.util.List;

public class FurnServiceTest {
    private FurnService furnService = new FurnServiceImpl();

    @Test
    public void queryFurns() {
        List<Furn> furns = furnService.queryFurns();
        for (Furn furn : furns) {
            System.out.println(furn);
        }
    }
    public void addFurn(){

    }
}
