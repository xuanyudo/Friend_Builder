package com.cse442.friend_builder.model;

import java.util.ArrayList;

public class Current extends User {

    public Current(String _email, String _userName, String _name, ArrayList<Event> _events) {
        email = _email;
        userName = _userName;
        name = _name;
        events = _events;
    }
    public Current() {}
}
