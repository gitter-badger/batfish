package org.batfish.datamodel.questions;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IQuestion {

   String toFullJsonString() throws JsonProcessingException;

   String toJsonString() throws JsonProcessingException;

}
