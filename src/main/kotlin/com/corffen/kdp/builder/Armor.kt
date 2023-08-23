package com.corffen.kdp.builder

enum class Armor(val title: String) {
    CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

    override fun toString() = title
}