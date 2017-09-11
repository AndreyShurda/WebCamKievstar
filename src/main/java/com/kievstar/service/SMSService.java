package com.kievstar.service;

import com.kievstar.models.SMS;
import com.kievstar.service.crud.CRUDServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SMSService extends CRUDServiceImpl<SMS> {

}
