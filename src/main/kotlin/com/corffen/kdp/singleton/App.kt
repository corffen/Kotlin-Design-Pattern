package com.corffen.kdp.singleton

fun main() {
    val instance1 = IvoryTower
    val instance2 = IvoryTower

    println("ivory instance 1 = $instance1")
    println("ivory instance 2 = $instance2")


    val enumIvoryTower1 = EnumIvoryTower.INSTANCE
    val enumIvoryTower2 = EnumIvoryTower.INSTANCE

    println("enumIvory1 = $enumIvoryTower1")
    println("enumIvory2 = $enumIvoryTower2")

    val jackManager2 = SingletonManager.getInstance("jack")
    jackManager2.test("hahha")
    jackManager2.test("xixi")

    println("jack 2 = $jackManager2")
}