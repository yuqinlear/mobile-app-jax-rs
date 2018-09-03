package com.changpeng.app.ws.service.com.changpeng.app.ws.service.impl;

import com.changpeng.app.ws.service.UsersService;
import com.changpeng.app.ws.shared.dto.UserDTO;
import com.changpeng.app.ws.utils.UserProfileUtils;

public class UsersServiceImpl implements UsersService {

    UserProfileUtils userProfileUtils = new UserProfileUtils();

    public UserDTO createUser(UserDTO user) {
        UserDTO returnValue = new UserDTO();

        // Validate the required fields
        userProfileUtils.validateRequiredFields(user);

        // Check if the user already exists

        // Create an Entity object

        // Generate secure public user id

        // Generate salt

        // Generate secure password

        // Record data into database

        // return back the user profile

        return returnValue;
    }
}
