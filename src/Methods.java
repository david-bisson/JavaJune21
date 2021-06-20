public class Methods {
    public static void main(String[] args) {
        run1();
        String s = run2();
        run3("anything");
        String s2 = run4("any word");
    }

    static void run1() { // void - לא מחזירה ערכים
        System.out.println("hello");
    }

    static String run2() { // כן מחזירה ערכים לא מקבלת ערכים
        return "hello";
    }

    static void run3(String word) { // מקבלת ערכים לא מחזירה ערכים
        System.out.println(word);
    }

    static String run4(String word) { // גם מקבלת וגם מחזירה ערכים
        return "your word is " + word;
    }
}
