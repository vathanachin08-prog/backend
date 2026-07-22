package com.mobile.springbootjwtapi.repository;

import com.mobile.springbootjwtapi.models.CategoryHotel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryHotelRepository extends JpaRepository<CategoryHotel, Integer> {
  List<CategoryHotel> findAllByStatus(String string);
}
