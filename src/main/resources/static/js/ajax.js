function ajax(url,success,error) {
    //1、创建一个异步对象
    var xmlHttp = new XMLHttpRequest();
    /**
     *  2、设置请求方式和请求地址
     *  xmlhttp.open("GET","test1.txt",true);
     xmlhttp.send();
     method：请求的类型；GET 或 POST
     url：文件在服务器上的位置
     async：true（异步）或 false（同步）
     string：仅用于 POST 请求
     */
    xmlHttp.open("GET",url,true);
    //发送请求
    xmlHttp.send();
    //监听状态的变化
    xmlHttp.onreadystatechange=function (ev2) {
        if(xmlHttp.readyState==4){
            if(xmlHttp.status==200){
                success(xmlHttp);
            }else{
               error(xmlHttp);
            }



        }





}

}