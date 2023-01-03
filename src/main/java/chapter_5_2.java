import java.util.*;
public class chapter_5_2 {
    public static void main(String[] args) {
        HashMap<String, String> itemImages = new HashMap<String, String>();
        itemImages.put("剣", "http://paiza.jp/learning/images/sword.png");
        itemImages.put("盾", "http://paiza.jp/learning/images/shield.png");
        itemImages.put("回復薬", "http://paiza.jp/learning/images/potion.png");
        itemImages.put("クリスタル", "http://paiza.jp/learning/images/crystal.png");

//前提が標準入力で打ち込んだキーワードに対して、キーを取り出し、その名前に応じた画像を表示させるという事

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();//標準入力した数を入れている

        for (int i = 0; i < count; i++) { //入力された分を繰り返し表示する
            String key = sc.next();//keyという変数に標準入力した文字列を代入している
            System.out.println("<img src = '" + itemImages.get(key) + "'><br>");

        }

    }
}
