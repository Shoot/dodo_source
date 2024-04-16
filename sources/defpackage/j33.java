package defpackage;

import android.util.Log;
import defpackage.b33;
import defpackage.g33;
import java.io.File;
import java.io.IOException;
/* compiled from: DiskLruCacheWrapper.java */
/* renamed from: j33  reason: default package */
/* loaded from: classes.dex */
public class j33 implements b33 {
    private final File b;
    private final long c;
    private g33 e;
    private final e33 d = new e33();
    private final ws9 a = new ws9();

    @Deprecated
    protected j33(File file, long j) {
        this.b = file;
        this.c = j;
    }

    public static b33 c(File file, long j) {
        return new j33(file, j);
    }

    private synchronized g33 d() throws IOException {
        try {
            if (this.e == null) {
                this.e = g33.H(this.b, 1, 1, this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    @Override // defpackage.b33
    public File a(se5 se5Var) {
        String b = this.a.b(se5Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b + " for for Key: " + se5Var);
        }
        try {
            g33.e y = d().y(b);
            if (y == null) {
                return null;
            }
            return y.a(0);
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.b33
    public void b(se5 se5Var, b33.b bVar) {
        g33 d;
        String b = this.a.b(se5Var);
        this.d.a(b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b + " for for Key: " + se5Var);
            }
            try {
                d = d();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            if (d.y(b) != null) {
                return;
            }
            g33.c s = d.s(b);
            if (s != null) {
                try {
                    if (bVar.a(s.f(0))) {
                        s.e();
                    }
                    s.b();
                    return;
                } catch (Throwable th) {
                    s.b();
                    throw th;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + b);
        } finally {
            this.d.b(b);
        }
    }
}
