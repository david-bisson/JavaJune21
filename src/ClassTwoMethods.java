import java.util.Scanner;

public class ClassTwoMethods {
    public static void main(String[] args) {




//        //7
//        printHello();
//        calculate();
//        //8
//        printName("Dudi");
//        divideByTwo(5.0);
//        divideByTwo(5);
//        //9
//        System.out.println(addTwoNumber(4, 5));
//        System.out.println(twoStrings("My name is","Dudi"));
//
//        //10
//        Car.drive();
//        Car.stop();
//
//        //11
//        System.out.println(5 % 2 ==1 ? 20:30); // 20 remainder  is 1
//
//        //12
////        while (1 > 0){
////            System.out.println("1");
////        }
////        Will cause infinite loop
//
//        //13
//        String a1 = "hello";
//        String a2 = "Hello";
//        System.out.println(a1.equals(a2)); // false, not the same string

        //14 - option 2 is better.

//        int x = 1;
//        int y = 2;
//
//        //option1
//        if (x > 0) {
//            if (y > 0) {
//                System.out.println("Good");
//            }
//            //option 2
//            if (x > 0 && y > 0) {
//                System.out.println("This one is better - Good");
//            }
//
//        }
        //15
//        pyramid(7);
        //16
//        printCross(5,'x');
        //17
        //System.out.println(sumOfDigits());

        //18
//        Dog sky = new Dog();
//        sky.name = "sky";
//        sky.age=3;
//        sky.happy=true;

        //19
//        multiSwitch(11);


    }


    static void printHello() {
        System.out.println("Hello");
    }

    static void calculate() {
        System.out.println(5 + 3.2);
    }


    static void printName(String someText) {
        System.out.println(someText);
    }


    static void divideByTwo(double someNumber) {
        System.out.println(someNumber / 2);
    }

    static void divideByTwo(int someNumber) {
        System.out.println(someNumber / 2);
    }

    static int addTwoNumber(int num1, int num2) {
        return num1 + num2;
    }

    static String twoStrings(String str1, String str2) {
        return str1 + " " + str2;
    }

    static void pyramid(int someNumber) {
        for (int i = 0; i < someNumber; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printCross(int size, char display) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col || row + col == size - 1) {
                    System.out.print(display);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static int sumOfDigits(){
        int number, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        number = sc.nextInt();
        result = 0;
        while (number > 0){
            result = result + (number % 10);
            number = number / 10;
        }
        return result;
    }

    static void multiSwitch(int someNumber){

        switch (someNumber){
            case 1:
            case 2:
            case 3:
                System.out.println("A");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("B");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("C");
                break;
            default:
                System.out.println("please enter numbers 1-10");
        }
    }




}
