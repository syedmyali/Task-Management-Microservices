package com.syed.controller;

import com.syed.model.Task;
import com.syed.model.TaskStatus;
import com.syed.model.UserDto;
import com.syed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {


    @GetMapping("/tasks")
    public ResponseEntity<String> getAllTasks() {

        return new ResponseEntity<>("Wellcome to Task Service!!", HttpStatus.OK);
    }
}
