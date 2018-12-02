package me.cho;

import me.cho.conf.JavaConfBean;
import me.cho.conf.XmlConfBean;
import me.cho.user.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Example.class) // 명시한 클레스 기준으로 테스트
public class ExampleTests {
	@Autowired
    UserService userService;

	@Autowired
    JavaConfBean javaConfBean;

	@Autowired
    XmlConfBean xmlConfBean;



	@Test
	public void di() {
		Assert.assertNotNull(userService);
		Assert.assertNotNull(javaConfBean);
		Assert.assertNotNull(xmlConfBean);
		// 아규먼트 빈 못가져옴...
		Assert.assertNotNull(userService.getUserRepository());


	}

}
