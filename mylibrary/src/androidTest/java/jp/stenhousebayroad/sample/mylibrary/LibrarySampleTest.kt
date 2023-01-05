package jp.stenhousebayroad.sample.mylibrary

import org.junit.Test

class LibrarySampleTest {
    @Test
    fun testHello() {
        assert(LibrarySample.hello() == "Hello")
    }
}