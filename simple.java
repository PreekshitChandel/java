class Area 
{
	void area(){
		System.out.println(" Area=0");
		}
	}
class Square extends Area {
	void area()//Sqaure 

	{
		int x=1;
	        int a=x*x;
		System.out.println(a);
	}
}
class Rectangle extends Area{
	void area()//Rectangle
	{
		int l=3;
	        int b = 1;
                int c= l*b;
		System.out.println(c);

	}
}
class simple
 {
 	public static void main(String[] args) {
 		Square s1 = new Square();
         s1.area();


 	} 


}