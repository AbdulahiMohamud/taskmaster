package com.abdul.taskmaster.dao;

import androidx.room.*;

import com.abdul.taskmaster.model.TaskModel;

import java.util.List;


@Dao
public interface TaskDao {
    // Create
    @Insert
     public void insert(TaskModel task);

    @Query("SELECT * FROM TaskModel")
    public List<TaskModel> findAll();


    // order by ascending order
    @Query("SELECT * FROM TaskModel ORDER BY name ASC")
    public List<TaskModel> findAllSortedByName();

        // find by id
    @Query("SELECT * FROM TaskModel WHERE id = :id")
    TaskModel findById(long id);
}
