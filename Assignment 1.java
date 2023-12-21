 import java.util.Scanner;
 public class Assignment1
 {
  /* // Q.1 Name 
  public static void main(String args[])
  {
   System.out.println("Hello\nAshok kokare");
  }
  */
  
  /* // Q.2 Summation
  public static void main (String args[])
  {
	int n1=74,n2=36;
	int sum= n1+n2;
	System.out.println("first no="+n1 + " Second no="+n2);
	System.out.println("sum of two numbers="+sum);
  }
  */
 
 /* // Q.3 Division
   public static void main(String args[])
   {
	 int c1=50, c2=3;
	 int div=c1/c2;
	 System.out.println("..Two numbers for division..");
	 System.out.println("1st no=" +c1 +"  2nd no= "+c2);
	 System.out.println("Expected output is="+div);
   }
 */  

  /* // Q.4
  public static void main(String args[])
  {
	int a,b,c,d;
    a=-5+8*6;
	b=(55+9)%9;
	c=20+-3*5/8;
	d=5+15/3*2-8%3;
   System.out.println("a="+a);
   System.out.println("b="+b);
   System.out.println("c="+c);
   System.out.println("d="+d);
  }
 */

 /* // Q.5
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);  
	System.out.println("..Enter two numbers only 25 & 5...");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	if((n1==25) && (n2==5))
	 {  System.out.println("1st no= "+n1 +" 2nd no= "+n2);
	    int mul=n1*n2;
		System.out.println("Multiplication= "+mul);
	 }
    else	 
	{
		System.out.println("1st no= "+n1 +" 2nd no= "+n2);
		System.out.println(" //YOU enter WRONG INPUT ///\nplease enter correct input numbers");
	}
	
  }
 */  
 
 /*  // Q.6 
 
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);  
	System.out.println("..Enter two numbers only ");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	System.out.println("1st no= "+n1 +" 2nd no= "+n2);
	int sum=n1+n2;
	int mul=n1*n2;
	int sub=n1-n2;
	int div=n1/n2;
	int rem=n1%n2;
	System.out.println("Addiion= "+sum);
	System.out.println("Substraction= "+sub);
	System.out.println("Multiplication= "+mul);
	System.out.println("Division= "+div);
	System.out.println("Remainder= "+rem);
 }
 */
 
 /* // Q.7
 public static void main (String args[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER NUMBER  ");
	int k=sc.nextInt();
	System.out.println("ENTER NUMBER is= "+k); 
	
	for(int i=1;i<=10;i++)
	  {
	    System.out.println(k+ " * " +i + "  =   " +k*i);  
	  }
 }
 */
 /* // Q.8 
 public static void main (String args[])
 {
	 System.out.print("   J    a  v     v  a ");
	 System.out.println();
	 System.out.print("   J   a a  v   v  a a ");
	 System.out.println();
	 System.out.print("J  J  aaaaa  v v  aaaaa ");
	 System.out.println();
	 System.out.print(" JJ  a     a  v  a     a");
	 System.out.println();
 }
 /*
 
 /* // Q.9
 public static void main (String args[])
 {
	float c1=25.5F,c2=3.5F,c3=40.5F,c4=4.5F;
	double d=((c1*c2-c2*c2)/(c3-c4));
	System.out.println("RESULT="+d);
 }
 */
 
 /* // Q.10  
 public static void main (String args[])
 {
	float c1=4.0F,c2=1,c3=1.0F,c4=3,c5=5,c6=7,c7=9,c8=11;
	double k=c1*(c2-(c3/c4)+(c3/c5)-(c3/c6)+(c3/c7)-(c3/c8));
	System.out.println("RESULT="+k);
 }
 */
 
 /* // Q.11
 public static void main (String args[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("...Enter radius in mm..");
	float rad=sc.nextFloat();
	System.out.println("...Enter radius is " +rad+ " mm..");
	float pi=3.142F;
    double peri=(2*pi*rad);
	double area=(pi*(rad*rad));
	System.out.println("Perimeter is "+peri+ " mm");
	System.out.println("Area is "+area+ " mm^2");
 }
 */
 
 /*  // Q.12
 public static void main (String args[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("...Enter Three numbers..");
	float n1=sc.nextFloat();
	float n2=sc.nextFloat();
	float n3=sc.nextFloat();
	float avg=(n1+n2+n3)/3;
	System.out.println("AVERAGE of THREE nos is="+avg);
	
 }
 */
 /* // Q.13
 public static void main (String args[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("...Enter value of width and height in mm..");
	float wid=sc.nextFloat();
	float high=sc.nextFloat();
	System.out.println("...Enter width is " +wid+ " mm.."+"\n...Enter height is " +high+ " mm..");
	
    float peri =(2*(wid+high));
	double area=(wid*high);
	System.out.println("Perimeter is "+peri+ " mm");
	System.out.println("Area is "+area+ " mm^2");
 }
 */
 
  /* // Q. 14
 public static void main (String args[])
 {
 System.out.print("* * * * * * ========================================");
 System.out.println();
 System.out.print(" * * * * * * =======================================");
 System.out.println();
 System.out.print("* * * * * * ========================================");
 System.out.println();
 System.out.print(" * * * * * * =======================================");
 System.out.println();
 System.out.print("* * * * * * ========================================");
 System.out.println();
 System.out.print(" * * * * * * =======================================");
 System.out.println();
 System.out.print("* * * * * * ========================================");
 System.out.println();
 System.out.print(" * * * * * * =======================================");
 System.out.println();
 System.out.print("* * * * * * ========================================");
 System.out.println();
 System.out.print("====================================================");
 System.out.println();
 System.out.print("====================================================");
 System.out.println();
 System.out.print("====================================================");
 System.out.println();
 System.out.print("====================================================");
 System.out.println();
 System.out.print("====================================================");
 System.out.println();
 System.out.print("====================================================");
 System.out.println();
 }
 */

  
 /* // Q.15
  public static void main(String [] args)
  {
	Scanner sc= new Scanner(System.in);
	System.out.println(" Enter 2 nos which wants to swap");
	int s=sc.nextInt();
	int w=sc.nextInt();
    System.out.println(" first no is n1= "+s +"  Second no is n2= "+w);
	s= s+w;
	w= s-w;
	s= s-w;
    System.out.println(" first no is n1= "+s +"  Second no is n2= "+w);	
  }
 */ 
 
 /* //Q.16
 public static void main(String[] args)
	{
		for(int i=1;i<=25;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==1 & j==2|i==1 & j==8|i==5 & j==2 |i==5 & j==8)
				{
					System.out.print("+");
				}
				else if(i==1&j==3|i==1&j==4|i==1&j==5|i==1&j==6|i==1&j==7)
				{
					System.out.print("/");
				}
				else if(i==2 & j==1)
				{
					System.out.print("[");
				}
				else if(i==2 & j==2 |i==2 & j==2 |i==3& j==2 |i==3 & j==8|i==4 & j==2|i==4 & j==8|i==4 & j==4|i==4 & j==6|i==2 & j==8 )
				{
					System.out.print("|");
				}
				else if(i==5&j==3|i==5&j==4|i==5&j==5|i==5&j==6|i==5&j==7)
				{
						System.out.print("-");
				}
				else if(i==2 & j==4 |i==2 & j==6 )
				{
					System.out.print("o");
			    }
                 else if(i==4 &j==5)
				 {
					 System.out.print("_");
				 }	
                else if(i==2 & j==9)
				{
				System.out.print("]");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	
	}
	*/

/*  // Q.18	
	public static void main(String[] args)
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter your 1st number");
	 String ac= sc.next();
	 System.out.println("enter your 2nd number");
	 String kb= sc.next();
	 int k1=Integer.parseInt(ac,2);
     int k2=Integer.parseInt(kb,2);
	 int k3=k1+k2;
	 System.out.println("k1 :" +Integer.toBinaryString(k1));
	 System.out.println("k2 :" +Integer.toBinaryString(k2));
	  System.out.println("k3=k1+k2 :" +Integer.toBinaryString(k3));
	 
	}
*/

 /* // Q.19
  public static void main(String[] args)
	{
     int s;
	 String k="";
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter your number");
	 int t= sc.nextInt();
		while(t!=0)
		{  
			s=t%2;
			t=t/2;
	        k=s+k;
		}
     System.out.println("The Decimal To Binary Conversion Is "+k);
		
	}
*/
	
/*  // Q.20
	public static void main(String[] args)
	{
     int r;
	 String b="";
	 char[] c ={'0','1','2','3','4','5','6','7','8','9','10','A','B','C','D','E','F'};
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter your number");
	 int a= sc.nextInt();
		while(a!=0)
		{  
			r=a%16;
			a=a/16;
	        b=c[r]+b;
		}
     System.out.println("The Decimal To Hexadecimal Conversion Is "+b);
		
	}
*/

/* // Q.21
  public static void main(String[] args)
	{
     int k;
	 String t="";
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter your number");
	 int c= sc.nextInt();
		while(c!=0)
		{  
			k=c%8;
			c=c/8;
	        t=k+t;
		}
     System.out.println("The Decimal To Octal Conversion Is "+t);
		
	}
	
*/	

/* // Q.22
 public static void main(String[] args)
	{
	int i=0,k=0;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter your number in 10101 form");
	 int a= sc.nextInt();
		while(a!=0)
		{  
	       double l=Math.pow(2,i);
		   k=k+((int)l*(a%10));
		   a=a/10;
		   i++;
		}
     System.out.println("The Binary To Decimal Conversion Is "+k);
		
	}
 */
 
 /* // Q.23
 public static void main(String[] args)
	{
	int i=0,k=0,count;
	String b="";
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter your number in 10101 form");
	 int a= sc.nextInt();
		while(a!=0)
		{  count=0;
			while(count!=4)
			{
			int c=(a%10);
		     b=b+c;
			 a/=10;
			 count++;
			}
			a = Integer.parseInt(b);
		   
		}
     System.out.println("The Binary To HexaDecimal Conversion Is "+a);
			
	}
 */
 
 
 }
