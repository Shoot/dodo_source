package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: Lambda.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lej5;", "R", "Lj94;", "Ljava/io/Serializable;", "", "toString", "", "arity", "I", "getArity", "()I", "<init>", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: ej5  reason: default package */
/* loaded from: classes3.dex */
public abstract class ej5<R> implements j94<R>, Serializable {
    private final int arity;

    public ej5(int i) {
        this.arity = i;
    }

    @Override // defpackage.j94
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String i = bc9.i(this);
        z65.g(i, "renderLambdaToString(...)");
        return i;
    }
}
