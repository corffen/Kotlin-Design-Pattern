package com.corffen.kdp.method.factory

class OrcWeapon(override val weaponType: WeaponType) : Weapon {
    override fun toString(): String {
        return "Orcish $weaponType"
    }
}
