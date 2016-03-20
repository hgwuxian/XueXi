package com.hu_yao.xuexi;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    //初始化 ArrayAdapter 并附名
    private  ArrayAdapter<String> arrayAdapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String [] zhi = {
                "Mon 6/23 - Sunny - 31/17",
                "Tue 6/24 - Foggy - 21/8",
                "Wed 6/25 - Cloudy - 22/17",
                "Thurs 6/26 - Rainy - 18/11",
                "Fri 6/27 - Foggy - 21/10",
                "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 6/29 - Sunny - 20/7"
        };
        //将数组赋予为List
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(zhi));
        //使用 ArrayAdapter ，并 public ArrayAdapter (Context context, int resource, int textViewResourceId, List<T> objects)
        arrayAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForecast);
        //View赋予位置
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        //需找ListView
        ListView listView = (ListView) rootView.findViewById(R.id.listview_frecast);
        //加载
        listView.setAdapter(arrayAdapter);
        //返回View
        return rootView;
    }
}
