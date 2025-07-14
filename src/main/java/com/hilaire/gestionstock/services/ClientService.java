package com.hilaire.gestionstock.services;

import java.util.List;

import com.hilaire.gestionstock.dto.ClientDto;

public interface ClientService {

    ClientDto save(ClientDto clientDto);

    ClientDto findById(Integer id);

    List<ClientDto> finAll();

    void delete(Integer id);
}
