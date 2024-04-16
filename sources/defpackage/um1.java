package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ComponentMonitor.java */
/* renamed from: um1  reason: default package */
/* loaded from: classes2.dex */
public class um1 implements wm1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, bm1 bm1Var, im1 im1Var) {
        try {
            jy3.b(str);
            return bm1Var.h().a(im1Var);
        } finally {
            jy3.a();
        }
    }

    @Override // defpackage.wm1
    public List<bm1<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final bm1<?> bm1Var : componentRegistrar.getComponents()) {
            final String i = bm1Var.i();
            if (i != null) {
                bm1Var = bm1Var.t(new rm1() { // from class: tm1
                    @Override // defpackage.rm1
                    public final Object a(im1 im1Var) {
                        Object c;
                        c = um1.c(i, bm1Var, im1Var);
                        return c;
                    }
                });
            }
            arrayList.add(bm1Var);
        }
        return arrayList;
    }
}
