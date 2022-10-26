package com.lwz.conn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.jsontestworktest.R;
//import com.lwz.conn.utils.ImagsUtils;

/**
 * 显示网络的文字或图片的页面
 */

public class ShowActivity extends Activity {

    com.lwz.conn.JokeBean jokeBean;//定义一个JokeBean对象
    ListView listView;//定义一个ListView显示页面数据

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = new ListView(this);
        setContentView(listView);
        //获取传递过来的数据
        jokeBean = (com.lwz.conn.JokeBean) getIntent().getSerializableExtra("jokeBean");
        //使用java代码创建一个ListView
        listView.setAdapter(adapter);

    }

    BaseAdapter adapter = new BaseAdapter() {
        @Override
        public int getCount() {
            return jokeBean.showapi_res_body.contentlist.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                convertView = View.inflate(getBaseContext(), R.layout.activity_joke, null);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            } else
                holder = (ViewHolder) convertView.getTag();
            com.lwz.conn.JokeBean.Body.Content content = jokeBean.showapi_res_body.contentlist.get(position);
            if (content.type == 1) {
                holder.tv_content.setVisibility(View.VISIBLE);
                holder.iv_content.setVisibility(View.GONE);
                holder.tv_content.setText(content.text);
            } else {
                holder.iv_content.setVisibility(View.VISIBLE);
                holder.tv_content.setVisibility(View.GONE);
               // ImagsUtils.bindView(content.img, holder.iv_content);
            }
            holder.tv_title.setText(content.title);
            holder.tv_time.setText(content.ct);
            return convertView;
        }

        class ViewHolder {

            TextView tv_title, tv_content, tv_time;
            ImageView iv_content;

            public ViewHolder(View convertView) {
                tv_title = (TextView) convertView.findViewById(R.id.joke_tv_title);
                tv_content = (TextView) convertView.findViewById(R.id.joke_tv_content);
                tv_time = (TextView) convertView.findViewById(R.id.joke_tv_time);
                iv_content = (ImageView) convertView.findViewById(R.id.joke_iv_content);
            }


        }
    };

}