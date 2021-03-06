/*
 * Copyright The Stargate Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.stargate.web.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A description of an error state */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {
  private String description = null;
  private int code;
  private String internalTxId = null;

  public Error() {
    super();
  }

  public Error(String description) {
    this.description = description;
  }

  public Error(String description, int code) {
    this.description = description;
    this.code = code;
  }

  /** A human readable description of the error state */
  public Error description(String description) {
    this.description = description;
    return this;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /** The internal number referencing the error state */
  public Error code(int code) {
    this.code = code;
    return this;
  }

  @JsonProperty("code")
  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  /** The internal tracking number of the request */
  public Error internalTxId(String internalTxId) {
    this.internalTxId = internalTxId;
    return this;
  }

  @JsonProperty("internalTxId")
  public String getInternalTxId() {
    return internalTxId;
  }

  public void setInternalTxId(String internalTxId) {
    this.internalTxId = internalTxId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(description, error.description)
        && Objects.equals(code, error.code)
        && Objects.equals(internalTxId, error.internalTxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, code, internalTxId);
  }

  @Override
  public String toString() {
    return "Error{"
        + "description='"
        + description
        + '\''
        + ", code='"
        + code
        + '\''
        + ", internalTxId='"
        + internalTxId
        + '\''
        + '}';
  }
}
