import java.util.HashMap;

public class chapter_4_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("国語",50);
        points.put("数学",80);
        points.put("英語",20);
        points.put("科学",10);
        points.put("現代社会",5);

        int sum = 0;
        for (int value : points.values() ) {
            sum += value;
        }
        System.out.println("５教科の合計点数は" + sum + "点です");

        double avg = sum / points.size();
        System.out.println("５教科の平均点数は" + avg + "点です");
    }
}
