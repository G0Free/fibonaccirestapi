package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.http.HttpStatus

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(0, result)
    }

    // TODO - Test with greater numbers and test edge cases
    @Test
    fun shouldReturn8WhenCall6(){
        //given
        val input = 6;
        //when
        val result: Int = underTest.fibonacci(input)
        //then
        Assertions.assertEquals(8, result)
    }
}