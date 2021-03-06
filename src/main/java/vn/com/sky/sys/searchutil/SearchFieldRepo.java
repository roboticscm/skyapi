package vn.com.sky.sys.searchutil;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

import vn.com.sky.sys.model.SearchField;

@Service
public interface SearchFieldRepo extends ReactiveCrudRepository<SearchField, Long> {

}
