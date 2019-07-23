package com.jtkj.controller.recognition;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import static com.jtkj.baidu.ai.util.FaceDetect.detect;
import static com.jtkj.baidu.ai.util.FaceMatch.match;
import static com.jtkj.baidu.ai.util.FaceMerge.facemerge;
import static com.jtkj.baidu.ai.util.GetAuth.getAuth;

@Controller
@CrossOrigin
public class Human {

    /**
     * @author yangmeng
     * @message 人脸检测
     *
     * */
    @RequestMapping("/human1")
    @ResponseBody
    public Map<String,Object> human1(@RequestParam("path") String path) throws Exception {

        Map<String,Object> result = new HashMap<>();

        String ak = "4rVzy7tDym1fACImbvErcxkm";
        String sk = "02zgbZTvplBs3ffszUInVZ0nZ7ecQd6w";
        String access_token = getAuth(ak,sk);
        System.out.println(access_token);

        String response = detect(path,access_token);

        result.put("status", 200);
        result.put("message", "识别成功");
        result.put("response",response);

        return result;
    }

    /**
     * @author yangmeng
     * @message 人脸对比
     *
     * */
    @RequestMapping("/human2")
    @ResponseBody
    public Map<String,Object> human2(@RequestParam("path1") String path1, @RequestParam("path2") String path2) throws Exception {

        Map<String,Object> result = new HashMap<>();

        String ak = "4rVzy7tDym1fACImbvErcxkm";
        String sk = "02zgbZTvplBs3ffszUInVZ0nZ7ecQd6w";
        String access_token = getAuth(ak,sk);
        System.out.println(access_token);

        String response = match(path1, path2, access_token);

        result.put("status", 200);
        result.put("message", "对比成功");
        result.put("response",response);

        return result;
    }

    /**
     * @author yangmeng
     * @message 人脸融合
     *
     * */
    @RequestMapping("/human3")
    @ResponseBody
    public Map<String,Object> human3(@RequestParam("path1") String path1, @RequestParam("path2") String path2) throws Exception {

        Map<String,Object> result = new HashMap<>();

        String ak = "4rVzy7tDym1fACImbvErcxkm";
        String sk = "02zgbZTvplBs3ffszUInVZ0nZ7ecQd6w";
        String access_token = getAuth(ak,sk);
        System.out.println(access_token);

        String response = facemerge(path1,path2,access_token);

        result.put("status", 200);
        result.put("message", "融合成功");
        result.put("response",response);

        return result;
    }
}
