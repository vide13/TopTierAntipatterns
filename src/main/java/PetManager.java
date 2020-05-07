import java.util.ArrayList;
import java.util.stream.Collectors;

public class PetManager {
    private ArrayList<Pet> petArrayList;

    PetManager() {
        this.petArrayList = new ArrayList<>();
    }

    public void addPet(Pet pet){
        petArrayList.add(pet);
    }

    ArrayList<Pet> getPetArrayListByType(String type) {
        if ("".equals(type))
            return null;
        return (ArrayList<Pet>) petArrayList.stream().filter(it -> it.getType().equals(type))
            .collect(Collectors.toList());
    }

    Pet getPetByName(String name) {
        if (name == null) {
            System.exit(-1);
        }
        for(Pet pet : petArrayList){
            if (pet.getName().equals(name)) return pet;
        }
        return null;
    }

    void removePet(Pet petToRemove) {
        petArrayList.remove(petToRemove);
    }

    ArrayList<Pet> getAllPets() {
        return petArrayList;
    }
}
