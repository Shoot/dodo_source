package defpackage;

import android.graphics.PointF;
import com.huawei.hms.opendevice.c;
import defpackage.xb5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ShapeDataParser.java */
/* renamed from: zga  reason: default package */
/* loaded from: classes.dex */
public class zga implements jwb<yga> {
    public static final zga a = new zga();
    private static final xb5.a b = xb5.a.a(c.a, "v", "i", "o");

    private zga() {
    }

    @Override // defpackage.jwb
    /* renamed from: b */
    public yga a(xb5 xb5Var, float f) throws IOException {
        if (xb5Var.r() == xb5.b.BEGIN_ARRAY) {
            xb5Var.b();
        }
        xb5Var.c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (xb5Var.j()) {
            int u = xb5Var.u(b);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2) {
                        if (u != 3) {
                            xb5Var.x();
                            xb5Var.y();
                        } else {
                            list3 = wc5.f(xb5Var, f);
                        }
                    } else {
                        list2 = wc5.f(xb5Var, f);
                    }
                } else {
                    list = wc5.f(xb5Var, f);
                }
            } else {
                z = xb5Var.k();
            }
        }
        xb5Var.i();
        if (xb5Var.r() == xb5.b.END_ARRAY) {
            xb5Var.e();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new yga(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new c32(ql6.a(list.get(i2), list3.get(i2)), ql6.a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new c32(ql6.a(list.get(i3), list3.get(i3)), ql6.a(pointF3, list2.get(0)), pointF3));
            }
            return new yga(pointF, z, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
