package org.project.sesiketujuh.service.implementation;

import org.project.sesiketujuh.model.Address;
import org.project.sesiketujuh.model.CheckoutRequest;
import org.project.sesiketujuh.service.CheckoutService;
import org.project.sesiketujuh.service.PaymentService;

public class CheckoutServiceImpl implements CheckoutService {

    private PaymentService paymentService;

    public CheckoutServiceImpl(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    //METHOD OVERRIDE -> implementasi dari konsep Polymorphism -> Runtime Polymorphism / Polimorfisme Dinamis
    @Override
    public void process(CheckoutRequest request) {
        //LOGIC

        /*
        1. Validasi alamat
        - cek apakah alamat tujuannya kosong atau tidak
         */
        boolean isValidateAddress = isValidateAddress(request.getAddress());

        /*
        2. Memproses pembayaran
         */
        String response = paymentService.paymentProcess(request.getPaymentMethod());
        boolean isPaymentSuccess = isPaymentSuccess(response);

        /*
        dst
         */

    }

    //METHOD OVERLOADING -> COMPILE TIME POLYMORPHISM (POLIMORFISME STATIK)
    private boolean isValidateAddress(Address address) {
        return !address.getDestination().isEmpty();
    }

    private boolean isValidateAddress(String address) {
        return !address.isEmpty();
    }

    private boolean isPaymentSuccess(String response) {
        return response.equals("Success");
    }
}
