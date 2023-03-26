import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
    	System.out.println("問１");
		//問題1:下記の条件を使ってfor文と条件文を組み合わせ結果が同じになるよう出力しなさい。for文ネスト3回（3回forを書くこと）
    	//strArray1でfor文を回し3文字目(k)以降のものをstrArray2に格納する(1個目のfor文)
    	//strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
    	//strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)
        List<String> strArray1 = new ArrayList<>(Arrays.asList("f", "u", "k", "u", "d", "a", "k", "a", "n", "e", "k", "o"));
        List<String> strArray2 = new ArrayList<>();
        List<String> strArray3 = new ArrayList<>();
        List<String> strArray4 = new ArrayList<>();

        for (int i = 0; i < strArray1.size() - 4; i++) {
            String str = strArray1.get(i);
            if (str.equals("k")) {
                strArray2.clear();
                for (int j = i + 1; j < strArray1.size() - 3; j++) {
                    String str2 = strArray1.get(j);
                    if (str2.equals("a")) {
                        strArray3.clear();
                        for (int k = j + 1; k < strArray1.size() - 2; k++) {
                            String str3 = strArray1.get(k);
                            if (str3.equals("k")) {
                                strArray3.add(str3);
                            }
                        }
                        if (!strArray3.isEmpty()) {
                            String str4 = strArray1.get(j + 6);
                            if (str4.equals("a") || str4.equals("o")) {
                                strArray4.add(str + str2 + strArray3.get(0) + str2 + str4);
                            }
                        }
                    }
                }
            }
        }

        System.out.println(strArray4);
    }
}
