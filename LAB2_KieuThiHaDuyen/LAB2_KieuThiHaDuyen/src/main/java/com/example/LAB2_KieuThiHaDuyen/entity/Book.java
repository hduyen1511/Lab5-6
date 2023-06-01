package com.example.LAB2_KieuThiHaDuyen.entity;


import com.example.LAB2_KieuThiHaDuyen.validator.annotation.ValidCategoryId;
import com.example.LAB2_KieuThiHaDuyen.validator.annotation.ValidUserId;
import jakarta.persistence.*;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 50)
    @NotNull(message = "Title must not be null")
    @Size(max = 50, message = "Title must less than 50 characters")
    private String title;

    @Column(name = "author", length = 50)
    @Size(max = 50, message = "Author must be less than 50 characters")
    private String author;

    @Column(name = "price")
    @NotNull(message = "Price is required")
    @Positive(message = "Price must be greater than 0")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @ValidCategoryId
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ValidUserId
    private User user;

}
