public class PersonTest {
    public static  void main(String[] args){
        Person p1= new Person();
        p1.name="Jack";
        p1.age=24;
        p1.gendar='男';
        System.out.println("name ="+p1.name+",age ="+p1.age+",gendar ="+p1.gendar);
        p1.eat();
        p1.sleep(8);
        p1.interests("画画");



    }
}
