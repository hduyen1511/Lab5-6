package com.example.LAB2_KieuThiHaDuyen.respository;

import com.example.LAB2_KieuThiHaDuyen.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
