package work_java;
//ランダムクラス呼び出し
import java.util.Random;


public class Lesson05 {

	public Lesson05() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args) {
		//課題１
		/*実装に際して、ランダムな整数の生成に使用するクラスに関して知識がないためネットを用いて別途学習。
		 * 出典：https://codegym.cc/ja/groups/posts/ja.825.java-util-random-kurasu
		 * 
		 * 値が10個であったため、配列でも対応可能であったが、一般化を考えたときに不適切であると判断。
		 */
		
		Random rand = new Random();
		//この10は範囲。+1しないと0が含まれてしまう。
		int num = rand.nextInt(10) + 1;
		
		//System.out.println(num % 2);
		
		/*
		//if文
		if(num % 2 == 0) {
			System.out.println(num + "は偶数です。");
		}else {
			System.out.println(num + "は奇数です。");
		}
		*/
		
		//swich文
		switch (num % 2) {
			case 0:
				System.out.println(num + "は偶数です。");
				break;
			case 1:
				System.out.println(num + "は奇数です。");
				break;
		}
		
		
		//課題２
		Random rand2 = new Random();
		
		/*デバック用
		int i;
		for(i = 0;i < 20;i++) {
			
			//この100は範囲。今回は0-100なので101。
			int score = rand2.nextInt(101);
			System.out.println(score);
			
			if(score == 100) {
				System.out.println(score + "満点");
			}else if(score >= 80){
				System.out.println(score + "優");
			}else if(score >= 70) {
				System.out.println(score + "良");
			}else if(score >= 50) {
				System.out.println(score + "可");
			}else{
				System.out.println(score + "不可");
			}
		
		}
		*/
		
		//この100は範囲。今回は0-100なので101。
		int score = rand2.nextInt(101);
		
		if(score == 100) {
			System.out.println("満点");
		}else if(score >= 80){
			System.out.println("優");
		}else if(score >= 70) {
			System.out.println("良");
		}else if(score >= 50) {
			System.out.println("可");
		}else{
			System.out.println("不可");
		}
		
		
		//課題３
		Random rand3 = new Random();
		Random rand4 = new Random();
		
		int score2 = rand.nextInt(101);
		int score3 = rand.nextInt(101);
		
		/*デバック用
		System.out.println(score2);
		System.out.println(score3);
		System.out.println(score2 + score3);
		*/
		
		if((score2 >= 60 && score3 >= 60) || (score2 + score3 >= 130) || (score2 + score3 >= 100 && (score2 >= 90 || score3 >= 90))){
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		
		
		
	}
		
		
		
		
		
		
}


