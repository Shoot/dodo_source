package defpackage;

import android.graphics.Rect;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import defpackage.em5;
import defpackage.xb5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: LottieCompositionMoshiParser.java */
/* renamed from: oz5  reason: default package */
/* loaded from: classes.dex */
public class oz5 {
    private static final xb5.a a = xb5.a.a("w", Image.TYPE_HIGH, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static xb5.a b = xb5.a.a("id", "layers", "w", Image.TYPE_HIGH, "p", "u");
    private static final xb5.a c = xb5.a.a(StatisticManager.LIST);
    private static final xb5.a d = xb5.a.a("cm", "tm", "dr");

    public static ez5 a(xb5 xb5Var) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        xb5 xb5Var2 = xb5Var;
        float e = fvb.e();
        py5<em5> py5Var = new py5<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        cra<u24> craVar = new cra<>();
        ez5 ez5Var = new ez5();
        xb5Var.c();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (xb5Var.j()) {
            switch (xb5Var2.u(a)) {
                case 0:
                    i = xb5Var.m();
                    continue;
                    xb5Var2 = xb5Var;
                case 1:
                    i2 = xb5Var.m();
                    continue;
                    xb5Var2 = xb5Var;
                case 2:
                    f = (float) xb5Var.l();
                    continue;
                    xb5Var2 = xb5Var;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) xb5Var.l()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) xb5Var.l();
                    break;
                case 5:
                    String[] split = xb5Var.o().split("\\.");
                    if (!fvb.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        ez5Var.a("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                    xb5Var2 = xb5Var;
                case 6:
                    e(xb5Var2, ez5Var, arrayList2, py5Var);
                    continue;
                    xb5Var2 = xb5Var;
                case 7:
                    b(xb5Var2, ez5Var, hashMap2, hashMap3);
                    continue;
                    xb5Var2 = xb5Var;
                case 8:
                    d(xb5Var2, hashMap4);
                    continue;
                    xb5Var2 = xb5Var;
                case 9:
                    c(xb5Var2, ez5Var, craVar);
                    continue;
                    xb5Var2 = xb5Var;
                case 10:
                    f(xb5Var2, arrayList3);
                    continue;
                    xb5Var2 = xb5Var;
                default:
                    xb5Var.x();
                    xb5Var.y();
                    continue;
                    xb5Var2 = xb5Var;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            xb5Var2 = xb5Var;
        }
        ez5Var.s(new Rect(0, 0, (int) (i * e), (int) (i2 * e)), f, f2, f3, arrayList2, py5Var, hashMap2, hashMap3, craVar, hashMap4, arrayList3);
        return ez5Var;
    }

    private static void b(xb5 xb5Var, ez5 ez5Var, Map<String, List<em5>> map, Map<String, rz5> map2) throws IOException {
        xb5Var.b();
        while (xb5Var.j()) {
            ArrayList arrayList = new ArrayList();
            py5 py5Var = new py5();
            xb5Var.c();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (xb5Var.j()) {
                int u = xb5Var.u(b);
                if (u != 0) {
                    if (u != 1) {
                        if (u != 2) {
                            if (u != 3) {
                                if (u != 4) {
                                    if (u != 5) {
                                        xb5Var.x();
                                        xb5Var.y();
                                    } else {
                                        str3 = xb5Var.o();
                                    }
                                } else {
                                    str2 = xb5Var.o();
                                }
                            } else {
                                i2 = xb5Var.m();
                            }
                        } else {
                            i = xb5Var.m();
                        }
                    } else {
                        xb5Var.b();
                        while (xb5Var.j()) {
                            em5 a2 = hm5.a(xb5Var, ez5Var);
                            py5Var.l(a2.d(), a2);
                            arrayList.add(a2);
                        }
                        xb5Var.e();
                    }
                } else {
                    str = xb5Var.o();
                }
            }
            xb5Var.i();
            if (str2 != null) {
                rz5 rz5Var = new rz5(i, i2, str, str2, str3);
                map2.put(rz5Var.d(), rz5Var);
            } else {
                map.put(str, arrayList);
            }
        }
        xb5Var.e();
    }

    private static void c(xb5 xb5Var, ez5 ez5Var, cra<u24> craVar) throws IOException {
        xb5Var.b();
        while (xb5Var.j()) {
            u24 a2 = v24.a(xb5Var, ez5Var);
            craVar.m(a2.hashCode(), a2);
        }
        xb5Var.e();
    }

    private static void d(xb5 xb5Var, Map<String, r24> map) throws IOException {
        xb5Var.c();
        while (xb5Var.j()) {
            if (xb5Var.u(c) != 0) {
                xb5Var.x();
                xb5Var.y();
            } else {
                xb5Var.b();
                while (xb5Var.j()) {
                    r24 a2 = k34.a(xb5Var);
                    map.put(a2.b(), a2);
                }
                xb5Var.e();
            }
        }
        xb5Var.i();
    }

    private static void e(xb5 xb5Var, ez5 ez5Var, List<em5> list, py5<em5> py5Var) throws IOException {
        xb5Var.b();
        int i = 0;
        while (xb5Var.j()) {
            em5 a2 = hm5.a(xb5Var, ez5Var);
            if (a2.f() == em5.a.IMAGE) {
                i++;
            }
            list.add(a2);
            py5Var.l(a2.d(), a2);
            if (i > 4) {
                ox5.c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        xb5Var.e();
    }

    private static void f(xb5 xb5Var, List<n86> list) throws IOException {
        xb5Var.b();
        while (xb5Var.j()) {
            xb5Var.c();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (xb5Var.j()) {
                int u = xb5Var.u(d);
                if (u != 0) {
                    if (u != 1) {
                        if (u != 2) {
                            xb5Var.x();
                            xb5Var.y();
                        } else {
                            f2 = (float) xb5Var.l();
                        }
                    } else {
                        f = (float) xb5Var.l();
                    }
                } else {
                    str = xb5Var.o();
                }
            }
            xb5Var.i();
            list.add(new n86(str, f, f2));
        }
        xb5Var.e();
    }
}
