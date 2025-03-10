package com.testing.Application.Controller;

import com.testing.Application.model.FormData;
import com.testing.Application.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/forms")
public class FormController {

    @Autowired
    private FormService formService;

    // Get all form submissions
    @GetMapping
    public List<FormData> getAllForms() {
        return formService.getAllForms();
    }

    // Submit a new form
    @PostMapping
    public ResponseEntity<FormData> submitForm(@Validated @RequestBody FormData formData) {
        FormData savedForm = formService.saveForm(formData);
        return ResponseEntity.ok(savedForm);
    }
}
