package com.mano.mano_quiz1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by JCMANO on 28/09/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context c;
    List<AndroidOS> codename;
    ImageView iv_Logo;
    TextView tv_Name, tv_Version, tv_Api, tv_Year;

    public CustomAdapter(Context c, List<AndroidOS> codename){
        this.c = c;
        this.codename = codename;
    }
    @Override
    public int getCount() {
        return codename.size();
    }

    @Override
    public Object getItem(int i) {
        return codename.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view.inflate(c, R.layout.row_layout, null);
        iv_Logo = (ImageView) v.findViewById(R.id.ivLogo);
        tv_Name = (TextView) v.findViewById(R.id.tvName);


        iv_Logo.setImageResource(codename.get(i).getLogo());
        tv_Name.setText(codename.get(i).getName());

        return v;
    }

}
