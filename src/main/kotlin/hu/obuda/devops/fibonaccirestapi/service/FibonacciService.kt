package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        var number1 = 0
        var number2 = 1
        var sum = 1

        for (i in 1 until n) {
            sum = number1 + number2
            number1 = number2
            number2 = sum
        }
        return sum
    }
}