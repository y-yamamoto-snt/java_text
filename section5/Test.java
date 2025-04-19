import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(25, 68, 93, 7, 51, 40, 88, 12, 36, 77));
        double intListMean = calcMeanOfIntList(intList);

        System.out.printf("Mean: %.2f", intListMean);
    }

    // 整数リストの要素の平均値を求める関数
    static double calcMeanOfIntList(List<Integer> givenIntList){
        int n = givenIntList.size();
        double intSum = 0;
        
        // 総和を計算
        for(int i=0; i<n; i++){
            intSum += givenIntList.get(i);
        }

        // 総和を配列の長さnで割る
        double intMean = intSum / n;
        
        // 関数の返り値をreturnで返す
        return intMean;
    }
}
