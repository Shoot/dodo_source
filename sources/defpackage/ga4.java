package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.osmdroid.tileprovider.tilesource.a;
/* compiled from: GEMFFileArchive.java */
/* renamed from: ga4  reason: default package */
/* loaded from: classes3.dex */
public class ga4 implements gr4 {
    private fa4 a;

    @Override // defpackage.gr4
    public void a(File file) throws Exception {
        this.a = new fa4(file);
    }

    @Override // defpackage.gr4
    public InputStream c(a aVar, long j) {
        return this.a.b(k76.c(j), k76.d(j), k76.e(j));
    }

    @Override // defpackage.gr4
    public void close() {
        try {
            this.a.a();
        } catch (IOException unused) {
        }
    }

    public String toString() {
        return "GEMFFileArchive [mGEMFFile=" + this.a.c() + "]";
    }

    @Override // defpackage.gr4
    public void b(boolean z) {
    }
}
