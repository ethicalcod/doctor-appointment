package com.appointment.doctorAppointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DoctorAppointmentApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
        return app.sources(DoctorAppointmentApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DoctorAppointmentApplication.class, args);
    }
}