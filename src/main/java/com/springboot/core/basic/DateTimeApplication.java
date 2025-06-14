package com.springboot.core.basic;

import java.time.*;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
/**
 * @author prabhakar, @Date 28-03-2025
 */
public class DateTimeApplication {

    public static void main(String[] args) {
        everyDayOfMonth();

        System.out.println("=========================");

        everyFriday();

        System.out.println("=========================");

        every2ndFriday();

    }

    private static void everyDayOfMonth() {
        LocalDate fromDate = LocalDate.of(2025, Month.JUNE, 1);
        LocalDate toDate = LocalDate.of(2025, Month.AUGUST, 30);

        LocalDate startDate;

        //get the monthDay of the current month
        LocalDate firstMonthDay = fromDate.withDayOfMonth(1);

        //if first monthDay is after the fromDate
        if (firstMonthDay.isAfter(fromDate) || firstMonthDay.equals(fromDate)) {
            startDate = firstMonthDay;
        } else {
            startDate = firstMonthDay.plusMonths(1);
        }

        //get occurrences every month until endDate is hit
        while (startDate.isBefore(toDate)) {
            System.out.println(startDate);
            startDate = startDate.plusMonths(1);
        }
    }

    private static void everyFriday() {
        LocalDate fromDate = LocalDate.of(2025, Month.JUNE, 1);
        LocalDate toDate = LocalDate.of(2025, Month.AUGUST, 30);

        LocalDate startDate;

        //get the first friday of the current week
        LocalDate firstMonthDay = fromDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        //if first first friday is after or on the fromDate
        if (firstMonthDay.isAfter(fromDate) || firstMonthDay.equals(fromDate)) {
            startDate = firstMonthDay;
        } else {
            startDate = firstMonthDay.plusWeeks(1);
        }

        //get occurrences every month until endDate is hit
        while (startDate.isBefore(toDate) || startDate.equals(toDate)) {
            System.out.println(startDate);
            startDate = startDate.plusWeeks(1);
        }
    }

    private static void every2ndFriday() {
        LocalDate fromDate = LocalDate.of(2025, Month.JUNE, 1);
        LocalDate toDate = LocalDate.of(2025, Month.AUGUST, 24);

        LocalDate recurrenceStartDate = LocalDate.of(2025, Month.JUNE, 30);

        System.out.println("RECURRENCE START DATE    " + recurrenceStartDate);

        LocalDate startDate;

        //get the first second friday
        LocalDate firstFriday = recurrenceStartDate.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.FRIDAY));

        System.out.println("FIRST FRIDAY    " + firstFriday);

        //if first monthDay is after the fromDate
        if ((firstFriday.isAfter(fromDate) || firstFriday.equals(fromDate)) && (firstFriday.isAfter(recurrenceStartDate) || firstFriday.equals(recurrenceStartDate))) {
            startDate = firstFriday;
        } else {
            startDate = firstFriday.plusWeeks(2);
        }

        //get occurrences every month until endDate is hit
        while (startDate.isBefore(toDate) || startDate.equals(toDate)) {
            System.out.println(startDate);
            startDate = startDate.plusWeeks(2);
        }
    }
}