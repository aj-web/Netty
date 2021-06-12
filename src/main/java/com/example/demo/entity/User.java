package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author czj
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    public int id;
    public String name;
    public int age;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
