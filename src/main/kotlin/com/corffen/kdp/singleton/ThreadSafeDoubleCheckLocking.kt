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
package com.corffen.kdp.singleton

/**
 *
 * Double check locking.
 *
 *
 * http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 *
 *
 * Broken under Java 1.4.
 *
 * @author mortezaadi@gmail.com
 */
class ThreadSafeDoubleCheckLocking private constructor() {
    /**
     * private constructor to prevent client from instantiating.
     */
    init {
        // to prevent instantiating by Reflection call
        if (flag) {
            flag = false
        } else {
            throw IllegalStateException("Already initialized.")
        }
    }

    companion object {
        val instance: ThreadSafeDoubleCheckLocking by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            ThreadSafeDoubleCheckLocking()
        }
        private var flag = true
    }
}
