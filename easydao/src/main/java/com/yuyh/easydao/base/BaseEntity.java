/**
 * Copyright (C) 2016 smuyyh
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yuyh.easydao.base;

import com.yuyh.easydao.annotation.AutoIncrement;
import com.yuyh.easydao.annotation.Id;
import com.yuyh.easydao.exception.DBException;
import com.yuyh.easydao.exception.ErrMsg;

import java.io.Serializable;

/**
 * the abstract base class for entity in the database
 *
 * @author yuyh.
 * @date 2016/11/16.
 */
public abstract class BaseEntity implements Serializable {

    @Id
    @AutoIncrement
    private Integer id;

    public BaseEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) throws DBException {
        if (id < 1) {
            throw new DBException(ErrMsg.ERR_INVALID_ID);
        }
        this.id = id;
    }
}