package com.appointment.doctorAppointment.repository;

import com.appointment.doctorAppointment.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}