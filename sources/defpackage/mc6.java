package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import defpackage.mm6;
import java.io.InputStream;
/* compiled from: MediaStoreImageThumbLoader.java */
/* renamed from: mc6  reason: default package */
/* loaded from: classes.dex */
public class mc6 implements mm6<Uri, InputStream> {
    private final Context a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    /* renamed from: mc6$a */
    /* loaded from: classes.dex */
    public static class a implements nm6<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Uri, InputStream> d(qp6 qp6Var) {
            return new mc6(this.a);
        }
    }

    public mc6(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<InputStream> b(@NonNull Uri uri, int i, int i2, @NonNull ac7 ac7Var) {
        if (oc6.e(i, i2)) {
            return new mm6.a<>(new e57(uri), rfb.f(this.a, uri));
        }
        return null;
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull Uri uri) {
        return oc6.b(uri);
    }
}
