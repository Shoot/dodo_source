package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
/* compiled from: ContinuationImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\r\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lev1;", "Le70;", "Lcv1;", "", "intercepted", "", "releaseIntercepted", "Lkotlin/coroutines/CoroutineContext;", "_context", "Lkotlin/coroutines/CoroutineContext;", "Lcv1;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "completion", "<init>", "(Lcv1;Lkotlin/coroutines/CoroutineContext;)V", "(Lcv1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: ev1  reason: default package */
/* loaded from: classes3.dex */
public abstract class ev1 extends e70 {
    private final CoroutineContext _context;
    private transient cv1<Object> intercepted;

    public ev1(cv1<Object> cv1Var, CoroutineContext coroutineContext) {
        super(cv1Var);
        this._context = coroutineContext;
    }

    @Override // defpackage.cv1
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        z65.e(coroutineContext);
        return coroutineContext;
    }

    public final cv1<Object> intercepted() {
        cv1<Object> cv1Var = this.intercepted;
        if (cv1Var == null) {
            d dVar = (d) getContext().c(d.J4);
            if (dVar == null || (cv1Var = dVar.b0(this)) == null) {
                cv1Var = this;
            }
            this.intercepted = cv1Var;
        }
        return cv1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.e70
    public void releaseIntercepted() {
        cv1<?> cv1Var = this.intercepted;
        if (cv1Var != null && cv1Var != this) {
            CoroutineContext.Element c = getContext().c(d.J4);
            z65.e(c);
            ((d) c).Q(cv1Var);
        }
        this.intercepted = hl1.a;
    }

    public ev1(cv1<Object> cv1Var) {
        this(cv1Var, cv1Var != null ? cv1Var.getContext() : null);
    }
}
