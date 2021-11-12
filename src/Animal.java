public abstract class Animal {
    final protected String name;
    final protected String color;
    final protected int age;


    Animal(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void walk() {
        System.out.println(name + " Ходит на лапках");
    }
    abstract void voice();
}