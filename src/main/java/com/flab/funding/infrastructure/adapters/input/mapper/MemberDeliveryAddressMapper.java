package com.flab.funding.infrastructure.adapters.input.mapper;

import com.flab.funding.domain.model.DeliveryAddress;
import com.flab.funding.infrastructure.adapters.input.data.request.MemberDeliveryAddressRegisterRequest;
import com.flab.funding.infrastructure.adapters.input.data.response.MemberDeliveryAddressRegisterResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MemberDeliveryAddressMapper {
    MemberDeliveryAddressMapper INSTANCE = Mappers.getMapper(MemberDeliveryAddressMapper.class);

    @Mapping(source = "isDefault", target = "isDefault")
    DeliveryAddress toDeliveryAddress(MemberDeliveryAddressRegisterRequest deliveryAddressRegisterRequest);

    @Mapping(source = "default", target = "isDefault")
    MemberDeliveryAddressRegisterResponse toMemberDeliveryAddressRegisterResponse(DeliveryAddress deliveryAddress);
}
