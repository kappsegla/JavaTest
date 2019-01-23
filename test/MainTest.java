import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void readInt_ReturnIntValueFromScanner_IntValue10() throws IOException {

        try (InputStream inputStream = MainTest.class.getResourceAsStream("/input.txt")) {
            Scanner scanner = new Scanner(inputStream);

            Main main = new Main(scanner);
            int i = main.readInt();

            assertEquals(10, i);
        }
    }
}