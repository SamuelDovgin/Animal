import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Main!");
        ArrayList<Dog> dogList = new ArrayList<>(5);

        dogList.add(new Dog("Honey", "1", "Golden Retriver", "calm and happy"));
        dogList.add(new Dog("Alice", "2", "Pomeranian", "angry and small"));

        dogList.get(0).bark("Bark");
        dogList.get(0).register(new VaccinationRecord());
        dogList.get(1).register(new VaccinationRecord());
        dogList.get(1).register(new VaccinationRecord());
    }
}

