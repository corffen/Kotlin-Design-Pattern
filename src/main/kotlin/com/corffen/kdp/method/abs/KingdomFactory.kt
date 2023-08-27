package com.corffen.kdp.method.abs

interface KingdomFactory {
    fun createCastle(): Castle
    fun createArmy(): Army
    fun createKing(): King
}
