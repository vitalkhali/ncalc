/*
 * Copyright 2017 Tran Le Duy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.duy.calculator.math_eval.test;

import com.example.duy.calculator.DLog;

/**
 * Created by DUy on 20-Jan-17.
 */

public abstract class TestCase {
    public TestCase(String name) {

    }

    public void assertEquals(String input, String result) {
        DLog.d(input + " = " + result + " | " + Boolean.parseBoolean(String.valueOf(input.equalsIgnoreCase(result))));
    }

    public void assertEquals(Object input, Object result) {
        DLog.d(input.equals(result) ? "true" : "false");
    }

}