package com.corffen.kdp.builder

enum class Profession {
    WARRIOR, THIEF, MAGE, PRIEST;

    override fun toString(): String {
        return name.lowercase()
    }
}
