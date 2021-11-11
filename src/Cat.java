public class Cat extends Animal {

    Cat(String name, int age, String color){
        super(name, age, color);
    }
    void voice() {
        System.out.println(this.name + " Мяу");
    }
    void walk() {
        System.out.println(name + " Ходит на лапках");
    }
}
