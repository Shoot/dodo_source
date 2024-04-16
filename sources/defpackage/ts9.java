package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.sk9;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SafeContinuationJvm.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001b*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\nB!\b\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0019B\u0017\b\u0011\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0018\u0010\u001aJ\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lts9;", "T", "Lcv1;", "Ltx1;", "Lsk9;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "", "a", "", "toString", "Lcv1;", "delegate", "Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "getCallerFrame", "()Ltx1;", "callerFrame", "initialResult", "<init>", "(Lcv1;Ljava/lang/Object;)V", "(Lcv1;)V", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: ts9  reason: default package */
/* loaded from: classes3.dex */
public final class ts9<T> implements cv1<T>, tx1 {
    private static final a b = new a(null);
    private static final AtomicReferenceFieldUpdater<ts9<?>, Object> c = AtomicReferenceFieldUpdater.newUpdater(ts9.class, Object.class, "result");
    private final cv1<T> a;
    private volatile Object result;

    /* compiled from: SafeContinuationJvm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bRj\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lts9$a;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lts9;", "kotlin.jvm.PlatformType", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getRESULT$annotations", "()V", "<init>", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ts9$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ts9(cv1<? super T> cv1Var, Object obj) {
        z65.h(cv1Var, "delegate");
        this.a = cv1Var;
        this.result = obj;
    }

    public final Object a() {
        Object d;
        Object d2;
        Object d3;
        Object obj = this.result;
        sx1 sx1Var = sx1.b;
        if (obj == sx1Var) {
            AtomicReferenceFieldUpdater<ts9<?>, Object> atomicReferenceFieldUpdater = c;
            d2 = c75.d();
            if (d2.a(atomicReferenceFieldUpdater, this, sx1Var, d2)) {
                d3 = c75.d();
                return d3;
            }
            obj = this.result;
        }
        if (obj == sx1.c) {
            d = c75.d();
            return d;
        } else if (!(obj instanceof sk9.b)) {
            return obj;
        } else {
            throw ((sk9.b) obj).a;
        }
    }

    @Override // defpackage.tx1
    public tx1 getCallerFrame() {
        cv1<T> cv1Var = this.a;
        if (cv1Var instanceof tx1) {
            return (tx1) cv1Var;
        }
        return null;
    }

    @Override // defpackage.cv1
    public CoroutineContext getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.cv1
    public void resumeWith(Object obj) {
        Object d;
        Object d2;
        while (true) {
            Object obj2 = this.result;
            sx1 sx1Var = sx1.b;
            if (obj2 != sx1Var) {
                d = c75.d();
                if (obj2 == d) {
                    AtomicReferenceFieldUpdater<ts9<?>, Object> atomicReferenceFieldUpdater = c;
                    d2 = c75.d();
                    if (d2.a(atomicReferenceFieldUpdater, this, d2, sx1.c)) {
                        this.a.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            } else if (d2.a(c, this, sx1Var, obj)) {
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ts9(cv1<? super T> cv1Var) {
        this(cv1Var, sx1.b);
        z65.h(cv1Var, "delegate");
    }
}
