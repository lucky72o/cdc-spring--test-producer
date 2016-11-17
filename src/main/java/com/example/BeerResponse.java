package com.example;

public class BeerResponse {

    private BeerStatus status;

    public BeerResponse() {
    }

    public BeerResponse(BeerStatus status) {


        this.status = status;
    }

    public BeerStatus getStatus() {
        return status;
    }

    public void setStatus(BeerStatus status) {
        this.status = status;
    }
}
