public class Snake extends Animal{
    Snake(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void walk() {
        System.out.println(name + " ползет");
    }
    void voice(){
        System.out.println(name + " шипит");
    }
}