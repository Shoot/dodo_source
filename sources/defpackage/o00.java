package defpackage;

import defpackage.z2b;
import kotlin.Metadata;
/* compiled from: AutoClosingRoomOpenHelperFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lo00;", "Lz2b$c;", "Lz2b$b;", "configuration", "Ln00;", "b", "a", "Lz2b$c;", "delegate", "Lm00;", "Lm00;", "autoCloser", "<init>", "(Lz2b$c;Lm00;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: o00  reason: default package */
/* loaded from: classes.dex */
public final class o00 implements z2b.c {
    private final z2b.c a;
    private final m00 b;

    public o00(z2b.c cVar, m00 m00Var) {
        z65.h(cVar, "delegate");
        z65.h(m00Var, "autoCloser");
        this.a = cVar;
        this.b = m00Var;
    }

    @Override // defpackage.z2b.c
    /* renamed from: b */
    public n00 a(z2b.b bVar) {
        z65.h(bVar, "configuration");
        return new n00(this.a.a(bVar), this.b);
    }
}
