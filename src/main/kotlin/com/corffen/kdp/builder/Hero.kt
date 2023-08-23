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
package com.corffen.kdp.builder

fun createHero(profession: Profession, name: String, block: Hero.Builder.() -> Unit): Hero {
    return Hero.Builder(profession, name).apply(block).build()
}

/**
 * Hero, the class with many parameters.
 */
class Hero private constructor(builder: Builder) {
    val profession: Profession
    val name: String
    val hairType: HairType?
    val hairColor: HairColor?
    val armor: Armor?
    val weapon: Weapon?

    init {
        profession = builder.profession
        name = builder.name
        hairColor = builder.hairColor
        hairType = builder.hairType
        weapon = builder.weapon
        armor = builder.armor
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("This is a ")
            .append(profession)
            .append(" named ")
            .append(name)
        if (hairColor != null || hairType != null) {
            sb.append(" with ")
            if (hairColor != null) {
                sb.append(hairColor).append(' ')
            }
            if (hairType != null) {
                sb.append(hairType).append(' ')
            }
            sb.append(if (hairType !== HairType.BALD) "hair" else "head")
        }
        if (armor != null) {
            sb.append(" wearing ").append(armor)
        }
        if (weapon != null) {
            sb.append(" and wielding a ").append(weapon)
        }
        sb.append('.')
        return sb.toString()
    }

    /**
     * The builder class.
     */
    class Builder(val profession: Profession, val name: String) {

        @set:JvmSynthetic
        var hairType: HairType? = null

        @set:JvmSynthetic
        var hairColor: HairColor? = null

        @set:JvmSynthetic
        var armor: Armor? = null

        @set:JvmSynthetic
        var weapon: Weapon? = null

        fun withHairType(hairType: HairType?): Builder {
            this.hairType = hairType
            return this
        }

        fun withHairColor(hairColor: HairColor?): Builder {
            this.hairColor = hairColor
            return this
        }

        fun withArmor(armor: Armor?): Builder {
            this.armor = armor
            return this
        }

        fun withWeapon(weapon: Weapon?) = apply {
            this.weapon = weapon
        }

        fun build(): Hero {
            return Hero(this)
        }
    }
}
