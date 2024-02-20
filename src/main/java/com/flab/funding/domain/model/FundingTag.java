package com.flab.funding.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class FundingTag {
    private Long id;
    private String fundingId;
    private String tag;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
