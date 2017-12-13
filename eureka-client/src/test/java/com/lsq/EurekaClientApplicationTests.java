//package com.lsq;
//
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
////// 指定我们SpringBoot工程的Application启动类
//@SpringApplicationConfiguration(classes = EurekaClientApplication.class)
/////由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
//@WebAppConfiguration
//public class EurekaClientApplicationTests {
//    private MockMvc mvc;
//
//
////    @Before
////    public void setUp() {
////        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
////    }
////
////    @Ignore
////    @Test
////    public void testIndex() throws Exception {
////        mvc.perform(MockMvcRequestBuilders.get("/index")
////                .accept(MediaType.APPLICATION_JSON))
////                .andExpect(status().isOk())
////                .andExpect(content().string(equalTo("spring boot")));
////    }
//
//}
