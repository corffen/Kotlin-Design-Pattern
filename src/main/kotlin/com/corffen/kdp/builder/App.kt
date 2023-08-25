package com.corffen.kdp.builder

fun main() {
    val mage = createHero(Profession.MAGE, "Riobard") {
        hairColor = HairColor.BLACK
        weapon = Weapon.DAGGER
    }
    println(mage)

    val thief = Hero.Builder(Profession.THIEF, "robot")
        .withHairColor(HairColor.BROWN)
        .withArmor(Armor.CHAIN_MAIL)
        .withHairType(HairType.BALD)
        .withWeapon(Weapon.DAGGER)
        .build()
    println(thief)
}
