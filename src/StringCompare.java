public class StringCompare {
    public static void main(String[] args) {
        String a = "john";
        String b = "John";

        if(a.equals(b)){
            System.out.println("they equal!");
        }
        if(a.equalsIgnoreCase(b)){
            System.out.println("they equal!");
        }
    }
}
