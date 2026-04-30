package com.appointment.doctorAppointment.repository;

import com.appointment.doctorAppointment.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    @Query("SELECT a FROM Appointment a JOIN a.doctor d")
    List<Appointment> getAppointmentsWithDoctor();
}