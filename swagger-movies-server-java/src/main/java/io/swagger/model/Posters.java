package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Posters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-22T22:19:58.119+02:00")

public class Posters   {
  @JsonProperty("thumbnail")
  private String thumbnail = null;

  @JsonProperty("profile")
  private String profile = null;

  @JsonProperty("detailed")
  private String detailed = null;

  @JsonProperty("original")
  private String original = null;

  public Posters thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @ApiModelProperty(value = "")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public Posters profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(value = "")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public Posters detailed(String detailed) {
    this.detailed = detailed;
    return this;
  }

   /**
   * Get detailed
   * @return detailed
  **/
  @ApiModelProperty(value = "")
  public String getDetailed() {
    return detailed;
  }

  public void setDetailed(String detailed) {
    this.detailed = detailed;
  }

  public Posters original(String original) {
    this.original = original;
    return this;
  }

   /**
   * Get original
   * @return original
  **/
  @ApiModelProperty(value = "")
  public String getOriginal() {
    return original;
  }

  public void setOriginal(String original) {
    this.original = original;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Posters posters = (Posters) o;
    return Objects.equals(this.thumbnail, posters.thumbnail) &&
        Objects.equals(this.profile, posters.profile) &&
        Objects.equals(this.detailed, posters.detailed) &&
        Objects.equals(this.original, posters.original);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thumbnail, profile, detailed, original);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Posters {\n");
    
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    detailed: ").append(toIndentedString(detailed)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
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

