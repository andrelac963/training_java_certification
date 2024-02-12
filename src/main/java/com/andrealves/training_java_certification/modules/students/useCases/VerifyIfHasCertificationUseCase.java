package com.andrealves.training_java_certification.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.andrealves.training_java_certification.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

  public boolean execute(VerifyHasCertificationDTO dto) {
    if (dto.getEmail().equals("andre@gmail.com") && dto.getTechnology().equals("Java")) {
      return true;
    }

    return false;
  }
}
