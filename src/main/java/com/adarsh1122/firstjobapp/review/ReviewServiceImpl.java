package com.adarsh1122.firstjobapp.review;

import java.util.List;

public class ReviewServiceImpl implements ReviewService {
    public ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewReposiory) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {
        List<Review> reviews = reviewRepository.findAllByCompanyId(companyId);
        return reviews;
    }
}
