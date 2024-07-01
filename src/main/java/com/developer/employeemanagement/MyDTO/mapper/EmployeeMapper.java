package com.developer.employeemanagement.MyDTO.mapper;

import com.developer.employeemanagement.MyDTO.request.EmployeeRequest;
import com.developer.employeemanagement.MyDTO.response.EmployeeResponse;
import com.developer.employeemanagement.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);
    EmployeeEntity fromRequestToEntity(EmployeeRequest employeeRequest);
    EmployeeResponse fromEntityToResponse(EmployeeEntity employeeEntity);
}
