package com.kievstar.service;

import com.kievstar.models.Image;
import com.kievstar.service.crud.CRUDServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ImageService extends CRUDServiceImpl<Image> {

}
