package com.gachidata.di;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
//@RunWith(JUnit4.class)
//@RunWith(SpringJUnit4ClassRunner.class)  // - junit4기반 

//@ExtendWith(SpringExtension.class)  // Spring DI구현시 필요 
//@ContextConfiguration("classpath:/di.xml")

@SpringJUnitConfig(locations = {"classpath:/di.xml"})  // 위 2개를 합친기능
@DisplayName("메시지출력 테스트")
class MessageRendererTest {
	
	@Autowired
	private MessageRenderer messageRenderer;
	
	@Test
	@DisplayName("@Test 첫번재")
	void renderer() {
		messageRenderer.render();
		assertNotNull(messageRenderer);
	}

}
