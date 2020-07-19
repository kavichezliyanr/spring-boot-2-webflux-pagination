/**
 * 
 */
package com.black.cat.pagination.controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.black.cat.pagination.document.College;
import com.black.cat.pagination.repository.CollegeRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

/**
 * @author Kavichezliyan
 *
 */
@RestController
@RequiredArgsConstructor
public class CollegeController {
	
	private final CollegeRepository collegeRepo;
	
	@GetMapping("/college")
	public Flux<College> getCollegeByPage(final @RequestParam(name = "page") int page,
            final @RequestParam(name = "size") int size, final @RequestParam(name = "sort") String sortBy ){
		return collegeRepo.findAllByIdNotNull(PageRequest.of(page, size),Sort.by("sortBy"));
	}

}
