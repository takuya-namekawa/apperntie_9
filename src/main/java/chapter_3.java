import java.util.HashMap;

public class chapter_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> enemy = new HashMap<String, Integer>();
        enemy.put("初段の段位は",1);
        enemy.put("中段の段位は",5);
        enemy.put("高段の段位は", 10);

        enemy.remove("中段の段位は");//ハッシュマップの削除

        System.out.println(enemy.get("初段の段位は") + "段です");
        System.out.println("サイズは" + enemy.size() + "です！");

        String level = "初段の段位は";
        System.out.println(enemy.get(level));

        String level1 = "未定義";
        System.out.println(enemy.get(level1));//この場合は未定義という要素を格納しているハッシュマップはないのでnullとなる


    }
}
