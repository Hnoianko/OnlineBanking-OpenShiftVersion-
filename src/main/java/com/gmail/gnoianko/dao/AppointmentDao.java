package com.gmail.gnoianko.dao;

import com.gmail.gnoianko.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDao extends JpaRepository<Appointment,Long> {
}
