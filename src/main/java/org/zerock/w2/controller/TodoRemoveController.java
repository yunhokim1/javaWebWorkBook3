package org.zerock.w2.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.w2.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
@WebServlet(name = "todoRemoveController", urlPatterns = "/todo/remove")
public class TodoRemoveController extends HttpServlet {

    private TodoService todoService = TodoService.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Long tno = Long.parseLong(req.getParameter("tno"));
        log.info("tno: {}", tno);

        try {
            todoService.remove(tno);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ServletException("remove error........");
        }

        resp.sendRedirect("/todo/list");
    }
}
