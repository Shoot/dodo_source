package defpackage;

import android.content.Context;
import defpackage.i33;
import java.io.File;
/* compiled from: InternalCacheDiskCacheFactory.java */
/* renamed from: q65  reason: default package */
/* loaded from: classes.dex */
public final class q65 extends i33 {

    /* compiled from: InternalCacheDiskCacheFactory.java */
    /* renamed from: q65$a */
    /* loaded from: classes.dex */
    class a implements i33.a {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // defpackage.i33.a
        public File a() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.b != null) {
                return new File(cacheDir, this.b);
            }
            return cacheDir;
        }
    }

    public q65(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public q65(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}
