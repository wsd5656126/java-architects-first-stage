package com.wusd;

import com.wusd.entity.ObjectFactory;
import com.wusd.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class SpringTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring2.xml");
        log.info("SpringIOC loading...");
        UserEntity userEntity = (UserEntity) applicationContext.getBean("userEntity");
        UserEntity userEntity1 = (UserEntity) applicationContext.getBean("userEntity");
        log.info("==:{}", userEntity == userEntity1);
        log.info("userEntity:{}", userEntity.toString());

        log.info("====================================");
        UserEntity userEntity2 = (UserEntity) applicationContext.getBean("userEntity2");
        UserEntity getUserEntity = (UserEntity) applicationContext.getBean("getUserEntity");
        UserEntity staticUserEnity = (UserEntity) applicationContext.getBean("getStaticUserEntity");
        log.info("");

    }
}
