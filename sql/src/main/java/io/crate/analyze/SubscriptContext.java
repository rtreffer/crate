/*
 * Licensed to CRATE Technology GmbH ("Crate") under one or more contributor
 * license agreements.  See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.  Crate licenses
 * this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.  You may
 * obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * However, if you have executed another commercial license agreement
 * with Crate these terms will supersede the license and you may use the
 * software solely pursuant to the terms of the relevant commercial agreement.
 */

package io.crate.analyze;

import io.crate.sql.tree.FunctionCall;
import io.crate.sql.tree.QualifiedName;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class SubscriptContext {

    private QualifiedName qName;
    private FunctionCall functionCall;
    private List<String> parts = new ArrayList<>();
    private Integer index;

    public QualifiedName qName() {
        return qName;
    }

    public void qName(QualifiedName qName) {
        this.qName = qName;
    }

    public List<String> parts() {
        return parts;
    }

    public void add(String part) {
        parts.add(0, part);
    }

    public void index(Integer index) {
        this.index = index;
    }

    @Nullable
    public Integer index() {
        return index;
    }

    @Nullable
    public FunctionCall functionCall() {
        return functionCall;
    }

    public void functionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }
}
