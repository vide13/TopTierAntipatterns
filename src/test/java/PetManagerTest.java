import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class PetManagerTest {

    /*@Test void test1() {
        PetManager petManager = new PetManager();
        Assertions.assertNotNull(petManager);
    }*/

    @Test void testPetManagerCreation() {
        PetManager petManager = new PetManager();
        Assertions.assertNotNull(petManager);
    }
        /**
     * getPetArrayListByType
     * clear all pets
     */
    /*PetManager petManager = new PetManager();
    @Test void test2() throws InterruptedException {
        Pet pet1 = new Cat("Tobias","Munchkin");
        Pet pet2 = new Cat("Bolinhas","Munchkin");
        Pet pet3 = new Cat("Pandora","NormalCatto");
        Pet pet4 = new Cat("Bigodes","NormalCatto");
        petManager.addPet(pet1);
        petManager.addPet(pet2);
        petManager.addPet(pet3);
        petManager.addPet(pet4);

        ArrayList<Pet> newList = petManager.getPetArrayListByType("NormalCatto");
        Assertions.assertTrue(newList.contains(pet3) && newList.contains(pet4));

        petManager.removePet(pet1);
        sleep(1000);
        petManager.removePet(pet2);
        sleep(1000);
        petManager.removePet(pet3);
        sleep(5000);
        petManager.removePet(pet4);
        sleep(1000);
        Assertions.assertTrue(petManager.getAllPets().isEmpty());
    }*/

        @Test void testAddPet() throws InterruptedException {
        PetManager petManager = new PetManager();
        Pet pet1 = new Cat("Tobias","Munchkin");
        Pet pet2 = new Cat("Bolinhas","Munchkin");
        Pet pet3 = new Cat("Pandora","NormalCatto");
        Pet pet4 = new Cat("Bigodes","NormalCatto");
        petManager.addPet(pet1);
        petManager.addPet(pet2);
        petManager.addPet(pet3);
        petManager.addPet(pet4);

        ArrayList<Pet> newList = petManager.getPetArrayListByType("NormalCatto");
        Assertions.assertTrue(newList.contains(pet3) && newList.contains(pet4));
    }

    /*
    PetManager petManager = new PetManager();


    @Test void testRemovePet() throws  InterruptedException{
        Pet pet1 = new Cat("Tobias","Munchkin");
        petManager.addPet(pet1);
        petManager.removePet(pet1);
        Assertions.assertTrue(petManager.getAllPets().isEmpty());
    }


    /**
     * getPetByName

    @Test void testGetPetByName() {
        Pet pet1 = new Cat("Tobias","Munchkin");
        petManager.addPet(pet1);
        Assertions.assertEquals(petManager.getPetByName("Tobias"), pet1);
    }
    */

    @Test void testRemovePet() throws  InterruptedException{
        PetManager petManager = new PetManager();
        Pet pet1 = new Cat("Tobias","Munchkin");
        petManager.addPet(pet1);
        petManager.removePet(pet1);
        Assertions.assertTrue(petManager.getAllPets().isEmpty());
    }

    @Test void testGetPetByName() {
        PetManager petManager = new PetManager();
        Pet pet1 = new Cat("Tobias","Munchkin");
        petManager.addPet(pet1);
        Assertions.assertEquals(petManager.getPetByName("Tobias"), pet1);
    }

}
