package com.example.examinetasktest_09;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity{

    public String title;
    public String Time;
    RecyclerView mRecyclerView;
    DataAdapter mMyAdapter;
    TextView responseText;
    List<Data.DataBean.DatasBean> datasBeans = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        sendRequestWithHttpOkConnection();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
//      mMyAdapter = new DateAdapter();
        DataAdapter adapter = new DataAdapter(datasBeans, MainActivity.this);
        mRecyclerView.setAdapter(mMyAdapter);


    }


    private void sendRequestWithHttpOkConnection(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder().url("https://www.wanandroid.com/article/list/0/json").build();
                    Response response = client.newCall(request).execute();
                    String responseData = response.body().string();
                    Log.d("Main11",responseData);
                    parseJSONWithGSON(responseData);

                    Message msg = new Message();
                    msg.what = 1;
                    handler.sendMessage(msg);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }



    private void parseJSONWithGSON(String jsonData){
        Gson gson = new Gson();

        Log.d("MainActivity",jsonData);
        Data item = gson.fromJson(jsonData,Data.class);
        /*这里的datasBeans就是单个条目里面的数据
        datasBeans就是我们准备的数据集合，相当于第一行代码第三章recyclrview那里准备数据时的fruitList
         */
        datasBeans = item.getData().getDatas();

        for(Data.DataBean.DatasBean datasBean:datasBeans){
            Log.d("MainActivity","title is   " + datasBean.getLink());
        }

    }


    public Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg){
            switch (msg.what){
                case 1:
                    mRecyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this,DividerItemDecoration.VERTICAL));
                    DataAdapter recycler_view = new DataAdapter(datasBeans,MainActivity.this);
                    mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                    mRecyclerView.setAdapter(recycler_view);
                    break;
            }

        }
    };



}
