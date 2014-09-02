package com.team430.zeus.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;

import java.util.List;

/**
 * @author Alex
 * @version 1.0
 * @date 7/25/14
 */
@Entity("spider")
@Indexes(@Index(value = "classPath", unique = true, dropDups = true))
public class Spider {
    @Id
    private ObjectId objectId;
    private Integer id;
    // The extractor class
    private String classPath;
    // The extractor delay time of begin
    private long delay;
    // The period of the extractor to extract the web
    private long period;

    private Integer sourceId;

    private List<Integer> topicIds;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    public long getDelay() {
        return delay;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }

    public long getPeriod() {
        return period;
    }

    public void setPeriod(long period) {
        this.period = period;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public List<Integer> getTopicIds() {
        return topicIds;
    }

    public void setTopicIds(List<Integer> topicIds) {
        this.topicIds = topicIds;
    }

    public ObjectId getObjectId() {
        return objectId;
    }
}
