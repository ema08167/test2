
	public class Main {

	public static void main(String[] args) {
	System.out.println("【数あてゲーム】");//①
	int ans=new java.util.Random().nextInt(10);//②
	for(int i=0; i<5; i++){//③
	System.out.println("0～9の数字を入力してください");//④
	int num=new java.util.Scanner(System.in).nextInt();//⑤
	if(ans==num){
	System.out.println("アタリ!");
	break;
	}else{
	System.out.println("違います。");
	}
	}
	System.out.println("ゲームを終了します");
  }
}


