package com.example.project_milkvita.TayyibaUser5;

import java.time.LocalDate;

public class paymentrecords {
    private int paymentamount;
    private LocalDate paymentdate;
    private String paymentmethod;

    public paymentrecords() {
    }

    public paymentrecords(int paymentamount, LocalDate paymentdate, String paymentmethod) {
        this.paymentamount = paymentamount;
        this.paymentdate = paymentdate;
        this.paymentmethod = paymentmethod;
    }

    public int getPaymentamount() {
        return paymentamount;
    }

    public void setPaymentamount(int paymentamount) {
        this.paymentamount = paymentamount;
    }

    public LocalDate getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(LocalDate paymentdate) {
        this.paymentdate = paymentdate;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    @Override
    public String toString() {
        return "paymentrecords{" +
                "paymentamount=" + paymentamount +
                ", paymentdate=" + paymentdate +
                ", paymentmethod='" + paymentmethod + '\'' +
                '}';
    }
}
