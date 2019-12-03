package aoc.two

import util.listFromCSFile

fun main(args: Array<String>){

    var cmds = listFromCSFile("txt/two.txt")

    cmds[1] = "12"
    cmds[2] = "2"

    var i = 0
    while (cmds[i].toInt() != 99) {

        var i0 = cmds[i].toInt()


        var i1 = cmds[i+1].toInt()
        var i2 = cmds[i+2].toInt()
        var i3 = cmds[i+3].toInt()

        if (i0 == 1) {
            cmds[i3] = (cmds[i1].toInt() + cmds[i2].toInt()).toString()
        }
        else if (i0 == 2){
            cmds[i3] = (cmds[i1].toInt() * cmds[i2].toInt()).toString()
        }

        i+=4
    }


    print(cmds[0])
}