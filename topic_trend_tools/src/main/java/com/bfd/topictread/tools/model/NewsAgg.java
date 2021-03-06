/**
 * Copyright (C) 2015 Baifendian Corporation
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

package com.bfd.topictread.tools.model;

/**
 * 新闻数据聚集
 * <p>
 * 
 * @author : dsfan
 * @date : 2016-7-9
 */
public class NewsAgg {
    /** 事件id */
    private String eventId;

    /** 总记录数 */
    private Long total;

    @Override
    public String toString() {
        return "NewsAgg [eventId=" + eventId + ", total=" + total + "]";
    }

    /**
     * getter method
     * 
     * @see NewsAgg#eventId
     * @return the eventId
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * setter method
     * 
     * @see NewsAgg#eventId
     * @param eventId
     *            the eventId to set
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * getter method
     * 
     * @see NewsAgg#total
     * @return the total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * setter method
     * 
     * @see NewsAgg#total
     * @param total
     *            the total to set
     */
    public void setTotal(Long total) {
        this.total = total;
    }

}
