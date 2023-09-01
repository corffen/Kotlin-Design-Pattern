package com.corffen.kdp.fade

fun main() {
    val facade = DwarvenGoldmineFacade()
    facade.startNewDay()
    facade.digOutGold()
    facade.endDay()
}
