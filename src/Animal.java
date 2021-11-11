public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;


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

