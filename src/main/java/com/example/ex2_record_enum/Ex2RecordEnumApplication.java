package com.example.ex2_record_enum;

import com.example.ex2_record_enum.domain.enums.ApplicationStatus;
import com.example.ex2_record_enum.presentation.dto.Request.ApplicationDto;
import com.example.ex2_record_enum.presentation.dto.Request.JobDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Ex2RecordEnumApplication {


	public static void main(String[] args) {

        JobDto jobDto = new JobDto(1,
                "dev-be",
                "abc",
                100.000,
                true
        );

        System.out.println("title" + jobDto.title());
        System.out.println("salary" + jobDto.salary());
//        ApplicationStatus currentStatus = ApplicationStatus.SUBMITTED;


        ApplicationDto applicationDto = new ApplicationDto(
                "Đặng Văn Nghĩa",
                "nghiadang@gmail.com",
                jobDto,
                ApplicationStatus.SUBMITTED
        );

//        System.out.println(applicationDto);
        System.out.println("Candidate name: " +applicationDto.candidateName());
        System.out.println("Candidate email: " +applicationDto.candidateEmail());
        System.out.println(jobDto);


	}

}
