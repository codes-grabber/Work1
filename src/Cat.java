public class Cat extends Animal{

    Cat(String name) {
        super(name);
    }

    void run(int distance){
        System.out.println( (distance >= 200) ? name + " столько не пробежит" : name + " пробежал " + distance + " м" );
    }
    void swim(int distance){
        System.out.println(name + " не умеет плавать!");
    }


}
