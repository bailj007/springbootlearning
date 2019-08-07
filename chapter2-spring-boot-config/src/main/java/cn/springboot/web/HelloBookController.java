package cn.springboot.web;

import cn.springboot.config.BookComponent;
import cn.springboot.config.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBookController {
    @Autowired
    //BookProperties bookProperties;
    BookComponent bookComponent;

    @GetMapping("/book/hello")
    public String sayHello(){
//        return "Hello， " + bookProperties.getWriter() + " is writing "
//                + bookProperties.getName() + " ！";
        return "Hello， " + bookComponent.getWriter() + " is writing "
                + bookComponent.getName() + " ！";
    }
}
