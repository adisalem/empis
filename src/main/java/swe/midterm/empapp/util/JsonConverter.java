
package swe.midterm.empapp.util;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import swe.midterm.empapp.dto.EmployeeViewDto;

public class JsonConverter {

    private static final ObjectMapper objectMapper = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT); // Enable pretty-printing

    public static String toJson(List<EmployeeViewDto> employees) throws JsonProcessingException {
        return objectMapper.writeValueAsString(employees);
    }
}