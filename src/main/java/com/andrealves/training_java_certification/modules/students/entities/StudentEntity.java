package com.andrealves.training_java_certification.modules.students.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "students")
public class StudentEntity {

  @Id
  private UUID id;
  private String email;
  private List<CertificationStudentEntity> certificationStudentEntity;
}
