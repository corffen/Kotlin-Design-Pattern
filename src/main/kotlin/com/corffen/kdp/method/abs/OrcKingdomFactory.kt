package com.corffen.kdp.method.abs

class OrcKingdomFactory : KingdomFactory {
    override fun createCastle() = OrcCastle()

    override fun createArmy() = OrcArmy()

    override fun createKing() = OrcKing()
}
