package defpackage;

import defpackage.k65;
import kotlin.Metadata;
/* compiled from: BrotliInterceptor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lig0;", "Lk65;", "Lk65$a;", "chain", "Lik9;", "intercept", "<init>", "()V", "okhttp-brotli"}, k = 1, mv = {1, 9, 0})
/* renamed from: ig0  reason: default package */
/* loaded from: classes3.dex */
public final class ig0 implements k65 {
    public static final ig0 a = new ig0();

    private ig0() {
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) {
        z65.h(aVar, "chain");
        if (aVar.request().d("Accept-Encoding") == null) {
            return jg0.a(aVar.b(aVar.request().i().j("Accept-Encoding", "br,gzip").b()));
        }
        return aVar.b(aVar.request());
    }
}
