package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.e1b;
import defpackage.xvb;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: DefaultFormValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lwp2;", "Lo54;", "Le1b;", "a", "Li54;", "Li54;", "getContext", "()Li54;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Li54;)V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wp2  reason: default package */
/* loaded from: classes.dex */
public final class wp2 implements o54 {
    private final i54 a;

    public wp2(i54 i54Var) {
        z65.h(i54Var, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = i54Var;
    }

    @Override // defpackage.o54
    public e1b a() {
        int w;
        int e;
        int e2;
        for (m54 m54Var : this.a.c()) {
            xvb g = m54Var.g();
            if (g instanceof xvb.a) {
                return new e1b.a(m54Var, ((xvb.a) g).a());
            }
        }
        Collection<m54> c = this.a.c();
        w = lc1.w(c, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (Object obj : c) {
            linkedHashMap.put(((m54) obj).c().getName(), obj);
        }
        return new e1b.b(linkedHashMap);
    }
}
