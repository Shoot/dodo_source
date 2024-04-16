package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ValueHolders.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u001a\u0010\u000f\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lowa;", "T", "Lcua;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: owa  reason: default package */
/* loaded from: classes.dex */
public final class owa<T> implements cua<T> {
    private final T a;

    public owa(T t) {
        this.a = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof owa) && z65.c(this.a, ((owa) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cua
    public T getValue() {
        return this.a;
    }

    public int hashCode() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
