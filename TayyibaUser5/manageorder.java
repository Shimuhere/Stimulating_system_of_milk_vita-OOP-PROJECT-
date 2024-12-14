package com.example.project_milkvita.TayyibaUser5;

import java.time.LocalDate;

    public class manageorder {
        private String productname;
        private int quantity;
        private LocalDate dateoforder;
        private String status;

        public manageorder() {
        }

        public manageorder(String productname, int quantity, LocalDate dateoforder, String status) {
            this.productname = productname;
            this.quantity = quantity;
            this.dateoforder = dateoforder;
            this.status = status;
        }

        public String getProductname() {
            return productname;
        }

        public void setProductname(String productname) {
            this.productname = productname;
        }

        public LocalDate getDateoforder() {
            return dateoforder;
        }

        public void setDateoforder(LocalDate dateoforder) {
            this.dateoforder = dateoforder;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "manageorder{" +
                    "productname='" + productname + '\'' +
                    ", quantity=" + quantity +
                    ", dateoforder=" + dateoforder +
                    ", status='" + status + '\'' +
                    '}';
        }
    }
