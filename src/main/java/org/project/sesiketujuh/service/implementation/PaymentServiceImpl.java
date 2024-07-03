package org.project.sesiketujuh.service.implementation;

import org.project.sesiketujuh.model.PaymentMethod;
import org.project.sesiketujuh.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentProcess(PaymentMethod paymentMethod) {
        //LOGIC UNTUK MEMPROSES PEMBAYARAN
        return "Success";
    }
}
