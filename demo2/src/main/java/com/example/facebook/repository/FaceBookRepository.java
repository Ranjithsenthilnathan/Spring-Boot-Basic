package com.example.facebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facebook.model.FaceBook;

@Repository
public interface FaceBookRepository extends JpaRepository<FaceBook,Integer>
{
	
}
