package yu;

interface A{
default public void m1() {
	System.out.println("111111111");
}
}

 class B{
public  void m1()
{System.out.println("2222222");
	
	}
}

public class HelloWorld extends B implements A{




 public static void main(String []args){
     A a=new HelloWorld();
     a.m1();
    System.out.println("Hello World");
 }
}