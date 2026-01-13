package com.studentManagement.demo.service;

import com.studentManagement.demo.dto.StudentRequest;
import com.studentManagement.demo.dto.StudentResponse;
import com.studentManagement.demo.model.Student;
import com.studentManagement.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public StudentResponse createStudent(StudentRequest request) {
        Student student = StudentMapper.toEntity(request);
        Student saved = repository.save(student);
        return StudentMapper.toResponse(saved);
    }

    public List<StudentResponse> getAllStudents() {
        return repository.findAll()
                .stream()
                .map(StudentMapper::toResponse)
                .toList();
    }

    public StudentResponse getStudentById(Long id) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        return StudentMapper.toResponse(student);
    }

    public StudentResponse updateStudent(Long id, StudentRequest request) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        student.setName(request.getName());
        student.setEmail(request.getEmail());
        student.setCourse(request.getCourse());
        student.setMarks(request.getMarks());
        student.setAttendancePercentage(request.getAttendancePercentage());

        return StudentMapper.toResponse(repository.save(student));
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
