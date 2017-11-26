package de.apps28.apollo.model.entity;

import com.google.firebase.firestore.Exclude;
import com.google.firebase.firestore.IgnoreExtraProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jonas Gerdes <dev@jonasgerdes.com>
 * @since 26-Nov-17
 */
@IgnoreExtraProperties
public class Poll {
    @Exclude
    public String id;

    String author;

    String description;
    boolean isExpired = false;
    List<Answer> answers = new ArrayList<>();
    List<String> deviceTokens = new ArrayList<>();
    public Poll() {
    }

    public Poll(String author, String description, boolean isExpired, List<Answer> answers,
                List<String> deviceTokens) {
        this.author = author;
        this.description = description;
        this.isExpired = isExpired;
        this.answers = answers;
        this.deviceTokens = deviceTokens;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public List<String> getDeviceTokens() {
        return deviceTokens;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public void setDeviceTokens(List<String> deviceTokens) {
        this.deviceTokens = deviceTokens;
    }
}
