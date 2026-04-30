package com.appointment.doctorAppointment.controller;

import com.appointment.doctorAppointment.entity.Doctor;
import com.appointment.doctorAppointment.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("doctors", service.getAll());
        return "doctor-list";
    }

    @GetMapping("/new")
    public String form(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "doctor-form";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("doctor", service.getById(id));
        return "doctor-form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/doctors/list";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Doctor doctor) {
        service.save(doctor);
        return "redirect:/doctors/list";
    }
}