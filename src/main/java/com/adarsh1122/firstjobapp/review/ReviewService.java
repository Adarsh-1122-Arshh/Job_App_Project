package com.adarsh1122.firstjobapp.review;

import org.springframework.stereotype.Service;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);

    boolean addReview(Long companyId, Review review);

    Review getReview(Long companyId, Long reviewId);

    boolean updateReview(Long companyId,Long reviewId, Review review);

    boolean deleteReview(Long companyId, Long reviewId);
}
