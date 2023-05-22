package com.example.kotest_app

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class CalculationTest : DescribeSpec({
    val clc = Calculations()

    describe("Sum of two numbers") {
        it("Test Case : 1") {
            val result = clc.additionOfTwoNumbers(2, 2)
            result shouldBe 4
        }
        it("Test Case : 2") {
            clc.additionOfTwoNumbers(3, 2) shouldBe 5
        }
        it("Test Case : 3") {
            clc.additionOfTwoNumbers(4, 2) shouldBe 6
        }
        it("Test Case : 4") {
            clc.additionOfTwoNumbers(2, 4) shouldBe 6
        }
    }

    describe("Difference of two numbers") {
        it("Test Case : 1") {
            val result = clc.subtractionOfTwoNumbers(2, 2)
            result shouldBe 0
        }
        it("Test Case : 2") {
            clc.subtractionOfTwoNumbers(3, 2) shouldBe 1
        }
        it("Test Case : 3") {
            clc.subtractionOfTwoNumbers(4, 2) shouldBe 2
        }
        it("Test Case : 4") {
            clc.subtractionOfTwoNumbers(2, 4) shouldBe 2
        }
    }

    describe("multiplication of two numbers") {
        it("Test Case : 1") {
            val result = clc.multiplicationOfTwoNumbers(2, 2)
            result shouldBe 4
        }
        it("Test Case : 2") {
            clc.multiplicationOfTwoNumbers(3, 2) shouldBe 6
        }
        it("Test Case : 3") {
            clc.multiplicationOfTwoNumbers(4, 2) shouldBe 8
        }
        it("Test Case : 4") {
            clc.multiplicationOfTwoNumbers(2, 4) shouldBe 8
        }
    }

    describe("Division of two numbers") {
        it("Test Case : 1") {
            val result = clc.divisionOfTwoNumbers(2, 2)
            result shouldBe 1
        }
        it("Test Case : 2") {
            clc.divisionOfTwoNumbers(3, 2) shouldBe 1
        }
        it("Test Case : 3") {
            clc.divisionOfTwoNumbers(4, 2) shouldBe 2
        }

        it("Test Case : 4") {
            clc.divisionOfTwoNumbers(2, 0) shouldBe 0
        }
    }
})
