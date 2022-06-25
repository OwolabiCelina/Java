package ac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirconditionerTest {

    private Airconditioner airconditioner;

    @BeforeEach
    public void Cooling(){
        airconditioner = new Airconditioner();
    }

    @Test
    public void test_isOn() throws Exception {
        String on = airconditioner.isOn("on");
        Assertions.assertEquals(on, on);
    }

    @Test
    public void test_isOnIsNotValid() throws Exception {
        String onVar = airconditioner.isOn("pppp");
        Assertions.assertEquals(onVar, "pppp");
    }
}