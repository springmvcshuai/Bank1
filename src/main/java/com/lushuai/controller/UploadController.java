package com.lushuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {


    @RequestMapping("/upload.do")
    public String uploadFile(@RequestParam MultipartFile upfile){

        String dir = "D:/upload";
        String filename = upfile.getOriginalFilename();
        File file = new File(dir);
        if (!file.exists()){
            file.mkdirs();
        }
        File newFile = new File(dir, filename);
        try {
            upfile.transferTo(newFile);
        } catch (IOException e) {
            System.out.println("testgit");
            e.printStackTrace();
        }
        return "redirect:/success.html";
    }
}
