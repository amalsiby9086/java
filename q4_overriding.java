 import java.util.*;
class shape
{
double dim1;
double dim2;
shape(double a,double b)
{
dim1=a;
dim2=b;
}
double area(){
System.out.println("Area for Shape is undefined:");
return 0;
}
}

class Rectangle extends shape
{
Rectangle(double a,double b)
{
super(a,b);
}
double area()
{
System.out.println("Inside area for rectangle.");
return dim1*dim2;
}
}

class Square extends shape
{
Square(double a,double b)
{
super(a,b);
}
double area(){
System.out.println("Inside area for square.");
return dim1*dim2;
}
}

class Circle extends shape
{
Circle(double a,double b)
{
super(a,b);
}
double area()
{
System.out.println("Inside area for circle.");
return dim1*dim2*3.14;
}
}


class q4_overriding
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a,l,b,r;
System.out.println("Enter the dimensions of Rectangle: ");
l=sc.nextDouble();
b=sc.nextDouble();
System.out.println("Enter dimensions of Square: ");
a=sc.nextDouble();
System.out.println("Enter dimensions of Circle: ");
r=sc.nextDouble();

shape sh =new shape(a,b);
Rectangle rec=new Rectangle(l,b);
Square sq=new Square(a,a);
Circle cir=new Circle(r,r);

shape shp;
shp=rec;
System.out.println("Area is : "+shp.area());
shp=sq;
System.out.println("Area is : "+shp.area());
shp=cir;
System.out.println("Area is : "+shp.area());

shp=sh;
System.out.println("Area is : "+shp.area());
sc.close();
}
}