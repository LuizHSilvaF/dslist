package com.project.dslist1.dto;

import java.util.Objects;

import com.project.dslist1.entities.Game;
import com.project.dslist1.projections.GameMinProjection;

public class GameDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
		
		public GameDTO(Game entity) {
			id = entity.getId();
			title = entity.getTitle();
			year = entity.getYear();
			imgUrl = entity.getImgUrl();
			shortDescription = entity.getShortDescription();
		}

		public GameDTO(GameMinProjection projection) {
			id = projection.getId();
			title = projection.getTitle();
			year = projection.getYear();
			imgUrl = projection.getImgUrl();
			shortDescription = projection.getShortDescription();
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

		public String getImgUrl() {
			return imgUrl;
		}

		public String getShortDescription() {
			return shortDescription;
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
			GameDTO other = (GameDTO) obj;
			return Objects.equals(id, other.id);
		}
}
