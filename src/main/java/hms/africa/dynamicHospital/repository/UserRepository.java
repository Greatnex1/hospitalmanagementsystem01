package hms.africa.dynamicHospital.repository;

import hms.africa.dynamicHospital.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository implements JpaRepository <User,String> {
}
