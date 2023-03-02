//Fundamentals

public class MainClass {
    public static void main(String [] args){
       // System.out.println("Hello Srikant !!How are you? ");
        person p1=new person();
        person p2=new person();
        p2.age=56;
        p2.name="Srk";
        p1.age=24;
        p1.name="Srikant";
        System.out.println(p1.age +" \n"+p1.name);
        System.out.println(p2.age +" \n"+p2.name);
        p1.eat();
        p1.walk();

        //compile time polymorphism
        p1.walk(2);
        p2.walk(5);
    }
}
 class person{
    String name;
    int age;
        void walk(){
            System.out.println(name+ "  Walking");

        }
        void eat(){
            System.out.println(name +" eating");
        }
        void walk(int steps){
            System.out.println(name +"  walking  "+steps+" Steps");
        }
 }
/*24
Srikant
56
Srk
Srikant eating
Srikant  Walking
Srikant  walking  2 Steps
Srk  walking  5 Steps
*/