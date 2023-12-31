package com.student.api.dto.reservation;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Valid
@NoArgsConstructor
public class VisitDto {
    @Schema(
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "Id of visit, autogenerated value, please ignore for POST operations"
    )
    private Long id;

    @NotNull
    @Schema(example = "2023-10-27 08:00:00")
    private String startDate;

    @NotNull
    private Long patientId;

    @Schema(
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "Reservation date, autogenerated value, please ignore for POST operations"
    )
    private String reservationDate;

    private String description;
}