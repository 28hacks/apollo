package de.apps28.apollo.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jonas Gerdes <dev@jonasgerdes.com>
 * @since 26-Nov-17
 */

public class Answer {
    String title;
    List<Vote> votes = new ArrayList<>();

    public Answer() {
    }

    public Answer(String title, List<Vote> votes) {
        this.title = title;
        this.votes = votes;
    }

    public String getTitle() {
        return title;
    }

    public List<Vote> getVotes() {
        return votes;
    }
}
