package org.example

import java.io.PrintStream

fun toUTF8 () {
    System.setOut(PrintStream(System.out, true, "UTF-8"))
    System.setErr(PrintStream(System.err, true, "UTF-8"))
}