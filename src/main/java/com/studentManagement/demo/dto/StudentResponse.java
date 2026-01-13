package com.studentManagement.demo.dto;

import com.studentManagement.demo.model.Course;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponse {
    //we control exactly what we return
    //No accidental field exposure

    private long id;
    private String name;
    private String email;
    private Course course;
    private int marks;
    private double attendancePercentage;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
