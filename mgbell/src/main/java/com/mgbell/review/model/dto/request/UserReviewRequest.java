package com.mgbell.review.model.dto.request;

import com.mgbell.review.model.entity.ReviewScore;
import com.mgbell.review.model.entity.SatisfiedReason;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserReviewRequest {
    @NotNull(message = "order id error")
    private Long orderId;
    @NotNull(message = "review score error")
    private ReviewScore reviewScore;
    private String content;
    private List<SatisfiedReason> satisfiedReasons = new ArrayList<>();
}
