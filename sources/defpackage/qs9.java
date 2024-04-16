package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\"\u001a\u00020\f¢\u0006\u0004\b2\u00103J'\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u001b\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lqs9;", "T", "Lpz3;", "Lev1;", "Ltx1;", "Lcv1;", "", "uCont", "value", "", "j", "(Lcv1;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "previousContext", "i", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lh73;", "exception", "k", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lsk9;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "a", "Lpz3;", "collector", "b", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "", c.a, "I", "collectContextSize", DateTokenConverter.CONVERTER_KEY, "lastEmissionContext", e.a, "Lcv1;", "completion", "getCallerFrame", "()Ltx1;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lpz3;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: qs9  reason: default package */
/* loaded from: classes3.dex */
public final class qs9<T> extends ev1 implements pz3<T>, tx1 {
    public final pz3<T> a;
    public final CoroutineContext b;
    public final int c;
    private CoroutineContext d;
    private cv1<? super Unit> e;

    /* compiled from: SafeCollector.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "count", "Lkotlin/coroutines/CoroutineContext$Element;", "<anonymous parameter 1>", "a", "(ILkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: qs9$a */
    /* loaded from: classes3.dex */
    static final class a extends ej5 implements Function2<Integer, CoroutineContext.Element, Integer> {
        public static final a a = new a();

        a() {
            super(2);
        }

        public final Integer a(int i, CoroutineContext.Element element) {
            return Integer.valueOf(i + 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element element) {
            return a(num.intValue(), element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qs9(pz3<? super T> pz3Var, CoroutineContext coroutineContext) {
        super(fz6.a, kotlin.coroutines.e.a);
        this.a = pz3Var;
        this.b = coroutineContext;
        this.c = ((Number) coroutineContext.m0(0, a.a)).intValue();
    }

    private final void i(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t) {
        if (coroutineContext2 instanceof h73) {
            k((h73) coroutineContext2, t);
        }
        ss9.a(this, coroutineContext);
    }

    private final Object j(cv1<? super Unit> cv1Var, T t) {
        Object d;
        CoroutineContext context = cv1Var.getContext();
        q95.k(context);
        CoroutineContext coroutineContext = this.d;
        if (coroutineContext != context) {
            i(context, coroutineContext, t);
            this.d = context;
        }
        this.e = cv1Var;
        Object invoke = rs9.a().invoke(this.a, t, this);
        d = c75.d();
        if (!z65.c(invoke, d)) {
            this.e = null;
        }
        return invoke;
    }

    private final void k(h73 h73Var, Object obj) {
        String f;
        f = e0b.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + h73Var.a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(f.toString());
    }

    @Override // defpackage.pz3
    public Object emit(T t, cv1<? super Unit> cv1Var) {
        Object d;
        Object d2;
        try {
            Object j = j(cv1Var, t);
            d = c75.d();
            if (j == d) {
                io2.c(cv1Var);
            }
            d2 = c75.d();
            if (j == d2) {
                return j;
            }
            return Unit.a;
        } catch (Throwable th) {
            this.d = new h73(th, cv1Var.getContext());
            throw th;
        }
    }

    @Override // defpackage.e70, defpackage.tx1
    public tx1 getCallerFrame() {
        cv1<? super Unit> cv1Var = this.e;
        if (cv1Var instanceof tx1) {
            return (tx1) cv1Var;
        }
        return null;
    }

    @Override // defpackage.ev1, defpackage.cv1
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.d;
        if (coroutineContext == null) {
            return kotlin.coroutines.e.a;
        }
        return coroutineContext;
    }

    @Override // defpackage.e70
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.e70
    public Object invokeSuspend(Object obj) {
        Object d;
        Throwable d2 = sk9.d(obj);
        if (d2 != null) {
            this.d = new h73(d2, getContext());
        }
        cv1<? super Unit> cv1Var = this.e;
        if (cv1Var != null) {
            cv1Var.resumeWith(obj);
        }
        d = c75.d();
        return d;
    }

    @Override // defpackage.ev1, defpackage.e70
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
