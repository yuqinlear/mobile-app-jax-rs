package com.changpeng.app.ws.ui.entrypoints;

import com.changpeng.app.ws.service.UsersService;
import com.changpeng.app.ws.service.com.changpeng.app.ws.service.impl.UsersServiceImpl;
import com.changpeng.app.ws.shared.dto.UserDTO;
import com.changpeng.app.ws.ui.model.request.CreateUserRequestModel;
import com.changpeng.app.ws.ui.model.response.UserProfileRest;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.BeanUtils;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UsersEntryPoint {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public UserProfileRest createUser(CreateUserRequestModel requestObject) {
        UserProfileRest returnValue = new UserProfileRest();

        // Prepare userDTO
        UserDTO userDto = new UserDTO();
        BeanUtils.copyProperties(requestObject, userDto);

        // Create new user
        UsersService userService = new UsersServiceImpl();
        UserDTO createdUserProfile = userService.createUser(userDto);

        // Prepare response
        BeanUtils.copyProperties(createdUserProfile, returnValue);
        return returnValue;
    }
}
