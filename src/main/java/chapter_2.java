import java.util.HashMap;

public class chapter_2 {
    public static void main(String[] args) {
        //HashMapはオブフェクトを生成して利用する
        //キーと値のデータ型を不等号で囲む　このデータ型にはクラス型を指定する必要がある
        //今回はキーも値も文字列なのでStringを使用しているが、整数などを格納する場合はIntegerを使用する
        //なぜIntではないかとうと整数をオブジェクトで扱えるのはIntegerだから

        HashMap<String, String> enemyMap = new HashMap<String, String>();
        enemyMap.put("ザコ", "スライム");//右辺がキー　左辺が値
        enemyMap.put("中ボス", "ドラゴン");//ハッシュマップのキーとデータの組み合わせをエントリーと呼ぶ
        System.out.println(enemyMap.get("ザコ"));//ハッシュマップのエントリーの値を取り出すにはキーを指定する
        System.out.println(enemyMap.get("中ボス"));

        enemyMap.put("ザコ", "モンスター");        //同じキーを指定して定義する事で書き換える事が出来る　この事をエントリーを上書きするという
        System.out.println(enemyMap.get("ザコ")); //
    }
}
