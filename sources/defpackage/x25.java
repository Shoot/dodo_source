package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: Lazy.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u000f\u0012\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lx25;", "T", "Lrn5;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "isInitialized", "", "toString", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: x25  reason: default package */
/* loaded from: classes3.dex */
public final class x25<T> implements rn5<T>, Serializable {
    private final T a;

    public x25(T t) {
        this.a = t;
    }

    @Override // defpackage.rn5
    public T getValue() {
        return this.a;
    }

    @Override // defpackage.rn5
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
