class Star13
{
   public static void main(String [] args)
   {
     for(int i=1; i<=5;i++)
	 {
		 for(int j =2; j<=i; j++)
		    {
			 System.out.print(" ");
		    }
	     for (int j=5;j>=i;j--)
	        {
		     System.out.print("*");
		    }System.out.println();
	 }
	  for(int k=2; k<=5;k++)
	 {
		 for(int j =4; j>=k; j--){
			 System.out.print(" ");
		 }
	     for (int j=1;j<=k;j++)
	     {
		     System.out.print("*");
		 }System.out.println();
	 }
   }
}