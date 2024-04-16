package defpackage;

import defpackage.k65;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: ConnectInterceptor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Llq1;", "Lk65;", "Lk65$a;", "chain", "Lik9;", "intercept", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: lq1  reason: default package */
/* loaded from: classes3.dex */
public final class lq1 implements k65 {
    public static final lq1 a = new lq1();

    private lq1() {
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) throws IOException {
        z65.h(aVar, "chain");
        w79 w79Var = (w79) aVar;
        return w79.f(w79Var, 0, w79Var.g().t(w79Var), null, 0, 0, 0, 61, null).b(w79Var.j());
    }
}
