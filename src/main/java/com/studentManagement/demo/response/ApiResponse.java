package com.studentManagement.demo.response;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ApiResponse<T>{
    //Generic <T> means it can wrap StudentResponse, List<StudentResponse> or null

    private String status;
    private String message;
    private T data;
}
