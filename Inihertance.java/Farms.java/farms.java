
public interface farms {
    
    public void listOfAnimals();
    public void informationAboutThem();
}
public class AboutMyFarm implements farms
{
    void listOfAnimals()
    {
        System.out.println("Here there is a list of Animals found in my Farm\nHene\nGoats\nCows\nDuck\nPigs");
    }
    void informationAboutThem()
    {
        System.out.println("The information about all of those animals in my Farm, is that they like to have a fun");
    }

    public void About()
    {
        System.out.println("This farm helps to feed my family");

    }
    public class Cows extends AboutMyFarm{
void infoAboutCows(){
   void infoAboutCows(){
    System.out.println("This is a correction of my Cows");
   }
}

}  

public class Goats extends Cows
{
     public infoAboutGoats(){
       System.out.println("This is a correction of my Goats");
     }
}

public class Hene extends Goats implements Goats farms{
    void infoAboutHene(){
        System.out.println("This is a correction of my Hene");
    }
}

