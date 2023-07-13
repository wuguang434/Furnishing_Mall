package com.hspedu.furns.test;

import com.hspedu.furns.dao.MemberDAO;
import com.hspedu.furns.dao.impl.MemberDAOimpl;
import com.hspedu.furns.entity.Member;
import org.testng.annotations.Test;

public class MemberDAOTest {
    private MemberDAO memberDAO = new MemberDAOimpl();
    @Test
    public void queryMemberByusername() {

        if (memberDAO.queryMemberByusername("admin") == null) {
            System.out.println("该用户名不存在...");
        } else {
            System.out.println("该用户名存在...");
        }
    }

    @Test
    public void saveMember() {

        Member member =
                new Member(null, "king", "king", "king@sohu.com");
        if(memberDAO.saveMember(member) == 1) {
            System.out.println("添加OK");
        } else {
            System.out.println("添加失败...");
        }
    }
    @Test
    public void queryMemberByUsernameAndPassword(){
        Member member = memberDAO.queryMemberByUsernameAndPassword("hspedu", "111111");
        System.out.println(member);
    }
}
