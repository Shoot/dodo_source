package defpackage;

import kotlin.Metadata;
/* compiled from: SuggestionMapper.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lb2b;", "La2b;", "Lw1b;", "suggestion", "Le2b;", "a", "Ln43;", "Ln43;", "distanceFormatter", "<init>", "(Ln43;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b2b  reason: default package */
/* loaded from: classes2.dex */
public final class b2b implements a2b {
    private final n43 a;

    public b2b(n43 n43Var) {
        z65.h(n43Var, "distanceFormatter");
        this.a = n43Var;
    }

    @Override // defpackage.a2b
    public e2b a(w1b w1bVar) {
        String str;
        z65.h(w1bVar, "suggestion");
        String a = w1bVar.a();
        String c = w1bVar.c();
        String d = w1bVar.d();
        Integer b = w1bVar.b();
        if (b != null) {
            str = this.a.a(b.intValue());
        } else {
            str = null;
        }
        return new e2b(a, c, d, str);
    }
}
