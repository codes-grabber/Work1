public class Dog extends Animal {

    Dog(String name, int age, String color){
        super(name, age, color);
    }

    void voice() {
        System.out.println(this.name + " Гав");
    }

}