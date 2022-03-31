package com.tecnorth.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

public class Client extends People {

    private List<Called> calls = new ArrayList<>();

    public List<Called> getCalls() {
        return calls;
    }

    public void setCalls(List<Called> calls) {
        this.calls = calls;
    }

    public Client() {
        super();
    }

    public Client(Integer id, String name, String cpf, String email, String password) {
        super( id, name, cpf, email, password );
    }
}