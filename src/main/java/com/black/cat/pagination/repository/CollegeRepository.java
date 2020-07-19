/**
 * 
 */
package com.black.cat.pagination.repository;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

import com.black.cat.pagination.document.College;

import reactor.core.publisher.Flux;

/**
 * @author Kavichezliyan
 *
 */
public interface CollegeRepository extends ReactiveSortingRepository<College, String> {

	Flux<College> findAllByIdNotNull(PageRequest pageble, Sort by);

}
