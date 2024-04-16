package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: Lazy.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lirb;", "T", "Lrn5;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "isInitialized", "", "toString", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "initializer", "b", "Ljava/lang/Object;", "_value", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: irb  reason: default package */
/* loaded from: classes3.dex */
public final class irb<T> implements rn5<T>, Serializable {
    private Function0<? extends T> a;
    private Object b;

    public irb(Function0<? extends T> function0) {
        z65.h(function0, "initializer");
        this.a = function0;
        this.b = qpb.a;
    }

    private final Object writeReplace() {
        return new x25(getValue());
    }

    @Override // defpackage.rn5
    public T getValue() {
        if (this.b == qpb.a) {
            Function0<? extends T> function0 = this.a;
            z65.e(function0);
            this.b = function0.invoke();
            this.a = null;
        }
        return (T) this.b;
    }

    @Override // defpackage.rn5
    public boolean isInitialized() {
        if (this.b != qpb.a) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
