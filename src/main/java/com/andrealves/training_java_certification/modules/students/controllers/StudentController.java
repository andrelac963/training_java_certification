package com.andrealves.training_java_certification.modules.students.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrealves.training_java_certification.modules.students.dto.StudentCertificationAnswerDTO;
import com.andrealves.training_java_certification.modules.students.dto.VerifyHasCertificationDTO;
import com.andrealves.training_java_certification.modules.students.useCases.StudentCertificationAnswersUseCase;
import com.andrealves.training_java_certification.modules.students.useCases.VerifyIfHasCertificationUseCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/students")
public class StudentController {

  @Autowired
  private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

  @Autowired
  private StudentCertificationAnswersUseCase StudentCertificationAnswersUseCase;

  @PostMapping("/verifyIfHasCertification")
  public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
    var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);

    if (result) {
      return "Usuário não pode fazer a prova!";
    }

    return "Usuário pode fazer a prova!";
  }

  @PostMapping("/certification/answer")
  public ResponseEntity<Object> certificationAnswer(
      @RequestBody StudentCertificationAnswerDTO studentCertificationAnswerDTO) {
    try {
      var result = StudentCertificationAnswersUseCase.execute(studentCertificationAnswerDTO);

      return ResponseEntity.ok().body(result);

    } catch (Exception e) {

      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

}
