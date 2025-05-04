package com.adarsh1122.firstjobapp.job;

import java.util.List;

public interface JobService {
    void generateJob(Job job);

    List<Job> findAll();

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);


}
