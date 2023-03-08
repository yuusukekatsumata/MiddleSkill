
public class test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		1.数字の5と9の変数を定義し、足した数字を出力しなさい。
		int num1 = 5;
		int num2 = 9;
		System.out.println(num1 + num2);
		
//		2.64ビット整数の「1111111111」を定義し2倍した値を出力しなさい。
		long num3 = 1111111111L;
		System.out.println(num3*2);
		
//		3.boolean型の変数の値に不正な文字列比較を入れてfalseを出力してください。
		boolean ismeg; // boolean型の変数を宣言
	    String messege = "眠い"; 
	 
	    ismeg = (messege == "金子さんかっこいい"); // 【条件式】
	    System.out.println(ismeg);
	}
}
