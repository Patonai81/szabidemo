package hu.cib.szabi.szabidemo.controller;

import hu.cib.szabi.szabidemo.exception.TestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionHandlerController {


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handle404() {
        return "error";
    }

    @ExceptionHandler(TestException.class)
    public ResponseEntity<Object> test(TestException te) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(te.getErrorMessage());
    }
}
