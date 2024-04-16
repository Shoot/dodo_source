package defpackage;

import android.graphics.Path;
import java.util.List;
/* compiled from: ShapeKeyframeAnimation.java */
/* renamed from: eha  reason: default package */
/* loaded from: classes.dex */
public class eha extends t70<yga, Path> {
    private final yga i;
    private final Path j;
    private List<gha> k;

    public eha(List<lg5<yga>> list) {
        super(list);
        this.i = new yga();
        this.j = new Path();
    }

    @Override // defpackage.t70
    /* renamed from: p */
    public Path i(lg5<yga> lg5Var, float f) {
        this.i.c(lg5Var.b, lg5Var.c, f);
        yga ygaVar = this.i;
        List<gha> list = this.k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ygaVar = this.k.get(size).c(ygaVar);
            }
        }
        ql6.h(ygaVar, this.j);
        return this.j;
    }

    public void q(List<gha> list) {
        this.k = list;
    }
}
