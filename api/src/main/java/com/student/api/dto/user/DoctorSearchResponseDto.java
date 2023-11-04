package com.student.api.dto.user;

import com.student.api.annotation.validator.phone.Phone;
import com.student.api.dto.common.enums.Sex;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Valid
@NoArgsConstructor
public class DoctorSearchResponseDto {
    @Schema(
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "Id of user, autogenerated value, please ignore for POST operations"
    )
    private Long id;

    @NotNull
    @NotBlank
    @Size(min = 2, max = 50)
    private String name;

    @NotNull
    @NotBlank
    @Size(min = 2, max = 50)
    private String surname;

    @NotNull
    @NotBlank
    private String email;

    @NotNull
    @NotBlank
    @Phone
    @Size(min = 8, max = 12)
    private String phoneNumber;

    @NotNull
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Sex sex;

    @NotNull
    private CompetencyInformationDto competencyInformation;

    @NotNull
    private Set<ServiceTypeDto> serviceTypes;
}
