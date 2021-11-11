public class Work1 {
    public static void main(String[] args) {
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
                new Cat("Dusia", 8, "Borring"),
                new Dog("Sharik", 5, "Black")
        };

        for(Animal animal : zoo){
            animal.voice();
        }


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