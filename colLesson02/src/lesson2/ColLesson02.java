package lesson2;

import java.util.Scanner;

public class ColLesson02{
	public static void main(String[] args) {
		// Wordクラスのインスタンス配列
		Word[] words = new Word[10]; //配列変数の宣言

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
				Word str = new Word(tmp[0], tmp[1]);
				words[index] = str;
				index++;
				System.out.println("英単語と日本語をスペースで区切って入力して下さい。 \"e\"で終了します。");
				input = sc.nextLine();

			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("用意した配列の容量をオーバーしました。");
		}
		finally{
			for(i = 0; i < index; i++ ){
				words.toString();
				System.out.println(words[i]);
			}
		}
		System.out.println(index + "件、登録しました。");
	}
}
