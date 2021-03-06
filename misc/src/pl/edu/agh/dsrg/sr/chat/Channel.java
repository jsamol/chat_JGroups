package pl.edu.agh.dsrg.sr.chat;

import java.util.ArrayList;
import java.util.List;


public class Channel {
    private String name;
    private List<String> nicknames;

    public Channel(String name) {
        this.name = name;
        nicknames = new ArrayList<>();
    }

    public void addNickname(String nickname) {
        if (!nicknames.contains(nickname))
            this.nicknames.add(nickname);
    }

    public void removeNickname(String nickname) {
        if (nicknames.contains(nickname))
            this.nicknames.remove(nickname);
    }

    public String getName() {
        return name;
    }

    public List<String> getNicknames() {
        return nicknames;
    }

    @Override
    public String toString() {
        return name;
    }
}
