package defpackage;

import kotlin.Metadata;
/* compiled from: ContinuationImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lf3b;", "Lev1;", "Lj94;", "", "", "toString", "", "arity", "I", "getArity", "()I", "Lcv1;", "completion", "<init>", "(ILcv1;)V", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: f3b  reason: default package */
/* loaded from: classes3.dex */
public abstract class f3b extends ev1 implements j94<Object> {
    private final int arity;

    public f3b(int i, cv1<Object> cv1Var) {
        super(cv1Var);
        this.arity = i;
    }

    @Override // defpackage.j94
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.e70
    public String toString() {
        if (getCompletion() == null) {
            String h = bc9.h(this);
            z65.g(h, "renderLambdaToString(...)");
            return h;
        }
        return super.toString();
    }

    public f3b(int i) {
        this(i, null);
    }
}
