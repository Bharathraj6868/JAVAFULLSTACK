class Calculator{

public static void main(String args[]){
add (100,200);
add (400,300);
add (500,600);

sub (100,200);
sub (400,300);
sub (500,600);

div (100,200);
div (400,300);
div (500,600);

mul (100,200);
mul (400,300);
mul (500,600);
}
public static void add(int num1, int num2){
int total=num1+num2;
System.out.println(total);
}

public static void sub(int num1,int num2){
int total=num1-num2;
System.out.println(total);
}

public static void div(int num1,int num2){
int total=num1/num2;
System.out.println(total);
}

public static void mul(int num1,int num2){
int total=num1*num2;
System.out.println(total);
}
}
