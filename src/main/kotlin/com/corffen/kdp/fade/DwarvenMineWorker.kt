/*
 * The MIT License
 * Copyright © 2014-2019 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.corffen.kdp.fade

import com.corffen.kdp.LOGGER
import java.util.*

/**
 * DwarvenMineWorker is one of the goldmine subsystems.
 */
abstract class DwarvenMineWorker {
    fun goToSleep() {
        LOGGER.info("{} goes to sleep.", name())
    }

    fun wakeUp() {
        LOGGER.info("{} wakes up.", name())
    }

    fun goHome() {
        LOGGER.info("{} goes home.", name())
    }

    fun goToMine() {
        LOGGER.info("{} goes to the mine.", name())
    }

    private fun action(action: Action) {
        when (action) {
            Action.GO_TO_SLEEP -> goToSleep()
            Action.WAKE_UP -> wakeUp()
            Action.GO_HOME -> goHome()
            Action.GO_TO_MINE -> goToMine()
            Action.WORK -> work()
            else -> LOGGER.info("Undefined action")
        }
    }

    /**
     * Perform actions.
     */
    fun action(vararg actions: Action?) {
        Arrays.stream<Action>(actions).forEach(::action)
    }

    abstract fun work()
    abstract fun name(): String?
    enum class Action {
        GO_TO_SLEEP,
        WAKE_UP,
        GO_HOME,
        GO_TO_MINE,
        WORK,
    }
}
