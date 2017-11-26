package de.apps28.apollo.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jonas Gerdes <dev@jonasgerdes.com>
 * @since 26-Nov-17
 */

public class Poll {
    String author;
    String description;
    boolean isExpired = false;
    List<Answer> answers = new ArrayList<>();
    List<String> deviceTokens = new ArrayList<>();

    public Poll() {
    }

    public Poll(String author, String description, boolean isExpired, List<Answer> answers, List<String> deviceTokens) {
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

}
