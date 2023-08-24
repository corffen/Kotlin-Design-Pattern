package com.corffen.kdp.singleton

class StaticInnerSingle private constructor() {
    companion object {
        fun getInstance() = Holder.instance
    }

    private object Holder {
        val instance = StaticInnerSingle()
    }
}