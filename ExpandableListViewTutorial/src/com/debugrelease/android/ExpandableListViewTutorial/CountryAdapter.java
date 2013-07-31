package com.debugrelease.android.ExpandableListViewTutorial;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;

public class CountryAdapter extends BaseExpandableListAdapter {
    private List<Country> countries;
    private LayoutInflater inflater;

    public CountryAdapter(Context context, List<Country> countries) {
        this.countries = countries;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getGroupCount() {
        return countries.size();
    }

    @Override
    public int getChildrenCount(int childPosition) {
        return countries.get(childPosition).getCities().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return countries.get(groupPosition).getName();
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return countries.get(groupPosition).getCities().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean b, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflater.inflate(R.layout.simple_expandable_list_item_1, viewGroup, false);
        }

        ((TextView) view).setText(getGroup(groupPosition).toString());
        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean b, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = inflater.inflate(R.layout.simple_list_item_1, viewGroup, false);
        }

        ((TextView)view).setText(getChild(groupPosition,childPosition).toString());
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i2) {
        return false;
    }
}
