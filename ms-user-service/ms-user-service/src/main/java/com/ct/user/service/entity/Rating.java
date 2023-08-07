package com.ct.user.service.entity;

import javax.persistence.Entity;

//don't use @Entity bcz we are not saving this into database
public class Rating {

	private String ratingId;
	private String userId;
	private String hotelid;
	private int rating;
	private String feedback;

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(String ratingId, String userId, String hotelid, int rating, String feedback) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelid = hotelid;
		this.rating = rating;
		this.feedback = feedback;
	}

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getHotelid() {
		return hotelid;
	}

	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
