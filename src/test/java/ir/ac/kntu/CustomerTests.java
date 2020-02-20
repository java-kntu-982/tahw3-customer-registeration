package ir.ac.kntu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

/**
 * @author your name
 */
public class CustomerTests {

    // write test for important methods

    @BeforeEach
    public void prepare() {
        // TODO: 2/20/2020 - complete if necessary
    }

    @BeforeAll
    public static void setUp() {
        // TODO: 2/20/2020  - complete if necessary
    }

    //simple example - can change if you want
    @Test
    public void nonDefaultConstructor() {
        Stream.of(Customer.class.getDeclaredConstructors())
                .filter(x -> x.getParameterCount() > 1)
                .findAny()
                .ifPresentOrElse(
                        (z) -> System.err.println("Constructor OK! :" + z),
                        () -> Assertions.fail("There should be at least one " +
                                "non-default constructor!"));
    }
}
