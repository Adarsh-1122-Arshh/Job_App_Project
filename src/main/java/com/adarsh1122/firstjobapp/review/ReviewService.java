package com.adarsh1122.firstjobapp.review;

import org.springframework.stereotype.Service;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);

    void addReview(Long companyId, Review review);
}
