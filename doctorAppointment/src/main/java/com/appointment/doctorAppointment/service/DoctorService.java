package com.appointment.doctorAppointment.service;

import com.appointment.doctorAppointment.entity.Doctor;
import com.appointment.doctorAppointment.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repo;

    public List<Doctor> getAll() {
        return repo.findAll();
    }

    public Doctor save(Doctor doctor) {
        return repo.save(doctor);
    }

    public Doctor getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}