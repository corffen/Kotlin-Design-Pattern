package com.corffen.kdp.method.factory

class FactoryMethodClient(var blacksmith: Blacksmith) {

    fun manufactureWeapons() {
        println(blacksmith.manufactureWeapon(WeaponType.SPEAR))
        println(blacksmith.manufactureWeapon(WeaponType.AXE))
    }
}