package com.example.ex2_record_enum.presentation.dto.Request;

public record JobDto(
        int id,
        String title,
        String company,
        double salary,
        boolean isOpen
){
    public JobDto{
        if(company == "abc"){
            throw new IllegalArgumentException("Tên phải có ý nghĩa");
        }
        if(salary <= 0){
            throw new IllegalArgumentException("Mức lương không được bé hơn hoặc bằng không");
        }
    }
}
