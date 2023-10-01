package edu.example.springmvcdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.example.springmvcdemo.util.Model;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Car {
    private Long id;
    private LocalDateTime created;
    private LocalDateTime destroyed;

    private String color;

    private Model model;
}
