package com.example.atividadeTaskJWT.enums;

public enum StatusEnum {

    PENDENTE ("pendente"),
    EM_ANDAMENTO("em_andamento"),
    CONCLUIDA("concluida");

    private String status;

    StatusEnum(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
