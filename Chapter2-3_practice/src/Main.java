
	public class Main {

	public static void main(String[] args) {
	System.out.println("ようこそ占いの館へ");//①
	System.out.println("あなたの名前を入力してください");//②
	String name= new java.util.Scanner(System.in).nextLine();//③
	System.out.println("あなたの年齢を入力してください");//④
	String ageString=
	new java.util.Scanner(System.in).nextLine();//⑤
	int age=Integer.parseInt(ageString);//⑥
	int fortune =new java.util.Random().nextInt(4);//⑦
	fortune++;//⑧
	System.out.println("占いの結果が出ました!");//⑨
	System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です");//⑩
	System.out.println("1:大吉 2:中吉 3:吉 4:凶");

	}

  }
