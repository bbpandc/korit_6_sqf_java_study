package com.study.java_study.ch10_추상화01;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 11, "말티즈");
        Animal tiger = new Tiger("옹이", 5, 100);

        System.out.println(dog.toString());
        System.out.println(tiger.toString());

        dog.move(); // 강아지가 네발로 움직입니다.
        tiger.move(); // 호랑이가 네발로 뛰어갑니다.
                      // 동물이 움직입니다.
                      // (***업캐스팅을 하면 재정의 된 걸로 실행. Animal의 메소드도 호출하려면 재정의한 메소드에 super.move()를 추가)
        ((Tiger)tiger).hunt(); // 호랑이가100의 힘으로 사냥을 합니다.
                               // Tiger로 다운캐스팅 후 메소드 호출
        dog.bark(); // 말티즈종의 강아지가 짖습니다.

        System.out.println();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = new Tiger("옹이", 5, 100);

        for(Animal animal : animals) {
            animal.move();
        }

        System.out.println();

        // instanceof: instanceof 앞의 원래 자료형이 instanceof 뒤면 true
        for(Animal animal : animals) {
            if(animal instanceof Tiger) {
                Tiger t = (Tiger)animal;
                t.hunt();
            } else if(animal instanceof Dog) {
                Dog d = (Dog)animal;
                d.bark();
            }
        }
//      =
        // .getClass(): 객체가 어떤 클래스의 인스턴스인지 알려줌.
        // .class: 클래스를 알려줌.
        // java 최신 버전은 instanceof가 없어서 이 형태를 많이 씀(호환성 문제)
        for(Animal animal : animals) {
            if(animal.getClass() == Tiger.class) {
                Tiger t = (Tiger)animal;
                t.hunt();
            } else if(animal.getClass() == Dog.class) {
                Dog d = (Dog)animal;
                d.bark();
            }
        }


        System.out.println();
        // Tiger, Dog클래스는 Animal클래스에 다른 요소를 추가해서 더해진 형태(Tiger, Dog = 각각 Animal + 다른 요소들)
        double dNum = 10; // 업캐스팅
        Animal a = new Tiger(); // 업캐스팅(하위 -> 상위). a는 Tiger 클래스에만 있는 메소드(변수)들에는 접근 불가
                                // = Animal 클래스의 메소드(변수)들에만 접근 가능
                                // , 업캐스팅을 하면 잠시 Tiger만의 요소들이 비활성화 됨.

        int iNum = (int)10.0; // 다운캐스팅
        Tiger t = (Tiger)a; // 다운캐스팅(상위 -> 하위).다운캐스팅은 업캐스팅 됐었던 것만 할 수 있다.
                            // 비활성화 되었던 요소들을 다운캐스팅 함으로써 다시 사용이 가능하게 됨.

//      Animal a2 = new Animal();
//      Tiger t2 = (Tiger)a2; // 주소가 Animal만 담을 수 있는 메모리에 다른 요소가 추가된 Tiger로 형변환 할 수 없다.

//      객체지향 언어(ex. java)와 절차지향 언어(ex. c언어)의 차이점: 둘 다 절차지향인건 같지만 객체지향은 거기서 객체가 추가 된 것이다.

    }
}
