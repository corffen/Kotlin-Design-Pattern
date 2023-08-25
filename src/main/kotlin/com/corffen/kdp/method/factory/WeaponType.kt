package com.corffen.kdp.method.factory

enum class WeaponType(val title: String) {
    SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

    override fun toString(): String = title
}