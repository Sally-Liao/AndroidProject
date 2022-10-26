package com.lwz.conn;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 这是一个数据解析的工具类，
 * <p>
 * 这里是从源码中取出属性值
 * 这里是使用从外到内一层一层的去获取资源数据，最里面一层的数据才是我们要显示在页面上的数据
 * 这里的处理的方式是比较麻烦的一种，其中它处理的方式可以有好几种
 * 这里的数据层层嵌套，就像xml资源的子标签一样
 */

/*下面是提供API网站给我们的数据的提示，xml文件中下面的某些变量，我们可以选择性的去使用，
但是这些变量的名字是固定的，更改了就获取不到了
 allNum String  345 所有记录数
    allPages    String  45  所有页数。每页20条。
    contentlist JokeItem[]      笑话条目内容
    - title String  吃了一百年的玉米    笑话标题
    - text  String      笑话正文
    - ct    String  2015-07-10 05:54:00.000 生成时间
    currentPage String  1   当前第几页
    maxResult   String  20  每页最多显示几条*/

//因为要Intent来实现数据的传递，所以要实现序列化
public class JokeBean implements Serializable {
    //最外层的属性值
    int showapi_res_code;
    String showapi_res_error;
    Body showapi_res_body;//这个才是有用的信息数据，上面的实现其实也是可以不用去定义的

    @Override
    public String toString() {
        return "JokeBean{" +
                "showapi_res_body=" + showapi_res_body +
                ", showapi_res_code=" + showapi_res_code +
                ", showapi_res_error='" + showapi_res_error + '\'' +
                '}';
    }

    class Body implements Serializable {
        int allNum;
        int allPages;
        int currentPage;//当前第几页
        int maxResult;
        int ret_code;
        ArrayList<Content> contentlist;

        @Override
        public String toString() {
            return "Body{" +
                    "allNum=" + allNum +
                    ", allPages=" + allPages +
                    ", currentPage=" + currentPage +
                    ", maxResult=" + maxResult +
                    ", ret_code=" + ret_code +
                    ", contentlist=" + contentlist +
                    '}';
        }

        class Content implements Serializable {
            String id;
            String ct;//生成时间
            String text;//笑话正文
            String title;//笑话标题
            int type;//文本笑话，图片笑话，动态图笑话
            String img;//笑话的图片连接地址URL

            //重写toString方法，查看数据
            @Override
            public String toString() {
                return "Content{" +
                        "ct='" + ct + '\'' +
                        ", id='" + id + '\'' +
                        ", text='" + text + '\'' +
                        ", title='" + title + '\'' +
                        ", type=" + type +
                        ", img='" + img + '\'' +
                        '}';
            }
        }
    }

    /**
     * 创建一个静态的转换方法
     * 将字符串使用json解析的方式，转换成对象
     * 用于把资源代码的字符串中某些值赋值给某些需要的变量
     */
    public static JokeBean getBeanValue(String json) {
        try {
            //1.将最外层的字符串，转换为json对象
            JSONObject jsonObject = new JSONObject(json);
            //2.创建返回的对象
            JokeBean jokeBean = new JokeBean();
            //3.取外层的数据，两种方法opt和get，其中opt更好，get在数据不匹配时会报错
            jokeBean.showapi_res_code = jsonObject.optInt("showapi_res_code");
            jokeBean.showapi_res_error = jsonObject.optString("showapi_res_error");

            //4.取第二层数据，是一个对象
            JSONObject bodyObject = jsonObject.optJSONObject("showapi_res_body");
            //5.通过这个对象的值，再去取数据
            //创建内部对象,把获取到的数据赋值给这个类的对象
            Body body = jokeBean.new Body();
            body.allNum = bodyObject.optInt("allNum");
            body.allPages = bodyObject.optInt("allPages");
            body.currentPage = bodyObject.optInt("currentPage");
            body.maxResult = bodyObject.optInt("maxResult");
            body.ret_code = bodyObject.optInt("ret_code");
            //Log.e("TAG", "jokeBean------------>" + jokeBean.toString());
            // Log.e("TAG", "body------------>" + body.toString());
            //这里的contentlist的数据是数组类型的！
            JSONArray array = bodyObject.optJSONArray("contentlist");
            //创建一个集合用来存放数组
            body.contentlist = new ArrayList<>();
            //通过数据遍历循环去取所有的对象
            for (int i = 0; i < array.length(); i++) {
                Body.Content content = body.new Content();
                //再次使用json解析数据
                //集合通过optXXX(index)的方法去取值
                JSONObject obj = array.optJSONObject(i);
                content.ct = obj.optString("ct");//笑话的创建时间
                content.id = obj.optString("id");//笑话的id编号
                content.title = obj.optString("title");//笑话的标题
                content.type = obj.optInt("type");//笑话的类别，1代表文本，2代表图像

                //对类别的判断
                if (content.type == 2) {
                    content.img = obj.optString("img");
                } else {
                    content.text = obj.optString("text");
                }
                body.contentlist.add(content);
            }
            //Log.e("TAG", "body.c------------>" + body.contentlist.toString());
            jokeBean.showapi_res_body = body;
            //返回一个JokeBean对象，里面包含所有的数据
            return jokeBean;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}