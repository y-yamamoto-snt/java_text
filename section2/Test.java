public class Test {
    public static void main(String[] args) {
        // 整数(int), 小数(double), 文字列(String)の変数を定義します。
        int integer         = 1;
        double doubleNum1  = 9.64;
        double doubleNum2  = 2.38;
        String str          = "Hello World!";

        // 整数の足し算
        int new_integer = integer + 4;
        System.out.printf("integer + 4 = %d\n", new_integer);

        // 小数の計算
        double newDoubleNum1 = doubleNum1 * 3.2;
        System.out.printf("doubleNum1 × 3.2 = %.3f\n", newDoubleNum1);

        double newDoubleNum2 = doubleNum1 / doubleNum2;
        System.out.printf("doubleNum1 / doubleNum2 = %.2f\n", newDoubleNum2);

        // 文字列のトリミング
        String substr = str.substring(3, 9);
        System.out.printf("substr: %s\n", substr);
    }
}
