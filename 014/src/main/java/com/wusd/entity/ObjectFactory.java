package com.wusd.entity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObjectFactory {
    public UserEntity getUserEntity() {
      log.info("ObjectFactory.getUserEntity()");
      return new UserEntity("wusd", 26);
    }
    public static UserEntity getStaticUserEntity() {
        log.info("ObjectFactory.getStaticUserEntity()");
        return new UserEntity("lij", 25);
    }
}
