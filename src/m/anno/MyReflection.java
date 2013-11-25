package m.anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection {

    public static void main(String[] args) throws Exception {
        Class argClass = null;
        argClass = Class.forName(args[0]);
        Method[] argMethods = argClass.getMethods();
        for (Method curMethod : argMethods) {
            if (argClass == curMethod.getDeclaringClass()) {
                curMethod.invoke(argClass.newInstance());
                if (curMethod.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation argAnnotation = curMethod.getAnnotation(MyAnnotation.class);
                    System.out.println(argAnnotation.hello());
                    System.out.println(argAnnotation.world());
                }
            }
        }
    }

}