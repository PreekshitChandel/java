class Area
{
	float a;
	float b;
	float l;

float AREA1(float a)
{
	float x = 4*a*a;

return x;
}

void AREA2(float l,float b){
float Y = l*b;

}
public static void main(String[] args) {
	Area a1 = new Area();
	a1.a=20;
	a1.l=20;
	a1.b=20;


System.out.println(a1.AREA1(a1.a));
a1.AREA2(a1.l,a1.b);
	
}
}
