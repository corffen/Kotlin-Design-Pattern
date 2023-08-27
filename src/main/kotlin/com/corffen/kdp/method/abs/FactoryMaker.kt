package com.corffen.kdp.method.abs

object FactoryMaker {
    enum class KingdomType {
        ELF, ORC
    }

    fun makeFactory(type: KingdomType): KingdomFactory {
        return when (type) {
            KingdomType.ELF -> ElfKingdomFactory()
            KingdomType.ORC -> OrcKingdomFactory()
        }
    }
}
