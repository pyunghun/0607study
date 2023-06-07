package com.ohgiraffers.section01.init;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 객체 배열 */
        /*
        * 필기.
        *  객체배열은 레퍼런스 변수에 대한 배열
        *  생성한 인스턴스도 배열을 이용해 관리하면
        *  동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리가 가능하다.
        *  반환값은 1개의 값만 반환할 수 있기 떄문에
        *  동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체배열을 이용할 수 있다.
        *  */


        // 자동차에 대한 5개의 인스턴스를 생성하기
        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티", 400);
        Car car5 = new Car("포터", 500);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        // 이렇게 생성하게 되면 코드가 복잡해지고 각각의 인스턴스를 생성 및 호출해야 한다.

        // 해결 = 객체배열
        Car[] carArray = new Car[5];

        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보", 350);
        carArray[2] = new Car("롤스", 250);
        carArray[3] = new Car("부가티", 400);
        carArray[4] = new Car("포터", 500);

        for(int i = 0; i < carArray.length; i++) {

            carArray[i].driveMaxSpeed();
        }

        System.out.println();
        /* 객체배열도 배열과 마찬가지로 할당과 동시에 초기화가 가능하다. */
        Car[] carArray2 = {
            new Car("페라리", 300)
                , new Car("롤스", 230)
                , new Car("람보", 340)
        };

        for(Car c : carArray2) {
            c.driveMaxSpeed();
        }
    }
}
