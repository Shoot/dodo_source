package com.facebook.flipper.plugins.databases.impl;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;
/* loaded from: classes2.dex */
public class DefaultSqliteDatabaseConnectionProvider implements SqliteDatabaseConnectionProvider {
    @Override // com.facebook.flipper.plugins.databases.impl.SqliteDatabaseConnectionProvider
    public y2b openDatabase(File file) throws SQLiteException {
        return FrameworkSQLiteDatabaseWrapping.wrap(SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 0));
    }
}
