import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		List<String> strArray1 = new ArrayList(Arrays.asList("f", "u", "k", "u", "d", "a", "k" , "a" , "n" , "e" , "k" , "o" ));
		List<String> strArray2 = new ArrayList<String>();
		List<String> strArray3 = new ArrayList<String>();
		List<String> strArray4 = new ArrayList<String>();
		//問題1:下記の条件を使ってfor文と条件文を組み合わせ結果が同じになるよう出力しなさい。for文ネスト3回（3回forを書くこと）
		for(int i = 0; i < strArray1.size(); i++) {
            if(strArray1.get(i).equals("k")) {
                for(int j = i; j < strArray1.size(); j++) {
                    strArray2.add(strArray1.get(j));
                }
                break;
            }
        }
        
        //strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
        for(int i = 0; i < strArray2.size(); i++) {
            String currentChar = strArray2.get(i);
            if(currentChar.equals("k") || currentChar.equals("a") || currentChar.equals("o")) {
                strArray3.add(currentChar);
            }
        }
        
        //strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)
        for(int i = 0; i < strArray3.size(); i++) {
            if(strArray4.size() == 0 && strArray3.get(i).equals("k")) {
                strArray4.add(strArray3.get(i));
            }
            else if(strArray4.size() == 1 && strArray3.get(i).equals("a")) {
                strArray4.add(strArray3.get(i));
            }
            else if(strArray4.size() == 2 && strArray3.get(i).equals("k")) {
                strArray4.add(strArray3.get(i));
            }
            else if(strArray4.size() == 3 && strArray3.get(i).equals("a")) {
                strArray4.add(strArray3.get(i));
            }
            else if(strArray4.size() == 4 && strArray3.get(i).equals("o")) {
                strArray4.add(strArray3.get(i));
            }
        }
        System.out.println(strArray4);
    }
	
}