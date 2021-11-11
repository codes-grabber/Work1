public class Bird extends Animal {

    int height;

    Bird(String name, int age, String color, int height){
        super(name, age, color);
        this.height = height;
    }


    void voice() {
        System.out.println(this.name + " Чирик");
    }
    void walk() {
        System.out.println(name + " Ходит на лапках");
    }
}
