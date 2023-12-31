//package com.hspedu.furns.web;
//
//import com.hspedu.furns.entity.Member;
//import com.hspedu.furns.service.MemberService;
//import com.hspedu.furns.service.impl.MemberServiceImpl;
//
//import javax.servlet.*;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//import java.io.IOException;
//
//@WebServlet(name = "LoginServlet", value = "/loginServlet")
//public class LoginServlet extends HttpServlet {
//    private MemberService memberService = new MemberServiceImpl();
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        System.out.println("loginServlet被调用");
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        if (memberService.login(new Member(null, username, password, null)) == null) {
//            request.setAttribute("msg", "用户名或密码错误");
//            request.setAttribute("username", username);
//            request.getRequestDispatcher("/views/member/login.jsp").forward(request,response);
//        } else {
//            System.out.println("登陆成功");
//            request.getRequestDispatcher("/views/member/login_ok.html").forward(request,response);
//        }
//    }
//}
