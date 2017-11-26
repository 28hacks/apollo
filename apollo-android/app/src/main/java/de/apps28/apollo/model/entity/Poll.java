package de.apps28.apollo.model.entity;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jonas Gerdes <dev@jonasgerdes.com>
 * @since 26-Nov-17
 */

public class Poll {

    String author;
    Question question;

    public Poll(String author, Question question) {
        this.author = author;
        this.question = question;
    }

    public static class Question {
        String description;
        List<Answer> answers;

        public Question(String description, Answer... answers) {
            this.description = description;
            this.answers = Arrays.asList(answers);
        }
    }

    public static class Answer {
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        String title;

        public List<Vote> getVotes() {
            return votes;
        }

        public void setVotes(List<Vote> votes) {
            this.votes = votes;
        }

        List<Vote> votes;

        public Answer(String title, Vote... votes) {
            this.title = title;
            this.votes = Arrays.asList(votes);
        }
    }

    public static class Vote {
        String user;

        public Vote(String user) {
            this.user = user;
        }
    }

}
