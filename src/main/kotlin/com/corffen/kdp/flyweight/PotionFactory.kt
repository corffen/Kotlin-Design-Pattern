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
package com.corffen.kdp.flyweight

import java.util.*

/**
 * PotionFactory is the Flyweight in this example. It minimizes memory use by sharing object
 * instances. It holds a map of potion instances and new potions are created only when none of the
 * type already exists.
 */
class PotionFactory {
    private val potions: MutableMap<PotionType, Potion>

    init {
        potions = EnumMap(PotionType::class.java)
    }

    fun createPotion(type: PotionType): Potion {
        var potion = potions[type]
        if (potion == null) {
            when (type) {
                PotionType.HEALING -> {
                    potion = HealingPotion()
                    potions[type] = potion
                }

                PotionType.HOLY_WATER -> {
                    potion = HolyWaterPotion()
                    potions[type] = potion
                }

                PotionType.INVISIBILITY -> {
                    potion = InvisibilityPotion()
                    potions[type] = potion
                }

                PotionType.POISON -> {
                    potion = PoisonPotion()
                    potions[type] = potion
                }

                PotionType.STRENGTH -> {
                    potion = StrengthPotion()
                    potions[type] = potion
                }
            }
        }
        return potion
    }
}
