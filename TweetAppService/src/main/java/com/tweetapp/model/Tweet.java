package com.tweetapp.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.Id;
import org.springframework.data.annotation.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tweet")
@Accessors(chain = true)
@ToString(exclude = {"replies"})
public class Tweet {
	//@Transient
	//public static final String SEQUENCE_NAME = "tweet_sequence";
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="tweetId")
	private Long tweetId;
	
	private String userName;
	private String tweet;
	private Date created;
	private int likes;
	@OneToMany(mappedBy = "tweet")
	//@MapsId("tweetId")
	private List<Replies> replies;
}
