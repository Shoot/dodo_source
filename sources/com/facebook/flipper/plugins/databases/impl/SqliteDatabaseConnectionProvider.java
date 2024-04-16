package com.facebook.flipper.plugins.databases.impl;

import android.database.sqlite.SQLiteException;
import java.io.File;
/* loaded from: classes2.dex */
public interface SqliteDatabaseConnectionProvider {
    y2b openDatabase(File file) throws SQLiteException;
}
