package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.NonNull;
/* compiled from: LruCache.java */
/* renamed from: g36  reason: default package */
/* loaded from: classes3.dex */
public final class g36 implements jl0 {
    final LruCache<String, b> a;

    /* compiled from: LruCache.java */
    /* renamed from: g36$a */
    /* loaded from: classes3.dex */
    class a extends LruCache<String, b> {
        a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a */
        public int sizeOf(String str, b bVar) {
            return bVar.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LruCache.java */
    /* renamed from: g36$b */
    /* loaded from: classes3.dex */
    public static final class b {
        final Bitmap a;
        final int b;

        b(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = i;
        }
    }

    public g36(@NonNull Context context) {
        this(evb.b(context));
    }

    @Override // defpackage.jl0
    public int a() {
        return this.a.maxSize();
    }

    @Override // defpackage.jl0
    public void b(@NonNull String str, @NonNull Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int j = evb.j(bitmap);
            if (j > a()) {
                this.a.remove(str);
                return;
            } else {
                this.a.put(str, new b(bitmap, j));
                return;
            }
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    @Override // defpackage.jl0
    public Bitmap get(@NonNull String str) {
        b bVar = this.a.get(str);
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    @Override // defpackage.jl0
    public int size() {
        return this.a.size();
    }

    public g36(int i) {
        this.a = new a(i);
    }
}
