package com.geekster.UniversityEventManagementUsingH2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    private Integer id;

    @NotBlank
    @Pattern(regexp = "[A-Z].*")
    private String firstName;

    private String lastName;
    @Min(18)
    @Max(25)
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Branch department;






}
