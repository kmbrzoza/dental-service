package com.student.api.dto.reservation;

import lombok.Data;

import java.sql.Time;
import java.sql.Timestamp;

@Data
public class CalendarDayDTO {
    private Long id;
    private Timestamp startDate;
    private Time workDuration;
    private Time startBreakTime;
    private Time breakDuration;
    private Long doctorId;
}