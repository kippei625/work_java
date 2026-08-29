package work_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson06 {

	public Lesson06() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
		
		//課題１
		//カリキュラムのサンプルコードは１行となっていたが、一般化を考えここではListの作成のみ行う。
		List<String> list = new ArrayList<>();
		
		//課題２
		//要素追加
		list.add("first");
		list.add("second");
		list.add("third");
		
		//課題３
		//アクセス
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//課題４
		Map<String, Object> map = new HashMap<>();
		
		//課題５
		map.put("name", "kippei");
		map.put("age", 22);
		map.put("from", "osaka");
		
		
		//課題６
		System.out.println(map);
		
		//課題７
		
		//多次元配列の作成。
		List<Map<String, Object>> data = new ArrayList<>();
		
		
		Map<String, Object> person1 = new HashMap<>();
		person1.put("name", "taro");
		person1.put("age", 20);
		person1.put("from", "tokyo");
		data.add(person1);

		Map<String, Object> person2 = new HashMap<>();
		person2.put("name", "jiro");
		person2.put("age", 25);
		person2.put("from", "osaka");
		data.add(person2);

		Map<String, Object> person3 = new HashMap<>();
		person3.put("name", "saburo");
		person3.put("age", 30);
		person3.put("from", "aichi");
		data.add(person3);
		
		
		/*出力確認用
		for(Map<String, Object> person : data) {
		    System.out.println(person);
		}
		
		*/
		
		
	}
		
	

}
