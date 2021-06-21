class Assignment2
{
 /* // Q 1
public static void main(String args[])
 {
  for(int i=1;i<=5;i++)
  {
	for(int j=1;j<=i;j++)
	{
	  System.out.print(j+" ");
	}
	System.out.println();
  }
 }
 */
 
 /* // Q 2
 public static void main(String args[])
 {
   int beeta=64;
   for(int i=1;i<=5;i++)
   {
	  for (int j=1;j<=i;j++)
	  {
		 System.out.print((char)(beeta+j)+" ");
	  }
	  System.out.println();
   }
 }
 */
 
 /* // Q 3
 public static void main(String args[])
 {
	 for(int i=1;i<=5;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print("* ");
		 }
		 System.out.println();
	 }
 }
 */
 
 /* // Q 4
 public static void main(String args[])
 {
  for(int i=1;i<=5;i++)
  {
	for(int j=1;j<=i;j++)
	{
	  System.out.print(i+" ");
	}
	System.out.println();
  }
 }
 */
 
 /* // Q 5
 public static void main(String args[])
 {
   int beeta=64;
   for(int i=1;i<=5;i++)
   {
	  for (int j=1;j<=i;j++)
	  {
		 System.out.print((char)(beeta+i)+" ");
	  }
	  System.out.println();
   }
 }
 */
 
 /*  // Q 6
 public static void main(String args[])
 {
	 for(int i=1;i<=5;i++)
	 {
		 for(int k=4;k>=i;k--)
		 {
		    System.out.print("  ");
		 }
		 for(int j=1;j<=i;j++)
		 {
			System.out.print("* ");
		 }
		 System.out.println();
	 }
  }
  */
  
/* // Q.7
  public static void main(String args[])
 {
	 int s=0;
	 for(int i=1;i<=5;i++)
	 {
		 for(int k=5;k>=1;k--)
		 {
			if(k>i)
			System.out.print(" ");
		    else
			{
				s=s+1;
				System.out.print(" "+s);
			}
		 }
		 s=0;
		 System.out.println();
	 }
  }
  */
  
  /* // Q. 8
  public static void main(String args[])
  {
	 int k=6;
    for(int i=1;i<=5;i++)
	{
	  for(int c=5;c>=1;c--)
	  {
		if(c>i)
			System.out.print(" ");
		else
		{
			System.out.print(" "+(k-c));
		}
	  }
	  System.out.println();
	}
  }
  */
  
  /* // Q.9
  public static void main(String args[])
  {
	int alpha=64;
	for(int i=1;i<=5;i++)
	{
	  for(int j=5;j>=1;j--)
	  {
		 if(j>i)
			 System.out.print(" ");
		 else
		 {
			 alpha=alpha+1;
			 System.out.print(" "+(char)alpha);
		 }
	  }
	  alpha=64;
	  System.out.println();
	}
  }
  */
  
 /*  // Q.10 
  public static void main(String args[])
  {
	int alpha=70;
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=1;j--)
		{
		  if(j>i)
			  System.out.print(" ");
		  else
			  System.out.print(" "+(char)(alpha-j));
		}
		System.out.println();
	}
  }
  */
  
/*  // Q. 11 
 public static void main(String args[])
  {
	for(int i=0;i<=5;i++)
	{
	 for(int j=5;j>=1;j--)
	 {
		if(j>i)
			System.out.print(" ");
		else
			System.out.print("*");
	 }
	 
	 for(int k=2;k<=i;k++)
	 {
		System.out.print("*");
	 }
	 System.out.println();
	}
  }
  */
  
 /* // Q. 12 
  public static void main(String args[])
  {
	for(int i=1;i<=5;i++)
	{
	  for(int j=5;j>=1;j--)
	  {
	    if(j>i)
		 System.out.print(" ");
	    else
			System.out.print(" "+i);
	  }
	  System.out.println();
	}
  }
  */
  
  /*  // Q. 13
  public static void main(String args[])
  {
	  int alpha=64;
	for(int i=1;i<=5;i++)
	{
	  for(int j=5;j>=1;j--)
	  {
	    if(j>i)
		 System.out.print(" ");
	    else
			System.out.print(" "+(char)(alpha+i));
	  }
	  System.out.println();
	}
  }
  
  */
  
  /* // Q.14
  public static void main(String args[])
  {
	  int s=0;
	  for(int i=1;i<=5;i++)
	  {
		 for(int j=5;j>=i;j--)
		 {
			 s=s+1;
			 System.out.print(s+" ");
		 }
		 s=0;
		 System.out.println();
	  }
  }
  
  */
  
  /*  // Q.15
  public static void main(String args[])
  {
	  for(int i=1;i<=5;i++)
	  {
		for(int j=5;j>=1;j--)
		{
			if(j>=i)
			System.out.print(j+" ");
		}
		System.out.println();
	  }
  }
  */
  
  /* // Q.16
  public static void main(String args[])
  {
	  int k=5;
	  for(int i=1;i<=5;i++)
	  {
		for(int j=1;j<=i;j++)
		{
			System.out.print(k+" ");
			k=k-1;
		}
		k=5;
		System.out.println();
	  }
  }
  */
  
  /*  // Q.17
  public static void main(String args[])
  {
	  int k=1;
	  for(int i=1;i<=5;i++)
	  {
		for(int j=1;j<=i;j++)
		{
			System.out.print((k++)+" ");
		}
		System.out.println();
	  }
  }
  */ 
  
  /* // Q.18
  public static void main(String args[])
  {
	  int alpha=64;
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=5;j>=i;j--)
		  {
			  alpha=alpha+1;
			  System.out.print((char)alpha+" ");
		  }
		  alpha=64;
		  System.out.println();
	  }
  }
  */
  
  /* // star p1
  public static void main(String args[])
  {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
		  System.out.print("*");
		}
		System.out.println();
	}		
  }
  */
  
  /* // p2
  public static void main(String args[])
  {
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>i;j--)
		{
		  System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
		  System.out.print("*");
		}
		System.out.println();
	}		
  }
  */
  
  /* // p3
   public static void main(String args[])
  {
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
		  System.out.print("*");
		}
		
		System.out.println();
	}		
  }
  */
  
  
  /* // p4
  public static void main(String args[])
  {
	for(int i=1;i<=5;i++)
	{
		for(int j=2;j<=i;j++)
		{
		  System.out.print(" ");
		}
		for(int k=5;k>=i;k--)
		{
		  System.out.print("*");
		}
		System.out.println();
	}		
  }
  */


/* // p5
  public static void main(String args[])
  {
	  for(int i=1;i<=5;i++)
	  {
		for(int j=5;j>=i;j--)
		{
		 System.out.print(" ");	
		}
		for(int k=1;k<=i;k++)
		{
		 System.out.print("*");
		}
		for(int c=2;c<=i;c++)
		{
			System.out.print("*");
		}
		System.out.println();
	  }
  }
  
 */
 
/* // p6
  public static void main(String args[])
  {
	  for(int i=1;i<=5;i++)
	  {
		for(int j=2;j<=i;j++)
		{
		 System.out.print(" ");	
		}
		for(int k=5;k>=i;k--)
		{
		 System.out.print("*");
		}
		for(int c=4;c>=i;c--)
		{
			System.out.print("*");
		}
		System.out.println();
	  }
  }
  
  */
  
  /*  // p7
  public static void main(String args[])
  {
	  for(int i=1;i<=5;i++)
	  {
		for(int j=4;j>=i;j--)
		{
		 System.out.print(" ");	
		}
		for(int k=1;k<=i;k++)
		{
		 System.out.print("*");
		}
		for(int c=2;c<=i;c++)
		{
			System.out.print("*");
		}
		System.out.println();
	  }
	  for(int i=1;i<=4;i++)
	  {
		for(int j=1;j<=i;j++)
		{
		 System.out.print(" ");	
		}
		for(int k=4;k>=i;k--)
		{
		 System.out.print("*");
		}
		for(int c=3;c>=i;c--)
		{
			System.out.print("*");
		}
		System.out.println();
	  }
  }
  */

/* // p8
  public static void main(String args[])
  {
	 for(int i=1;i<=5;i++)
	 {
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
            System.out.println();		
	 }
  
    for(int i=1;i<=4;i++)
	 {
		for(int j=4;j>=i;j--)
		{
			System.out.print("*");
		}
            System.out.println();		
	 }
  }
  */
  
  /*  // p9
   public static void main(String args[])
  {
	 for(int i=1;i<=5;i++)
	 {
		for(int m=4;m>=i;m--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
            System.out.println();		
	 }
  
    for(int i=1;i<=4;i++)
	 {
		for(int f=1;f<=i;f++)
		{
			System.out.print(" ");
		}
		for(int j=4;j>=i;j--)
		{
			System.out.print("*");
		}
            System.out.println();		
	 }
  }
  */
  
  /* // p10
  public static void main(String args[])
  {
	for(int i=1;i<=5;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=5;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
  }
  */
  
 /*  // p11 
  public static void main(String args[])
  {
	for(int i=1;i<=5;i++)
	{
		for(int j=2;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=5;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
  }
  */
  
  /* // p12
  public static void main(String args[])
  {
	for(int i=1;i<5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int t=1;t<=5;t++)
	{
	  for(int k=1;k<=t;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
  }
  */
  
  /*  // p13
  public static void main(String args[])
  {
	for(int i=1;i<5;i++)
	{
		for(int s=2;s<=i;s++)
		{
			System.out.print(" ");
		}
		for(int j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int t=1;t<=5;t++)
	{
	    for(int s=4;s>=t;s--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=t;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
  }
  */
  
  /* // p14
  public static void main(String args[])
  {
	for(int i=1;i<=5;i++)
	{
	  for(int j=1;j<=5;j++)
	  {
		if(j<i)
			System.out.print(" ");
		else
			System.out.print(" *");
	  }
	  System.out.println();
	}
	 for(int i=2;i<=5;i++)
	{
	  for(int j=5;j>=1;j--)
	  {
		if(j>i)
			System.out.print(" ");
		else
			System.out.print(" *");
	  }
	  System.out.println();
	} 
  }
  */
  
  /*  // pyramid p1
  public static void main(String args[])
  {
	 for(int i=1;i<=9;i++)
	 {
	   for(int j=9;j>=1;j--)
	   {
	     if(j>i)
		   System.out.print(" ");
	     else
		   System.out.print(" "+i);
	   }
	   System.out.println();
	 }
  }
  */
  
  
  /* // pyramid p2
  public static void main(String args[])
  {  
  int k=1;
	 for(int i=1;i<=9;i++)
	 {
	   for(int j=9;j>=1;j--)
	   {
	     if(j>i)
		   System.out.print(" ");
	     else
		 {
		   System.out.print(" "+k);
	       k=k+1;
		 }
	   }
	   k=1;
	   System.out.println();
	 }
  }
  */
  
  /* // pyramid p3
  public static void main(String args[])
  {  
	 for(int i=1;i<=9;i++)
	 {
	   for(int j=9;j>=1;j--)
	   {
	     if(j>i)
		   System.out.print(" ");
	     else
		 {
		   System.out.print(" *");
		 }
	   }
	   System.out.println();
	 }
  }
  */
  
  
  /* // pyramid p4
  public static void main(String args[])
  {
	  
	  for(int i=1;i<=9;i++)
	  {
		  for(int j=8;j>=i;j--)
		  {
			  System.out.print("  ");
		  }
		  for(int k=1;k<=i;k++)
		  {
			  System.out.print(k+" ");
		  }
		  for(int c=1;c<i;c++)
		  {
			  System.out.print(i-c+" ");
		  }
		  System.out.println();
	  }
  }
  */
  
  /*  // pyramid p5
  public static void main(String[] args)
	{
	   for(int s=9;s>=1;s--)
	   {
			for(int j=1;j<=s-1;j++)
			{
			System.out.print("  ");
			}
		    for(int k=s;k<=9;k++)
			{
			System.out.print(k+" ");
			}
			for(int p=8;p>=s;p--)
			{
			System.out.print(p+" ");
			}
			System.out.println();
	    }
	}
	*/
	
/* // 	pyramid p6
	public static void main(String args[])
  {  
	 for(int i=1;i<=9;i++)
	 {
	   for(int j=1;j<=9;j++)
	   {
	     if(j<i)
		   System.out.print(" ");
	     else
		 {
		   System.out.print(" *");
		 }
	   }
	   System.out.println();
	 }
  }
  */
  
  
  /*  // pyramid p7
  public static void main(String args[])
  {  int k=9;
	 for(int i=1;i<=9;i++)
	 {
	   for(int j=1;j<=9;j++)
	   {
	     if(j<i)
		   System.out.print(" ");
	     else
		 {
		   System.out.print(" "+k);
		 }
	   }
	   k=k-1;
	   System.out.println();
	 }
  }
  */
  
 
 /* // Half Pyramid
 public static void main(String args[])
  {  
	 for(int i=1;i<=6;i++)
	 {
	   for(int j=1;j<=i;j++)
	   {
	     System.out.print("* ");
	   }
	   System.out.println();
	 }
  }
  */


/*  // inverted Half Pyramid
 public static void main(String args[])
  {  
	 for(int i=1;i<=7;i++)
	 {
	   for(int j=7;j>=1;j--)
	   {
	     if(j>i)
		   System.out.print(" *");
	     else
		 {
		   System.out.print(" ");
		 }
	   }
	   System.out.println();
	 }
  }
  
  */

 
 /* // full pyramid
 public static void main(String args[])
  {  
	 for(int i=1;i<=6;i++)
	 {
	   for(int j=6;j>=1;j--)
	   {
	     if(j>i)
		   System.out.print("  ");
	     else
		 {
		   System.out.print("   *");
		 }
	   }
	   System.out.println();
	 }
  }
  */
  
  public static void main(String args[])
  {  
	 for(int i=1;i<=6;i++)
	 {
	   for(int j=1;j<=6;j++)
	   {
	     if(j<i)
		   System.out.print("  ");
	     else
		 {
		   System.out.print("   *");
		 }
	   }
	   System.out.println();
	 }
  }
}