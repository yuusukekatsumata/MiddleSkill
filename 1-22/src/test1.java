import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class test1 {
	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		Date date = new Date();
        System.out.println(date);
		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		LocalDate shinyaDate = LocalDate.parse(shinyaBirthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        LocalDate minamiDate = LocalDate.parse(minamiBirthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        if (shinyaDate.isBefore(minamiDate)) {
            System.out.println(shinyaBirthday);
        } else {
            System.out.println(minamiBirthday);
        }
		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
        LocalDate furuyamaDate = LocalDate.parse(furuyamaBirthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        
        LocalDate date1 = furuyamaDate.plusYears(5).plusMonths(2);
    		
    	DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
 		String fdate = date1.format(dtFormat);
 		System.out.println(fdate);
	}
}


