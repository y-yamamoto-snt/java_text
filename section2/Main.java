public class Main {
    public static void main(String[] args) {
        int integer         = 1;
        double double_num1  = 9.64;
        double double_num2  = 2.38;
        String str          = "Hello World!";

        // 整数の足し算
        int new_integer = integer + 4;
        System.out.printf("integer + 4 = %d\n", new_integer);

        // 小数の計算
        double new_double_num1 = double_num1 * 3.2;
        System.out.printf("double_num1 × 3.2 = %.3f\n", new_double_num1);

        double new_double_num2 = double_num1 / double_num2;
        System.out.printf("double_num1 / double_num2 = %.2f\n", new_double_num2);

        // 文字列のトリミング
        String substr = str.substring(3, 9);
        System.out.printf("substr: %s\n", substr);

        return;
    }
}
