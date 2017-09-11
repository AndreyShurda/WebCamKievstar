package com.kievstar.service;

import com.kievstar.models.Address;
import com.kievstar.service.crud.CRUDServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AddressService extends CRUDServiceImpl<Address> {

//    public Address findByIP(){
//
//    }
}
