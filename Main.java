import java.util.Random;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");

        String name = scan.nextLine();

        System.out.println("あなたの年齢を入力してください");

        String ageString = scan.nextLine();
        int age = Integer.parseInt(ageString);

        int fortune = rand.nextInt(4);
        fortune++;

        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("1:大吉2:中吉3:小吉4:凶");

    }

}