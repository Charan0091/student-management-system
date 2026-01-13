package com.studentManagement.demo.dto;

import com.studentManagement.demo.model.Course;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentRequest {
    // only fields needed from the clients
    // validation stays here

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid Email")
    @NotBlank(message = "Email is required")
    private String email;

    @NotNull(message = "Course is required")
    private Course course;

    @Min(0)
    @Max(100)
    private int marks;

    @DecimalMin("0.0")
    @DecimalMax("100.0")
    private Double attendancePercentage;
}
