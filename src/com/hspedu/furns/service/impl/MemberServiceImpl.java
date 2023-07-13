package com.hspedu.furns.service.impl;

import com.hspedu.furns.dao.MemberDAO;
import com.hspedu.furns.dao.impl.MemberDAOimpl;
import com.hspedu.furns.entity.Member;
import com.hspedu.furns.service.MemberService;

public class MemberServiceImpl implements MemberService {
    private MemberDAO memberDAO = new MemberDAOimpl();

    @Override
    public boolean registerMember(Member member) {
        return memberDAO.saveMember(member) == 1 ? true : false;
    }

    @Override
    public boolean isExistsUsername(String username) {
        return memberDAO.queryMemberByusername(username) == null ? false : true;

    }

    @Override
    public Member login(Member member) {
        return memberDAO.queryMemberByUsernameAndPassword
                (member.getUsername(), member.getPassword());
    }
}
