package jp.ac.uryukyu.ie.e175771;

public class Battle {
    int x;
    int y;
    private String color;//B:黒, W:白, E:空

    /**
     * コンストラクタ。石の座標と色(空を表す"E")を指定する。
     * @param x　x座標
     * @param y　y座標
     */
    public Battle(int x, int y){
        this.x = x;
        this.y = y;
        color = "E";
    }
    /**
     * 石の色を指定するメソッド
     * @param color　変えたい色(B:黒, W:白, E:空)
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * 石の色を返すメソッド
     * @return 石の色
     */
    public String getColor(){
        return color;
    }


}
