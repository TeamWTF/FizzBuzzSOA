package com.enterprise.fizzbuzz.soa.client.adapter;

import com.enterprise.fizzbuzz.soa.exceptions.SomeObjectIsNullException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import javax.xml.ws.Service;

public class ClientAdapter implements InvocationHandler {
    
    private Class<? extends Service> serviceClass;
    
    public ClientAdapter(Class<? extends Service> serviceClass) {
        this.serviceClass = serviceClass;
    }
    
    @Override
    public Object invoke(Object o, Method method, Object[] os) throws Throwable {
        Object delegateObject = createDelegate();
        Class<?> delegateClass = delegateObject.getClass();
        Method delegateMethod = delegateClass.getMethod(method.getName(), method.getParameterTypes());
        try {
            return delegateMethod.invoke(delegateObject, os);
        } catch (InvocationTargetException ex) {
            throw new SomeObjectIsNullException(ex.getCause());
        }
    }
    
    private Object createDelegate() throws Throwable {
        Method portMethod = serviceClass.getMethod(String.format("get%sPort", extractClient(serviceClass)));
        return portMethod.invoke(serviceClass.newInstance());
    }    
    
    public static <T> T createAdaptedInterface(Class<? extends Service> serviceClass, Class<T> type) {
        return (T) Proxy.newProxyInstance(serviceClass.getClassLoader(),
                               new Class<?>[] {type},
                               new ClientAdapter(serviceClass));
    }    
    
    private static String extractClient(Class<?> serviceClass) {
        final String className = serviceClass.getSimpleName();
        return className.substring(0, className.indexOf("Service"));
    }
}
