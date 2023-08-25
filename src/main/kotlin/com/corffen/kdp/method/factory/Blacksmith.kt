package com.corffen.kdp.method.factory

interface Blacksmith {
    fun manufactureWeapon(weaponType: WeaponType): Weapon
}
