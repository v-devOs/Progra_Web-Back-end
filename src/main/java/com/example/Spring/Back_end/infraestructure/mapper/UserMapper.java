package com.example.Spring.Back_end.infraestructure.mapper;

import com.example.Spring.Back_end.domain.entity.User;
import com.example.Spring.Back_end.presentation.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    ModelMapper modelMapper;

    UserDTO toUserDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    public UserMapper(
            @Autowired ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
}
