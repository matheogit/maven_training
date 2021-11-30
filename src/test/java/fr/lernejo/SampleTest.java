package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op_add_of_1_and_2_should_produce_3() {
        int a = 1;
        int b = 2;
        Sample sample = new Sample();
        int result = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(result).as("addition of 1 and 2")
            .isEqualTo(3);
    }

    @Test
    void op_multiplication_of_2_and_3_should_produce_3() {
        int a = 2;
        int b = 3;
        Sample sample = new Sample();
        int result = sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertThat(result).as("multiplication of 2 and 3")
            .isEqualTo(6);
    }

    @Test
    void fact_of_0_or_minus_should_produce_an_exception() {
        int factorial = -1;
        Sample sample = new Sample();

        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(factorial));
    }

    @Test
    void fact_of_5_should_produce_120() {
        int factorial = 5; // (1)
        Sample sample = new Sample();
        int result = sample.fact(factorial);
        Assertions.assertThat(result).as("fact of 5")
            .isEqualTo(120);
    }
}
