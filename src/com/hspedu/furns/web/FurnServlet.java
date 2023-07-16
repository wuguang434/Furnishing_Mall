package com.hspedu.furns.web;

import com.hspedu.furns.entity.Furn;
import com.hspedu.furns.service.FurnService;
import com.hspedu.furns.service.impl.FurnServiceImpl;
import com.hspedu.furns.utils.DataUtils;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author 12100
 */
public class FurnServlet extends BasicServlet {

    private FurnService furnService = new FurnServiceImpl();

    protected void del(HttpServletRequest req,HttpServletResponse resp){
        req.getParameter("?")
    }



    /**
     * 这里使用模板设计模式+反射+动态绑定来调用到list方法
     *
     * @param req
     * @param resp
     */

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        System.out.println("furnservice方法被调用");
        List<Furn> furns = furnService.queryFurns();
        req.setAttribute("furns", furns);
        req.getRequestDispatcher("/views/manage/furn_manage.jsp").forward(req, resp);

    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String maker = req.getParameter("maker");
//        String price = req.getParameter("price");
//        String sales = req.getParameter("sales");
//        String stock = req.getParameter("stock");
//        Furn furn = new Furn(null, name, maker, new BigDecimal(price), new Integer(sales),
//                new Integer(stock), "assets/images/product-image/default.jpg");


//        try {
//            /**将req.getParameterMap() 数据封装到furn对象中
//             * 使用反射将数据封装,有一个前提
//             * 表单提交的数据字段名需要和封装的Javabean的属性名一致
//             */
//            BeanUtils.populate(furn, req.getParameterMap());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        Furn furn = new Furn();
        //自动将获取的数据封装
        Furn furn = DataUtils.copyParamToBean(req.getParameterMap(), new Furn());
        furnService.addFurn(furn);

        /**
         * req.getRequestDispatcher("/manage/furnServlet?action=list").forward(req,resp);
         *因为这里使用请求转发,当用户刷新页面,会重新发出一次添加请求,会造成重复添加
         *重定向实际是让浏览器重新发请求,所以最好回送一个完整的url
         */
        resp.sendRedirect(req.getContextPath() + "/manage/furnServlet?action=list");
    }
}
