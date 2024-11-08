package com.dev.jobportal.entity.mapper;

import com.dev.jobportal.entity.JobCompany;
import com.dev.jobportal.entity.JobLocation;
import lombok.Data;

@Data
public class RecruiterJobsDto {

    private Long totalCandidates;
    private Integer jobPostId;
    private String jobTitle;
    private JobLocation jobLocationId;
    private JobCompany jobCompanyId;

    public RecruiterJobsDto(Long totalCandidates,
                            Integer jobPostId,
                            String jobTitle,
                            JobLocation jobLocationId,
                            JobCompany jobCompanyId) {
        this.totalCandidates = totalCandidates;
        this.jobPostId = jobPostId;
        this.jobTitle = jobTitle;
        this.jobLocationId = jobLocationId;
        this.jobCompanyId = jobCompanyId;
    }
}