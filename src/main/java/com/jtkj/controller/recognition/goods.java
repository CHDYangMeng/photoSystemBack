package com.jtkj.controller.recognition;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import static com.jtkj.baidu.ai.util.AdvancedGeneral.advancedGeneral;
import static com.jtkj.baidu.ai.util.Animal.animal;
import static com.jtkj.baidu.ai.util.Dish.dish;
import static com.jtkj.baidu.ai.util.Flower.flower;
import static com.jtkj.baidu.ai.util.GetAuth.getAuth;
import static com.jtkj.baidu.ai.util.Ingredient.ingredient;
import static com.jtkj.baidu.ai.util.Plant.plant;

@Controller
@CrossOrigin
public class goods {

    /**
     * @author yangmeng
     * @message 场景识别
     *
     */
    @RequestMapping("/pageComponent1")
    @ResponseBody
    public Map<String, Object> pageComponent1(@RequestParam("path") String path) throws Exception {
        Map<String,Object> result = new HashMap<>();

        String ak = "4rVzy7tDym1fACImbvErcxkm";
        String sk = "02zgbZTvplBs3ffszUInVZ0nZ7ecQd6w";
        String access_token = getAuth(ak,sk);
        System.out.println(access_token);

        String response = advancedGeneral(path,access_token);

        System.out.println(response);

        result.put("status", 200);
        result.put("message", "识别成功");
        result.put("response",response);
        return result;
    }

    /**
     * @author yangmeng
     * @message 菜品识别
     *
     */
    @RequestMapping("/pageComponent2")
    @ResponseBody
    public Map<String, Object> pageComponent2(@RequestParam("path") String path) throws Exception {
        Map<String,Object> result = new HashMap<>();

        String ak = "4rVzy7tDym1fACImbvErcxkm";
        String sk = "02zgbZTvplBs3ffszUInVZ0nZ7ecQd6w";
        String access_token = getAuth(ak,sk);
        System.out.println(access_token);

        String response = dish(path,access_token);

        System.out.println(response);

        result.put("status", 200);
        result.put("message", "识别成功");
        result.put("response",response);
        return result;
    }

    /**
     * @author yangmeng
     * @message 动物识别
     *
     */
    @RequestMapping("/pageComponent3")
    @ResponseBody
    public Map<String, Object> pageComponent3(@RequestParam("path") String path) throws Exception {
        Map<String,Object> result = new HashMap<>();

        String ak = "4rVzy7tDym1fACImbvErcxkm";
        String sk = "02zgbZTvplBs3ffszUInVZ0nZ7ecQd6w";
        String access_token = getAuth(ak,sk);
        System.out.println(access_token);

        String response = animal(path,access_token);

        System.out.println(response);

        result.put("status", 200);
        result.put("message", "识别成功");
        result.put("response",response);
        return result;
    }

    /**
     * @author yangmeng
     * @message 植物识别
     *
     */
    @RequestMapping("/pageComponent4")
    @ResponseBody
    public Map<String, Object> pageComponent4(@RequestParam("path") String path) throws Exception {
        Map<String,Object> result = new HashMap<>();

        String ak = "4rVzy7tDym1fACImbvErcxkm";
        String sk = "02zgbZTvplBs3ffszUInVZ0nZ7ecQd6w";
        String access_token = getAuth(ak,sk);
        System.out.println(access_token);

        String response = plant(path,access_token);

        System.out.println(response);

        result.put("status", 200);
        result.put("message", "识别成功");
        result.put("response",response);
        return result;
    }

    /**
     * @author yangmeng
     * @message 花卉识别
     *
     */
    @RequestMapping("/pageComponent5")
    @ResponseBody
    public Map<String, Object> pageComponent5(@RequestParam("path") String path) throws Exception {
        Map<String,Object> result = new HashMap<>();

        String ak = "4rVzy7tDym1fACImbvErcxkm";
        String sk = "02zgbZTvplBs3ffszUInVZ0nZ7ecQd6w";
        String access_token = getAuth(ak,sk);
        System.out.println(access_token);

        String response = flower(path,access_token);

        System.out.println(response);

        result.put("status", 200);
        result.put("message", "识别成功");
        result.put("response",response);
        return result;
    }

    /**
     * @author yangmeng
     * @message 果蔬识别
     *
     */
    @RequestMapping("/pageComponent6")
    @ResponseBody
    public Map<String, Object> pageComponent6(@RequestParam("path") String path) throws Exception {
        Map<String,Object> result = new HashMap<>();

        String ak = "4rVzy7tDym1fACImbvErcxkm";
        String sk = "02zgbZTvplBs3ffszUInVZ0nZ7ecQd6w";
        String access_token = getAuth(ak,sk);
        System.out.println(access_token);

        String response = ingredient(path,access_token);

        System.out.println(response);

        result.put("status", 200);
        result.put("message", "识别成功");
        result.put("response",response);
        return result;
    }
}
