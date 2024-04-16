package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: BytesBackedNativeSessionFile.java */
/* renamed from: ok0  reason: default package */
/* loaded from: classes2.dex */
class ok0 implements mu6 {
    private final byte[] a;
    @NonNull
    private final String b;
    @NonNull
    private final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ok0(@NonNull String str, @NonNull String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.a = bArr;
    }

    private byte[] d() {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.a;
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.mu6
    public j12.d.b a() {
        byte[] d = d();
        if (d == null) {
            return null;
        }
        return j12.d.b.a().b(d).c(this.b).a();
    }

    @Override // defpackage.mu6
    @NonNull
    public String b() {
        return this.c;
    }

    @Override // defpackage.mu6
    public InputStream c() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }
}
