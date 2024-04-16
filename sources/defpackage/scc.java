package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.osmdroid.tileprovider.tilesource.a;
/* compiled from: ZipFileArchive.java */
/* renamed from: scc  reason: default package */
/* loaded from: classes3.dex */
public class scc implements gr4 {
    protected ZipFile a;
    private boolean b = false;

    private String d(long j, String str) {
        return str + '/' + k76.e(j) + '/' + k76.c(j) + '/' + k76.d(j) + ".png";
    }

    @Override // defpackage.gr4
    public void a(File file) throws Exception {
        this.a = new ZipFile(file);
    }

    @Override // defpackage.gr4
    public void b(boolean z) {
        this.b = z;
    }

    @Override // defpackage.gr4
    public InputStream c(a aVar, long j) {
        try {
            if (!this.b) {
                ZipEntry entry = this.a.getEntry(aVar.d(j));
                if (entry != null) {
                    return this.a.getInputStream(entry);
                }
                return null;
            }
            Enumeration<? extends ZipEntry> entries = this.a.entries();
            while (entries.hasMoreElements()) {
                String name = entries.nextElement().getName();
                if (name.contains("/")) {
                    ZipEntry entry2 = this.a.getEntry(d(j, name.split("/")[0]));
                    if (entry2 != null) {
                        return this.a.getInputStream(entry2);
                    }
                }
            }
            return null;
        } catch (IOException e) {
            Log.w("OsmDroid", "Error getting zip stream: " + k76.h(j), e);
            return null;
        }
    }

    @Override // defpackage.gr4
    public void close() {
        try {
            this.a.close();
        } catch (IOException unused) {
        }
    }

    public String toString() {
        return "ZipFileArchive [mZipFile=" + this.a.getName() + "]";
    }
}
