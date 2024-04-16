package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: FileBackedNativeSessionFile.java */
/* renamed from: xs3  reason: default package */
/* loaded from: classes2.dex */
class xs3 implements mu6 {
    @NonNull
    private final File a;
    @NonNull
    private final String b;
    @NonNull
    private final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xs3(@NonNull String str, @NonNull String str2, @NonNull File file) {
        this.b = str;
        this.c = str2;
        this.a = file;
    }

    private byte[] d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream c = c();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (c == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (c != null) {
                    c.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = c.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        c.close();
                        return byteArray;
                    }
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // defpackage.mu6
    public j12.d.b a() {
        byte[] d = d();
        if (d != null) {
            return j12.d.b.a().b(d).c(this.b).a();
        }
        return null;
    }

    @Override // defpackage.mu6
    @NonNull
    public String b() {
        return this.c;
    }

    @Override // defpackage.mu6
    public InputStream c() {
        if (this.a.exists() && this.a.isFile()) {
            try {
                return new FileInputStream(this.a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
