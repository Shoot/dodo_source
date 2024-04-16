package com.facebook.flipper.plugins.databases.impl;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import defpackage.m74;
import java.lang.reflect.Constructor;
/* loaded from: classes2.dex */
public class FrameworkSQLiteDatabaseWrapping {
    public static y2b wrap(SQLiteDatabase sQLiteDatabase) throws SQLiteException {
        try {
            m74.a aVar = m74.b;
            Constructor declaredConstructor = m74.class.getDeclaredConstructor(SQLiteDatabase.class);
            declaredConstructor.setAccessible(true);
            return (y2b) declaredConstructor.newInstance(sQLiteDatabase);
        } catch (Exception e) {
            throw new SQLiteException("Failed to instantiate androidx.sqlite.db.framework.FrameworkSQLiteDatabase", e);
        }
    }
}
