package com.kotlin.learning;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) throws Exception {
        TestInterImpl testInter = new TestInterImpl();
        ClassLoader classLoader = testInter.getClass().getClassLoader();
        Class<?>[] interfaces = testInter.getClass().getInterfaces();
        TestInter testInterProxy =
                (TestInter) Proxy.newProxyInstance(classLoader, interfaces, new TestInvocationHandler(testInter));
        testInterProxy.method("代理调用");
    }

    static class TestInvocationHandler implements InvocationHandler {
        Object target;
        public TestInvocationHandler(Object target) {
            this.target = target;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return method.invoke(target, args);
        }
    }

    interface TestInter {
        void method(String string);
    }

    static class TestInterImpl implements TestInter {

        @Override
        public void method(String str) {
            System.out.println("method: " + str);
        }
    }
}
