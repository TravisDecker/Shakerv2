package com.shaker.shaker

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.shaker.shaker.Entities.FeatureEntity

@Database(entities = [FeatureEntity::class], version = 1)
public abstract class FeatureDatabase : RoomDatabase() {

    abstract fun featureDao(): FeatureDao

    companion object {
        @Volatile
        private var INSTANCE: FeatureDatabase? = null

        fun getDatabase(context: Context): FeatureDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {}
            val instance = Room.databaseBuilder(
                context.applicationContext,
                FeatureDatabase::class.java,
                "FeatureDatabase"
            ).build()
            INSTANCE = instance
            return instance
        }

    }

}