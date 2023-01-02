import java.util.HashMap;
import java.util.Map.Entry;

public class chapter_4_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> skills = new HashMap<String, Integer>();
        skills.put("アタック", 150);
        skills.put("デフェンス", 100);
        skills.put("マジック", 200);
        skills.put("ムーブ", 300);


        for (Entry<String, Integer> entry : skills.entrySet()) {
            System.out.print(entry.getKey());
            System.out.println("は" + entry.getValue() + "です");
        }

    }
}
