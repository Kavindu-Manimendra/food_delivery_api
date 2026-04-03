package org.foodapi.service;

import org.foodapi.dtos.UserRequest;
import org.foodapi.dtos.UserResponse;

public interface UserService {
    UserResponse registerUser(UserRequest request);
}
