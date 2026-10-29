package com.example.ex2_record_enum.presentation.dto.Request;

import com.example.ex2_record_enum.domain.enums.ApplicationStatus;

public record ApplicationDto(
        String candidateName,
        String candidateEmail,
        JobDto AppliedJob,
        ApplicationStatus status
) {

}
