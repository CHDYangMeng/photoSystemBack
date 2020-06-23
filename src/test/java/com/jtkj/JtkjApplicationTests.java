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

		} catch (Exception e) {
			e.fillInStackTrace();
		}

	}
}
