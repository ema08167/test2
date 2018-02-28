package ifpackage;

public class If_Sentences {

	public static void main(String[] args) {
		// if文の練習
		//変数aが20より小さい場合、Aと表示
		int a =10;
		if (a < 20){
			System.out.println("A");
		}

		//変数a2が30以下の場合、Bと表示
		int a2=20;
		if (a2 <= 30){
			System.out.println("B");
		}

		//もし、文字列bが山田だった場合、山田さんを表示
		String b="山田";
		if(b.equals("山田")){
			System.out.println(b+"さん");
		}


		//変数a3が10未満かつ、3より大きい→Aと表示
		int a3 =5;
		if (a3<10 && 3<a3){
			System.out.println("A");
		}

		//もし、ある数a4が5以上である、または0以下のどちらか→Bと表示
		int a4=5;
		if(a4>=5 || a4<=0){
			System.out.println("B");
		}

		//変数a3が10未満かつ、3より大きい→Aと表示
		int a5 =5;
		if (a5<10 && 3<a5){
			System.out.println("A");
			}

		//ある変数a6が8より大きい場合→A そうでない場合で10未満の場合→B
		int a6 =7;
		if (a6>8){
			System.out.println("A");
		}else if (a6<10){
			System.out.println("B");
		}

//変数a7が8より大きい→A そうでない場合で、10未満の場合→B
		int a7=11;
		if (a7>8){
		    System.out.println("A");
		}else if(a7<10){
		    System.out.println("B");

		   }

//変数a8が5より大きい→A そうでない→Z
        int a8=3;
        if(a8>5){
           System.out.println("A");
        }else{
        	System.out.println("Z");
        }
//変数a9が8より大きい→A そうでない場合で8の場合→B そうでない→C
        int a9=20;
        if(a9<8){
        	System.out.println("A");
        }else if (a9 ==8){
        	System.out.println("B");
        }else{
        	System.out.println("C");
        }

//変数a10が20以上→成人 そうでない場合→未成年
        int a10 =18;
        if(a10 >=20){
        	System.out.println("成人");
        }else{
        	System.out.println("未成年");
        }
//変数ageが20未満→未成年 そうでない場合で、80より大きい→高齢者 それ以外→成人
	int age =35;
	if (age <20){
		System.out.println("未成年");
	}else if (age >80){
		System.out.println("高齢者");
	}else{
		System.out.println("成人");
	}
//変数age_2が20未満→未成年 そうでない場合で、20以上で80以下→成人 それ以外→高齢者
    int age_2 =35;
    if(age_2 <20){
       System.out.println("未成年");
    }else if(age_2 >=20 && age_2 <=80){
    	System.out.println("成人");
    }else{
    	System.out.println("高齢者");
    }
//変数が奇数が偶数か判定させる
    int b2 =5;
    if(b2%2==0){
    	System.out.println("偶数");
    }else{
    	System.out.println("奇数");
    }
//変数b3が10より大きい場合で、かつ、39未満の場合、Aと表示
     int b3 =20;
     if(b3>10){
    	if(b3<30){
    		System.out.println("A");
    	}
     }

//変数b4が3より大きい場合で、かつ、変数b4が10未満の場合→A
     int b4=7;
     if(b4>3){
    	 if(b4<10){
    		System.out.println("A");
    	 }
     }

     //変数b5が3より大きい場合で、かつ、10未満の場合→A
     int b5 =7;
     if(b5>3){
    	 if(b5<10){
    		 System.out.println("A");
    	 }
     }
//変数b6が10より大きく、かつ、30未満→A
        int b6=50;
        if(b6>10){
        	if(b6<30){
        		System.out.println("A");
        	}
        }
//変数b7が0より大きく、2と等しい→A そうでなくて、3と等しい→B それ以外→C
          int b7=10;
          if(b7>0)
        	  if (b7==2){
        		  System.out.println("A");
        	  }else if (b7==3){
        		  System.out.println("B");
        	  }else{
        		  System.out.println("C");
        	  }

		  //変数b8が0より大きく、2と等しい→A そうでなく、3と等しい→B それ以外→C
          int b8=2;
          if(b8>0)
        	if(b8==2){
        		System.out.println("A");
        	}else if (b8==3){
        		System.out.println("B");
        	}else{
        		System.out.println("C");
        	}

//変数numberが100以下の時、20未満の場合→未成年 そうでない場合で、77の場合→喜寿 88の場合→米寿 それ以外→成人
          int number =88;
          if(number <=100){
        	  if(number<20){
        		  System.out.println("未成年");
        	  }else if (number ==77){
        		  System.out.println("喜寿");
        	  }else if (number==88){
        		  System.out.println("米寿");
        	  }else{
        		  System.out.println("成人");
        	  }
          }
   //変数number2が100以下の時、20未満の場合→未成年 そうでない場合で、77の場合→喜寿 88→米寿 それ以外→成人
            int number2=36;
            if(number2<=100){
            	if(number2<20){
            		System.out.println("未成年");
            	}else if (number2==77){
            		System.out.println("喜寿");
            	}else if (number2==88){
            		System.out.println("米寿");
            	}else{
            		System.out.println("成人");
            	}
            }
//変数number3が100以下の時、20未満→未成年 そうでない場合で、77の場合→喜寿 88→米寿 それ以外→成人
            int number3=110;
            if(number3<=100){
            	if(number3<20){
            		System.out.println("未成年");
            	}else if (number3==77){
            		System.out.println("喜寿");
            	}else if (number3==88){
            		System.out.println("米寿");
            	}else{
            		System.out.println("成人");
            	}
            }

  }
}






