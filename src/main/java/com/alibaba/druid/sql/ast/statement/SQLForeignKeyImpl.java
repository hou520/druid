/*
 * Copyright 1999-2011 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.sql.ast.statement;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.druid.sql.ast.SQLName;

public abstract class SQLForeignKeyImpl extends SQLConstaintImpl implements SQLForeignKeyConstraint {

    private SQLName       referencedTableName;
    private List<SQLName> referencingColumns = new ArrayList<SQLName>();
    private List<SQLName> referencedColumns  = new ArrayList<SQLName>();

    @Override
    public List<SQLName> getReferencingColumns() {
        return referencingColumns;
    }

    @Override
    public SQLName getReferencedTableName() {
        return referencedTableName;
    }

    @Override
    public void setReferencedTableName(SQLName value) {
        this.referencedTableName = value;
    }

    @Override
    public List<SQLName> getReferencedColumns() {
        return referencedColumns;
    }

}
