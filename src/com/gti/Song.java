package com.gti;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private List<String> strings;

    public void addString(String string) {
        if(strings == null) {
            strings= new ArrayList<>();
        }
        strings.add(string);
    }

    public List<String> getStrings() {
        return strings;
    }
}
