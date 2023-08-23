package com.corffen.kdp.builder

import java.util.*

enum class Weapon {
    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    override fun toString(): String {
        return name.lowercase(Locale.US)
    }
}