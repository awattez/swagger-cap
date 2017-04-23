package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Actors
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-22T22:19:58.119+02:00")

public class Actors   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("pictures")
  private List<String> pictures = null;

  public Actors id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Actors name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Actors pictures(List<String> pictures) {
    this.pictures = pictures;
    return this;
  }

  public Actors addPicturesItem(String picturesItem) {
    if (this.pictures == null) {
      this.pictures = new ArrayList<String>();
    }
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * Get pictures
   * @return pictures
  **/
  @ApiModelProperty(value = "")
  public List<String> getPictures() {
    return pictures;
  }

  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actors actors = (Actors) o;
    return Objects.equals(this.id, actors.id) &&
        Objects.equals(this.name, actors.name) &&
        Objects.equals(this.pictures, actors.pictures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pictures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actors {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
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

