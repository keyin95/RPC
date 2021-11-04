package org.example.rpc.common.utils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/* Reflection tools
* */
public class ReflectionUtils {
    public static <T> T newInstance(Class<T> clazz){
        try{
            return clazz.newInstance();
        }catch(Exception e){
            throw new IllegalStateException(e);
        }
    }

    public static Method[] getPublicMethods(Class clazz){
        Method[] methods = clazz.getMethods();
        List<Method> pmethods = new ArrayList<>();
        for(Method m: methods){
             pmethods.add(m);
        }
        return pmethods.toArray(new Method[0]);
    }

    public static Object invoke(Object obj, Method method, Object... args){
        try {
            return method.invoke(obj, args);
        }catch (Exception e){
            throw new IllegalStateException(e);
        }
    }
}
