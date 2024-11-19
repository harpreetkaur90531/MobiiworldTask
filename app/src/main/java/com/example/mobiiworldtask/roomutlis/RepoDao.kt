package com.example.mobiiworldtask.roomutlis

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mobiiworldtask.models.Repo

@Dao
interface RepoDao {
    //    Function to add a new user to the database, here onConflict is called when there
//    will be an existing user with same parameters then we've set it to ignore
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addRepo(user: Repo)

    //    Query to return all the user, the list will be wrapped in the LiveData
    @Query("SELECT * FROM repo_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<Repo>>

    //    Function to update the existing user
    @Update
    suspend fun updateRepo(user: Repo)

    //    Function to delete a single user
    @Delete
    suspend fun deleteRepo(user: Repo)

    //    Function to delete all of the existing user
    @Query("DELETE FROM repo_table")
    suspend fun deleteAllRepo()

}