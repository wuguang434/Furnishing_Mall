package com.hspedu.furns.web;

import com.hspedu.furns.entity.Furn;
import com.hspedu.furns.service.FurnService;
import com.hspedu.furns.service.impl.FurnServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

/**
 * @author 12100
 */
public class FurnServlet extends BasicServlet {

    private FurnService furnService = new FurnServiceImpl();

    /**
     * 这里使用模板设计模式+反射+动态绑定来调用到list方法
     * @param req
     * @param resp
     */
    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        System.out.println("furnservice方法被调用");
        List<Furn> furns = furnService.queryFurns();
        req.setAttribute("furns", furns);
        req.getRequestDispatcher("/views/manage/furn_manage.jsp").forward(req,resp);

//        for(Furn furn:furns){
//            System.out.println(furn);
//        }

    }
}
