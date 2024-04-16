package com.facebook.flipper.plugins.databases.impl;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class DefaultSqliteDatabaseProvider implements SqliteDatabaseProvider {
    private static final String DB_EXTENSION = ".db";
    private static final int MAX_RECURSIVE_TRAVERSAL_DEPTH = 5;
    private static final List<File> extraDatabaseFiles = new ArrayList();
    private final Context context;
    private final int fileDirectoryRecursiveDepth;

    public DefaultSqliteDatabaseProvider(Context context) {
        this(context, 5);
    }

    private static void addDatabaseFilesRecursively(File file, int i, String str, int i2, List<File> list) {
        File[] listFiles;
        if (i < i2 && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getPath().endsWith(str)) {
                    list.add(file2);
                } else if (file2.isDirectory()) {
                    addDatabaseFilesRecursively(file2, i + 1, str, i2, list);
                }
            }
        }
    }

    public static void registerExtraDatabaseFile(File file) {
        List<File> list = extraDatabaseFiles;
        synchronized (list) {
            list.add(file);
        }
    }

    @Override // com.facebook.flipper.plugins.databases.impl.SqliteDatabaseProvider
    public List<File> getDatabaseFiles() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.context.databaseList()) {
            arrayList.add(this.context.getDatabasePath(str));
        }
        addDatabaseFilesRecursively(new File(this.context.getFilesDir().getPath()), 0, DB_EXTENSION, this.fileDirectoryRecursiveDepth, arrayList);
        List<File> list = extraDatabaseFiles;
        synchronized (list) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public DefaultSqliteDatabaseProvider(Context context, int i) {
        this.context = context;
        this.fileDirectoryRecursiveDepth = i;
    }
}
