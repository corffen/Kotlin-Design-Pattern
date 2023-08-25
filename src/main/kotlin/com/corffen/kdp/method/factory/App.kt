package com.corffen.kdp.method.factory

fun main() {
    var app = FactoryMethodClient(OrcBlacksmith())
    app.manufactureWeapons()

    app = FactoryMethodClient(ElfBlacksmith())
    app.manufactureWeapons()
}
