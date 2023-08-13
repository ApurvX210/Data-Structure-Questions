import java.util.Scanner;

public class basic {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Apurv a=new Apurv("Apurv", 20);
        System.out.println(a.name+" "+a.age);
        Object o=new Object();
        o.
    }
}
class Child extends Apurv{

    Child(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
    }
    
}
class Apurv{
    String name;
    int age;
    static int count;
    Apurv(int age){
        this.age=age;
        System.out.println("Apurv.Apurv()");
    }
    Apurv(String name,int age){
        this(age);
        this.name=name;
        System.out.println("Apurv.Apurv()");
    }
}
