package com.example.kotest_app

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest : FunSpec({
    test("Test case 1") {
        val clc = Calculations()
        val total = clc.additionOfTwoNumbers(2, 2)
        total shouldBe 4
    }

    test("Test case 2") {
        val clc = Calculations()
        val total = clc.additionOfTwoNumbers(3, 2)
        total shouldBe 5
    }


    test("Test case 3") {
        val clc = Calculations()
        val total = clc.additionOfTwoNumbers(3, 3)
        total shouldBe 6
    }
})
