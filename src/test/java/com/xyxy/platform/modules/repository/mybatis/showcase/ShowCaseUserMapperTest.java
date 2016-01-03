package com.xyxy.platform.modules.repository.mybatis.showcase;

import com.xyxy.platform.modules.entity.showcase.ShowCaseUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * 简介:
 *
 * @author Caizhenegda
 * @version 1.0
 * @Date 2016-01-03 16:52
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring-config.xml"})
public class ShowCaseUserMapperTest {

    @Autowired
    ShowCaseUserMapper mapper;

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        ShowCaseUser user = mapper.selectByPrimaryKey(1l);
        System.out.println(user);
    }
}