package com.example.demo.dto;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class StudentDTO {

    private long id;

    private String name;

    private String email;

}
