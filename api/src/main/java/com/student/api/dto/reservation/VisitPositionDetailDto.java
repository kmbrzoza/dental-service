package com.student.api.dto.reservation;

import com.student.api.dto.user.ServiceTypeDetailDto;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Valid
@NoArgsConstructor
@AllArgsConstructor
public class VisitPositionDetailDto {
    @Schema(
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "Id of visit position, autogenerated value, please ignore for POST operations"
    )
    private Long id;

    @NotNull
    private ServiceTypeDetailDto serviceType;

}
