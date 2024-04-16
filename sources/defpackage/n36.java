package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import org.osmdroid.tileprovider.tilesource.a;
/* compiled from: MBTilesFileArchive.java */
/* renamed from: n36  reason: default package */
/* loaded from: classes3.dex */
public class n36 implements gr4 {
    private SQLiteDatabase a;

    @Override // defpackage.gr4
    public void a(File file) throws Exception {
        this.a = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 17);
    }

    @Override // defpackage.gr4
    public InputStream c(a aVar, long j) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            Cursor query = this.a.query("tiles", new String[]{"tile_data"}, "tile_column=? and tile_row=? and zoom_level=?", new String[]{Integer.toString(k76.c(j)), Double.toString((Math.pow(2.0d, k76.e(j)) - k76.d(j)) - 1.0d), Integer.toString(k76.e(j))}, null, null, null);
            if (query.getCount() != 0) {
                query.moveToFirst();
                byteArrayInputStream = new ByteArrayInputStream(query.getBlob(0));
            } else {
                byteArrayInputStream = null;
            }
            query.close();
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

    public String toString() {
        return "DatabaseFileArchive [mDatabase=" + this.a.getPath() + "]";
    }

    @Override // defpackage.gr4
    public void b(boolean z) {
    }
}
