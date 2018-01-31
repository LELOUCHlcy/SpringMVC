package com.lcy.controller;

import com.lcy.dao.EmployeeDao;
import com.lcy.entities.Employee;
import com.lcy.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;

/**
 * springmvc的helloworld
 *
 * @author lcy
 * @create 2018-01-26 09:50
 */
@Controller
@RequestMapping("/springmvc")
public class HelloWorldController {

    public static final String SUCCESS = "success";

    @Autowired
    private EmployeeDao employeeDao;


    @Autowired
    private ResourceBundleMessageSource messageSource;


    @RequestMapping("/helloworld")
    public String helloworld() {

        return SUCCESS;
    }

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping() {
        return SUCCESS;
    }

    @RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    public String testMethod() {
        return SUCCESS;
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") String id) {
        System.out.println(id);
        return SUCCESS;
    }


    @RequestMapping("/testPojo")
    public String testPojo(User user) {
        System.out.println(user);
        return SUCCESS;
    }

    @RequestMapping("/testServletAPI")
    public void testServletAPI(Writer out, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("requset:" + request + "," + "response:" + response);
        out.write("servlet success");
        //  return SUCCESS;
    }


    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("name1", "1111");
        map.put("name2", "2111");
        map.put("name3", "3111");
        return SUCCESS;
    }


    @RequestMapping("/testModel")
    public String testModel(Model model) {
        model.addAttribute("name1", "1111");
        model.addAttribute("name2", "2222");
        model.addAttribute("name3", "3333");
        return SUCCESS;
    }

    @ModelAttribute
    public void getUser(Map<String, Object> map) {

        User user = new User(12, "565862329@qq.com", 1, "123456", "lcy");
        map.put("user", user);

    }

    @RequestMapping("/testModalAttribute")
    public String testModalAttribute(User user) {

        System.out.println(user);
        return SUCCESS;
    }

    @RequestMapping("/testView")
    public String testView() {


        return "helloView";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect() {
        System.out.println("testRedirect");

        return "forward:/WEB-INF/views/redirect.jsp";
    }

    @RequestMapping("/testConverter")
    public String testConverter(@RequestParam("employee") Employee employee) {
        System.out.println(employee);
        return SUCCESS;
    }

    @RequestMapping("/testFormatting")
    public String testFormatting(@Valid Employee employee) {
        System.out.println(employee);
      /*  if(result.getFieldErrorCount()>0){
            return "redirect:/index.jsp";
        }*/
        return SUCCESS;
    }

    @RequestMapping("/testJson")
    @ResponseBody
    public Collection<Employee> testJson() {


        return employeeDao.getAll();
    }

    @RequestMapping("/testI18n")
    public String testI18n(Locale locale) {

        System.out.println(messageSource.getMessage("i18n.user", null, locale));


        return SUCCESS;
    }


    @RequestMapping("/testFileUpload")
    public String testFileUpload(@RequestParam("desc") String desc, @RequestParam("file") MultipartFile file) {

        System.out.println(desc);
        System.out.println(file.getOriginalFilename());
        return SUCCESS;
    }


}
