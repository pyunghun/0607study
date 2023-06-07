package com.ohgiraffers.section02.uses;

public class MemberService {
    public void signUpMembers() {

        Member[] members = new Member[5];
        members[0] = new Member(1, "user01", "pass01", "조평훈", 20, '남');
        members[1] = new Member(2, "user02", "pass02", "조평훈1", 20, '남');
        members[2] = new Member(3, "user03", "pass03", "조평훈2", 20, '남');
        members[3] = new Member(4, "user04", "pass04", "조평훈3", 20, '남');
        members[4] = new Member(5, "user05", "pass05", "조평훈4", 20, '남');

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);
    }

    public void showAllMembers() {

        MemberFinder memberFinder = new MemberFinder();
        System.out.println("=====가입된 회원의 목록=====");
        for(Member member : memberFinder.findAllMembers()) {
            if(member != null) {
                System.out.println(member.toString());
            }
        }
    }
}
