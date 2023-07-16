package com.hspedu.furns.web;

import com.hspedu.furns.entity.Member;
import com.hspedu.furns.service.impl.MemberServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AdminServlet extends BasicServlet {
    private MemberServiceImpl memberService = new MemberServiceImpl();

    protected void login(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        if (memberService.login(new Member(null, username, password, null)) == null) {
//            request.setAttribute("msg", "用户名或密码错误");
//            request.setAttribute("username", username);
//            request.getRequestDispatcher("/views/manage/manage_login.jsp").forward(request, responce);
//        } else {
//            System.out.println("登陆成功");
//            //判断这个用户名是不是可用
//            if (!memberService.isExistsUsername(username)) {
//
//                Member member = new Member(null, username, password, null);
//                if (memberService.registerMember(member)) {
//                    //请求转发
//                    request.getRequestDispatcher("/views/member/register_ok.html")
//                            .forward(request, responce);
//                } else {
//                    //请求转发
//                    request.getRequestDispatcher("/views/member/register_fail.html")
//                            .forward(request, responce);
//                }
//
//            } else {
                request.getRequestDispatcher("/views/manage/manage_menu.jsp")
                        .forward(request, responce);
            }

        }
//    }
//}