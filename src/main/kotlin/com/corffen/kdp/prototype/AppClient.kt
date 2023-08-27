package com.corffen.kdp.prototype

fun main() {
    var proto: Mage = ElfMage("cooking")
    var mage = proto.copy()
    println(mage.toString())

    proto = OrcMage("axe")
    mage = proto.copy()
    println(mage.toString())
}
