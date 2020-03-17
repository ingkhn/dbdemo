package com.school.dto;

import com.jayway.jsonpath.internal.function.text.Length;
import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO implements Serializable {

//    @ApiModelProperty(hidden = true)
    private int id;

    @NotEmpty
    private String firstName;

    @NotEmpty
//    @Length(min = 2, max = 20)
    private String lastName;
}
