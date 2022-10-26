package com.example.examinetasktest_09;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Data {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":21655,"link":"https://demon.blog.csdn.net/article/details/123276161","niceDate":"23小时前","niceShareDate":"23小时前","origin":"","prefix":"","projectLink":"","publishTime":1646376106000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1646376106000,"shareUser":"DeMon","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android Activity Results API自动化注册&amp;极简使用方案","type":0,"userId":68767,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21641,"link":"https://mp.weixin.qq.com/s/lAnoez0CKECuAzlrWP40LQ","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1646325145000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1646295348000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"三年磨一剑，高德地图体验优化实践总结","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaobinAndroid421726260","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"项目中完全kotlin编写，采用学习的协程和MVVM架构；\r\n下载导入本地aar包、7.1.1gradle插件、libs.versions.toml管理版本\r\nSplashScreenApp启动画面；\r\n随意切换主题颜色，适配深色模式等\r\n因为项目比较简单，我并没有采用仓库存储库等方式，而且直接简单调用，如果实际项目中，尽量让项目符合架构模式，但也不要为了架构而架构，而是让项目变得简单易读易懂。","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/d7bbe689-7bab-4db4-938f-24d5e4854302.png","fresh":false,"host":"","id":21652,"link":"https://www.wanandroid.com/blog/show/3146","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"https://github.com/xiaobinAndroid421726260/KotlinMvvmWanAndroid","publishTime":1646317861000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1646317861000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"一个Kotlin + 协程 + MVVM的wanandroid项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"SaltedFish-Extreme","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"Kotlin版的玩安卓项目APP，使用玩Android网站提供的接口，使用了很多技术，参考了各位大佬的玩安卓项目以及集成了很多优秀的开源库和工具类及各式UI组件的项目","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/4d550f58-1370-4582-a04f-7c6e303ab84a.png","fresh":false,"host":"","id":21651,"link":"https://www.wanandroid.com/blog/show/3145","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"https://github.com/SaltedFish-Extreme/WanAndroid","publishTime":1646317793000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1646317793000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"Kotlin版玩安卓APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21644,"link":"https://mp.weixin.qq.com/s/9SpwiUa9wz7z86FOfbhFgw","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1646297622000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1646297622000,"shareUser":"今阳","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android高手笔记-屏幕适配 &amp; UI优化","type":0,"userId":83603,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21648,"link":"https://mp.weixin.qq.com/s/XHbJ1L5_rdvKs3AjLCvGiA","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1646236800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1646317689000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"分享一个困惑很久的问题：App前台，Activity会被回收吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21649,"link":"https://mp.weixin.qq.com/s/5nlwuAFxTRBGkpBylD1zlQ","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1646236800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1646317703000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"FlutterComponent更佳实践之Shadow怎么就这么简单","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21650,"link":"https://mp.weixin.qq.com/s/gEtsNEWPHsSt52D7J00pug","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1646236800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1646317717000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"看完这一篇，你也可以自如地掌握字节码插桩","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"jhflovehqy","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"使用Flutter开发，Getx作为状态管理框架，符合Material Design界面设计风格。良好的注释风格，符合注释规范。","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/21c42ea7-f451-425a-b274-b116b6d4e91a.png","fresh":false,"host":"","id":21640,"link":"https://www.wanandroid.com/blog/show/3144","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"https://github.com/jhflovehqy/flutter_bolg_manage","publishTime":1646228637000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1646228637000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"Flutter企业级项目实战&mdash;&mdash;博时App","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21632,"link":"https://juejin.cn/post/7070102878479728677/","niceDate":"2022-03-02 09:50","niceShareDate":"2022-03-02 09:50","origin":"","prefix":"","projectLink":"","publishTime":1646185809000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1646185809000,"shareUser":"吊儿郎当","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"🔥🔥🔥 SDK发布到maven Central，实现远程依赖","type":0,"userId":2554,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21620,"link":"https://juejin.cn/post/7070074670036287496","niceDate":"2022-03-02 00:31","niceShareDate":"2022-03-02 00:25","origin":"","prefix":"","projectLink":"","publishTime":1646152310000,"realSuperChapterId":150,"selfVisible":0,"shareDate":1646151953000,"shareUser":"鸿洋","superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"Android 中关于枚举的优化","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":487,"chapterName":"ViewModel","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21621,"link":"https://juejin.cn/post/7070040451989897246","niceDate":"2022-03-02 00:31","niceShareDate":"2022-03-02 00:26","origin":"","prefix":"","projectLink":"","publishTime":1646152300000,"realSuperChapterId":422,"selfVisible":0,"shareDate":1646151991000,"shareUser":"鸿洋","superChapterId":423,"superChapterName":"Jetpack","tags":[],"title":"ViewModel是如何在配置更改后继续留存数据的","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":486,"chapterName":"LiveData","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21622,"link":"https://juejin.cn/post/7069774777124126757","niceDate":"2022-03-02 00:31","niceShareDate":"2022-03-02 00:26","origin":"","prefix":"","projectLink":"","publishTime":1646152289000,"realSuperChapterId":422,"selfVisible":0,"shareDate":1646152002000,"shareUser":"鸿洋","superChapterId":423,"superChapterName":"Jetpack","tags":[],"title":"Jetpack LiveData 观察它 响应它","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":228,"chapterName":"辅助 or 工具类","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21624,"link":"https://www.jianshu.com/p/15ff181cc2f8","niceDate":"2022-03-02 00:31","niceShareDate":"2022-03-02 00:28","origin":"","prefix":"","projectLink":"","publishTime":1646152279000,"realSuperChapterId":156,"selfVisible":0,"shareDate":1646152095000,"shareUser":"鸿洋","superChapterId":135,"superChapterName":"项目必备","tags":[],"title":"XLog 详解及源码分析","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":153,"chapterName":"进程启动相关","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21625,"link":"https://www.jianshu.com/p/5df66b910ce0","niceDate":"2022-03-02 00:31","niceShareDate":"2022-03-02 00:28","origin":"","prefix":"","projectLink":"","publishTime":1646152264000,"realSuperChapterId":152,"selfVisible":0,"shareDate":1646152127000,"shareUser":"鸿洋","superChapterId":171,"superChapterName":"framework","tags":[],"title":"[073]M1编译AOSP是什么体验","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":30,"chapterName":"Toast","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21626,"link":"https://www.jianshu.com/p/f9e60e9272cf","niceDate":"2022-03-02 00:30","niceShareDate":"2022-03-02 00:29","origin":"","prefix":"","projectLink":"","publishTime":1646152244000,"realSuperChapterId":29,"selfVisible":0,"shareDate":1646152144000,"shareUser":"鸿洋","superChapterId":30,"superChapterName":"用户交互","tags":[],"title":"【Window系列】&mdash;&mdash;Toast源码解析","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21628,"link":"https://www.jianshu.com/p/d3ab78a61cf8","niceDate":"2022-03-02 00:30","niceShareDate":"2022-03-02 00:29","origin":"","prefix":"","projectLink":"","publishTime":1646152226000,"realSuperChapterId":150,"selfVisible":0,"shareDate":1646152182000,"shareUser":"鸿洋","superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"总听说AGP，它到底做了什么？","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":432,"chapterName":"UI渲染","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21629,"link":"https://www.jianshu.com/p/476a357ed363","niceDate":"2022-03-02 00:30","niceShareDate":"2022-03-02 00:29","origin":"","prefix":"","projectLink":"","publishTime":1646152219000,"realSuperChapterId":152,"selfVisible":0,"shareDate":1646152198000,"shareUser":"鸿洋","superChapterId":171,"superChapterName":"framework","tags":[],"title":"Android VirtualDisplay解析","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"张鸿洋","canEdit":false,"chapterId":543,"chapterName":"Android技术周报","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21619,"link":"https://www.wanandroid.com/blog/show/3143","niceDate":"2022-03-02 00:00","niceShareDate":"2022-03-02 00:10","origin":"","prefix":"","projectLink":"","publishTime":1646150400000,"realSuperChapterId":542,"selfVisible":0,"shareDate":1646151000000,"shareUser":"","superChapterId":543,"superChapterName":"技术周报","tags":[],"title":"Android 技术周刊 （2022-02-23 ~ 2022-03-02）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21637,"link":"https://mp.weixin.qq.com/s/SmYAtRQqunYwL5faWtFWnw","niceDate":"2022-03-02 00:00","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1646150400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1646228317000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"\u200b已投入生产的Android动态切换应用图标方案","type":0,"userId":-1,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":597,"size":20,"total":11926}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public static Data objectFromData(String str) {

        return new com.google.gson.Gson().fromJson(str, Data.class);
    }

    public static Data objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), Data.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Data> arrayDataFromData(String str) {

        Type listType = new com.google.gson.reflect.TypeToken<ArrayList<Data>>() {
        }.getType();

        return new com.google.gson.Gson().fromJson(str, listType);
    }

    public static List<Data> arrayDataFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new com.google.gson.reflect.TypeToken<ArrayList<Data>>() {
            }.getType();

            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":21655,"link":"https://demon.blog.csdn.net/article/details/123276161","niceDate":"23小时前","niceShareDate":"23小时前","origin":"","prefix":"","projectLink":"","publishTime":1646376106000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1646376106000,"shareUser":"DeMon","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android Activity Results API自动化注册&amp;极简使用方案","type":0,"userId":68767,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21641,"link":"https://mp.weixin.qq.com/s/lAnoez0CKECuAzlrWP40LQ","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1646325145000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1646295348000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"三年磨一剑，高德地图体验优化实践总结","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaobinAndroid421726260","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"项目中完全kotlin编写，采用学习的协程和MVVM架构；\r\n下载导入本地aar包、7.1.1gradle插件、libs.versions.toml管理版本\r\nSplashScreenApp启动画面；\r\n随意切换主题颜色，适配深色模式等\r\n因为项目比较简单，我并没有采用仓库存储库等方式，而且直接简单调用，如果实际项目中，尽量让项目符合架构模式，但也不要为了架构而架构，而是让项目变得简单易读易懂。","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/d7bbe689-7bab-4db4-938f-24d5e4854302.png","fresh":false,"host":"","id":21652,"link":"https://www.wanandroid.com/blog/show/3146","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"https://github.com/xiaobinAndroid421726260/KotlinMvvmWanAndroid","publishTime":1646317861000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1646317861000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"一个Kotlin + 协程 + MVVM的wanandroid项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"SaltedFish-Extreme","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"Kotlin版的玩安卓项目APP，使用玩Android网站提供的接口，使用了很多技术，参考了各位大佬的玩安卓项目以及集成了很多优秀的开源库和工具类及各式UI组件的项目","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/4d550f58-1370-4582-a04f-7c6e303ab84a.png","fresh":false,"host":"","id":21651,"link":"https://www.wanandroid.com/blog/show/3145","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"https://github.com/SaltedFish-Extreme/WanAndroid","publishTime":1646317793000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1646317793000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"Kotlin版玩安卓APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21644,"link":"https://mp.weixin.qq.com/s/9SpwiUa9wz7z86FOfbhFgw","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1646297622000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1646297622000,"shareUser":"今阳","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android高手笔记-屏幕适配 &amp; UI优化","type":0,"userId":83603,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21648,"link":"https://mp.weixin.qq.com/s/XHbJ1L5_rdvKs3AjLCvGiA","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1646236800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1646317689000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"分享一个困惑很久的问题：App前台，Activity会被回收吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21649,"link":"https://mp.weixin.qq.com/s/5nlwuAFxTRBGkpBylD1zlQ","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1646236800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1646317703000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"FlutterComponent更佳实践之Shadow怎么就这么简单","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21650,"link":"https://mp.weixin.qq.com/s/gEtsNEWPHsSt52D7J00pug","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1646236800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1646317717000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"看完这一篇，你也可以自如地掌握字节码插桩","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"jhflovehqy","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"使用Flutter开发，Getx作为状态管理框架，符合Material Design界面设计风格。良好的注释风格，符合注释规范。","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/21c42ea7-f451-425a-b274-b116b6d4e91a.png","fresh":false,"host":"","id":21640,"link":"https://www.wanandroid.com/blog/show/3144","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"https://github.com/jhflovehqy/flutter_bolg_manage","publishTime":1646228637000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1646228637000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"Flutter企业级项目实战&mdash;&mdash;博时App","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21632,"link":"https://juejin.cn/post/7070102878479728677/","niceDate":"2022-03-02 09:50","niceShareDate":"2022-03-02 09:50","origin":"","prefix":"","projectLink":"","publishTime":1646185809000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1646185809000,"shareUser":"吊儿郎当","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"🔥🔥🔥 SDK发布到maven Central，实现远程依赖","type":0,"userId":2554,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21620,"link":"https://juejin.cn/post/7070074670036287496","niceDate":"2022-03-02 00:31","niceShareDate":"2022-03-02 00:25","origin":"","prefix":"","projectLink":"","publishTime":1646152310000,"realSuperChapterId":150,"selfVisible":0,"shareDate":1646151953000,"shareUser":"鸿洋","superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"Android 中关于枚举的优化","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":487,"chapterName":"ViewModel","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21621,"link":"https://juejin.cn/post/7070040451989897246","niceDate":"2022-03-02 00:31","niceShareDate":"2022-03-02 00:26","origin":"","prefix":"","projectLink":"","publishTime":1646152300000,"realSuperChapterId":422,"selfVisible":0,"shareDate":1646151991000,"shareUser":"鸿洋","superChapterId":423,"superChapterName":"Jetpack","tags":[],"title":"ViewModel是如何在配置更改后继续留存数据的","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":486,"chapterName":"LiveData","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21622,"link":"https://juejin.cn/post/7069774777124126757","niceDate":"2022-03-02 00:31","niceShareDate":"2022-03-02 00:26","origin":"","prefix":"","projectLink":"","publishTime":1646152289000,"realSuperChapterId":422,"selfVisible":0,"shareDate":1646152002000,"shareUser":"鸿洋","superChapterId":423,"superChapterName":"Jetpack","tags":[],"title":"Jetpack LiveData 观察它 响应它","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":228,"chapterName":"辅助 or 工具类","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21624,"link":"https://www.jianshu.com/p/15ff181cc2f8","niceDate":"2022-03-02 00:31","niceShareDate":"2022-03-02 00:28","origin":"","prefix":"","projectLink":"","publishTime":1646152279000,"realSuperChapterId":156,"selfVisible":0,"shareDate":1646152095000,"shareUser":"鸿洋","superChapterId":135,"superChapterName":"项目必备","tags":[],"title":"XLog 详解及源码分析","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":153,"chapterName":"进程启动相关","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21625,"link":"https://www.jianshu.com/p/5df66b910ce0","niceDate":"2022-03-02 00:31","niceShareDate":"2022-03-02 00:28","origin":"","prefix":"","projectLink":"","publishTime":1646152264000,"realSuperChapterId":152,"selfVisible":0,"shareDate":1646152127000,"shareUser":"鸿洋","superChapterId":171,"superChapterName":"framework","tags":[],"title":"[073]M1编译AOSP是什么体验","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":30,"chapterName":"Toast","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21626,"link":"https://www.jianshu.com/p/f9e60e9272cf","niceDate":"2022-03-02 00:30","niceShareDate":"2022-03-02 00:29","origin":"","prefix":"","projectLink":"","publishTime":1646152244000,"realSuperChapterId":29,"selfVisible":0,"shareDate":1646152144000,"shareUser":"鸿洋","superChapterId":30,"superChapterName":"用户交互","tags":[],"title":"【Window系列】&mdash;&mdash;Toast源码解析","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21628,"link":"https://www.jianshu.com/p/d3ab78a61cf8","niceDate":"2022-03-02 00:30","niceShareDate":"2022-03-02 00:29","origin":"","prefix":"","projectLink":"","publishTime":1646152226000,"realSuperChapterId":150,"selfVisible":0,"shareDate":1646152182000,"shareUser":"鸿洋","superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"总听说AGP，它到底做了什么？","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":432,"chapterName":"UI渲染","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21629,"link":"https://www.jianshu.com/p/476a357ed363","niceDate":"2022-03-02 00:30","niceShareDate":"2022-03-02 00:29","origin":"","prefix":"","projectLink":"","publishTime":1646152219000,"realSuperChapterId":152,"selfVisible":0,"shareDate":1646152198000,"shareUser":"鸿洋","superChapterId":171,"superChapterName":"framework","tags":[],"title":"Android VirtualDisplay解析","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"张鸿洋","canEdit":false,"chapterId":543,"chapterName":"Android技术周报","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21619,"link":"https://www.wanandroid.com/blog/show/3143","niceDate":"2022-03-02 00:00","niceShareDate":"2022-03-02 00:10","origin":"","prefix":"","projectLink":"","publishTime":1646150400000,"realSuperChapterId":542,"selfVisible":0,"shareDate":1646151000000,"shareUser":"","superChapterId":543,"superChapterName":"技术周报","tags":[],"title":"Android 技术周刊 （2022-02-23 ~ 2022-03-02）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21637,"link":"https://mp.weixin.qq.com/s/SmYAtRQqunYwL5faWtFWnw","niceDate":"2022-03-02 00:00","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1646150400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1646228317000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"\u200b已投入生产的Android动态切换应用图标方案","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 597
         * size : 20
         * total : 11926
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public static DataBean objectFromData(String str) {

            return new com.google.gson.Gson().fromJson(str, DataBean.class);
        }

        public static DataBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new com.google.gson.Gson().fromJson(jsonObject.getString(str), DataBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<DataBean> arrayDataBeanFromData(String str) {

            Type listType = new com.google.gson.reflect.TypeToken<ArrayList<DataBean>>() {
            }.getType();

            return new com.google.gson.Gson().fromJson(str, listType);
        }

        public static List<DataBean> arrayDataBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author :
             * canEdit : false
             * chapterId : 502
             * chapterName : 自助
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : true
             * host :
             * id : 21655
             * link : https://demon.blog.csdn.net/article/details/123276161
             * niceDate : 23小时前
             * niceShareDate : 23小时前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1646376106000
             * realSuperChapterId : 493
             * selfVisible : 0
             * shareDate : 1646376106000
             * shareUser : DeMon
             * superChapterId : 494
             * superChapterName : 广场Tab
             * tags : []
             * title : Android Activity Results API自动化注册&amp;极简使用方案
             * type : 0
             * userId : 68767
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private String host;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int realSuperChapterId;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public static DatasBean objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str, DatasBean.class);
            }

            public static DatasBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new com.google.gson.Gson().fromJson(jsonObject.getString(str), DatasBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<DatasBean> arrayDatasBeanFromData(String str) {

                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<DatasBean>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(str, listType);
            }

            public static List<DatasBean> arrayDatasBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new com.google.gson.reflect.TypeToken<ArrayList<DatasBean>>() {
                    }.getType();

                    return new com.google.gson.Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public String getHost() {
                return host;
            }

            public void setHost(String host) {
                this.host = host;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getRealSuperChapterId() {
                return realSuperChapterId;
            }

            public void setRealSuperChapterId(int realSuperChapterId) {
                this.realSuperChapterId = realSuperChapterId;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }

        }
    }
}