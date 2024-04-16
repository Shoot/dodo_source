package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Ljqb;", "T", "Ltw9;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "oldValue", "", "i1", "", "h1", "state", "c1", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lcv1;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcv1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: jqb  reason: default package */
/* loaded from: classes3.dex */
public final class jqb<T> extends tw9<T> {
    private ThreadLocal<Pair<CoroutineContext, Object>> d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jqb(kotlin.coroutines.CoroutineContext r3, defpackage.cv1<? super T> r4) {
        /*
            r2 = this;
            lqb r0 = defpackage.lqb.a
            kotlin.coroutines.CoroutineContext$Element r1 = r3.c(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.CoroutineContext r0 = r3.P(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.d = r0
            kotlin.coroutines.CoroutineContext r4 = r4.getContext()
            kotlin.coroutines.d$b r0 = kotlin.coroutines.d.J4
            kotlin.coroutines.CoroutineContext$Element r4 = r4.c(r0)
            boolean r4 = r4 instanceof defpackage.kx1
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = defpackage.wdb.c(r3, r4)
            defpackage.wdb.a(r3, r4)
            r2.i1(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqb.<init>(kotlin.coroutines.CoroutineContext, cv1):void");
    }

    @Override // defpackage.tw9, defpackage.e1
    protected void c1(Object obj) {
        Pair<CoroutineContext, Object> pair = this.d.get();
        jqb<?> jqbVar = null;
        if (pair != null) {
            wdb.a(pair.a(), pair.b());
            this.d.set(null);
        }
        Object a = xl1.a(obj, this.c);
        cv1<T> cv1Var = this.c;
        CoroutineContext context = cv1Var.getContext();
        Object c = wdb.c(context, null);
        if (c != wdb.a) {
            jqbVar = jx1.g(cv1Var, context, c);
        }
        try {
            this.c.resumeWith(a);
            Unit unit = Unit.a;
        } finally {
            if (jqbVar == null || jqbVar.h1()) {
                wdb.a(context, c);
            }
        }
    }

    public final boolean h1() {
        if (this.d.get() == null) {
            return false;
        }
        this.d.set(null);
        return true;
    }

    public final void i1(CoroutineContext coroutineContext, Object obj) {
        this.d.set(lnb.a(coroutineContext, obj));
    }
}
