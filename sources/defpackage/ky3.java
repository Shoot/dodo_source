package defpackage;

import com.google.firebase.perf.metrics.Trace;
import kotlin.Metadata;
/* compiled from: FirebaseTraceFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lky3;", "Lvjb;", "", "traceName", "Lqjb;", "a", "Lvw3;", "Lvw3;", "firebase", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ky3  reason: default package */
/* loaded from: classes4.dex */
public final class ky3 implements vjb {
    private final vw3 a;

    public ky3() {
        vw3 c = vw3.c();
        z65.g(c, "getInstance(...)");
        this.a = c;
    }

    @Override // defpackage.vjb
    public qjb a(String str) {
        z65.h(str, "traceName");
        Trace e = this.a.e(str);
        z65.g(e, "newTrace(...)");
        return new iy3(e);
    }
}
