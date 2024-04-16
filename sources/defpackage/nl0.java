package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: CacheInspector.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lnl0;", "Lml0;", "", c.a, "", "cacheKey", "", "a", "duration", "", "b", "Lul0;", "Lul0;", "cacheTimestampRepository", "<init>", "(Lul0;)V", "cache"}, k = 1, mv = {1, 9, 0})
/* renamed from: nl0  reason: default package */
/* loaded from: classes.dex */
public final class nl0 implements ml0 {
    private final ul0 a;

    public nl0(ul0 ul0Var) {
        z65.h(ul0Var, "cacheTimestampRepository");
        this.a = ul0Var;
    }

    private final long c() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.ml0
    public boolean a(String str) {
        z65.h(str, "cacheKey");
        tl0 m = this.a.m(str);
        if (m == null) {
            return false;
        }
        long c = c();
        if (c <= m.c() || m.d() <= c) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ml0
    public void b(String str, long j) {
        tl0 tl0Var;
        z65.h(str, "cacheKey");
        if (j == 0) {
            this.a.l(str);
            return;
        }
        long c = c();
        long j2 = c + j;
        tl0 m = this.a.m(str);
        if (m != null && m.c() <= c && m.c() >= j2) {
            tl0Var = tl0.b(m, null, 0L, j2, 3, null);
        } else {
            tl0Var = new tl0(str, c, j2);
        }
        this.a.o(tl0Var);
    }
}
