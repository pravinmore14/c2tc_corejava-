package Practise;



public class Pratice {
	public static void main (String [] args){
		
		//0   1     1      2      3    5    8    13 21 34 
		//n1  n2    sum
//			  n1     n2   sum
//			         n1    n2   sum 
//			                n1    n2   sum
			  
				int n1=0;
				int n2=1;
				int sum=0;
				System.out.println(n1+" "+n2);
				for (int i=0;i<8;i++) {
					sum=n1+n2;
					System.out.print(" "+sum);
					n1=n2;
					n2=sum;
				}
				
			
	}
	}
