package com.abdul.taskmaster.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.abdul.taskmaster.dao.TaskDao;
import com.abdul.taskmaster.model.TaskModel;

@Database(entities = {TaskModel.class}, version = 2)
@TypeConverters({TaskMasterDatabaseConverter.class})
public abstract class TaskMasterDatabase extends RoomDatabase {

    public abstract TaskDao taskDao();

}
