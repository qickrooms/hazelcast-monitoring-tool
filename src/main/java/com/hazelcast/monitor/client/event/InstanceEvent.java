/*
 * Copyright (c) 2007-2008, Hazel Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.hazelcast.monitor.client.event;

import com.hazelcast.monitor.client.InstanceType;

import java.util.Date;

public abstract class InstanceEvent implements ChangeEvent {

    private String name;
    private InstanceType instanceType;
    private int clusterId;
    private Date date;

    public InstanceEvent() {
    }

    public InstanceEvent(int clusterId, InstanceType instanceType, String name) {
        this.name = name;
        this.instanceType = instanceType;
        this.clusterId = clusterId;
        this.date = new Date();
    }

    public InstanceType getInstanceType() {
        return instanceType;
    }

    public String getName() {
        return name;
    }

    public int getClusterId() {
        return clusterId;
    }

    public Date getCreatedDate() {
        return date;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", instanceType=" + instanceType +
                ", clusterId=" + clusterId +
                ", date=" + date +
                '}';
    }
}


