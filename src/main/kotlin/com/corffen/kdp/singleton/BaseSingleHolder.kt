package com.corffen.kdp.singleton

open class BaseSingleHolder<out T, in A>(val creator: (A) -> T) {

    @Volatile
    private var instance: T? = null

    fun getInstance(arg: A): T {
        return instance ?: synchronized(this) {
            instance ?: creator(arg).apply {
                instance = this
            }
        }
    }
}

class SingletonManager private constructor(val name: String) {
    companion object : BaseSingleHolder<SingletonManager, String>(::SingletonManager)
}
