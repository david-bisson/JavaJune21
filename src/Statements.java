public class Statements {
    public static void main(String[] args) {
        breakStatement();
        continueStatement();
        returnStatement(0);
    }

    static void breakStatement(){
        for (int i = 0; i < 5; i++){
            if (i == 2){
                break;
            }
            System.out.println(i);
        }
    }

    static void continueStatement(){
        for (int j = 0; j < 5; j++){
            if (j == 2){
                continue;
            }
            System.out.println(j);
        }
    }

    static void returnStatement(int x){
        if (x <= 0) {
            return;
        }
        x = x * 9;
        x++;
        x = x / 2;
        System.out.println(x);
    }
}
