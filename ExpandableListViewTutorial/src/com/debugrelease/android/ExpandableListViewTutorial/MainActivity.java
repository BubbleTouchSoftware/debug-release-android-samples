package com.debugrelease.android.ExpandableListViewTutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    private static List<Country> Countries;
    private ExpandableListView expandableListView;
    private CountryAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LoadCountries();
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        adapter = new CountryAdapter(this, Countries);
        expandableListView.setAdapter(adapter);
    }

    private void LoadCountries() {
        Countries = new ArrayList<Country>();

        ArrayList<String> citiesAustralia = new ArrayList<String>(
                Arrays.asList("Brisbane", "Hobart", "Melbourne", "Sydney"));
        Countries.add(new Country("Australia", citiesAustralia));

        ArrayList<String> citiesChina = new ArrayList<String>(
                Arrays.asList("Beijing", "Chuzhou", "Dongguan", "Shangzhou"));
        Countries.add(new Country("China", citiesChina));

        ArrayList<String> citiesIndia = new ArrayList<String>(
                Arrays.asList("Bombay", "Calcutta", "Delhi", "Madras"));
        Countries.add(new Country("India", citiesIndia));

        ArrayList<String> citiesNewZealand = new ArrayList<String>(
                Arrays.asList("Auckland", "Christchurch", "Wellington"));
        Countries.add(new Country("New Zealand", citiesNewZealand));

        ArrayList<String> citiesRussia = new ArrayList<String>(
                Arrays.asList("Moscow", "Kursk", "Novosibirsk", "Saint Petersburg"));
        Countries.add(new Country("Russia", citiesRussia));
    }
}
