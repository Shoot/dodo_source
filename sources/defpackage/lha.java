package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.kha;
import defpackage.xb5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeStrokeParser.java */
/* renamed from: lha  reason: default package */
/* loaded from: classes.dex */
public class lha {
    private static final xb5.a a = xb5.a.a("nm", c.a, "w", "o", "lc", "lj", "ml", "hd", DateTokenConverter.CONVERTER_KEY);
    private static final xb5.a b = xb5.a.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kha a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        pj pjVar = null;
        oj ojVar = null;
        pj pjVar2 = null;
        kha.b bVar = null;
        kha.c cVar = null;
        float f = 0.0f;
        boolean z = false;
        rj rjVar = null;
        while (xb5Var.j()) {
            switch (xb5Var.u(a)) {
                case 0:
                    str = xb5Var.o();
                    break;
                case 1:
                    ojVar = ek.c(xb5Var, ez5Var);
                    break;
                case 2:
                    pjVar2 = ek.e(xb5Var, ez5Var);
                    break;
                case 3:
                    rjVar = ek.h(xb5Var, ez5Var);
                    break;
                case 4:
                    bVar = kha.b.values()[xb5Var.m() - 1];
                    break;
                case 5:
                    cVar = kha.c.values()[xb5Var.m() - 1];
                    break;
                case 6:
                    f = (float) xb5Var.l();
                    break;
                case 7:
                    z = xb5Var.k();
                    break;
                case 8:
                    xb5Var.b();
                    while (xb5Var.j()) {
                        xb5Var.c();
                        String str2 = null;
                        pj pjVar3 = null;
                        while (xb5Var.j()) {
                            int u = xb5Var.u(b);
                            if (u != 0) {
                                if (u != 1) {
                                    xb5Var.x();
                                    xb5Var.y();
                                } else {
                                    pjVar3 = ek.e(xb5Var, ez5Var);
                                }
                            } else {
                                str2 = xb5Var.o();
                            }
                        }
                        xb5Var.i();
                        str2.hashCode();
                        char c = 65535;
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals(DateTokenConverter.CONVERTER_KEY)) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                ez5Var.u(true);
                                arrayList.add(pjVar3);
                                break;
                            case 2:
                                pjVar = pjVar3;
                                break;
                        }
                    }
                    xb5Var.e();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((pj) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    xb5Var.y();
                    break;
            }
        }
        if (rjVar == null) {
            rjVar = new rj(Collections.singletonList(new lg5(100)));
        }
        return new kha(str, pjVar, arrayList, ojVar, rjVar, pjVar2, bVar, cVar, f, z);
    }
}
