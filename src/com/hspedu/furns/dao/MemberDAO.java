package com.hspedu.furns.dao;

import com.hspedu.furns.entity.Member;

public interface MemberDAO {
    public Member queryMemberByusername(String name);

    public int saveMember(Member member);

    public Member queryMemberByUsernameAndPassword(String username, String password);
}
