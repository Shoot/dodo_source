package defpackage;

import android.net.Uri;
import androidx.annotation.NonNull;
import defpackage.mm6;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: UrlUriLoader.java */
/* renamed from: ztb  reason: default package */
/* loaded from: classes.dex */
public class ztb<Data> implements mm6<Uri, Data> {
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final mm6<gg4, Data> a;

    /* compiled from: UrlUriLoader.java */
    /* renamed from: ztb$a */
    /* loaded from: classes.dex */
    public static class a implements nm6<Uri, InputStream> {
        @Override // defpackage.nm6
        @NonNull
        public mm6<Uri, InputStream> d(qp6 qp6Var) {
            return new ztb(qp6Var.d(gg4.class, InputStream.class));
        }
    }

    public ztb(mm6<gg4, Data> mm6Var) {
        this.a = mm6Var;
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<Data> b(@NonNull Uri uri, int i, int i2, @NonNull ac7 ac7Var) {
        return this.a.b(new gg4(uri.toString()), i, i2, ac7Var);
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull Uri uri) {
        return b.contains(uri.getScheme());
    }
}
