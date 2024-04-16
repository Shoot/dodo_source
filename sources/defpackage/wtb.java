package defpackage;

import androidx.annotation.NonNull;
import defpackage.mm6;
import java.io.InputStream;
import java.net.URL;
/* compiled from: UrlLoader.java */
/* renamed from: wtb  reason: default package */
/* loaded from: classes.dex */
public class wtb implements mm6<URL, InputStream> {
    private final mm6<gg4, InputStream> a;

    /* compiled from: UrlLoader.java */
    /* renamed from: wtb$a */
    /* loaded from: classes.dex */
    public static class a implements nm6<URL, InputStream> {
        @Override // defpackage.nm6
        @NonNull
        public mm6<URL, InputStream> d(qp6 qp6Var) {
            return new wtb(qp6Var.d(gg4.class, InputStream.class));
        }
    }

    public wtb(mm6<gg4, InputStream> mm6Var) {
        this.a = mm6Var;
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<InputStream> b(@NonNull URL url, int i, int i2, @NonNull ac7 ac7Var) {
        return this.a.b(new gg4(url), i, i2, ac7Var);
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull URL url) {
        return true;
    }
}
