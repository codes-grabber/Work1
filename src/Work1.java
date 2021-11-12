import planes.Plane;
import java.util.*;

public class Work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.Date utilDate = new java.util.Date();
        //java.sql.Date sqlDate = new java.sql.Date();
//        Bird bird = new Bird("Kesha", 5, "Yello", 56);
//        System.out.println(bird.name);
//        Parrot parrot = new Parrot("Popug", 6, "Green", 100);
//        parrot.speak();
//        Snake snake = new Snake("Kaa", 30, "black");
//        snake.walk();
//        parrot.walk();

//        Animal firstAnimal = new Bird("Chucha", 7, "red", 15);
//        Animal secondAnimal = new Snake("Нагайна", 50, "Пятнистая");
//        firstAnimal.voice();
//        secondAnimal.voice();
//        walk(parrot);

        Animal[] zoo = {
                new Bird("Chucha", 7, "red", 15),
                new Snake("Нагайна", 50, "Пятнистая"),
                new Parrot("Popugai", 4, "Желтый", 55),
                new Cat("Dusia", 8, "Borring"),
                new Dog("Sharik", 5, "Black")
        };

        short myShort = 16;
        byte myByte =(byte) myShort;

        for(Animal animal : zoo){
            if (animal instanceof Parrot){
                Parrot parrot = (Parrot) animal; // приводим animal к типу данных Parrot чтобы получить доступ с его методу speak
                parrot.speak();
            }


            animal.voice();
        }



        Point p1 = new Point(1,1);
        Point p2 = new Point(2,3);
        double x = Point.getDistance(p1, p2);
        System.out.println(x);

        double x2 = p1.getDist(p2);
        System.out.println(x2);
        p1.setX(10);
        System.out.println(p1.getX());




        //        Building firstBuilding = new Building();
//        Building secondBuilding = new Building();
//        Cat firstCat = new Cat();
//        firstCat.name = "Васька";
//        firstCat.walk();
//        firstCat.voice();
//
//
//        System.out.println(bird.name);

        //Building.printCount();
    }

    public static void walk(Animal animal){
        animal.walk();
    }
}