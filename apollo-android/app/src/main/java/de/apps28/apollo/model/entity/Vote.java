package de.apps28.apollo.model.entity;

/**
 * @author Jonas Gerdes <dev@jonasgerdes.com>
 * @since 26-Nov-17
 */

public class Vote {
    String user;

    public Vote() {
    }

    public Vote(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

}
