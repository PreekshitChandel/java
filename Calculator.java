


class Calculator 
{

	public static void main(String[] args) 
	{       
		int ch=1;

		System.out.println("\n\t  ++++++++^^^^^^^^^^^^^++++++++");
		System.out.println("\t        ***  CALCULATOR*** ");
		System.out.println("\t    +++++++^^^^^^^^^^^^^^++++++++\n");
		System.out.println("\t  1. addition ");
		System.out.println("\t  2. substraction");
		System.out.println("\t  3. multiplication ");
		System.out.println("\t  4. division \n\n");


		switch (ch) 
		{ 
			case 1 : {   
				         int a=1, b=1;
				         System.out.println("\t        ADDITION  ");
				         System.out.println("\t                  ");
				         System.out.println("\t   First Number is : " +a);
				         System.out.println("\t   Second Number is : " +b+"\n");
				         int x=a+b;
				         System.out.println("\t   Result : "+x);
				         


			}

			case 2 : {
				
				        int a=2, b=1;
				        System.out.println("\t    SUBSTRACTION ");
				        System.out.println("\t                ");
				        System.out.println("\t First Number is : " +a);
				        System.out.println("\t  Second Number is : " +b+"\n");
				        int x=a-b;
				        System.out.println("\t  Result : "+x+ "\n" );
				        

			}

			case 3 : {
				        int a=4, b=2;
				         System.out.println("\t     MULTIPLICATION        ");
				         System.out.println("\t                ");
				         System.out.println("\t First Number is : " +a);
				         System.out.println("\t  Second Number is : " +b+"\n");
				         int x=a*b;
				         System.out.println("\t  Result : "+x );
				         
			}

			case 4 : {
				        int a=8, b=2;
				        System.out.println("\t      DIVISION      ");
				        System.out.println("\t                   ");
				         System.out.println("\t First Number is : " +a);
				         System.out.println("\t  Second Number is : " +b+"\n");
				         int x=a/b;
				         System.out.println("\t  Result : "+x );
				         

			}
			
		}

		
	}
}