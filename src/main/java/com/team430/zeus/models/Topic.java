package com.team430.zeus.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;

/**
 * The topic(or channel)
 *
 * @author Alex
 * @version 1.0
 * @date 7/25/14
 */
@Entity("topic")
@Indexes({@Index(value = "nameEn", unique = true, dropDups = true),
        @Index(value = "nameCn")})
public class Topic {
    @Id
    private ObjectId objectId;

    private Integer id;
    // The English name of the topic
    private String nameEn;
    // The Chinese name of the topic
    private String nameCn;
    // The English description of the topic
    private String descriptionEn;
    // The Chinese description of the topic
    private String descriptionCn;
    // The background image url of the topic
    private String imageUrl;
    private boolean defaultTopic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getDescriptionCn() {
        return descriptionCn;
    }

    public void setDescriptionCn(String descriptionCn) {
        this.descriptionCn = descriptionCn;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isDefaultTopic() {
        return defaultTopic;
    }

    public void setDefaultTopic(boolean defaultTopic) {
        this.defaultTopic = defaultTopic;
    }

    public ObjectId getObjectId() {
        return objectId;
    }
}
