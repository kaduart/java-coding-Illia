package br.com.teste.ilia.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.teste.ilia.entity.User;
import br.com.teste.ilia.service.dto.UserDTO;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface UserMapper extends EntityMapper<UserDTO, User> {

	
	@Mapping(source = "user", target = "user")
    UserDTO toDto(User user);

    @Mapping(source = "user", target = "user")
    User toEntity(UserDTO userDTO);
}
