package util

import java.io.File

fun listFromTextFile(file: String): List<String> {
    val lineList = mutableListOf<String>()

    File(file).useLines { lines -> lines.forEach { lineList.add(it) }}
    return lineList
}
fun listFromCSFile(file: String): Array<String>{

    val lineList = listFromTextFile(file)

    val line = lineList[0]

    return line.split(",").toTypedArray()


}