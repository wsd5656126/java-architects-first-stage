package com.wusd;

import com.wusd.maven.Hello;
import org.junit.Test;

public class HelloFriendTest {
    @Test
    public void test() {
        Hello hello = new Hello();
        hello.hello();
    }
}
