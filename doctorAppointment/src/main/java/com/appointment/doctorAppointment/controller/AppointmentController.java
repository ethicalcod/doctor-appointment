package com.appointment.doctorAppointment.controller;

import com.appointment.doctorAppointment.entity.Appointment;
import com.appointment.doctorAppointment.service.AppointmentService;
import com.appointment.doctorAppointment.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @Autowired
    private DoctorService doctorService;

    // LIST
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("appointments", service.getAll());
        return "appointment-list";
    }

    // FORM
    @GetMapping("/new")
    public String form(Model model) {
        model.addAttribute("appointment", new Appointment());
        model.addAttribute("doctors", doctorService.getAll()); // 🔥 important
        return "appointment-form";
    }
    
    // SAVE
    @PostMapping("/save")
    public String save(
        @ModelAttribute Appointment a,
        @RequestParam("doctor.id") Long doctorId) {
    try{
        a.setDoctor(doctorService.getById(doctorId));
        service.save(a);
        } catch (Exception e) {
                return "error";
        }
    System.out.println("Appointment ID: " + a.getId());
    return "redirect:/appointments/list";
    }

    // DELETE
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/appointments/list";
    }

    // EDIT FORM
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        System.out.println("EDIT ID: " + id);
        model.addAttribute("appointment", service.getById(id));
        model.addAttribute("doctors", doctorService.getAll());
        return "appointment-form";
    }

    
}