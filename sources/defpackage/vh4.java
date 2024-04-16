package defpackage;

import java.util.List;
/* compiled from: GradientColorKeyframeAnimation.java */
/* renamed from: vh4  reason: default package */
/* loaded from: classes.dex */
public class vh4 extends mg5<th4> {
    private final th4 i;

    public vh4(List<lg5<th4>> list) {
        super(list);
        th4 th4Var = list.get(0).b;
        int c = th4Var != null ? th4Var.c() : 0;
        this.i = new th4(new float[c], new int[c]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t70
    /* renamed from: p */
    public th4 i(lg5<th4> lg5Var, float f) {
        this.i.d(lg5Var.b, lg5Var.c, f);
        return this.i;
    }
}
