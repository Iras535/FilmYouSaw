package com.example.android.filmyousawalert.db;

/**
 * Created by pc on 05.04.2016.
 */
import android.provider.BaseColumns;

public class TaskContract {
//    This TaskContract class defines the final variables which we will use to access the data in the database
    public static final String DB_NAME = "com.example.FilmYouSawAlert.db.tasks";
    public static final int DB_VERSION = 1;
    public static final String TABLE = "tasks";

    public class Columns {
        public static final String TASK = "task";
        public static final String _ID = BaseColumns._ID;

    }
}
