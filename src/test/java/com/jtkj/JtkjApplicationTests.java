package com.jtkj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.Rserve.RConnection;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import static com.jtkj.baidu.ai.util.FaceDetect.detect;
import static com.jtkj.baidu.ai.util.FaceMatch.match;
import static com.jtkj.baidu.ai.util.FaceMerge.facemerge;
import static com.jtkj.baidu.ai.util.GetAuth.getAuth;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JtkjApplicationTests {

	@Test
	public void test() {
		try {
			String ak = "4rVzy7tDym1fACImbvErcxkm";
			String sk = "02zgbZTvplBs3ffszUInVZ0nZ7ecQd6w";
			String access_token = getAuth(ak,sk);
			System.out.println(access_token);

			String path1 = "G:\\PhotoTestSystem\\photoTestSystem_back\\src\\main\\resources\\photo\\TIM20190312212233.jpg";
			String path2 = "G:\\PhotoTestSystem\\photoTestSystem_back\\src\\main\\resources\\photo\\20190312213532.jpg";
			String response = facemerge(path1,path2,access_token);

			System.out.println(response);
		} catch (Exception e) {
			e.fillInStackTrace();
		}

	}
}
