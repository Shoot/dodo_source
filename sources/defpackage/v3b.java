package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0016\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lv3b;", "T", "Lrn5;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "isInitialized", "", "toString", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "initializer", "b", "Ljava/lang/Object;", "_value", c.a, "lock", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: v3b  reason: default package */
/* loaded from: classes3.dex */
public final class v3b<T> implements rn5<T>, Serializable {
    private Function0<? extends T> a;
    private volatile Object b;
    private final Object c;

    public v3b(Function0<? extends T> function0, Object obj) {
        z65.h(function0, "initializer");
        this.a = function0;
        this.b = qpb.a;
        this.c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new x25(getValue());
    }

    @Override // defpackage.rn5
    public T getValue() {
        T t;
        T t2 = (T) this.b;
        qpb qpbVar = qpb.a;
        if (t2 != qpbVar) {
            return t2;
        }
        synchronized (this.c) {
            t = (T) this.b;
            if (t == qpbVar) {
                Function0<? extends T> function0 = this.a;
                z65.e(function0);
                t = function0.invoke();
                this.b = t;
                this.a = null;
            }
        }
        return t;
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

    public /* synthetic */ v3b(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? null : obj);
    }
}
