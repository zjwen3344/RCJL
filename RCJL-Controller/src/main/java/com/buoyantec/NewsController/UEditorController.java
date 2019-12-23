package com.buoyantec.NewsController;

import com.buoyantec.BaseController;
import com.buoyantec.Utils.Ueditor.ActionEnter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * @program: RCJL
 * @description: UE编辑器相关操作接口
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-23 14:20
 **/

@RestController
@RequestMapping("/News/Ueditor")
public class UEditorController extends BaseController {


    @RequestMapping(value="/config")
    public void config(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");

        String rootPath = request.getSession().getServletContext().getRealPath("/");
        try {
            String exec = new ActionEnter(request, rootPath).exec();
            PrintWriter writer = response.getWriter();
            writer.write(exec);
            writer.flush();
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
