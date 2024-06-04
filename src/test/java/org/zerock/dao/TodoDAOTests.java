package org.zerock.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.w2.dao.TodoDAO;
import org.zerock.w2.domain.TodoVO;

import java.time.LocalDate;
import java.util.List;

public class TodoDAOTests {

    private TodoDAO todoDAO;

    @BeforeEach
    void ready() {
        todoDAO = new TodoDAO();
    }

    @Test
    void testTime() throws Exception {
        System.out.println(todoDAO.getTime());
    }

    @Test
    void testInsert() throws Exception {
        TodoVO todoVO = TodoVO.builder()
                .title("Sample Title...")
                .dueDate(LocalDate.of(2024, 06, 04))
                .build();

        todoDAO.insert(todoVO);
    }

    @Test
    void testList() throws Exception {
        List<TodoVO> list = todoDAO.selectAll();

        list.forEach(vo -> System.out.println(vo));
    }

    @Test
    void testSelectOne() throws Exception {

        Long tno = 1L;

        TodoVO vo = todoDAO.selectOne(tno);

        System.out.println(vo);
    }

    @Test
    void testUpdateOne() throws Exception {
        TodoVO vo = TodoVO.builder()
                .tno(1L)
                .title("Sample Title...")
                .dueDate(LocalDate.of(2024, 06, 30))
                .finished(true)
                .build();

        todoDAO.updateOne(vo);
    }
}
