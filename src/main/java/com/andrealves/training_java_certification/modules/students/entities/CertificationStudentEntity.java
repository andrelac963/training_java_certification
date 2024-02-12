package com.andrealves.training_java_certification.modules.students.entities;

import java.util.UUID;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {

  private UUID id;
  private UUID studentId;
  private String technology;
  private int grade;
  private List<AnswersCertificationsEntity> answersCertificationsEntity;
}
