package com.corffen.kdp.method.factory


class ElfWeapon(override val weaponType: WeaponType) : Weapon {
    override fun toString(): String {
        return "Elven $weaponType"
    }
}