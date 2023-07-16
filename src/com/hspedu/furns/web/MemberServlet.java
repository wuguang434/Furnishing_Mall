package com.hspedu.furns.web;

import com.hspedu.furns.entity.Member;
import com.hspedu.furns.service.impl.MemberServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author 12100
 */
public class MemberServlet extends BasicServlet {

    private MemberServiceImpl memberService = new MemberServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        String action = request.getParameter("action");
//        System.out.println("action=" + action);
//        if (action.equals("login")){
//            login(request, response);
//        }else if(action.equals("register")){
//            register(request,response);
//        }else {
//            response.getWriter().write("请求参数错误");
//        }
//    }

    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (memberService.login(new Member(null, username, password, null)) == null) {
            request.setAttribute("msg", "用户名或密码错误");
            request.setAttribute("username", username);
            request.getRequestDispatcher("/views/member/login.jsp").forward(request, response);
        } else {
            System.out.println("登陆成功");
            request.getRequestDispatcher("/views/member/login_ok.html").forward(request, response);
        }
    }

    protected void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        //判断这个用户名是不是可用
        if (!memberService.isExistsUsername(username)) {

            Member member = new Member(null, username, password, email);
            if (memberService.registerMember(member)) {
                //请求转发
                request.getRequestDispatcher("/views/member/register_ok.html")
                        .forward(request, response);
            } else {
                //请求转发
                request.getRequestDispatcher("/views/member/register_fail.html")
                        .forward(request, response);
            }

        } else {
            //后面可以加入提示信息...
            request.getRequestDispatcher("/views/member/login.jsp")
                    .forward(request, response);
        }

    }
}
