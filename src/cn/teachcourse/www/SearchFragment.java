package cn.teachcourse.www;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
@author TeachCourse
@date ´´½¨ÓÚ£º2015-11-4
 */
@SuppressLint("NewApi")
public class SearchFragment extends Fragment {
    @Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {        
        return inflater.inflate(R.layout.search_fragment, null);       
    } 
}

