package com.example.greetingmvc.web.models.requests;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonForm {
    //@NotNull
    //@NotEmpty
    @NotBlank
    @Size(min=2, max=10)
    private String name;
    @NotNull
    @Min(value=6, message="Verifier votre age min 6")@Max(60)
    private Integer age;
}