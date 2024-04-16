package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.graphics.drawable.Drawable;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: SqlTileWriter.java */
/* renamed from: osa  reason: default package */
/* loaded from: classes3.dex */
public class osa implements ur4 {
    private static boolean c = true;
    protected static File e = null;
    protected static SQLiteDatabase f = null;
    static boolean g = false;
    protected long a = 0;
    private final rc4 b;
    private static final Object d = new Object();
    private static final String[] h = {"tile", "expires"};
    private static final String[] i = {"expires"};

    /* compiled from: SqlTileWriter.java */
    /* renamed from: osa$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            osa.this.n();
        }
    }

    public osa() {
        rc4 rc4Var = new rc4(new a());
        this.b = rc4Var;
        e();
        if (!g) {
            g = true;
            if (c) {
                rc4Var.c();
            }
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS expires_index ON tiles (expires);");
    }

    public static long f(long j) {
        return g(k76.c(j), k76.d(j), k76.e(j));
    }

    public static long g(long j, long j2, long j3) {
        int i2 = (int) j3;
        return (((j3 << i2) + j) << i2) + j2;
    }

    public static String[] h(long j, String str) {
        return new String[]{String.valueOf(j), str};
    }

    public static String[] i(long j, org.osmdroid.tileprovider.tilesource.a aVar) {
        return h(j, aVar.name());
    }

    public static boolean k(SQLiteException sQLiteException) {
        String simpleName = sQLiteException.getClass().getSimpleName();
        if (!simpleName.equals("SQLiteFullException") && !simpleName.equals("SQLiteBindOrColumnIndexOutOfRangeException") && !simpleName.equals("SQLiteTableLockedException") && !simpleName.equals("SQLiteMisuseException") && !simpleName.equals("SQLiteBlobTooBigException") && !simpleName.equals("SQLiteConstraintException") && !simpleName.equals("SQLiteDatatypeMismatchException")) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ur4
    public boolean a(org.osmdroid.tileprovider.tilesource.a aVar, long j, InputStream inputStream, Long l) {
        SQLiteDatabase e2 = e();
        if (e2 != null && e2.isOpen()) {
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                try {
                    try {
                        ContentValues contentValues = new ContentValues();
                        long f2 = f(j);
                        contentValues.put("provider", aVar.name());
                        byte[] bArr = new byte[512];
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr, 0, read);
                            } catch (SQLiteFullException e3) {
                                e = e3;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                Log.e("OsmDroid", "SQLiteFullException while saving tile.", e);
                                this.b.c();
                                c(e);
                                byteArrayOutputStream.close();
                                return false;
                            } catch (Exception e4) {
                                e = e4;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                Log.e("OsmDroid", "Unable to store cached tile from " + aVar.name() + " " + k76.h(j) + " db is not null", e);
                                zx1.c = zx1.c + 1;
                                c(e);
                                byteArrayOutputStream.close();
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException unused) {
                                }
                                throw th;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        contentValues.put(Action.KEY_ATTRIBUTE, Long.valueOf(f2));
                        contentValues.put("tile", byteArray);
                        if (l != null) {
                            contentValues.put("expires", l);
                        }
                        e2.replaceOrThrow("tiles", null, contentValues);
                        if (dq1.a().v()) {
                            Log.d("OsmDroid", "tile inserted " + aVar.name() + k76.h(j));
                        }
                        if (System.currentTimeMillis() > this.a + dq1.a().x()) {
                            this.a = System.currentTimeMillis();
                            this.b.c();
                        }
                        byteArrayOutputStream2.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (SQLiteFullException e5) {
                    e = e5;
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (IOException unused2) {
            }
        } else {
            Log.d("OsmDroid", "Unable to store cached tile from " + aVar.name() + " " + k76.h(j) + ", database not available.");
            zx1.c = zx1.c + 1;
            return false;
        }
    }

    protected void c(Exception exc) {
        if ((exc instanceof SQLiteException) && !k((SQLiteException) exc)) {
            m();
        }
    }

    protected SQLiteDatabase e() {
        SQLiteDatabase sQLiteDatabase = f;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase;
        }
        synchronized (d) {
            dq1.a().d().mkdirs();
            File file = new File(dq1.a().d().getAbsolutePath() + File.separator + "cache.db");
            e = file;
            if (f == null) {
                try {
                    SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
                    f = openOrCreateDatabase;
                    openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS tiles (key INTEGER , provider TEXT, tile BLOB, expires INTEGER, PRIMARY KEY (key, provider));");
                } catch (Exception e2) {
                    Log.e("OsmDroid", "Unable to start the sqlite tile writer. Check external storage availability.", e2);
                    c(e2);
                    return null;
                }
            }
        }
        return f;
    }

    public Cursor j(String[] strArr, String[] strArr2) {
        return e().query("tiles", strArr2, "key=? and provider=?", strArr, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ByteArrayInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.osmdroid.tileprovider.tilesource.a] */
    public Drawable l(org.osmdroid.tileprovider.tilesource.a aVar, long j) throws Exception {
        Cursor j2;
        long j3;
        byte[] bArr;
        ?? byteArrayInputStream;
        Cursor cursor = null;
        try {
            try {
                j2 = j(i(f(j), aVar), h);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (j2.moveToFirst()) {
                bArr = j2.getBlob(0);
                j3 = j2.getLong(1);
            } else {
                j3 = 0;
                bArr = null;
            }
            if (bArr == null) {
                if (dq1.a().v()) {
                    Log.d("OsmDroid", "SqlCache - Tile doesn't exist: " + aVar.name() + k76.h(j));
                }
                j2.close();
                return null;
            }
            j2.close();
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Drawable a2 = aVar.a(byteArrayInputStream);
                if (j3 < System.currentTimeMillis() && a2 != null) {
                    if (dq1.a().v()) {
                        Log.d("OsmDroid", "Tile expired: " + aVar.name() + k76.h(j));
                    }
                    jn3.b(a2, -2);
                }
                xya.a(byteArrayInputStream);
                return a2;
            } catch (Throwable th3) {
                th = th3;
                cursor = byteArrayInputStream;
                if (cursor != null) {
                    xya.a(cursor);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            cursor = j2;
            c(e);
            throw e;
        } catch (Throwable th4) {
            th = th4;
            cursor = j2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public void m() {
        synchronized (d) {
            try {
                SQLiteDatabase sQLiteDatabase = f;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n() {
        SQLiteDatabase e2 = e();
        if (e2 != null && e2.isOpen()) {
            d(e2);
            long length = e.length();
            if (length <= dq1.a().f()) {
                return;
            }
            o(length - dq1.a().t(), dq1.a().g(), dq1.a().e(), true);
        } else if (dq1.a().v()) {
            Log.d("OsmDroid", "Finished init thread, aborted due to null database reference");
        }
    }

    public void o(long j, int i2, long j2, boolean z) {
        boolean z2;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        SQLiteDatabase e2 = e();
        long j3 = j;
        boolean z3 = true;
        while (j3 > 0) {
            if (z3) {
                z2 = false;
            } else {
                if (j2 > 0) {
                    try {
                        Thread.sleep(j2);
                    } catch (InterruptedException unused) {
                    }
                }
                z2 = z3;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT key,LENGTH(HEX(tile))/2 FROM tiles WHERE expires IS NOT NULL ");
                String str3 = "";
                if (z) {
                    str = "";
                } else {
                    str = "AND expires < " + currentTimeMillis + " ";
                }
                sb2.append(str);
                sb2.append("ORDER BY ");
                sb2.append("expires");
                sb2.append(" ASC LIMIT ");
                sb2.append(i2);
                Cursor rawQuery = e2.rawQuery(sb2.toString(), null);
                rawQuery.moveToFirst();
                sb.setLength(0);
                sb.append("key in (");
                String str4 = "";
                while (true) {
                    str2 = str3;
                    if (rawQuery.isAfterLast()) {
                        break;
                    }
                    long j4 = rawQuery.getLong(0);
                    long j5 = rawQuery.getLong(1);
                    rawQuery.moveToNext();
                    sb.append(str4);
                    sb.append(j4);
                    j3 -= j5;
                    str4 = ",";
                    if (j3 <= 0) {
                        break;
                    }
                    str3 = str2;
                }
                rawQuery.close();
                if (str2.equals(str4)) {
                    return;
                }
                sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                try {
                    e2.delete("tiles", sb.toString(), null);
                } catch (SQLiteFullException e3) {
                    Log.e("OsmDroid", "SQLiteFullException while cleanup.", e3);
                    c(e3);
                } catch (Exception e4) {
                    c(e4);
                    return;
                }
                z3 = z2;
            } catch (Exception e5) {
                c(e5);
                return;
            }
        }
    }

    @Override // defpackage.ur4
    public void b() {
    }
}
