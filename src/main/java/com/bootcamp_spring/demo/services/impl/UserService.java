package com.bootcamp_spring.demo.services.impl;

import com.bootcamp_spring.demo.dto.UsersDTO;
import com.bootcamp_spring.demo.entity.UsersEntity;
import com.bootcamp_spring.demo.repository.UsersRepository;
import com.bootcamp_spring.demo.services.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUsersService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public UsersDTO getUserById(Long id) {
        Optional<UsersEntity> optUserEntity = usersRepository.findById(id);
        if (optUserEntity.isEmpty())
            return UsersDTO.builder()
                    .name(String.format("No hay registro con el ID %s", id))
                    .lastName(String.format("No hay registro con el ID %s", id))
                    .build();

        UsersEntity usersEntity = optUserEntity.get();
        UsersDTO usersDTO = UsersDTO.builder()
                .id(usersEntity.getId())
                .name(usersEntity.getName())
                .lastName(usersEntity.getLastName())
                .state(usersEntity.getState())
                .build();

        return usersDTO;
    }

}
