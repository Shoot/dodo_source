package defpackage;

import defpackage.b33;
import java.io.File;
/* compiled from: DiskLruCacheFactory.java */
/* renamed from: i33  reason: default package */
/* loaded from: classes.dex */
public class i33 implements b33.a {
    private final long a;
    private final a b;

    /* compiled from: DiskLruCacheFactory.java */
    /* renamed from: i33$a */
    /* loaded from: classes.dex */
    public interface a {
        File a();
    }

    public i33(a aVar, long j) {
        this.a = j;
        this.b = aVar;
    }

    @Override // defpackage.b33.a
    public b33 a() {
        File a2 = this.b.a();
        if (a2 == null) {
            return null;
        }
        if (!a2.isDirectory() && !a2.mkdirs()) {
            return null;
        }
        return j33.c(a2, this.a);
    }
}
