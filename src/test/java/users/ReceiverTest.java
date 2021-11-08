package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    Receiver receiver;

    @BeforeEach
    void setUp() {
        receiver = new Receiver();
    }

    @Test
    void update() {
        receiver.update();
        assertEquals("The order is already delivered.", receiver.getStatus());
    }
}