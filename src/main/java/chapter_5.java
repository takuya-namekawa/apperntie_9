import java.util.*;

public class chapter_5 {
    public static void main(String[] args) {
        //画像用ハッシュ
        HashMap<String, String> itemImages = new HashMap<String, String>();
        itemImages.put("剣", "http://paiza.jp/learning/images/sword.png");
        itemImages.put("盾", "http://paiza.jp/learning/images/shield.png");
        itemImages.put("回復薬", "http://paiza.jp/learning/images/potion.png");
        itemImages.put("クリスタル", "http://paiza.jp/learning/images/crystal.png");

        //アイテムの並び順配列
        String[] itemOrders = {"クリスタル", "盾", "剣", "回復薬","回復薬","回復薬"};

        //アイテム名を取り出す
        //アイテムネーム変数を作成して、アイテムオーダーズの要素を格納している
        for (String itemName : itemOrders) {
            System.out.println("<img src = '" + itemImages.get(itemName) + "'>");//アイテムネームがキーとなっている事で、画像のURLを取り出している
            System.out.println(itemName + "<br>");
        }

        //画像ファイルを取り出す
    }
}

