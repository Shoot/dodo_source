package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.em5;
import defpackage.xb5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: LayerParser.java */
/* renamed from: hm5  reason: default package */
/* loaded from: classes.dex */
public class hm5 {
    private static final xb5.a a = xb5.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", Image.TYPE_HIGH, "ip", "op", "tm", "cl", "hd");
    private static final xb5.a b = xb5.a.a(DateTokenConverter.CONVERTER_KEY, "a");
    private static final xb5.a c = xb5.a.a("ty", "nm");

    /* compiled from: LayerParser.java */
    /* renamed from: hm5$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[em5.b.values().length];
            a = iArr;
            try {
                iArr[em5.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[em5.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static em5 a(xb5 xb5Var, ez5 ez5Var) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        em5.b bVar = em5.b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        xb5Var.c();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        em5.b bVar2 = bVar;
        String str = "UNSET";
        em5.a aVar = null;
        String str2 = null;
        bk bkVar = null;
        yj yjVar = null;
        zj zjVar = null;
        pj pjVar = null;
        ae0 ae0Var = null;
        e93 e93Var = null;
        long j = 0;
        long j2 = -1;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f2 = 1.0f;
        float f3 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        float f4 = 0.0f;
        String str3 = null;
        while (xb5Var.j()) {
            switch (xb5Var.u(a)) {
                case 0:
                    str = xb5Var.o();
                    break;
                case 1:
                    j = xb5Var.m();
                    break;
                case 2:
                    str2 = xb5Var.o();
                    break;
                case 3:
                    int m = xb5Var.m();
                    aVar = em5.a.UNKNOWN;
                    if (m >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = em5.a.values()[m];
                        break;
                    }
                case 4:
                    j2 = xb5Var.m();
                    break;
                case 5:
                    i = (int) (xb5Var.m() * fvb.e());
                    break;
                case 6:
                    i2 = (int) (xb5Var.m() * fvb.e());
                    break;
                case 7:
                    i3 = Color.parseColor(xb5Var.o());
                    break;
                case 8:
                    bkVar = ck.g(xb5Var, ez5Var);
                    break;
                case 9:
                    int m2 = xb5Var.m();
                    if (m2 >= em5.b.values().length) {
                        ez5Var.a("Unsupported matte type: " + m2);
                        break;
                    } else {
                        bVar2 = em5.b.values()[m2];
                        int i6 = a.a[bVar2.ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                ez5Var.a("Unsupported matte type: Luma Inverted");
                            }
                        } else {
                            ez5Var.a("Unsupported matte type: Luma");
                        }
                        ez5Var.r(1);
                        break;
                    }
                case 10:
                    xb5Var.b();
                    while (xb5Var.j()) {
                        arrayList3.add(e96.a(xb5Var, ez5Var));
                    }
                    ez5Var.r(arrayList3.size());
                    xb5Var.e();
                    break;
                case 11:
                    xb5Var.b();
                    while (xb5Var.j()) {
                        xt1 a2 = yt1.a(xb5Var, ez5Var);
                        if (a2 != null) {
                            arrayList4.add(a2);
                        }
                    }
                    xb5Var.e();
                    break;
                case 12:
                    xb5Var.c();
                    while (xb5Var.j()) {
                        int u = xb5Var.u(b);
                        if (u != 0) {
                            if (u != 1) {
                                xb5Var.x();
                                xb5Var.y();
                            } else {
                                xb5Var.b();
                                if (xb5Var.j()) {
                                    zjVar = ak.a(xb5Var, ez5Var);
                                }
                                while (xb5Var.j()) {
                                    xb5Var.y();
                                }
                                xb5Var.e();
                            }
                        } else {
                            yjVar = ek.d(xb5Var, ez5Var);
                        }
                    }
                    xb5Var.i();
                    break;
                case 13:
                    xb5Var.b();
                    ArrayList arrayList5 = new ArrayList();
                    while (xb5Var.j()) {
                        xb5Var.c();
                        while (xb5Var.j()) {
                            int u2 = xb5Var.u(c);
                            if (u2 != 0) {
                                if (u2 != 1) {
                                    xb5Var.x();
                                    xb5Var.y();
                                } else {
                                    arrayList5.add(xb5Var.o());
                                }
                            } else {
                                int m3 = xb5Var.m();
                                if (m3 == 29) {
                                    ae0Var = be0.b(xb5Var, ez5Var);
                                } else if (m3 == 25) {
                                    e93Var = new f93().b(xb5Var, ez5Var);
                                }
                            }
                        }
                        xb5Var.i();
                    }
                    xb5Var.e();
                    ez5Var.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f2 = (float) xb5Var.l();
                    break;
                case 15:
                    f3 = (float) xb5Var.l();
                    break;
                case 16:
                    i4 = (int) (xb5Var.m() * fvb.e());
                    break;
                case 17:
                    i5 = (int) (xb5Var.m() * fvb.e());
                    break;
                case 18:
                    f = (float) xb5Var.l();
                    break;
                case 19:
                    f4 = (float) xb5Var.l();
                    break;
                case 20:
                    pjVar = ek.f(xb5Var, ez5Var, false);
                    break;
                case 21:
                    str3 = xb5Var.o();
                    break;
                case 22:
                    z = xb5Var.k();
                    break;
                default:
                    xb5Var.x();
                    xb5Var.y();
                    break;
            }
        }
        xb5Var.i();
        ArrayList arrayList6 = new ArrayList();
        if (f > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new lg5(ez5Var, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f)));
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f4 <= 0.0f) {
            f4 = ez5Var.f();
        }
        arrayList2.add(new lg5(ez5Var, valueOf, valueOf, null, f, Float.valueOf(f4)));
        arrayList2.add(new lg5(ez5Var, valueOf2, valueOf2, null, f4, Float.valueOf(Float.MAX_VALUE)));
        if (str.endsWith(".ai") || "ai".equals(str3)) {
            ez5Var.a("Convert your Illustrator layers to shape layers.");
        }
        return new em5(arrayList4, ez5Var, str, j, aVar, j2, str2, arrayList, bkVar, i, i2, i3, f2, f3, i4, i5, yjVar, zjVar, arrayList2, bVar2, pjVar, z, ae0Var, e93Var);
    }

    public static em5 b(ez5 ez5Var) {
        Rect b2 = ez5Var.b();
        return new em5(Collections.emptyList(), ez5Var, "__container", -1L, em5.a.PRE_COMP, -1L, null, Collections.emptyList(), new bk(), 0, 0, 0, 0.0f, 0.0f, b2.width(), b2.height(), null, null, Collections.emptyList(), em5.b.NONE, null, false, null, null);
    }
}
