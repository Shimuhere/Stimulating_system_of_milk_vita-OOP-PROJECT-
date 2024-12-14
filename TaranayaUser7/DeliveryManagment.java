package com.example.milkvitaproject.TaranayaUser7;

public class DeliveryManagment {
        private String orderId;
        private String deliveryDate;
        private String status:

        public DeliveryManagement(String orderId, String deliveryDate, String status) {
            this.orderId = orderId;
            this.deliveryDate = deliveryDate;
            this.status = status;
        }

    public DeliveryManagment(String ord01, String date, String delivered) {
    }

    public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getDeliveryDate() {
            return deliveryDate;
        }

        public void setDeliveryDate(String deliveryDate) {
            this.deliveryDate = deliveryDate;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Delivery{" +
                    "orderId='" + orderId + '\'' +
                    ", deliveryDate='" + deliveryDate + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }
