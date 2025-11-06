package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "FormData")

public class DemoModel {
    @Id

    private String  name;
    private String  id;
    private String Password;
    private String address;
    private String phonenumber;
    private String date;

    
   

    
    
}
