package org.example.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String position;
    private String phone;

    public Employee(String name, String position, String phone) {
        this.name = name;
        this.position = position;
        this.phone = phone;
    }
}
