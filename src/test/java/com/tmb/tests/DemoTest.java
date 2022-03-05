package com.tmb.tests;

import com.tmb.FrameworkConfig;
import com.tmb.config.ConfigFactory;
import org.testng.annotations.Test;

public class DemoTest {

    //local, remote(selenium, selenoid, browserstack) : chrome, firefox

    @Test
    public void test1(){
        System.out.println(ConfigFactory.getConfig().browser());


    }
}
