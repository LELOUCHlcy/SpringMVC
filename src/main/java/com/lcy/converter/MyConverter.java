package com.lcy.converter;

import com.lcy.entities.Employee;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 自定义springmvc转换器
 *
 * @author lcy
 * @create 2018-01-29 09:47
 */
@Component
public class MyConverter implements Converter<String,Employee> {
    public Employee convert(String s) {
       if(s!=null){
           String[] vals = s.split("-");
           if(vals!=null&&vals.length==3){
               String username = vals[0];
               String email = vals[1];
               Integer age = Integer.parseInt(vals[2]);
               Employee e = new Employee(null,username,email,age,null);
               return e;
           }


       }

        return null;
    }
}
