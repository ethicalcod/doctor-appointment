package com.appointment.doctorAppointment.service;

import com.appointment.doctorAppointment.entity.Appointment;
import com.appointment.doctorAppointment.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repo;

    public List<Appointment> getAll() {
        return repo.getAppointmentsWithDoctor();
        
    }

    public Appointment save(Appointment a) {
        return repo.save(a);
    }

    public Appointment getById(Long id) {
        return repo.findById(id)
        .orElseThrow(() -> new RuntimeException("Appointment not found with id: " + id));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}