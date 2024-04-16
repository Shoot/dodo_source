package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.zr7;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PathParser.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a\u001a\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aX\u0010\f\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u001aX\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"", "Lzr7;", "Lor7;", "target", c.a, "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "", "isMoreThanHalf", "isPositiveArc", "", "cx", "cy", "e1x", "e1y", "start", "sweep", "", "[F", "getEmptyArray", "()[F", "EmptyArray", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: fs7  reason: default package */
/* loaded from: classes.dex */
public final class fs7 {
    private static final float[] a = new float[0];

    private static final void a(or7 or7Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = 4;
        int ceil = (int) Math.ceil(Math.abs((d9 * d11) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * cos;
        double d14 = d4 * sin;
        double d15 = (d13 * sin2) - (d14 * cos2);
        double d16 = d12 * sin;
        double d17 = d4 * cos;
        double d18 = (sin2 * d16) + (cos2 * d17);
        double d19 = d9 / ceil;
        double d20 = d5;
        double d21 = d8;
        double d22 = d18;
        double d23 = d15;
        int i = 0;
        double d24 = d6;
        while (i < ceil) {
            double d25 = d21 + d19;
            double sin3 = Math.sin(d25);
            double cos3 = Math.cos(d25);
            int i2 = ceil;
            double d26 = (d + ((d10 * cos) * cos3)) - (d14 * sin3);
            double d27 = d2 + (d10 * sin * cos3) + (d17 * sin3);
            double d28 = (d13 * sin3) - (d14 * cos3);
            double d29 = (sin3 * d16) + (cos3 * d17);
            double d30 = d25 - d21;
            double tan = Math.tan(d30 / 2);
            double sin4 = (Math.sin(d30) * (Math.sqrt(d11 + ((3.0d * tan) * tan)) - 1)) / 3;
            or7Var.m((float) (d20 + (d23 * sin4)), (float) (d24 + (d22 * sin4)), (float) (d26 - (sin4 * d28)), (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
            i++;
            d19 = d19;
            sin = sin;
            d20 = d26;
            d16 = d16;
            d21 = d25;
            d22 = d29;
            d11 = d11;
            d23 = d28;
            cos = cos;
            ceil = i2;
            d24 = d27;
            d10 = d3;
        }
    }

    private static final void b(or7 or7Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        boolean z3;
        double d10 = (d7 / 180) * 3.141592653589793d;
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        double d11 = ((d * cos) + (d2 * sin)) / d5;
        double d12 = (((-d) * sin) + (d2 * cos)) / d6;
        double d13 = ((d3 * cos) + (d4 * sin)) / d5;
        double d14 = (((-d3) * sin) + (d4 * cos)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = 2;
        double d18 = (d11 + d13) / d17;
        double d19 = (d12 + d14) / d17;
        double d20 = (d15 * d15) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            b(or7Var, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d15 * sqrt2;
        double d23 = sqrt2 * d16;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d12 - d9, d11 - d8);
        double atan22 = Math.atan2(d14 - d9, d13 - d8) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            if (i > 0) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d24 = d8 * d5;
        double d25 = d9 * d6;
        a(or7Var, (d24 * cos) - (d25 * sin), (d24 * sin) + (d25 * cos), d5, d6, d, d2, d10, atan2, atan22);
    }

    public static final or7 c(List<? extends zr7> list, or7 or7Var) {
        zr7 zr7Var;
        zr7 zr7Var2;
        int i;
        int i2;
        zr7 zr7Var3;
        float f;
        float f2;
        float f3;
        float f4;
        float d;
        float e;
        float d2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float c;
        List<? extends zr7> list2 = list;
        or7 or7Var2 = or7Var;
        z65.h(list2, "<this>");
        z65.h(or7Var2, "target");
        int j = or7Var.j();
        or7Var.g();
        or7Var2.f(j);
        if (list.isEmpty()) {
            zr7Var = zr7.b.c;
        } else {
            zr7Var = list2.get(0);
        }
        int size = list.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        int i3 = 0;
        while (i3 < size) {
            zr7 zr7Var4 = list2.get(i3);
            if (zr7Var4 instanceof zr7.b) {
                or7Var.close();
                or7Var2.l(f15, f16);
                zr7Var3 = zr7Var4;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else if (zr7Var4 instanceof zr7.n) {
                zr7.n nVar = (zr7.n) zr7Var4;
                f13 += nVar.c();
                f14 += nVar.d();
                or7Var2.b(nVar.c(), nVar.d());
                zr7Var3 = zr7Var4;
                f15 = f13;
                f16 = f14;
            } else {
                if (zr7Var4 instanceof zr7.f) {
                    zr7.f fVar = (zr7.f) zr7Var4;
                    float c2 = fVar.c();
                    float d3 = fVar.d();
                    or7Var2.l(fVar.c(), fVar.d());
                    f13 = c2;
                    f15 = f13;
                    f14 = d3;
                    f16 = f14;
                } else {
                    if (zr7Var4 instanceof zr7.m) {
                        zr7.m mVar = (zr7.m) zr7Var4;
                        or7Var2.n(mVar.c(), mVar.d());
                        f13 += mVar.c();
                        c = mVar.d();
                    } else if (zr7Var4 instanceof zr7.e) {
                        zr7.e eVar = (zr7.e) zr7Var4;
                        or7Var2.o(eVar.c(), eVar.d());
                        float c3 = eVar.c();
                        f14 = eVar.d();
                        f13 = c3;
                    } else if (zr7Var4 instanceof zr7.l) {
                        zr7.l lVar = (zr7.l) zr7Var4;
                        or7Var2.n(lVar.c(), f10);
                        f13 += lVar.c();
                    } else if (zr7Var4 instanceof zr7.d) {
                        zr7.d dVar = (zr7.d) zr7Var4;
                        or7Var2.o(dVar.c(), f14);
                        f13 = dVar.c();
                    } else if (zr7Var4 instanceof zr7.r) {
                        zr7.r rVar = (zr7.r) zr7Var4;
                        or7Var2.n(f10, rVar.c());
                        c = rVar.c();
                    } else if (zr7Var4 instanceof zr7.s) {
                        zr7.s sVar = (zr7.s) zr7Var4;
                        or7Var2.o(f13, sVar.c());
                        f14 = sVar.c();
                    } else {
                        if (zr7Var4 instanceof zr7.k) {
                            zr7.k kVar = (zr7.k) zr7Var4;
                            zr7Var2 = zr7Var4;
                            or7Var.c(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
                            f3 = kVar.d() + f13;
                            f4 = kVar.g() + f14;
                            f13 += kVar.e();
                            d = kVar.h();
                        } else {
                            zr7Var2 = zr7Var4;
                            if (zr7Var2 instanceof zr7.c) {
                                zr7.c cVar = (zr7.c) zr7Var2;
                                or7Var.m(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
                                f3 = cVar.d();
                                e = cVar.g();
                                d2 = cVar.e();
                                f5 = cVar.h();
                            } else if (zr7Var2 instanceof zr7.p) {
                                if (zr7Var.a()) {
                                    f9 = f14 - f12;
                                    f8 = f13 - f11;
                                } else {
                                    f8 = 0.0f;
                                    f9 = 0.0f;
                                }
                                zr7.p pVar = (zr7.p) zr7Var2;
                                or7Var.c(f8, f9, pVar.c(), pVar.e(), pVar.d(), pVar.f());
                                f3 = pVar.c() + f13;
                                f4 = pVar.e() + f14;
                                f13 += pVar.d();
                                d = pVar.f();
                            } else if (zr7Var2 instanceof zr7.h) {
                                if (zr7Var.a()) {
                                    float f17 = 2;
                                    f7 = (f17 * f14) - f12;
                                    f6 = (f13 * f17) - f11;
                                } else {
                                    f6 = f13;
                                    f7 = f14;
                                }
                                zr7.h hVar = (zr7.h) zr7Var2;
                                or7Var.m(f6, f7, hVar.c(), hVar.e(), hVar.d(), hVar.f());
                                f3 = hVar.c();
                                e = hVar.e();
                                d2 = hVar.d();
                                f5 = hVar.f();
                            } else if (zr7Var2 instanceof zr7.o) {
                                zr7.o oVar = (zr7.o) zr7Var2;
                                or7Var2.e(oVar.c(), oVar.e(), oVar.d(), oVar.f());
                                f3 = oVar.c() + f13;
                                f4 = oVar.e() + f14;
                                f13 += oVar.d();
                                d = oVar.f();
                            } else if (zr7Var2 instanceof zr7.g) {
                                zr7.g gVar = (zr7.g) zr7Var2;
                                or7Var2.d(gVar.c(), gVar.e(), gVar.d(), gVar.f());
                                f3 = gVar.c();
                                e = gVar.e();
                                d2 = gVar.d();
                                f5 = gVar.f();
                            } else if (zr7Var2 instanceof zr7.q) {
                                if (zr7Var.b()) {
                                    f = f13 - f11;
                                    f2 = f14 - f12;
                                } else {
                                    f = 0.0f;
                                    f2 = 0.0f;
                                }
                                zr7.q qVar = (zr7.q) zr7Var2;
                                or7Var2.e(f, f2, qVar.c(), qVar.d());
                                f3 = f + f13;
                                f4 = f2 + f14;
                                f13 += qVar.c();
                                d = qVar.d();
                            } else {
                                if (zr7Var2 instanceof zr7.i) {
                                    if (zr7Var.b()) {
                                        float f18 = 2;
                                        f13 = (f13 * f18) - f11;
                                        f14 = (f18 * f14) - f12;
                                    }
                                    zr7.i iVar = (zr7.i) zr7Var2;
                                    or7Var2.d(f13, f14, iVar.c(), iVar.d());
                                    float c4 = iVar.c();
                                    zr7Var3 = zr7Var2;
                                    f12 = f14;
                                    i = i3;
                                    i2 = size;
                                    f14 = iVar.d();
                                    f11 = f13;
                                    f13 = c4;
                                } else if (zr7Var2 instanceof zr7.j) {
                                    zr7.j jVar = (zr7.j) zr7Var2;
                                    float c5 = jVar.c() + f13;
                                    float d4 = jVar.d() + f14;
                                    zr7Var3 = zr7Var2;
                                    i = i3;
                                    i2 = size;
                                    b(or7Var, f13, f14, c5, d4, jVar.e(), jVar.g(), jVar.f(), jVar.h(), jVar.i());
                                    f11 = c5;
                                    f13 = f11;
                                    f15 = f15;
                                    f16 = f16;
                                    f12 = d4;
                                    f14 = f12;
                                } else {
                                    float f19 = f15;
                                    float f20 = f16;
                                    i = i3;
                                    i2 = size;
                                    if (zr7Var2 instanceof zr7.a) {
                                        zr7.a aVar = (zr7.a) zr7Var2;
                                        zr7Var3 = zr7Var2;
                                        b(or7Var, f13, f14, aVar.c(), aVar.d(), aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.i());
                                        f13 = aVar.c();
                                        f12 = aVar.d();
                                        f14 = f12;
                                        f15 = f19;
                                        f16 = f20;
                                        f11 = f13;
                                    } else {
                                        zr7Var3 = zr7Var2;
                                        f15 = f19;
                                        f16 = f20;
                                    }
                                }
                                i3 = i + 1;
                                or7Var2 = or7Var;
                                size = i2;
                                zr7Var = zr7Var3;
                                f10 = 0.0f;
                                list2 = list;
                            }
                            zr7Var3 = zr7Var2;
                            f13 = d2;
                            f14 = f5;
                            i = i3;
                            i2 = size;
                            f12 = e;
                            f11 = f3;
                            i3 = i + 1;
                            or7Var2 = or7Var;
                            size = i2;
                            zr7Var = zr7Var3;
                            f10 = 0.0f;
                            list2 = list;
                        }
                        f14 += d;
                        zr7Var3 = zr7Var2;
                        f12 = f4;
                        i = i3;
                        i2 = size;
                        f11 = f3;
                        i3 = i + 1;
                        or7Var2 = or7Var;
                        size = i2;
                        zr7Var = zr7Var3;
                        f10 = 0.0f;
                        list2 = list;
                    }
                    f14 += c;
                }
                zr7Var3 = zr7Var4;
            }
            i = i3;
            i2 = size;
            i3 = i + 1;
            or7Var2 = or7Var;
            size = i2;
            zr7Var = zr7Var3;
            f10 = 0.0f;
            list2 = list;
        }
        return or7Var;
    }
}
