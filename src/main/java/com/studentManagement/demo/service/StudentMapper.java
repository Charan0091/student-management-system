package com.studentManagement.demo.service;

import com.studentManagement.demo.dto.StudentRequest;
import com.studentManagement.demo.dto.StudentResponse;
import com.studentManagement.demo.model.Student;

public class StudentMapper {

    public static Student toEntity(StudentRequest request) {

        return Student.builder()
                .name(request.getName())
                .email(request.getEmail())
                .course(request.getCourse())
                .marks(request.getMarks())
                .attendancePercentage(request.getAttendancePercentage())
                .build();
    }

    public static StudentResponse toResponse(Student student) {

        return StudentResponse.builder()
                .id(student.getId())
                .name(student.getName())
                .email(student.getEmail())
                .course(student.getCourse())
                .marks(student.getMarks())
                .attendancePercentage(student.getAttendancePercentage())
                .createdAt(student.getCreatedAt())
                .updatedAt(student.getUpdatedAt())
                .build();
    }
}
