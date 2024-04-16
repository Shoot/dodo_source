package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: AcquirerRegistry.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lr4;", "Lq4;", "", "acquirerCode", "Ll4;", "b", "a", "Lm4;", "Lm4;", "acquirerFactory", "", "Ljava/util/Set;", "acquirers", "<init>", "(Lm4;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: r4  reason: default package */
/* loaded from: classes2.dex */
public final class r4 implements q4 {
    private final m4 a;
    private final Set<l4> b;

    public r4(m4 m4Var) {
        z65.h(m4Var, "acquirerFactory");
        this.a = m4Var;
        this.b = new LinkedHashSet();
    }

    private final l4 b(String str) {
        Object obj;
        Iterator<T> it = this.b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((l4) obj).c(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        l4 l4Var = (l4) obj;
        if (l4Var == null) {
            l4 a = this.a.a(str);
            this.b.add(a);
            return a;
        }
        return l4Var;
    }

    @Override // defpackage.q4
    public l4 a(String str) {
        z65.h(str, "acquirerCode");
        return b(str);
    }
}
