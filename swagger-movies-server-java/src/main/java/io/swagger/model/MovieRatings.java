package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * MovieRatings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-22T22:19:58.119+02:00")

public class MovieRatings   {
  @JsonProperty("criticsScore")
  private Integer criticsScore = null;

  @JsonProperty("audienceScore")
  private Integer audienceScore = null;

  public MovieRatings criticsScore(Integer criticsScore) {
    this.criticsScore = criticsScore;
    return this;
  }

   /**
   * Get criticsScore
   * minimum: 0
   * maximum: 100
   * @return criticsScore
  **/
  @ApiModelProperty(value = "")
 @Min(0) @Max(100)  public Integer getCriticsScore() {
    return criticsScore;
  }

  public void setCriticsScore(Integer criticsScore) {
    this.criticsScore = criticsScore;
  }

  public MovieRatings audienceScore(Integer audienceScore) {
    this.audienceScore = audienceScore;
    return this;
  }

   /**
   * Get audienceScore
   * minimum: 0
   * maximum: 100
   * @return audienceScore
  **/
  @ApiModelProperty(value = "")
 @Min(0) @Max(100)  public Integer getAudienceScore() {
    return audienceScore;
  }

  public void setAudienceScore(Integer audienceScore) {
    this.audienceScore = audienceScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieRatings movieRatings = (MovieRatings) o;
    return Objects.equals(this.criticsScore, movieRatings.criticsScore) &&
        Objects.equals(this.audienceScore, movieRatings.audienceScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criticsScore, audienceScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieRatings {\n");
    
    sb.append("    criticsScore: ").append(toIndentedString(criticsScore)).append("\n");
    sb.append("    audienceScore: ").append(toIndentedString(audienceScore)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

