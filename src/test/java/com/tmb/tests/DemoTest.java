package com.tmb.tests;

import com.tmb.FrameworkConfig;
import com.tmb.config.ConfigFactory;
import org.testng.annotations.Test;

public class DemoTest {

    //local, remote(selenium, selenoid, browserstack) : chrome, firefox

    @Test
    public void test1(){
        System.out.println(ConfigFactory.getConfig().browser());
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.in");
        System.out.println(driver.getTitle());
        driver.quit();*/

    }
}
