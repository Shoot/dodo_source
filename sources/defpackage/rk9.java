package defpackage;

import kotlin.Metadata;
/* compiled from: ContinuationImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lrk9;", "Lqk9;", "Lj94;", "", "", "toString", "", "a", "I", "getArity", "()I", "arity", "Lcv1;", "completion", "<init>", "(ILcv1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: rk9  reason: default package */
/* loaded from: classes3.dex */
public abstract class rk9 extends qk9 implements j94<Object> {
    private final int a;

    public rk9(int i, cv1<Object> cv1Var) {
        super(cv1Var);
        this.a = i;
    }

    @Override // defpackage.j94
    public int getArity() {
        return this.a;
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
}
