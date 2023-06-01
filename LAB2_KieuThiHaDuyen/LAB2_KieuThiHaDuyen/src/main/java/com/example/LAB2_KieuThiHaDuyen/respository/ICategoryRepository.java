package com.example.LAB2_KieuThiHaDuyen.respository;

import com.example.LAB2_KieuThiHaDuyen.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
