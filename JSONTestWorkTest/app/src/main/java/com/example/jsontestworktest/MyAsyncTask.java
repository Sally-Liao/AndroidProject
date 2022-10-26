package com.lwz.conn.utils;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import com.lwz.conn.JokeBean;
import com.lwz.conn.ShowActivity;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 异步任务的创建
 * 这里的任务是下载网络的资源文件
 */

public class MyAsyncTask extends AsyncTask<String, Void, String> {
    Context context;

    public MyAsyncTask(Context context) {
        this.context = context;
    }

    //在子线程中做资源的下载
    @Override
    protected String doInBackground(String... params) {
        try {
            //从params中获取传过来的URL
            URL url = new URL(params[0]);
            Log.e("TAG", params[0]);
            //使用URLconnection的子类HttpURLconnection来请求连接更好
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);//设置要读取文件
            conn.setConnectTimeout(10000);//设置连接的最长时间
            InputStream is = conn.getInputStream();//获取连接的输入流
            ByteArrayOutputStream baos = new ByteArrayOutputStream(); //创建一个高速的输出流来读取输入流
            //对数据的读取（边读边取）
            int len = 0;
            byte[] buf = new byte[1024];
            while ((len = is.read(buf)) != -1) {
                baos.write(buf, 0, len);
            }
            //获得的输出流变成String类型的字符串，用于最后的返回
            String result = new String(baos.toByteArray(), "utf-8");//设置编码格式
            //返回的是获取的一大串文本资源源码
            Log.e("TAG","-------------->"+ result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    //任务完成后页面的跳转，把相关数据带到要跳转的页面
    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        //这里接收的s，就是从网络中获取到的一大串字符串的文件源码
        //这里要使用json解析，从源码中来获取我们需要的数据
        Log.e("TAG", s);
        JokeBean jokeBean = JokeBean.getBeanValue(s);
        //页面的跳转
        Intent intent = new Intent(context, ShowActivity.class);
        intent.putExtra("jokeBean", jokeBean);  //数据传递
        context.startActivity(intent);//开始跳转

    }
}