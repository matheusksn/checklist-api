package com.matheusksn.springboot.checklistapi.dto;

import com.matheusksn.springboot.checklistapi.entity.CategoryEntity;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Data
@Getter
@Builder
public class CategoryDTO {

    private String guid;

    @NotBlank(message = "Category name cannot be either null or empty")
    private String name;

    public static CategoryDTO toDTO(CategoryEntity categoryEntity){
        return CategoryDTO.builder()
                .guid(categoryEntity.getGuid())
                .name(categoryEntity.getName())
                .build();
    }
}
