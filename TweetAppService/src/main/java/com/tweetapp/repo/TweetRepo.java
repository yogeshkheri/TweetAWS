package com.tweetapp.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.tweetapp.model.Tweet;

@Repository
public interface TweetRepo extends CrudRepository<Tweet, Long>{

	//@Query("{ userName : ?0}")
	List<Tweet> findByUserName(String userName);

}
