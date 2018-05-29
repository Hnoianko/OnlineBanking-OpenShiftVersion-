package com.gmail.gnoianko.servises.ServicesImplementation;

import com.gmail.gnoianko.dao.AppointmentDao;
import com.gmail.gnoianko.models.Appointment;
import com.gmail.gnoianko.servises.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentDao.save(appointment);
    }

    @Override
    public List<Appointment> findAll() {
        return appointmentDao.findAll();
    }

    @Override
    public Appointment findAppointment(Long id) {
        return appointmentDao.findOne(id);
    }

}
