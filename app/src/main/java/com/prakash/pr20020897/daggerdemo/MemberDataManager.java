package com.prakash.pr20020897.daggerdemo;

import java.util.ArrayList;

public class MemberDataManager {
    private String memberStatus = "AccessDenied";
    private ArrayList<Member> memberArrayList;

    public MemberDataManager() {
        populateData();
    }

    private void populateData() {
        memberArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            memberArrayList.add(new Member(String.valueOf(1000 + i)));
        }
    }

    public String checkEmpId(String empid) {
        for (Member m : memberArrayList) {
            if (m.getMemberId().equals(empid))
                memberStatus = "Access Granted";
        }
        return memberStatus;
    }
}
