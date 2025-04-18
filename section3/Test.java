public class Test {
    public static void main(String[] args) {
        int n = 10;

        // for文を使って、1^2+...+n^2を計算する。
        int accumSquareSum = 0;
        for(int i=1; i<=n; i++){
            accumSquareSum += Math.pow(i, 2);
        }
        System.out.printf("1^2+...+%d^2 = %d\n", n, accumSquareSum);

        // while文を使って、1^3+...+n^3を計算する。
        int accumCubicSum = 0;
        int j = 1;
        while(j <= n){
            accumCubicSum += Math.pow(j, 3);
            j+=1;
        }
        System.out.printf("1^3+...+%d^3 = %d\n", n, accumCubicSum);
    }    
}
