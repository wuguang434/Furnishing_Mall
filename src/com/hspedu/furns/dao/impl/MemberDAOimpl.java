package com.hspedu.furns.dao.impl;

import com.hspedu.furns.dao.BasicDAO;
import com.hspedu.furns.dao.MemberDAO;
import com.hspedu.furns.entity.Member;

public class MemberDAOimpl extends BasicDAO<Member> implements MemberDAO {


    /**
     * queryMemberByusername和queryMemberByUsername的区别
     * 注意大小写的问题;
     */
    @Override
    public Member queryMemberByusername(String username) {
        String sql = "SELECT `id`,`username`,`password`,`email` FROM `member` " +
                " WHERE `username`=?";
        return querySingle(sql, Member.class, username);
    }

    @Override
    /**
     * 第21行多写了一个member,以后自动补全时需要看清楚
     */
//    }
    public int saveMember(Member member) {
        String sql = "INSERT INTO `member`(`username`,`password`,`email`) " +
                " VALUES(?,MD5(?), ?)";
        return update(sql, member.getUsername(),
                member.getPassword(), member.getEmail());
    }

    @Override
    public Member queryMemberByUsernameAndPassword(String username, String password) {

        String sql = "SELECT `id`,`username`,`password`,`email` FROM `member` " +
                " WHERE `username`=? and `password`=md5(?)";
        return querySingle(sql, Member.class, username, password);
    }
}
