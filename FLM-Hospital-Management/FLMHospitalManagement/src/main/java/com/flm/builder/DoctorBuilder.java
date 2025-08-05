package com.flm.builder;

import com.flm.dto.AddressDTO;
import com.flm.dto.DoctorDetailsDTO;
import com.flm.dto.RegisterDoctorDTO;
import com.flm.model.Address;
import com.flm.model.Doctor;
import com.flm.model.User;

public class DoctorBuilder {

    // Convert DTO to Doctor Entity
    public static Doctor buildDoctorFromDTO(RegisterDoctorDTO dto) {
        return Doctor.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .phoneNumber(dto.getPhoneNumber())
                .dateOfJoining(dto.getDateOfJoining())
                .specialization(dto.getSpecialization())
                .experienceInYears(dto.getExperienceInYears())
                .isEmployeeActive(true)
                .canLogin(true)
                .address(Address.builder()
                        .street(dto.getAddressDTO().getStreet())
                        .landMark(dto.getAddressDTO().getLandMark())
                        .city(dto.getAddressDTO().getCity())
                        .postalCode(dto.getAddressDTO().getPostalCode())
                        .state(dto.getAddressDTO().getState())
                        .country(dto.getAddressDTO().getCountry())
                        .build())
                .user(User.builder()
                		.email(dto.getEmail())
                		.password(null)
                		.role("ROLE_DOCTOR")
                		.build()) // Associate the doctor with a User entity
                .build();
    }
    
    public static DoctorDetailsDTO buildDoctorDetailsDTOFromDoctor(Doctor doctor) {
        return DoctorDetailsDTO.builder()
                .doctorId(doctor.getStaffId())
                .firstName(doctor.getFirstName())
                .lastName(doctor.getLastName())
                .email(doctor.getUser().getEmail()) // Get email from User entity
                .phoneNumber(doctor.getPhoneNumber())
                .addressDTO(AddressDTO.builder()
                        .street(doctor.getAddress().getStreet())
                        .landMark(doctor.getAddress().getLandMark())
                        .city(doctor.getAddress().getCity())
                        .postalCode(doctor.getAddress().getPostalCode())
                        .state(doctor.getAddress().getState())
                        .country(doctor.getAddress().getCountry())
                        .build())
                .specialization(doctor.getSpecialization())
                .experienceInYears(doctor.getExperienceInYears())
                .dateOfJoining(doctor.getDateOfJoining())
                .isActive(doctor.getIsEmployeeActive())
                .build();
    }
    
}
