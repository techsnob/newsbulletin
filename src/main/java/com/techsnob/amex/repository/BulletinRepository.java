package com.techsnob.amex.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.techsnob.amex.entities.Bulletin;

public interface BulletinRepository extends PagingAndSortingRepository<Bulletin, Long> {
	List<Bulletin> findByBulletinHeadLine(String bulletinHeadLine);
}
