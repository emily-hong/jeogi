package com.stay.vo;

// 숙박 리뷰와 평점
public class ReviewsAndRatings {
	int id;
	String starRating; // 평점 
	String reviewContent; // 리뷰 내용 
	String createdAt; // 작성날짜 
	
	public ReviewsAndRatings() {}
	public ReviewsAndRatings(String starRating, String reviewContent, String createdAt) {
		super();
		this.starRating = starRating;
		this.reviewContent = reviewContent;
		this.createdAt = createdAt;
	}
	public String getStarRating() {
		return starRating;
	}
	public void setStarRating(String starRating) {
		this.starRating = starRating;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	@Override
	public String toString() {
		return "ReviewsAndRatings [starRating=" + starRating + ", reviewContent=" + reviewContent + ", createdAt="
				+ createdAt + "]";
	}
}
