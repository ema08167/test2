
public class Switchpackage {

	public static void main(String[] args) {
		//変数aが0の場合、"aは0に等しい"と表示 もしくは、1の場合→aは1に等しい
		int a=1;

		switch(a){
	    case 0:
	    	System.out.println("aは0に等しい");
	    	break;

	    case 1:
	    	System.out.println("aは1に等しい");
	    	break;
	    }
//変数a2が0→aは0に等しい もしくは、1→aは1に等しい それ以外→aは0でも1でもない
		int a2=5;

		switch(a2){
		case 0:
			System.out.println("a2は0に等しい");
			break;

		case 1:
			System.out.println("a2は1に等しい");
			break;
			default:
				System.out.println("a2は0でも1でもない");
		}
		//変数a3が赤→赤組です 白→白組です
		String a3="赤";

		switch(a3){
		case"赤":
		System.out.println("赤組です");
		break;

		case "白":
			System.out.println("白組です");
			break;
		}

		//変数a4が赤の場合→赤組です 白→白組です それ以外→エラーです
		String a4="青";

		switch(a4){
		case "赤":
			System.out.println("赤組です");
			break;

		case "白":
			System.out.println("白組です");
			break;

			default:
				System.out.println("エラーです");
		}

	}

}
