package com.debugrelease.android.ExpandableListViewTutorial;

import java.util.List;

public class Country {
    private String Name;
    private List<String> Cities;

    public Country(String name, List<String> cities) {
        Name = name;
        Cities = cities;
    }

    public String getName() {
        return Name;
    }

    public List<String> getCities() {
        return Cities;
    }
}
