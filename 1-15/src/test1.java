import java.util.Arrays;

public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		System.out.println(add(5, 10));
		//改行
		System.out.println("問２");
		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		System.out.println(isNewspaper("しんぶんし"));
		//改行
		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer [] i = {5,3,1,9,4,8};
		sortDescending(i);
        System.out.println(Arrays.toString(i));
		//改行
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int [] k = {5,3,1,9,4,8};
		  System.out.println(minimum(k));
	}
	//問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
		public static int add(int a, int b) {
			return a + b;
		}
	//問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
		public static boolean isNewspaper(String s) {
	        String reversed = new StringBuilder(s).reverse().toString();
	        return s.equals(reversed);
	    }
	
	//問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
	    public static void sortDescending(Integer[] arr) {
	        Arrays.sort(arr, (a, b) -> b - a);
	    }
	
	//問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	    public static int minimum(int[] arr) {
	        int min = 0;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < arr[min]) {
	                min = i;
	            }
	        }
	        return min;
	    }
	
}


