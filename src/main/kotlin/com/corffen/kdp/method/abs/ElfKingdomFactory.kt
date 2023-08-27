package com.corffen.kdp.method.abs

class ElfKingdomFactory : KingdomFactory {
    override fun createCastle() = ElfCastle()

    override fun createArmy() = ElfArmy()

    override fun createKing() = ElfKing()
}
