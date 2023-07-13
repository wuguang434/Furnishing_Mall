package com.hspedu.furns.service;

import com.hspedu.furns.entity.Member;

public interface MemberService {
    public boolean registerMember(Member member);

    public boolean isExistsUsername(String name);

    public Member login(Member member);
}
