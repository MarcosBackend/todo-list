package com.tasks.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {

    @NotBlank(message = "Title Invalid")
    @Size(max = 100)
    private String title;
    @Size(max = 255)
    private String description;
    private Boolean completed = false;
}
