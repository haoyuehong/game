package com.hz202.game.utils;

import com.github.iamdrq.staticlient.FileUploadClient;
import com.github.iamdrq.staticlient.FileUploadResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: mol
 * @Description:
 * @Date: create in 11:35 2018/4/28
 */
public class UploadUtils {
    public static String uploadPic(MultipartFile file, String path) throws Exception{
        FileUploadClient fileUploadClient = new FileUploadClient("https://static.jdksh.cn/","lgfiletest");
        FileUploadResult uploadResult = fileUploadClient.upload(path, file.getOriginalFilename(), file.getInputStream());
        if(uploadResult.getCode() == 0){
            return "上传失败";
        }
        return uploadResult.getPath().get(0).replace("627/","");
    }
}
