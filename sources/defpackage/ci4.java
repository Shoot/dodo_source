package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kha;
import defpackage.xb5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: GradientStrokeParser.java */
/* renamed from: ci4  reason: default package */
/* loaded from: classes.dex */
class ci4 {
    private static final xb5.a a = xb5.a.a("nm", "g", "o", "t", Image.TYPE_SMALL, e.a, "w", "lc", "lj", "ml", "hd", DateTokenConverter.CONVERTER_KEY);
    private static final xb5.a b = xb5.a.a("p", "k");
    private static final xb5.a c = xb5.a.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ai4 a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        String str;
        qj qjVar;
        di4 di4Var;
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        di4 di4Var2 = null;
        qj qjVar2 = null;
        uj ujVar = null;
        uj ujVar2 = null;
        pj pjVar = null;
        kha.b bVar = null;
        kha.c cVar = null;
        float f = 0.0f;
        pj pjVar2 = null;
        boolean z = false;
        rj rjVar = null;
        while (xb5Var.j()) {
            switch (xb5Var.u(a)) {
                case 0:
                    str2 = xb5Var.o();
                    continue;
                case 1:
                    str = str2;
                    xb5Var.c();
                    int i = -1;
                    while (xb5Var.j()) {
                        int u = xb5Var.u(b);
                        if (u != 0) {
                            qjVar = qjVar2;
                            if (u != 1) {
                                xb5Var.x();
                                xb5Var.y();
                            } else {
                                qjVar2 = ek.g(xb5Var, ez5Var, i);
                            }
                        } else {
                            qjVar = qjVar2;
                            i = xb5Var.m();
                        }
                        qjVar2 = qjVar;
                    }
                    xb5Var.i();
                    break;
                case 2:
                    rjVar = ek.h(xb5Var, ez5Var);
                    continue;
                case 3:
                    str = str2;
                    if (xb5Var.m() == 1) {
                        di4Var = di4.LINEAR;
                    } else {
                        di4Var = di4.RADIAL;
                    }
                    di4Var2 = di4Var;
                    break;
                case 4:
                    ujVar = ek.i(xb5Var, ez5Var);
                    continue;
                case 5:
                    ujVar2 = ek.i(xb5Var, ez5Var);
                    continue;
                case 6:
                    pjVar = ek.e(xb5Var, ez5Var);
                    continue;
                case 7:
                    str = str2;
                    bVar = kha.b.values()[xb5Var.m() - 1];
                    break;
                case 8:
                    str = str2;
                    cVar = kha.c.values()[xb5Var.m() - 1];
                    break;
                case 9:
                    str = str2;
                    f = (float) xb5Var.l();
                    break;
                case 10:
                    z = xb5Var.k();
                    continue;
                case 11:
                    xb5Var.b();
                    while (xb5Var.j()) {
                        xb5Var.c();
                        String str3 = null;
                        pj pjVar3 = null;
                        while (xb5Var.j()) {
                            int u2 = xb5Var.u(c);
                            if (u2 != 0) {
                                pj pjVar4 = pjVar2;
                                if (u2 != 1) {
                                    xb5Var.x();
                                    xb5Var.y();
                                } else {
                                    pjVar3 = ek.e(xb5Var, ez5Var);
                                }
                                pjVar2 = pjVar4;
                            } else {
                                str3 = xb5Var.o();
                            }
                        }
                        pj pjVar5 = pjVar2;
                        xb5Var.i();
                        if (str3.equals("o")) {
                            pjVar2 = pjVar3;
                        } else {
                            if (str3.equals(DateTokenConverter.CONVERTER_KEY) || str3.equals("g")) {
                                ez5Var.u(true);
                                arrayList.add(pjVar3);
                            }
                            pjVar2 = pjVar5;
                        }
                    }
                    pj pjVar6 = pjVar2;
                    xb5Var.e();
                    if (arrayList.size() == 1) {
                        arrayList.add((pj) arrayList.get(0));
                    }
                    pjVar2 = pjVar6;
                    continue;
                    break;
                default:
                    xb5Var.x();
                    xb5Var.y();
                    continue;
            }
            str2 = str;
        }
        String str4 = str2;
        if (rjVar == null) {
            rjVar = new rj(Collections.singletonList(new lg5(100)));
        }
        return new ai4(str4, di4Var2, qjVar2, rjVar, ujVar, ujVar2, pjVar, bVar, cVar, f, arrayList, pjVar2, z);
    }
}
