package com.mobile.springbootjwtapi.repository;


import com.mobile.springbootjwtapi.models.Floor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FloorRepository extends JpaRepository<Floor, Integer> {
  List<Floor> findAllByHotelIdAndStatus(Integer hotelId, String status);
}
