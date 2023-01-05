package jp.stenhousebayroad.sample.mylibrary

import android.os.SystemClock

object LibrarySample {
    fun hello(): String {
        // FIXME
        val start = SystemClock.elapsedRealtime()
        val end = SystemClock.elapsedRealtime()
        println("time: ${end - start}")

        return "Hello"
    }
}