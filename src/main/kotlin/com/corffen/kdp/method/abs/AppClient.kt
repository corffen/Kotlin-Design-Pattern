package com.corffen.kdp.method.abs

class AppClient {
    var king: King? = null
    var army: Army? = null
    var castle: Castle? = null

    fun createKingdom(factory: KingdomFactory) {
        king = factory.createKing()
        army = factory.createArmy()
        castle = factory.createCastle()
    }
}

fun main() {
    val app = AppClient()
    app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF))
    println(app.king?.description)
    println(app.army?.description)
    println(app.castle?.description)

    app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ORC))
    println(app.king?.description)
    println(app.army?.description)
    println(app.castle?.description)
}
