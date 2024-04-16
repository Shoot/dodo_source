package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: AbstractCoroutine.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00100\u001a\u00020$\u0012\u0006\u00101\u001a\u00020\u000b\u0012\u0006\u00102\u001a\u00020\u000b¢\u0006\u0004\b3\u00104J\u0017\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0000\u0010\bJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\u0012\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0004J\u001e\u0010\u0015\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\bJ\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u001a\u0010\u001bJJ\u0010\"\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00028\u00012\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00100 ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u001d\u0010+\u001a\u00020$8\u0006¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0014\u0010/\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Le1;", "T", "Lv95;", "Ll95;", "Lcv1;", "Lqx1;", "value", "", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "d1", "", "X", "", "state", "K0", "Lsk9;", "result", "resumeWith", "c1", "exception", "v0", "(Ljava/lang/Throwable;)V", "F0", "()Ljava/lang/String;", "R", "Lux1;", "start", "receiver", "Lkotlin/Function2;", "block", "f1", "(Lux1;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", CoreConstants.CONTEXT_SCOPE_VALUE, "getCoroutineContext", "coroutineContext", "()Z", "isActive", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: e1  reason: default package */
/* loaded from: classes3.dex */
public abstract class e1<T> extends v95 implements l95, cv1<T>, qx1 {
    private final CoroutineContext b;

    public e1(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            w0((l95) coroutineContext.c(l95.M));
        }
        this.b = coroutineContext.P(this);
    }

    @Override // defpackage.v95
    public String F0() {
        String b = jx1.b(this.b);
        if (b == null) {
            return super.F0();
        }
        return CoreConstants.DOUBLE_QUOTE_CHAR + b + "\":" + super.F0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v95
    protected final void K0(Object obj) {
        if (obj instanceof il1) {
            il1 il1Var = (il1) obj;
            d1(il1Var.a, il1Var.a());
            return;
        }
        e1(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.v95
    public String X() {
        return jo2.a(this) + " was cancelled";
    }

    @Override // defpackage.v95, defpackage.l95
    public boolean b() {
        return super.b();
    }

    protected void c1(Object obj) {
        D(obj);
    }

    public final <R> void f1(ux1 ux1Var, R r, Function2<? super R, ? super cv1<? super T>, ? extends Object> function2) {
        ux1Var.i(function2, r, this);
    }

    @Override // defpackage.cv1
    public final CoroutineContext getContext() {
        return this.b;
    }

    @Override // defpackage.qx1
    public CoroutineContext getCoroutineContext() {
        return this.b;
    }

    @Override // defpackage.cv1
    public final void resumeWith(Object obj) {
        Object D0 = D0(xl1.d(obj, null, 1, null));
        if (D0 == w95.b) {
            return;
        }
        c1(D0);
    }

    @Override // defpackage.v95
    public final void v0(Throwable th) {
        nx1.a(this.b, th);
    }

    protected void e1(T t) {
    }

    protected void d1(Throwable th, boolean z) {
    }
}
