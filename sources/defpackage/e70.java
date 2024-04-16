package defpackage;

import defpackage.sk9;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: ContinuationImpl.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H$¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0014J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R!\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Le70;", "Lcv1;", "", "Ltx1;", "Ljava/io/Serializable;", "Lsk9;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "completion", "create", "value", "", "toString", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lcv1;", "getCompletion", "()Lcv1;", "getCallerFrame", "()Ltx1;", "callerFrame", "<init>", "(Lcv1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: e70  reason: default package */
/* loaded from: classes3.dex */
public abstract class e70 implements cv1<Object>, tx1, Serializable {
    private final cv1<Object> completion;

    public e70(cv1<Object> cv1Var) {
        this.completion = cv1Var;
    }

    public cv1<Unit> create(cv1<?> cv1Var) {
        z65.h(cv1Var, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.tx1
    public tx1 getCallerFrame() {
        cv1<Object> cv1Var = this.completion;
        if (cv1Var instanceof tx1) {
            return (tx1) cv1Var;
        }
        return null;
    }

    public final cv1<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return on2.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cv1
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object d;
        cv1 cv1Var = this;
        while (true) {
            io2.b(cv1Var);
            e70 e70Var = (e70) cv1Var;
            cv1 cv1Var2 = e70Var.completion;
            z65.e(cv1Var2);
            try {
                invokeSuspend = e70Var.invokeSuspend(obj);
                d = c75.d();
            } catch (Throwable th) {
                sk9.a aVar = sk9.b;
                obj = sk9.b(vk9.a(th));
            }
            if (invokeSuspend == d) {
                return;
            }
            obj = sk9.b(invokeSuspend);
            e70Var.releaseIntercepted();
            if (cv1Var2 instanceof e70) {
                cv1Var = cv1Var2;
            } else {
                cv1Var2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        z65.h(cv1Var, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    protected void releaseIntercepted() {
    }
}
