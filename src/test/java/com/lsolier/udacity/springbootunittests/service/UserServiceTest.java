package com.lsolier.udacity.springbootunittests.service;

import com.lsolier.udacity.springbootunittests.SpringBootUnitTestsApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SpringBootUnitTestsApplication.class})
public class UserServiceTest {

  @Resource
  private UserService userService;

  @Test
  public void testGetUser() {
    Assert.assertEquals(userService.getUser(), "Luis");
  }

}