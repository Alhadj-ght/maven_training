package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void adding_2_numbers(){
        int number1 = 5;
        int number2 = 8;
        Sample s = new Sample();

        int sum = s.op(Sample.Operation.ADD,number1,number2);

        Assertions.assertThat(sum).as("Sum of two numbers number1 and number2")
            .isEqualTo(13);
    }


    @Test
    void multiplying_2_numbers(){
        int number1 = 5;
        int number2 = 2;
        Sample s = new Sample();

        int product = s.op(Sample.Operation.MULT,number1,number2);

        Assertions.assertThat(product).as("Product of two numbers number1 and number2")
            .isEqualTo(10);
    }

}
