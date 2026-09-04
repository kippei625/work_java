package work_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lesson07 {

	public Lesson07() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args) {
		//課題１
		int i,j;
		i = 0;
		j = 0;
		
		for(i = 1;i <= 9;i++) {
			for(j = 1;j <= 1;j++) {
				System.out.println(j + "*" + i + "=" + i * j);
			}
		}
		
		
		//課題２
		HashMap<String, HashMap<String, String>> employees = new HashMap<String, HashMap<String, String>>() {
		    {
		        put("中田", new HashMap<String, String>() {
		            {
		                put("age", "23");
		                put("pref", "東京");
		            }
		        });
		        put("山本", new HashMap<String, String>() {
		            {
		                put("age", "19");
		                put("pref", "京都");
		            }
		        });
		        put("佐藤", new HashMap<String, String>() {
		            {
		                put("age", "30");
		                put("pref", "大阪");
		            }
		        });
		        put("小林", new HashMap<String, String>() {
		            {
		                put("age", "22");
		                put("pref", "福岡");
		            }
		        });
		    }
		};
		
		//引数からアクセスするので「employees」。
		System.out.println(employees);
		
		
		//応用問題１
		/*・指針
		 * 1－40までの番号を生成し、配列Aと配列Bに入れる。
		 * 配列Aから文字列として、検索をかけて3のつく数字を探査。
		 * 配列Bは条件で3の倍数を探査。
		 * それぞれ出力。
		 * 
		 * ↓
		 * 
		 * 多次元配列を用いずに実装しようとした結果、コードが長くなりすぎてしまったのでListを用いることにする。
		 * 
		 */
		//変数名resultとして、Listを作成。Integerなので数値として作成している。
		List<Integer> result = new ArrayList<>();
		
		int k;
		String num;
		
		for (k = 1;k <= 40;k++) {
			//文字列に変換。
			num = String.valueOf(k);
			
			//条件式：.containsで3の文字列の探査。かつ、3で割ったときの余りが0、つまり3の倍数の時にresultのListに追加される。
			if (num.contains("3") || k % 3 == 0) {
				result.add(k);
			}
		}
		
        System.out.println(result);
        
        
        
        
        //応用問題２
        /*
         * 指針
         *連想配列を作る。そのためにはpref以外の要素を取得する必要がある。
         *.forEachを用いる。
         *参考文献：https://qiita.com/TakehiroKATO/items/b8144523e72e3efe283d
         */
        
        
        
        /*
        *employees.forEach((name, info) -> {
        *	System.out.println("名前: " + name + ", 年齢: " + info.get("age") + ", 出身地: " + info.get("pref"));
        *});
        */
        
        
        //課題２の配列から、名前と年齢だけの連想配列を作成する・
        //['name' = '名前', 'age' = '年齢']の形式で表示する。
        HashMap<String, HashMap<String, String>> nameAgeOnly = new HashMap<>();
   
        //nameとageだけをnameAgeに詰め替えてnameAgeOnlyに格納する。
        employees.forEach((name, info) -> {
        	
        	HashMap<String, String> nameAge = new HashMap<>();
        	nameAge.put("name", name);
        	nameAge.put("age", info.get("age"));
        	
        	nameAgeOnly.put(name, nameAge);
        	
        });
        
        nameAgeOnly.forEach((name, nameAge) -> {
        	System.out.println("['name' = '" + nameAge.get("name") + "', 'age' = '" + nameAge.get("age") + "']");
        	});
        
        
	
	
	
	}
	
	
	
}
