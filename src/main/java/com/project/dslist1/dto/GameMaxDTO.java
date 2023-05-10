package com.project.dslist1.dto;

import java.util.Objects;

import com.project.dslist1.entities.Game;

public class GameMaxDTO {

	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameMaxDTO() {
	}

	public GameMaxDTO(Game entity) {
		//BeanUtils.copyProperties(entity, this);
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		genre = entity.getGenre();
		platforms = entity.getPlatforms();
		score = entity.getScore();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
		longDescription = entity.getLongDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public Double getScore() {
		return score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameMaxDTO other = (GameMaxDTO) obj;
		return Objects.equals(id, other.id);
	}
}
