package com.xue.study.snow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/load")
public class FileController {

    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public String uploadPage(){
        return "upload.html";
    }
    @RequestMapping(value = "/multipart",method = RequestMethod.GET)
    public String uploadPage1(){
        return "upload_multipart.html";
    }
    @RequestMapping(value = "/part",method = RequestMethod.GET)
    public String uploadPage2(){
        return "upload_part.html";
    }

    //使用HttpServletRequest 作为参数
    @PostMapping("/upload/file")
    @ResponseBody
    public Map<String,Object> uploadRequest(HttpServletRequest request){
        boolean flag =false;
        MultipartHttpServletRequest mreq=null;
        //强制转换为MultipartHttpServletRequest接口对象
        if(request instanceof MultipartHttpServletRequest){
            mreq =(MultipartHttpServletRequest) request;
        }else{
            return dealResultMap(false,"上传失败");
        }
        //获取MultipartFile文件信息
        MultipartFile mf =mreq.getFile("file");
        //获取源文件名称
        String fileName =mf.getOriginalFilename();
        File file =new File(fileName);
        try{
            //保存文件
            mf.transferTo(file);
        }catch (Exception e){
            e.printStackTrace();
            return dealResultMap(false,"上传失败");
        }
        return dealResultMap(true,"上传成功");

    }
    //使用spring MVC 的MultipartFile 类作为参数
    @RequestMapping(value = "/upload/multipart",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> uploadMultipartFile(MultipartFile file){
        String fileName =file.getOriginalFilename();
        File dest = new File(fileName);
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
            return dealResultMap(false,"上传失败");


        }
        return dealResultMap(true,"上传成功");


    }
    @ResponseBody
    @RequestMapping(value = "/upload/part",method = RequestMethod.POST)
    public Map<String,Object> uploadPart(Part file){
        //获取提交文件名
        String fileName =file.getSubmittedFileName();
        try {
            //写入文件
            file.write(fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return dealResultMap(false,"上传失败");

        }
        return dealResultMap(true,"上传成功");

    }



    //处理上传文件结果
    private Map<String,Object> dealResultMap(boolean success,String msg){
        Map<String,Object> result = new HashMap<>();
        result.put("success",success);
        result.put("msg",msg);
        return result;

    }









}
