package com.studentManagement.demo.controller;

import com.studentManagement.demo.dto.StudentRequest;
import com.studentManagement.demo.dto.StudentResponse;
import com.studentManagement.demo.model.Student;
import com.studentManagement.demo.response.ApiResponse;
import com.studentManagement.demo.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    public ResponseEntity<ApiResponse<StudentResponse>> createStudent(@Valid @RequestBody StudentRequest request) {
        StudentResponse student = service.createStudent(request);

        return ResponseEntity.ok(
                ApiResponse.<StudentResponse>builder()
                        .status("SUCCESS")
                        .message("Student created successfully")
                        .data(student)
                        .build()
        );
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<StudentResponse>>> getAllStudents() {
        List<StudentResponse> students = service.getAllStudents();
        return ResponseEntity.ok(
                ApiResponse.<List<StudentResponse>>builder()
                        .status("SUCCESS")
                        .message("Students fetched successfully")
                        .data(students)
                        .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<StudentResponse>> getStudentById(@PathVariable Long id) {
        StudentResponse student = service.getStudentById(id);

        return ResponseEntity.ok(
                ApiResponse.<StudentResponse>builder()
                        .status("SUCCESS")
                        .message("Student fetched successfully")
                        .data(student)
                        .build()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<StudentResponse>> updateStudent(
            @PathVariable Long id,
            @Valid @RequestBody StudentRequest request) {

        StudentResponse student = service.updateStudent(id, request);
        return ResponseEntity.ok(
                ApiResponse.<StudentResponse>builder()
                        .status("SUCCESS")
                        .message("Student updated successfully")
                        .data(student)
                        .build()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return ResponseEntity.ok(
                ApiResponse.<Void>builder()
                        .status("SUCCESS")
                        .message("Student deleted successfully")
                        .data(null)
                        .build()
        );
    }
}
