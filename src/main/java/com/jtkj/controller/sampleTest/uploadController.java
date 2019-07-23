package com.jtkj.controller.sampleTest;


import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static com.jtkj.baidu.ai.util.AdvancedGeneral.advancedGeneral;
import static com.jtkj.baidu.ai.util.GetAuth.getAuth;

@Controller
@CrossOrigin
public class uploadController {

    @RequestMapping("/UploadFile")
    @ResponseBody
    public Map<String, Object> uploadFile( @RequestParam("file") MultipartFile file, @RequestParam("authorName") String authorName, HttpServletRequest request) throws Exception {

        Map<String,Object> result = new HashMap<>();

        try {
            File path = new File(ResourceUtils.getURL("src\\main\\resources\\photo\\").getPath());
            String fileName = file.getOriginalFilename();
            String newName = authorName +  fileName;
            String realPath = path + "\\" + newName;
            System.out.println(realPath);
            File desFile = new File(realPath);
            file.transferTo(desFile);

            result.put("status", 200);
            result.put("message","图片上传成功");
            result.put("flag","success");
            result.put("path",realPath);

        } catch (Exception e) {
            System.out.println("文件已存在");
            e.fillInStackTrace();

            File path = new File(ResourceUtils.getURL("src\\main\\resources\\photo\\").getPath());
            String fileName = file.getOriginalFilename();
            String newName = authorName +  fileName;
            String realPath = path + "\\" + newName;

            result.put("status", 201);
            result.put("message","图片上传成功");
            result.put("flag","error");
            result.put("path",realPath);
        }
        return result;
    }

    @RequestMapping("/pictureTest")
    @ResponseBody
    public Map<String,Object> pictureTest(@RequestParam("path") String path) throws Exception {

        Map<String,Object> result = new HashMap<>();

        String ak = "4rVzy7tDym1fACImbvErcxkm";
        String sk = "02zgbZTvplBs3ffszUInVZ0nZ7ecQd6w";
        String access_token = getAuth(ak,sk);
        System.out.println(access_token);

        String response = advancedGeneral(path,access_token);

        System.out.println(response);

        result.put("status", 200);
        result.put("message", "测试成功");
        result.put("response",response);
        return result;
    }
}
