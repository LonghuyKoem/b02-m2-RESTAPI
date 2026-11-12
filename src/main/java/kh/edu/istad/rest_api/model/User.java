package kh.edu.istad.rest_api.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private UUID id;
    private String name;
    private String username;
    private String password;
    private Boolean isActive;
}