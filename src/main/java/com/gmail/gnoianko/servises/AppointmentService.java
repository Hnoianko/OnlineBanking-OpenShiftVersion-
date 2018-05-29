package com.gmail.gnoianko.servises;

import com.gmail.gnoianko.models.Appointment;

import java.util.List;

public interface AppointmentService {

    Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

}
