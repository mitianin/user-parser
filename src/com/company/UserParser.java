package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserParser {
    Pattern pattern = Pattern.compile("(?:(\\w+):)?(\\w+)(?:@(\\d+))?");

    User parse(String user) {
        Matcher matcher = pattern.matcher(user);

        if (matcher.matches()) {
            String nick = matcher.group(1);
            String name = matcher.group(2);
            String pas = matcher.group(3);

            if (nick == null) {
                return new User(name, name, pas);
            } else {
                return new User(nick, name, pas);
            }

        }
        return null;
    }

    List<User> parseToList(String user) {
        ArrayList<User> list = new ArrayList<>();
        String[] users = user.split(",");
        Matcher matcher;

        for (String x:users
             ) {
            matcher = pattern.matcher(x);

            if (matcher.matches()) {
                User userToAdd = parse(x);
                list.add(userToAdd);
            }
        }

        return list;
    }

}
