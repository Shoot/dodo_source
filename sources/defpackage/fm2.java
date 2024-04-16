package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import org.osmdroid.tileprovider.tilesource.a;
/* compiled from: DatabaseFileArchive.java */
/* renamed from: fm2  reason: default package */
/* loaded from: classes3.dex */
public class fm2 implements gr4 {
    static final String[] c = {"tile"};
    private SQLiteDatabase a;
    private boolean b = false;

    @Override // defpackage.gr4
    public void a(File file) throws Exception {
        this.a = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 17);
    }

    @Override // defpackage.gr4
    public void b(boolean z) {
        this.b = z;
    }

    @Override // defpackage.gr4
    public InputStream c(a aVar, long j) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byte[] d = d(aVar, j);
            if (d != null) {
                byteArrayInputStream = new ByteArrayInputStream(d);
            } else {
                byteArrayInputStream = null;
            }
        } catch (Throwable th) {
            Log.w("OsmDroid", "Error getting db stream: " + k76.h(j), th);
        }
        if (byteArrayInputStream == null) {
            return null;
        }
        return byteArrayInputStream;
    }

    @Override // defpackage.gr4
    public void close() {
        this.a.close();
    }

    public byte[] d(a aVar, long j) {
        Cursor query;
        byte[] bArr;
        SQLiteDatabase sQLiteDatabase = this.a;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                String[] strArr = {"tile"};
                long e = k76.e(j);
                int i = (int) e;
                long c2 = (((e << i) + k76.c(j)) << i) + k76.d(j);
                if (!this.b) {
                    query = this.a.query("tiles", strArr, "key = " + c2 + " and provider = ?", new String[]{aVar.name()}, null, null, null);
                } else {
                    query = this.a.query("tiles", strArr, "key = " + c2, null, null, null, null);
                }
                if (query.getCount() != 0) {
                    query.moveToFirst();
                    bArr = query.getBlob(0);
                } else {
                    bArr = null;
                }
                query.close();
            } catch (Throwable th) {
                Log.w("OsmDroid", "Error getting db stream: " + k76.h(j), th);
            }
            if (bArr == null) {
                return null;
            }
            return bArr;
        }
        if (dq1.a().h()) {
            Log.d("OsmDroid", "Skipping DatabaseFileArchive lookup, database is closed");
        }
        return null;
    }

    public String toString() {
        return "DatabaseFileArchive [mDatabase=" + this.a.getPath() + "]";
    }
}
