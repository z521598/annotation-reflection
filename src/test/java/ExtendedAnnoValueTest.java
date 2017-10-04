import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.baidu.langshiquan.annotation.Description;

/**
 * Created by langshiquan on 17/10/4.
 */
@RunWith(JUnit4.class)
public class ExtendedAnnoValueTest {
    private Class c;

    @Before
    public void init() throws ClassNotFoundException {
        c = Class.forName("com.baidu.langshiquan.bean.FatherUserBean");
    }

    @Test
    public void testGetClassAnno() {
        // 判断是否存在
        boolean isExist = c.isAnnotationPresent(Description.class);
        if (isExist) {
            // 获取注解实例
            Description d = (Description) c.getAnnotation(Description.class);
            System.out.println(d.value());
        }

    }

    @Test
    public void testGetMethodAnno2() {
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            boolean isExist = method.isAnnotationPresent(Description.class);
            if (isExist) {
                // 获取注解实例
                Description d = method.getAnnotation(Description.class);
                System.out.println(d.value());
            }
        }
    }

    @Test
    public void testGetClassAnno2() {
        Annotation[] annotations = c.getAnnotations();
        for(Annotation annotation :annotations){
            if(annotation instanceof Description){
                System.out.println(((Description) annotation).value());
            }
        }
    }

}
