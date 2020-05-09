# api_auto_test
自动化测试的简单封装

##一、增加yaml文件

```$xslt
methods:
  search:
    query:
      wd: 接口测试
    url: "https://www.baidu.com/s"
```
- methods 所有接口，写死的
- 方法名 测试接口的名字
- header 接口头信息，没有就不要加
- query  接口query参数，没有就不要加
- postbody 接口发送的消息体，没有就不要加
- method  方法，默认为get
- url 接口地址


##二、加class
 在api相应目录下找到或增加类或方法，有参数加参数

    `public Response search(){ return parseSteps(); }`    
  
##三、测试用例

```$xslt
     
private static BaiduApi baiduApi;
    @BeforeAll
    static void  createUserActivity(){
        baiduApi = new BaiduApi();
    }


    @Test
    void testHeath(){
        b
    }


 @Test
 @Story("搜索接口测试")
 @Severity(SeverityLevel.NORMAL)
 @Description("百度搜索‘接口测试’的测试用例")
 void testHeath(){
     baiduApi.search().then().statusCode(200);
 }

    
```

##四、生成测试报告
集成了allure报告

![测试报告](https://raw.githubusercontent.com/little-success/api_xiaoxin/blob/master/src/main/resources/img/01.png)



![Relative date](https://img.shields.io/date/1587719993)
![language](https://img.shields.io/badge/language-java-green.svg)
