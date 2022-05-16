package com.example.springbootcore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import static com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat.UUID;
import static java.util.UUID.randomUUID;

@Controller
public class FormController {

   @GetMapping("/form_layouts")
    public String form_layouts()
    {
        return "form/form_layouts";
    }


    @PostMapping("/upload")
    public String upload(@RequestPart("headerImg") MultipartFile headerImg, @RequestParam("username") String username,
                        @RequestPart("photos")MultipartFile[] photos, @RequestParam("email") String email) throws IOException {
        File file = new File("D:\\image");
        if(!file.exists()) {
            file.mkdir();
        }

        if(!headerImg.isEmpty())
        {
            String filename = randomUUID().toString();
            headerImg.transferTo(new File(file.getAbsolutePath()+"\\"+filename+".jpg"));

            }
        if(photos.length > 0)
        {
            for(MultipartFile photo : photos)
            {
                if(!photo.isEmpty())
                {
                    String originalFilename = photo.getOriginalFilename();
                    String filename = randomUUID().toString();
                    photo.transferTo(new File(file.getAbsolutePath()+"\\"+filename+".jpg"));
                }
            }
        }

        return "index";
    }


}
