package com.kristin.config.parsing;

import com.kristin.config.Bean;
import org.dom4j.DocumentException;
import org.junit.Test;

import java.util.Map;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/7/10 11:08
 * @desc
 **/
public class TestConfigrationManager {
    @Test
    public void testGetBean() {
        Map<String, Bean> beanConfig = null;
        beanConfig = ConfigurationManager.getBeanConfig("/applicationContext.xml");
        for (Map.Entry<String, Bean> e : beanConfig.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
