import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ageList = new ArrayList<>(Arrays.asList(19, 20, 21, 18, 22, 19, 20, 21, 18, 22));
        List<String> nameList = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Ethan", "Fiona", "George", "Hannah", "Ian", "Julia"));
        // このIntegerもsection3と一緒で、intと中身は一緒です。
        
        int n = ageList.size(); // 人数をnに格納

        for(int i=0; i<n; i++){
            // i番目の年齢と名前を抽出。
            int age     = ageList.get(i);
            String name = nameList.get(i);

            // 20歳以上ならAdult, 未満ならMinorと表示。
            if(age >= 20){
                System.err.printf("%s: Adult\n", name);
            }
            else{
                System.err.printf("%s: Minor\n", name);
            }
        }
    }    
}
