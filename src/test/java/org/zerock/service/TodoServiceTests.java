package org.zerock.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.w2.dto.TodoDTO;
import org.zerock.w2.service.TodoService;

import java.time.LocalDate;

@Log4j2
public class TodoServiceTests {

    private TodoService todoService;

    @BeforeEach
    void ready() {
        todoService = TodoService.INSTANCE;
    }

    @Test
    void testRegister() throws Exception {
        TodoDTO todoDTO = TodoDTO.builder()
                .title("JDBC Test title")
                .dueDate(LocalDate.now())
                .build();

        log.info("----------------------------------");
        log.info(todoDTO);

        todoService.register(todoDTO);
    }

}
