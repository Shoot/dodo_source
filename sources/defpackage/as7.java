package defpackage;

import defpackage.zr7;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PathNode.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a*\u0010\t\u001a\u00020\b*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\n"}, d2 = {"", "", "Lzr7;", "nodes", "", "args", "", "count", "", "a", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: as7  reason: default package */
/* loaded from: classes.dex */
public final class as7 {
    public static final void a(char c, List<zr7> list, float[] fArr, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        z65.h(list, "nodes");
        z65.h(fArr, "args");
        if (c == 'z' || c == 'Z') {
            list.add(zr7.b.c);
            return;
        }
        int i2 = 0;
        if (c == 'm') {
            int i3 = i - 2;
            while (i2 <= i3) {
                int i4 = i2 + 1;
                zr7 nVar = new zr7.n(fArr[i2], fArr[i4]);
                if ((nVar instanceof zr7.f) && i2 > 0) {
                    nVar = new zr7.e(fArr[i2], fArr[i4]);
                } else if (i2 > 0) {
                    nVar = new zr7.m(fArr[i2], fArr[i4]);
                }
                list.add(nVar);
                i2 += 2;
            }
        } else if (c == 'M') {
            int i5 = i - 2;
            while (i2 <= i5) {
                int i6 = i2 + 1;
                zr7 fVar = new zr7.f(fArr[i2], fArr[i6]);
                if (i2 > 0) {
                    fVar = new zr7.e(fArr[i2], fArr[i6]);
                } else if ((fVar instanceof zr7.n) && i2 > 0) {
                    fVar = new zr7.m(fArr[i2], fArr[i6]);
                }
                list.add(fVar);
                i2 += 2;
            }
        } else if (c == 'l') {
            int i7 = i - 2;
            while (i2 <= i7) {
                int i8 = i2 + 1;
                zr7 mVar = new zr7.m(fArr[i2], fArr[i8]);
                if ((mVar instanceof zr7.f) && i2 > 0) {
                    mVar = new zr7.e(fArr[i2], fArr[i8]);
                } else if ((mVar instanceof zr7.n) && i2 > 0) {
                    mVar = new zr7.m(fArr[i2], fArr[i8]);
                }
                list.add(mVar);
                i2 += 2;
            }
        } else if (c == 'L') {
            int i9 = i - 2;
            while (i2 <= i9) {
                int i10 = i2 + 1;
                zr7 eVar = new zr7.e(fArr[i2], fArr[i10]);
                if ((eVar instanceof zr7.f) && i2 > 0) {
                    eVar = new zr7.e(fArr[i2], fArr[i10]);
                } else if ((eVar instanceof zr7.n) && i2 > 0) {
                    eVar = new zr7.m(fArr[i2], fArr[i10]);
                }
                list.add(eVar);
                i2 += 2;
            }
        } else if (c == 'h') {
            int i11 = i - 1;
            while (i2 <= i11) {
                zr7 lVar = new zr7.l(fArr[i2]);
                if ((lVar instanceof zr7.f) && i2 > 0) {
                    lVar = new zr7.e(fArr[i2], fArr[i2 + 1]);
                } else if ((lVar instanceof zr7.n) && i2 > 0) {
                    lVar = new zr7.m(fArr[i2], fArr[i2 + 1]);
                }
                list.add(lVar);
                i2++;
            }
        } else if (c == 'H') {
            int i12 = i - 1;
            while (i2 <= i12) {
                zr7 dVar = new zr7.d(fArr[i2]);
                if ((dVar instanceof zr7.f) && i2 > 0) {
                    dVar = new zr7.e(fArr[i2], fArr[i2 + 1]);
                } else if ((dVar instanceof zr7.n) && i2 > 0) {
                    dVar = new zr7.m(fArr[i2], fArr[i2 + 1]);
                }
                list.add(dVar);
                i2++;
            }
        } else if (c == 'v') {
            int i13 = i - 1;
            while (i2 <= i13) {
                zr7 rVar = new zr7.r(fArr[i2]);
                if ((rVar instanceof zr7.f) && i2 > 0) {
                    rVar = new zr7.e(fArr[i2], fArr[i2 + 1]);
                } else if ((rVar instanceof zr7.n) && i2 > 0) {
                    rVar = new zr7.m(fArr[i2], fArr[i2 + 1]);
                }
                list.add(rVar);
                i2++;
            }
        } else if (c == 'V') {
            int i14 = i - 1;
            while (i2 <= i14) {
                zr7 sVar = new zr7.s(fArr[i2]);
                if ((sVar instanceof zr7.f) && i2 > 0) {
                    sVar = new zr7.e(fArr[i2], fArr[i2 + 1]);
                } else if ((sVar instanceof zr7.n) && i2 > 0) {
                    sVar = new zr7.m(fArr[i2], fArr[i2 + 1]);
                }
                list.add(sVar);
                i2++;
            }
        } else if (c == 'c') {
            int i15 = i - 6;
            while (i2 <= i15) {
                int i16 = i2 + 1;
                zr7 kVar = new zr7.k(fArr[i2], fArr[i16], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]);
                if ((kVar instanceof zr7.f) && i2 > 0) {
                    kVar = new zr7.e(fArr[i2], fArr[i16]);
                } else if ((kVar instanceof zr7.n) && i2 > 0) {
                    kVar = new zr7.m(fArr[i2], fArr[i16]);
                }
                list.add(kVar);
                i2 += 6;
            }
        } else if (c == 'C') {
            int i17 = i - 6;
            while (i2 <= i17) {
                int i18 = i2 + 1;
                zr7 cVar = new zr7.c(fArr[i2], fArr[i18], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]);
                if ((cVar instanceof zr7.f) && i2 > 0) {
                    cVar = new zr7.e(fArr[i2], fArr[i18]);
                } else if ((cVar instanceof zr7.n) && i2 > 0) {
                    cVar = new zr7.m(fArr[i2], fArr[i18]);
                }
                list.add(cVar);
                i2 += 6;
            }
        } else if (c == 's') {
            int i19 = i - 4;
            while (i2 <= i19) {
                int i20 = i2 + 1;
                zr7 pVar = new zr7.p(fArr[i2], fArr[i20], fArr[i2 + 2], fArr[i2 + 3]);
                if ((pVar instanceof zr7.f) && i2 > 0) {
                    pVar = new zr7.e(fArr[i2], fArr[i20]);
                } else if ((pVar instanceof zr7.n) && i2 > 0) {
                    pVar = new zr7.m(fArr[i2], fArr[i20]);
                }
                list.add(pVar);
                i2 += 4;
            }
        } else if (c == 'S') {
            int i21 = i - 4;
            while (i2 <= i21) {
                int i22 = i2 + 1;
                zr7 hVar = new zr7.h(fArr[i2], fArr[i22], fArr[i2 + 2], fArr[i2 + 3]);
                if ((hVar instanceof zr7.f) && i2 > 0) {
                    hVar = new zr7.e(fArr[i2], fArr[i22]);
                } else if ((hVar instanceof zr7.n) && i2 > 0) {
                    hVar = new zr7.m(fArr[i2], fArr[i22]);
                }
                list.add(hVar);
                i2 += 4;
            }
        } else if (c == 'q') {
            int i23 = i - 4;
            while (i2 <= i23) {
                int i24 = i2 + 1;
                zr7 oVar = new zr7.o(fArr[i2], fArr[i24], fArr[i2 + 2], fArr[i2 + 3]);
                if ((oVar instanceof zr7.f) && i2 > 0) {
                    oVar = new zr7.e(fArr[i2], fArr[i24]);
                } else if ((oVar instanceof zr7.n) && i2 > 0) {
                    oVar = new zr7.m(fArr[i2], fArr[i24]);
                }
                list.add(oVar);
                i2 += 4;
            }
        } else if (c == 'Q') {
            int i25 = i - 4;
            while (i2 <= i25) {
                int i26 = i2 + 1;
                zr7 gVar = new zr7.g(fArr[i2], fArr[i26], fArr[i2 + 2], fArr[i2 + 3]);
                if ((gVar instanceof zr7.f) && i2 > 0) {
                    gVar = new zr7.e(fArr[i2], fArr[i26]);
                } else if ((gVar instanceof zr7.n) && i2 > 0) {
                    gVar = new zr7.m(fArr[i2], fArr[i26]);
                }
                list.add(gVar);
                i2 += 4;
            }
        } else if (c == 't') {
            int i27 = i - 2;
            while (i2 <= i27) {
                int i28 = i2 + 1;
                zr7 qVar = new zr7.q(fArr[i2], fArr[i28]);
                if ((qVar instanceof zr7.f) && i2 > 0) {
                    qVar = new zr7.e(fArr[i2], fArr[i28]);
                } else if ((qVar instanceof zr7.n) && i2 > 0) {
                    qVar = new zr7.m(fArr[i2], fArr[i28]);
                }
                list.add(qVar);
                i2 += 2;
            }
        } else if (c == 'T') {
            int i29 = i - 2;
            while (i2 <= i29) {
                int i30 = i2 + 1;
                zr7 iVar = new zr7.i(fArr[i2], fArr[i30]);
                if ((iVar instanceof zr7.f) && i2 > 0) {
                    iVar = new zr7.e(fArr[i2], fArr[i30]);
                } else if ((iVar instanceof zr7.n) && i2 > 0) {
                    iVar = new zr7.m(fArr[i2], fArr[i30]);
                }
                list.add(iVar);
                i2 += 2;
            }
        } else if (c == 'a') {
            int i31 = i - 7;
            for (int i32 = 0; i32 <= i31; i32 += 7) {
                float f = fArr[i32];
                int i33 = i32 + 1;
                float f2 = fArr[i33];
                float f3 = fArr[i32 + 2];
                if (Float.compare(fArr[i32 + 3], 0.0f) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (Float.compare(fArr[i32 + 4], 0.0f) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zr7 jVar = new zr7.j(f, f2, f3, z3, z4, fArr[i32 + 5], fArr[i32 + 6]);
                if ((jVar instanceof zr7.f) && i32 > 0) {
                    jVar = new zr7.e(fArr[i32], fArr[i33]);
                } else if ((jVar instanceof zr7.n) && i32 > 0) {
                    jVar = new zr7.m(fArr[i32], fArr[i33]);
                }
                list.add(jVar);
            }
        } else if (c == 'A') {
            int i34 = i - 7;
            for (int i35 = 0; i35 <= i34; i35 += 7) {
                float f4 = fArr[i35];
                int i36 = i35 + 1;
                float f5 = fArr[i36];
                float f6 = fArr[i35 + 2];
                if (Float.compare(fArr[i35 + 3], 0.0f) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (Float.compare(fArr[i35 + 4], 0.0f) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zr7 aVar = new zr7.a(f4, f5, f6, z, z2, fArr[i35 + 5], fArr[i35 + 6]);
                if ((aVar instanceof zr7.f) && i35 > 0) {
                    aVar = new zr7.e(fArr[i35], fArr[i36]);
                } else if ((aVar instanceof zr7.n) && i35 > 0) {
                    aVar = new zr7.m(fArr[i35], fArr[i36]);
                }
                list.add(aVar);
            }
        } else {
            throw new IllegalArgumentException("Unknown command for: " + c);
        }
    }
}
