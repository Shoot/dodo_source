package defpackage;
/* compiled from: AnnotatedWithParams.java */
/* renamed from: ol  reason: default package */
/* loaded from: classes2.dex */
public abstract class ol extends hl {
    protected final rl[] c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ol(znb znbVar, rl rlVar, rl[] rlVarArr) {
        super(znbVar, rlVar);
        this.c = rlVarArr;
    }

    public final ll q(int i) {
        return new ll(this, s(i), this.a, r(i), i);
    }

    public final rl r(int i) {
        rl[] rlVarArr = this.c;
        if (rlVarArr != null && i >= 0 && i < rlVarArr.length) {
            return rlVarArr[i];
        }
        return null;
    }

    public abstract y85 s(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public ll u(int i, rl rlVar) {
        this.c[i] = rlVar;
        return q(i);
    }
}
