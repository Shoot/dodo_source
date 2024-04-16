package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import defpackage.mm6;
import java.io.InputStream;
/* compiled from: MediaStoreVideoThumbLoader.java */
/* renamed from: pc6  reason: default package */
/* loaded from: classes.dex */
public class pc6 implements mm6<Uri, InputStream> {
    private final Context a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* renamed from: pc6$a */
    /* loaded from: classes.dex */
    public static class a implements nm6<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Uri, InputStream> d(qp6 qp6Var) {
            return new pc6(this.a);
        }
    }

    public pc6(Context context) {
        this.a = context.getApplicationContext();
    }

    private boolean e(ac7 ac7Var) {
        Long l = (Long) ac7Var.c(lyb.d);
        if (l != null && l.longValue() == -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<InputStream> b(@NonNull Uri uri, int i, int i2, @NonNull ac7 ac7Var) {
        if (oc6.e(i, i2) && e(ac7Var)) {
            return new mm6.a<>(new e57(uri), rfb.g(this.a, uri));
        }
        return null;
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull Uri uri) {
        return oc6.d(uri);
    }
}
