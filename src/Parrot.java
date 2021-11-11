public class Parrot extends Bird{

    Parrot(String name, int age, String color, int height) {
        super(name, age, color, height); //ищет автоматически конструктор Bird
    }

    void speak(){
        System.out.println(name + " Хочет крекер");
    }
}