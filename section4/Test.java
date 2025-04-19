

public class Test{
    public static void main(String[] args) {
        int a = 10;
        if(a >= 3){
            System.out.printf("a = %d is big number!\n", a);
        }
        else{
            System.out.printf("a = %d is small number...\n", a);
        }

        int b = 69;
        if(b > 65){
            System.out.println("Retired !");
        }
        else if(b > 20){
            System.out.println("Working !");
        }
        else if(b > 5){
            System.out.println("Studying !");
        }
        else{
            System.out.println("Baby");
        }
    }
}