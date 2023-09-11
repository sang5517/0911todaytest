package Exam1.java;

public class Exam1 {
    public static void main(String[] args) {

        //===========================================================================================================
        // 문제1
        int num1 = 15;
        int num2 = 4;

        System.out.printf("num1을 num2로 나눈 몫은 %f입니다.\n", num1 / num2); // num1을 num2로 나눈 몫은 3.750000입니다.

        //===========================================================================================================
        // 문제2(변수 활용 해야 답 인정)
        int a1 = 10;
        int a2 = a1;
        System.out.printf("a2는 a1과 같은 값 %d입니다.\n", 10); // 출력 : a2는 a1과 같은 값 10입니다.

        //===========================================================================================================
        // 문제3
        // 출력
        // 5
        // 4
        // 3
        // 2
        // 1

        for (int num = 0; num < 5; num++) {
            System.out.println(num);
        }
        //===========================================================================================================
        // 문제4(변수 활용 해야 답 인정)
        String str1 = "hello";
        String str2 = "world";
        System.out.printf("hello", "world"); // hello, world
        //===========================================================================================================
        // 문제 5
        int num = 10;
        if (num < 10) {
            System.out.println("10보다 작다");
        } else if (num <= 10) {
            System.out.println("10보다 크거나 같다");
        }
        // 10보다 크거나 같다.

        //===========================================================================================================
        // 문제6, 문제9, 9번 빈칸은 class에 있습니다.
        float[] arr = new float[args.length];
                System.out.println(arr.length);// 10

        //===========================================================================================================
        // 문제7

        Dog dog1 = new Dog();


       System.out.printf("%d살 강아지 %s\n", dog1.age, dog1.name); //출력: 5살 강아지 Max

        //===========================================================================================================
        // 문제8 -> 빈칸은 class에 있습니다.
     //   Dog.classInfo(); // 출력 : 이름과 나이를 이용해 Dog를 만드는 Dog class 입니다.

        //===========================================================================================================
        // 문제 10
        Dog bark; // 출력: Max가 멍멍하고 짖습니다.
        //===========================================================================================================


    }
}

//===========================================================================================================
class Dog {

    public int age;
    public String name;

    // 문제 9
    Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // 문제 8
   void classInfo() {
        System.out.println("이름과 나이를 이용해 Dog를 만드는 Dog class 입니다.");
    }

    void bark() {
        System.out.printf("%s가 멍멍하고 짖습니다.\n", this.name);
    }
}


