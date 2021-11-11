public class Dog extends Animal{
    Dog(String name) {
        super(name);
    }
    void run(int distance){
        System.out.println( (distance >= 500) ? name + " столько не пробежит" : name + " пробежал " + distance + " м" );
    }
    void swim(int distance){
        System.out.println( (distance >= 10) ? name + " столько не проплывет" : name + " проплыл " + distance + " м" );
    }
}
