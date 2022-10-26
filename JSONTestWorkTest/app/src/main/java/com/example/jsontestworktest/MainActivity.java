//package com.lwz.conn;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jsontestworktest.R;
import com.lwz.conn.utils.MyAsyncTask;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/***
 * Android网络请求示例
 */
public class MainActivity extends AppCompatActivity {
    //定义布局内的控件
    TextView textView;
    CheckBox checkBox;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化控件
        textView = (TextView) findViewById(R.id.main_tv);
        checkBox = (CheckBox) findViewById(R.id.main_cb_isImage);
        editText = (EditText) findViewById(R.id.main_et_pager);

    }

    //第一个按钮的回调方法
    //这里请求的数页面数据的源码资源
    public void conn1(View v) {
        //所有的网络资源请求都是子线程中进行的
        new Thread(new Runnable() {
            @Override
            public void run() {
                //资源下载的实际代码
                try {
                    //设置URL
                    URL url = new URL("http://route.showapi.com/341-1?showapi_appid=27155&time=&page=&maxResult=&showapi_sign=5bd3b5774c2346068463b526171ba86e");
                    // URL url = new URL("https://www.baidu.com");
                    //打开连接使用openConnection方法
                    URLConnection conn = url.openConnection();
                    //必须要对连接对象做相关的设置
                    conn.setConnectTimeout(10000);//设置连接的最长时间
                    conn.setDoOutput(true);//用于设置是否从连接中读取数据，如果参数值为true时，表示读取数据，否则不读取数据
                    //这里写数据使用setDoInput(boolean newValue)，我也是感觉比较奇怪的地方！
                    //获取输入流
                    InputStream is = conn.getInputStream();
                    //对流里面的数据进行读取
                    int len = 0;
                    byte[] buf = new byte[1024];
                    final StringBuilder sb = new StringBuilder();
                    while ((len = is.read(buf)) != -1) {
                        sb.append(new String(buf, 0, len));
                    }
                    is.close();//关闭流

                    //把获取的字符串数据显示在UI文本中，但是要在主线程中进行
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView.setText(sb.toString());
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }

    //连接并处理网络文件，用自定义的布局显示出来
    public void conn2(View view) {
        //get请求使用？来拼接参数，多个参数使用&符号
        //判断是显示图片还是显示文本信息
        boolean isImage = checkBox.isChecked();

        //确定URL的链接地址
        // 这里的showapi_appid和showapi_sign都要自己上网注册使用自己的账号的应用信息。
        String baseURL = "";
        if (isImage) {
            baseURL = "http://route.showapi.com/341-2?showapi_appid=27155&showapi_sign=5bd3b5774c2346068463b526171ba86e&page=";
        } else {
            baseURL = "http://route.showapi.com/341-1?showapi_appid=27155&showapi_sign=5bd3b5774c2346068463b526171ba86e&page=";
        }
        int pageNum = 1;//定义more的页码数
        String pageString = editText.getText().toString(); //获取用户输入页数
        try {
            pageNum = Integer.parseInt(TextUtils.isEmpty(pageString) ? "1" : pageString);
            if (pageNum <= 1) {
                pageNum = 1;
            }
        } catch (Exception e) {
            Toast.makeText(this, "你输入的页码数有误！", Toast.LENGTH_SHORT).show();
        }
        baseURL += pageNum;
        //使用异步任务来加载数据,在异步任务里面，任务完成后做页面跳转
        MyAsyncTask task = new MyAsyncTask(MainActivity.this);
        task.execute(baseURL);
    }


}