import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PetManagerTest {

    @Test void test1() {
        PetManager petManager = new PetManager();
        Assertions.assertNotNull(petManager);
    }
}
