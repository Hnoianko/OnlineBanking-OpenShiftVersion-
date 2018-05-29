package com.gmail.gnoianko.controllers.admin;


import com.gmail.gnoianko.models.Appointment;
import com.gmail.gnoianko.models.PrimaryTransaction;
import com.gmail.gnoianko.models.SavingsTransaction;
import com.gmail.gnoianko.models.User;
import com.gmail.gnoianko.servises.AppointmentService;
import com.gmail.gnoianko.servises.TransactionService;
import com.gmail.gnoianko.servises.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@PreAuthorize("hasRole('ADMIN')")
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private AppointmentService appointmentService;

    @RequestMapping("/mainPage")
    public String homeAdmin() {
        return "/admin";
    }

    @RequestMapping("/mainPage/")
    public String admin() {
        return "/admin";
    }

    @RequestMapping("/usersAdmin")
    public String userList(Model model) {
        List<User> userList = userService.findUserList();

        model.addAttribute("userList", userList);
        return "usersAdmin";
    }

    @RequestMapping("/appointmentAdmin")
    public String appointmentList(Model model) {
        List<Appointment> appointmentList = appointmentService.findAll();

        model.addAttribute("appointmentList", appointmentList);
        return "appointmentAdmin";
    }

    @RequestMapping(value = "/primaryTransactionsAdmin", method = RequestMethod.GET)
    public String getPrimaryTransactionList(@RequestParam("username") String username, Model model) {
        List<PrimaryTransaction> primaryTransactionList = transactionService.findPrimaryTransactionList(username);
        model.addAttribute("primaryTransactionList", primaryTransactionList);
        model.addAttribute("username", username);
        return "primaryTransactionsAdmin";
    }

    @RequestMapping(value = "/savingsTransactionsAdmin", method = RequestMethod.GET)
    public String getSavingsTransactionList(@RequestParam("username") String username, Model model) {
        List<SavingsTransaction> savingsTransactionList = transactionService.findSavingsTransactionList(username);
        model.addAttribute("savingsTransactionList", savingsTransactionList);
        model.addAttribute("username", username);
        return "savingsTransactionsAdmin";
    }

}
