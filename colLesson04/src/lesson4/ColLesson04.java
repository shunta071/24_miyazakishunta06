package lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04{
	public static void main(String[] args) {
		ArrayList<Word>array = new ArrayList<Word>(5);

		// コマンドラインから入力
		System.out.println("英単語と日本語をスペースで区切って入力して下さい。");
		Scanner sc  = new Scanner(System.in);
		String input = sc.nextLine(); //inputに入力値を読み込む

		// ここから記述してください
		// 例えば、「apple  りんご」と入力されたときはtmp[0]に"apple"、tmp[1]に"りんご"が入る

		int index = 0;
		int i = 0;

		try{
			while(!input.equals("e")){
				String[] tmp = new String[2];
				tmp = input.split(" ");
				array.add(new Word(tmp[0], tmp[1]));
				index++;
				System.out.println("英単語と日本語をスペースで区切って入力して下さい。 \"e\"で終了します。");
				input = sc.nextLine();
			}
		}
		catch(Exception e){
			System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
			for( i = 0; i < array.size(); i++ ){
				System.out.println(array.get(i));
			}
		}
		finally{
			for( i = 0; i < array.size(); i++ ){
				System.out.println(array.get(i));
			}
		}
		System.out.println( index + "件、登録しました。");
	}
}
