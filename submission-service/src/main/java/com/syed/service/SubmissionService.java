package com.syed.service;

import com.syed.model.Submission;

import java.util.List;

public interface SubmissionService {

    Submission submitTask(Long taskId, String githubLink, Long userId, String jwt) throws Exception;
    Submission getTaskSubmissionById(Long submissionId) throws Exception;
    List<Submission> getAllTaskSubmissions();
    List<Submission> getTaskSubmissionsByTaskId(Long taskId);

    Submission acceptDecilneSubmission(Long id, String status) throws Exception;


}
