package template.apptemplate.utils

import android.util.Log

class Logger {
    private val TAG = "MyApp"

    fun d(message: String) {
        val stacktrace = Thread.currentThread().stackTrace[3]
        Log.d(TAG, "(${stacktrace.fileName}:${stacktrace.lineNumber}) $message")
    }

    fun d(message: String, e: Throwable) {
        val stacktrace = Thread.currentThread().stackTrace[3]
        Log.d(TAG, "(${stacktrace.fileName}:${stacktrace.lineNumber}) $message")
        e?.stackTrace?.forEach {
            Log.d(TAG, "  at ${it.className}.${it.methodName}(${it.fileName}:${it.lineNumber})")
        }
    }

    fun e(message: String, e: Throwable) {
        Log.e(TAG, message, e)
    }
}