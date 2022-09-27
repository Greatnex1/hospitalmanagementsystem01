package hms.africa.dynamicHospital.data.models;

import java.time.LocalDateTime;
import java.util.List;

public class HealthProfessional extends  User{
    private List<Appointment> appointments;
    Hospital hospital;
    LocalDateTime localDateTime;

}
