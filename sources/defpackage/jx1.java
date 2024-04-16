package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a(\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0013\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\u0011H\u0080\u0010\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lqx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, DateTokenConverter.CONVERTER_KEY, "addedContext", e.a, "", com.huawei.hms.opendevice.c.a, "originalContext", "appendContext", "isNewCoroutine", "a", "Lcv1;", "", "oldValue", "Ljqb;", "g", "Ltx1;", "f", "", "b", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: jx1  reason: default package */
/* loaded from: classes3.dex */
public final class jx1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: jx1$a */
    /* loaded from: classes3.dex */
    public static final class a extends ej5 implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            if (element instanceof uw1) {
                return coroutineContext.P(((uw1) element).y());
            }
            return coroutineContext.P(element);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: jx1$b */
    /* loaded from: classes3.dex */
    public static final class b extends ej5 implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {
        final /* synthetic */ ea9<CoroutineContext> a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ea9<CoroutineContext> ea9Var, boolean z) {
            super(2);
            this.a = ea9Var;
            this.b = z;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.CoroutineContext] */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
            if (!(element instanceof uw1)) {
                return coroutineContext.P(element);
            }
            CoroutineContext.Element c = this.a.a.c(element.getKey());
            if (c == null) {
                uw1 uw1Var = (uw1) element;
                if (this.b) {
                    uw1Var = uw1Var.y();
                }
                return coroutineContext.P(uw1Var);
            }
            ea9<CoroutineContext> ea9Var = this.a;
            ea9Var.a = ea9Var.a.T(element.getKey());
            return coroutineContext.P(((uw1) element).k(c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "result", "Lkotlin/coroutines/CoroutineContext$Element;", "it", "a", "(ZLkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: jx1$c */
    /* loaded from: classes3.dex */
    public static final class c extends ej5 implements Function2<Boolean, CoroutineContext.Element, Boolean> {
        public static final c a = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z, CoroutineContext.Element element) {
            boolean z2;
            if (!z && !(element instanceof uw1)) {
                z2 = false;
            } else {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.Element element) {
            return a(bool.booleanValue(), element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean c2 = c(coroutineContext);
        boolean c3 = c(coroutineContext2);
        if (!c2 && !c3) {
            return coroutineContext.P(coroutineContext2);
        }
        ea9 ea9Var = new ea9();
        ea9Var.a = coroutineContext2;
        kotlin.coroutines.e eVar = kotlin.coroutines.e.a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.m0(eVar, new b(ea9Var, z));
        if (c3) {
            ea9Var.a = ((CoroutineContext) ea9Var.a).m0(eVar, a.a);
        }
        return coroutineContext3.P((CoroutineContext) ea9Var.a);
    }

    public static final String b(CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.m0(Boolean.FALSE, c.a)).booleanValue();
    }

    public static final CoroutineContext d(qx1 qx1Var, CoroutineContext coroutineContext) {
        CoroutineContext a2 = a(qx1Var.getCoroutineContext(), coroutineContext, true);
        if (a2 != v33.a() && a2.c(d.J4) == null) {
            return a2.P(v33.a());
        }
        return a2;
    }

    public static final CoroutineContext e(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        if (!c(coroutineContext2)) {
            return coroutineContext.P(coroutineContext2);
        }
        return a(coroutineContext, coroutineContext2, false);
    }

    public static final jqb<?> f(tx1 tx1Var) {
        while (!(tx1Var instanceof p33) && (tx1Var = tx1Var.getCallerFrame()) != null) {
            if (tx1Var instanceof jqb) {
                return (jqb) tx1Var;
            }
        }
        return null;
    }

    public static final jqb<?> g(cv1<?> cv1Var, CoroutineContext coroutineContext, Object obj) {
        if (!(cv1Var instanceof tx1) || coroutineContext.c(lqb.a) == null) {
            return null;
        }
        jqb<?> f = f((tx1) cv1Var);
        if (f != null) {
            f.i1(coroutineContext, obj);
        }
        return f;
    }
}
