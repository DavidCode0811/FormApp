package com.testing.Application.service;

import com.testing.Application.model.FormData;
import com.testing.Application.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FormService {

    @Autowired
    private FormRepository formRepository;

    public List<FormData> getAllForms() {
        return formRepository.findAll();
    }

    public FormData saveForm(FormData formData) {
        return formRepository.save(formData);
    }
}
