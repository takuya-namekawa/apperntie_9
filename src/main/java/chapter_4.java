import java.util.HashMap;
import java.util.Map.Entry; //エントリーを拡張forなどで出力するため記述する
public class chapter_4 {
    public static void main(String[] args) {
        HashMap<String,String> enemyMap = new HashMap<String, String>();
        enemyMap.put("低", "スライム");
        enemyMap.put("中", "ドラゴン");
        enemyMap.put("高", "魔王");

        System.out.println("最初の通常出力しているのは右記" + enemyMap.get("低"));
        System.out.println("");
//拡張forは前半に取り出す変数を指定して : 後半に対象となるデータの集まりを指定する
        //キーと値は文字列というentry変数を指定してenemyMapからentrySet()メソッドを用いるて取り出している
        for (Entry<String,String> entry : enemyMap.entrySet()){
            //getKey()メソッドでキーの値を取り出す事が出来る
            System.out.print(entry.getKey() + ", ");
            System.out.println(entry.getValue());
            //getValue()メソッドでエントリーの値を取得して呼び出している
            //getValue()メソッドはエントリーの値だけを取り出すために使用

        }
    }
}
