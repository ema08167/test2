
public class roupe {

	public static void main(String[] args) {
		   for(int a=0; a<3; a++){
			   System.out.println(a);
		   }
		   System.out.println("\n");

           for(int b=1; b<10; b++){
        	   System.out.println(b);
           }
           System.out.println("\n");

           for (int c=3; c<10; c++){
        	   System.out.println(c);
           }
           System.out.println("\n");

           for(int d=3; d<=10; d++){
        	   System.out.println(d);
           }
           System.out.println("\n");

           for(int e=10; e>5; e--){
        	   System.out.println(e);
           }System.out.println("\n");

           for(int f=10; f>=5; f--){
        	   System.out.println(f);
           }System.out.println("\n");

           for(int g=1; g<10; g+=2){
        	   System.out.println(g);
           }System.out.println("\n");

           for(int h=1; h<10; h+=3){
        	   System.out.println(h);
           }System.out.println("\n");

           for(int i=10; i>1; i-=2){
        	   System.out.println(i);
           }System.out.println("\n");

           for(int j=10; j>1; j-=3){
        	   System.out.println(j);
           }System.out.println("\n");


           //変数kが、初期値1から10以下の間で、偶数の間は、表示をして改行する。
           for(int k=1; k<=10; k++){
        	   if(k%2==0){
        		   System.out.println(k+"\n");
        	   }
           }System.out.println("\n");

           for(int l=0;l<3; l++){
        	   for (int m=1; m<4; m++){
        		   System.out.println(m);
        	   }
        	   System.out.println("\n");
           }System.out.println("\n");
           //変数nが0以上だった場合→プラス 0未満だった場合→マイナス
           int n=10;
           String b=n>=0? "プラス":"マイナス";
           System.out.println(b);
           System.out.println("\n");

           int o=2;
           String c=o%2==0? "偶数":"奇数";
           System.out.println(c);
           System.out.println("\n");

           //変数pが偶数の場合「☆」 奇数の場合「★」これを変数pが0以上5以下の間、繰り返す.
            for (int p=0; p<=5; p++){
            	String d= p%2==0? "☆":"★";
            	System.out.println(d);
            }System.out.println("\n");


	}

}
