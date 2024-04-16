package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: ShowLimiter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Laka;", "Lzja;", "Ldka;", "", c.a, "params", "", "b", "", "a", "Lml0;", "Lml0;", "cacheInspector", "<init>", "(Lml0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: aka  reason: default package */
/* loaded from: classes4.dex */
public final class aka implements zja {
    private final ml0 a;

    public aka(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        this.a = ml0Var;
    }

    private final String c(dka dkaVar) {
        String k = dkaVar.k();
        return "ShowLimiter." + k;
    }

    @Override // defpackage.zja
    public void a(dka dkaVar) {
        z65.h(dkaVar, "params");
        this.a.b(c(dkaVar), dkaVar.i());
    }

    @Override // defpackage.zja
    public boolean b(dka dkaVar) {
        z65.h(dkaVar, "params");
        return !this.a.a(c(dkaVar));
    }
}
