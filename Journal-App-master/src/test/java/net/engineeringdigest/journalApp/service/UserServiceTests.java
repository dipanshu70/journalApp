package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Disabled                                           //Now this test will not run
    @Test
    public void testFindByUsername(){
        assertEquals(4,2+2);
        assertTrue(5>3);
        assertNotNull(userRepository.findByusername("Ram"));
    }

    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,10,12",
//            "3,3,9"                  This will show error
    })
    public void test(int a, int b, int expected){
        assertEquals(expected, a + b , "Failed for : " + a + "," + b + "," + expected);
    }
}
