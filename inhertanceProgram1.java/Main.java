public class Main {
    
        public static void main(String[] args) {
            
             farms animal;
            /**
             animal = new AboutMyFarm();
            animal.listOfAnimals();
            animal.informationAboutThem();
            animal.About();
    
            animal = new Cows();
            animal.infoAboutCows();
    
           animal = new Goats();
           animal.infoAboutGoats();
    
           animal = new Hene();
           animal.infoAboutHene();
           */
        animal = new AboutMyFarm();
        animal.listOfAnimals();
        animal.informationAboutThem();
        ((AboutMyFarm) animal).About();

        animal = new Cows();
        animal.listOfAnimals();
        animal.informationAboutThem();
        ((Cows) animal).infoAboutCows();

        animal = new Goats();
        animal.listOfAnimals();
        animal.informationAboutThem();
        ((Goats) animal).infoAboutGoats();

        animal = new Hene();
        animal.listOfAnimals();
        animal.informationAboutThem();
        ((Hene) animal).infoAboutHene();
    
       
    }
    
}
