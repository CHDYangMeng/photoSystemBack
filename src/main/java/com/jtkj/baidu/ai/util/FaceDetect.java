package com.jtkj.baidu.ai.util;

import com.baidu.ai.aip.utils.Base64Util;
import com.baidu.ai.aip.utils.FileUtil;
import com.baidu.ai.aip.utils.GsonUtils;
import com.baidu.ai.aip.utils.HttpUtil;

import java.util.HashMap;
import java.util.Map;


public class FaceDetect {

    public static String detect(String path, String access_token) {

        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/detect";
        try {
            // 本地文件路径
            String filePath = path;
//            String imgParam = getImageStr(filePath);
            byte[] img_byte = FileUtil.readFileByBytes(path);
            String imgParam = Base64Util.encode(img_byte);

            Map<String, Object> map = new HashMap<>();
            map.put("image", imgParam);
            map.put("face_field", "age,beauty,expression,gender,glasses,race,emotion,face_type");
            map.put("image_type", "BASE64");

            String param = GsonUtils.toJson(map);

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = access_token;

            String result = HttpUtil.post(url, accessToken, "application/json", param);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
