package com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 객체배열(클래스 자료형 배열)을 매개변수와 리턴값으로 사용 */
        /* 설명.
        *   동일한 타입의 여러 개의 인스턴스를 인자로 전달하거나 리턴받는 경우도
        *   객체배열을 사용 가능
        *  */

        /* 필기.
        *   시스템 요구사항
        *   1. 여러 명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
        *   2. 전체 회원 조회 시 여러 명의 회원 정보 반환 */

        /* 필기.
        *   제약사항
        *   1. MemberRepository에 static 필드로 회원 정보들을 관리
        *   2. 회원 정보는 최대 10개 */

        // 회원 정보는 : 회원 번호, 아이디, 비번, 이름, 나이, 성별

        Scanner sc = new Scanner(System.in);

        MemberService memberManager = new MemberService();

        while(true) {
            System.out.println("====회원 관리 프로그램====");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : memberManager.signUpMembers(); break;
                case 2 : memberManager.showAllMembers(); break;
                case 9 : System.out.println("프로그램을 종료합니다."); return;
                default :
                    System.out.println("잘못된 번호입력 삐빅"); break;
            }
        }
    }
}
