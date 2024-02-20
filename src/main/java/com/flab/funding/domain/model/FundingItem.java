package com.flab.funding.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
public class FundingItem {
    private Long id;
    private String fundingId;
    private String itemName;
    private FundingItemOption optionType;
    private List<FundingItemOption> fundingItemOptions;
    private List<FundingRewardItem> fundingRewardItems;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
