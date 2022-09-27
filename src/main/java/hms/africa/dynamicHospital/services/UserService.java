package hms.africa.dynamicHospital.services;

import hms.africa.dynamicHospital.data.dto.request.UpdateUserDetails;
import hms.africa.dynamicHospital.data.dto.request.UserLoginRequest;
import hms.africa.dynamicHospital.data.dto.request.UserRegistrationRequest;
import hms.africa.dynamicHospital.data.dto.respond.UserLoginResponse;
import hms.africa.dynamicHospital.data.dto.respond.UserRegistrationResponse;
import hms.africa.dynamicHospital.data.models.User;
import hms.africa.dynamicHospital.repository.UserRepository;

import java.net.PasswordAuthentication;

public interface UserService  {
    UserRepository userRepository = new UserRepository();
   // PasswordAuthentication passwordAuth = new PasswordAuthentication("", '');

    UserRegistrationResponse registerUser (UserRegistrationRequest userRegistrationRequest);

    UserLoginResponse loginUser (UserLoginRequest userLoginRequest);

    String completeProfile(UpdateUserDetails updateUserDetails);
}
