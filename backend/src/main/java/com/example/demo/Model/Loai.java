package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name="loai")
@Data
public class Loai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maloai;
    @Column
    private String tenloai;

}
