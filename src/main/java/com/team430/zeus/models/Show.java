package com.team430.zeus.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;

import java.util.Date;

/**
 * The Show model Indicates a vedio,music,web,article and so on.
 * Created by alex on 6/21/14.
 */
@Entity("show")
@Indexes({@Index(value = "title,spiderId,rawUrl", unique = true, dropDups = true),
        @Index("publishTime")})
public class Show {
    @Id
    ObjectId objectId;
    //The spider objectId indicates which spider generates the show
    private Integer spiderId;
    // The type of the show
    private ShowType type;
    // The title of the show
    private String title;
    // The authors of this show
    private String authors;
    // The abstraction or summary of this show
    private String abstraction;
    // The backgroud url of this show;
    private String imageUrl;
    // The url of the vedio,audio,image,web and so on
    private String url;
    // The alternative url of the vedio,audio,image,web and son on
    private String urlAlt;
    // The raw url of this show
    private String rawUrl;
    // The alternative raw url of this show
    private String rawUrlAlt;
    //The content of the show, text or html.
    private String content;
    //The publish time of this show
    private Date publishTime;
    //The creation time of this show in db.
    private Date createTime;

    // unit, seconds
    private long duration;

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public ShowType getType() {
        return type;
    }

    public void setType(ShowType type) {
        this.type = type;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getAbstraction() {
        return abstraction;
    }

    public void setAbstraction(String abstraction) {
        this.abstraction = abstraction;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlAlt() {
        return urlAlt;
    }

    public void setUrlAlt(String urlAlt) {
        this.urlAlt = urlAlt;
    }

    public String getRawUrl() {
        return rawUrl;
    }

    public void setRawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
    }

    public String getRawUrlAlt() {
        return rawUrlAlt;
    }

    public void setRawUrlAlt(String rawUrlAlt) {
        this.rawUrlAlt = rawUrlAlt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSpiderId() {
        return spiderId;
    }

    public void setSpiderId(Integer spiderId) {
        this.spiderId = spiderId;
    }

    public ObjectId getObjectId() {
        return objectId;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Show)) return false;

        Show show = (Show) o;

        if (rawUrl != null ? !rawUrl.equals(show.rawUrl) : show.rawUrl != null) return false;
        if (spiderId != null ? !spiderId.equals(show.spiderId) : show.spiderId != null) return false;
        if (title != null ? !title.equals(show.title) : show.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = spiderId != null ? spiderId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (rawUrl != null ? rawUrl.hashCode() : 0);
        return result;
    }
}
