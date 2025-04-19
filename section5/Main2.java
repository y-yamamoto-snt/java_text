import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // 10人の身長、体重リストがあります。それぞれのBMIを計算して平均値を求めましょう。

        List<Double> heightList = new ArrayList<>(Arrays.asList(170.0, 165.0, 180.0, 175.0, 160.0, 168.0, 172.0, 178.0, 169.0, 166.0));
        List<Double> weightList = new ArrayList<>(Arrays.asList(65.0, 58.0, 72.0, 70.0, 55.0, 60.0, 67.0, 75.0, 62.0, 59.0));

        // BMIの平均値を計算 (calcBmiFromHWListsを利用)
        double meanBMI = calcBmiFromHWLists(heightList, weightList);
        System.out.printf("Mean of BMI: %.2f\n", meanBMI);
    }

    /**
     * 
     * @param height 人の身長(cm)
     * @param weight 人の体重(kg)
     * @return 身長と体重からBMIを計算して出力する
     */
    static double calcBMI(double height, double weight){
        double BMI = weight / Math.pow(height*0.01, 2);
        return BMI;
    }

    /**
     * 
     * @param heightList 人物の身長のリスト(cm)
     * @param weightList 人物の体重のリスト(kg)
     * @return 与えられた身長と体重のリストから、この人たちのBMIの平均値を計算して出力する
     */
    static double calcBmiFromHWLists(List<Double> heightList, List<Double> weightList){
        double bmiSum = 0.0;
        for(int i=0; i < heightList.size(); i++){
            // i番目の身長、体重を取得
            double height_i = heightList.get(i);
            double weight_i = weightList.get(i);

            // i番目の人のBMIを計算(関数を使用)
            double bmi_i = calcBMI(height_i, weight_i);

            // BMIの総和に加算
            bmiSum = bmiSum + bmi_i;
        }
        // BMIの総和を人数で割る
        double meanBMI = bmiSum / heightList.size();
        return meanBMI;
    }
}
