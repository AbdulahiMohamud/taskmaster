package com.abdul.taskmaster.database;

import androidx.room.*;

import java.util.Date;

public class TaskMasterDatabaseConverter {
    @TypeConverter
    public static Date fromTimeStamp (Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimeStamp (Date date) {
        return date == null ? null : date.getTime();
    }
}
