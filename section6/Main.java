import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Ethan", "Fiona", "George", "Hannah", "Ian", "Julia"));
        List<Integer> ageList = new ArrayList<>(Arrays.asList(19, 20, 21, 18, 22, 19, 20, 21, 18, 22));
        List<Double> heightList = new ArrayList<>(Arrays.asList(170.0, 165.0, 180.0, 175.0, 160.0, 168.0, 172.0, 178.0, 169.0, 166.0));
        List<Double> weightList = new ArrayList<>(Arrays.asList(65.0, 58.0, 72.0, 70.0, 55.0, 60.0, 67.0, 75.0, 62.0, 59.0));
    
        List<HumanProfile> profileList = HumanProfileUtils.createProfiles(nameList, ageList, heightList, weightList);
        HumanProfileUtils.showProfiles(profileList);   
    }
}

class HumanProfile{
    String name;
    int age;
    double height;
    double weight;
    
    HumanProfile(String name, int age, double height, double weight){
        this.name   = name;
        this.age    = age;
        this.height = height;
        this.weight = weight;
    }

    double calcBMI(){
        double bmi = this.weight / Math.pow(this.height*0.01, 2);
        return bmi;
    }

    String adultOrMinor(){
        String ageStatus = "";
        if(this.age >= 20){
            ageStatus = "Adult";
        }
        else{
            ageStatus = "Minor";
        }
        return ageStatus;
    }
}

class HumanProfileUtils {

    static List<HumanProfile> createProfiles(List<String> nameList, List<Integer> ageList, List<Double> heightList, List<Double> weightList) {
        // 空のHumanProfile配列を生成
        List<HumanProfile> profileList = new ArrayList<>();

        // i番目の人のプロフィールを取得
        for (int i = 0; i < nameList.size(); i++) {
            HumanProfile profile = new HumanProfile(nameList.get(i), ageList.get(i), heightList.get(i), weightList.get(i));
            profileList.add(profile);
        }
        return profileList;
    }

    static void showProfiles(List<HumanProfile> profileList) {
        for (int i=0; i < profileList.size(); i++) {
            // i番目のプロフィールを取得
            HumanProfile profile = profileList.get(i);

            // BMIの計算、成人判定の結果をそれぞれの変数に格納
            double bmi          = profile.calcBMI();
            String ageStatus    = profile.adultOrMinor();

            // プリント
            System.out.printf("%-10s | Age: %2d | Height: %.1f | Weight: %.1f | BMI: %.1f | %s\n",
                    profile.name, profile.age, profile.height, profile.weight, bmi, ageStatus);
        }
    }
}