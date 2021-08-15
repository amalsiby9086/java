 import java.util.*;
class shapeArea
{
    void Area(int x)
    {
        System.out.println("Area of the square: "+x*x+" sq units");
    }
    void Area(double x, double y)
    {
        System.out.println("Area of the rectangle: "+x*y+" sq units");
    }
    void Area(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle: "+area+" sq units");
    }
}
class q1_overloading
{
    public static void main(String args[]){
	Scanner sc=new
	Scanner(System.in);
        shapeArea obj = new shapeArea();
	int a;
	double x,y;
	double r;
	System.out.println("Enter length of square: ");
	a=sc.nextInt();
	obj.Area(a);

	System.out.println("Enter length and breadth of rectangle: ");
	x=sc.nextDouble();
	y=sc.nextDouble();
	obj.Area(x,y);

	System.out.println("Enter radius of circle: ");
	r=sc.nextDouble();
	obj.Area(r);
	sc.close();
    }
}