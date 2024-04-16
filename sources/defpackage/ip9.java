package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gb8;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.i;
/* compiled from: RowColumnMeasurementHelper.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001Bt\u0012\u0006\u0010&\u001a\u00020\"\u0012*\u0010,\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0'\u0012\u0006\u00101\u001a\u00020-\u0012\u0006\u00106\u001a\u000202\u0012\u0006\u0010;\u001a\u000207\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020=0<\u0012\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0Bø\u0001\u0001¢\u0006\u0004\bK\u0010LJ(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J2\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\n\u0010\u0013\u001a\u00020\u0002*\u00020\nJ\n\u0010\u0014\u001a\u00020\u0002*\u00020\nJ3\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fR\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b$\u0010%R;\u0010,\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0'8\u0006¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b*\u0010+R \u00101\u001a\u00020-8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0017\u00106\u001a\u0002028\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105R\u0017\u0010;\u001a\u0002078\u0006¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\b9\u0010:R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020=0<8\u0006¢\u0006\f\n\u0004\b!\u0010>\u001a\u0004\b?\u0010@R\u001f\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006M"}, d2 = {"Lip9;", "", "", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "Lvb6;", "measureScope", c.a, "Lgb8;", "placeable", "Ljp9;", "parentData", "crossAxisLayoutSize", "Lqm5;", "layoutDirection", "beforeCrossAxisAlignmentLine", "b", DateTokenConverter.CONVERTER_KEY, "a", "Lnr1;", "constraints", "startIndex", "endIndex", "Lhp9;", e.a, "(Lvb6;JII)Lhp9;", "Lgb8$a;", "placeableScope", "measureResult", "crossAxisOffset", "", "f", "Lkn5;", "Lkn5;", "getOrientation", "()Lkn5;", "orientation", "Lkotlin/Function5;", "La03;", "Lc94;", "getArrangement", "()Lc94;", "arrangement", "Li73;", "F", "getArrangementSpacing-D9Ej5fM", "()F", "arrangementSpacing", "Ljna;", "Ljna;", "getCrossAxisSize", "()Ljna;", "crossAxisSize", "Lv22;", "Lv22;", "getCrossAxisAlignment", "()Lv22;", "crossAxisAlignment", "", "Lmb6;", "Ljava/util/List;", "getMeasurables", "()Ljava/util/List;", "measurables", "", "g", "[Lgb8;", "getPlaceables", "()[Lgb8;", "placeables", Image.TYPE_HIGH, "[Ljp9;", "rowColumnParentData", "<init>", "(Lkn5;Lc94;FLjna;Lv22;Ljava/util/List;[Lgb8;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ip9  reason: default package */
/* loaded from: classes.dex */
public final class ip9 {
    private final kn5 a;
    private final c94<Integer, int[], qm5, a03, int[], Unit> b;
    private final float c;
    private final jna d;
    private final v22 e;
    private final List<mb6> f;
    private final gb8[] g;
    private final jp9[] h;

    public /* synthetic */ ip9(kn5 kn5Var, c94 c94Var, float f, jna jnaVar, v22 v22Var, List list, gb8[] gb8VarArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(kn5Var, c94Var, f, jnaVar, v22Var, list, gb8VarArr);
    }

    private final int b(gb8 gb8Var, jp9 jp9Var, int i, qm5 qm5Var, int i2) {
        v22 v22Var;
        if (jp9Var == null || (v22Var = jp9Var.a()) == null) {
            v22Var = this.e;
        }
        int a = i - a(gb8Var);
        if (this.a == kn5.Horizontal) {
            qm5Var = qm5.Ltr;
        }
        return v22Var.a(a, qm5Var, gb8Var, i2);
    }

    private final int[] c(int i, int[] iArr, int[] iArr2, vb6 vb6Var) {
        this.b.f0(Integer.valueOf(i), iArr, vb6Var.getLayoutDirection(), vb6Var, iArr2);
        return iArr2;
    }

    public final int a(gb8 gb8Var) {
        z65.h(gb8Var, "<this>");
        if (this.a == kn5.Horizontal) {
            return gb8Var.e0();
        }
        return gb8Var.y0();
    }

    public final int d(gb8 gb8Var) {
        z65.h(gb8Var, "<this>");
        if (this.a == kn5.Horizontal) {
            return gb8Var.y0();
        }
        return gb8Var.e0();
    }

    public final hp9 e(vb6 vb6Var, long j, int i, int i2) {
        int i3;
        int p;
        float f;
        IntRange q;
        int i4;
        int h;
        int a;
        int c;
        int i5;
        int i6;
        boolean z;
        int c2;
        int i7;
        int i8;
        int max;
        Integer num;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        z65.h(vb6Var, "measureScope");
        long c3 = dm7.c(j, this.a);
        int O = vb6Var.O(this.c);
        int i13 = i2 - i;
        float f2 = 0.0f;
        int i14 = i;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        float f3 = 0.0f;
        int i18 = 0;
        boolean z3 = false;
        while (true) {
            i3 = Integer.MAX_VALUE;
            if (i14 >= i2) {
                break;
            }
            mb6 mb6Var = this.f.get(i14);
            jp9 jp9Var = this.h[i14];
            float d = gp9.d(jp9Var);
            if (d > f2) {
                f3 += d;
                i17++;
                i11 = i14;
            } else {
                int n = nr1.n(c3);
                gb8 gb8Var = this.g[i14];
                if (gb8Var == null) {
                    if (n == Integer.MAX_VALUE) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i12 = n - i18;
                    }
                    i9 = n;
                    int i19 = i12;
                    i10 = i16;
                    i11 = i14;
                    gb8Var = mb6Var.E(dm7.f(dm7.e(c3, 0, i19, 0, 0, 8, null), this.a));
                } else {
                    i9 = n;
                    i10 = i16;
                    i11 = i14;
                }
                int min = Math.min(O, (i9 - i18) - d(gb8Var));
                i18 += d(gb8Var) + min;
                int max2 = Math.max(i10, a(gb8Var));
                if (!z3 && !gp9.e(jp9Var)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.g[i11] = gb8Var;
                i15 = min;
                i16 = max2;
                z3 = z2;
            }
            i14 = i11 + 1;
            f2 = 0.0f;
        }
        int i20 = i16;
        if (i17 == 0) {
            i18 -= i15;
            i4 = i20;
            h = 0;
        } else {
            int i21 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            if (i21 > 0 && nr1.n(c3) != Integer.MAX_VALUE) {
                p = nr1.n(c3);
            } else {
                p = nr1.p(c3);
            }
            int i22 = O * (i17 - 1);
            int i23 = (p - i18) - i22;
            if (i21 > 0) {
                f = i23 / f3;
            } else {
                f = 0.0f;
            }
            q = i.q(i, i2);
            Iterator<Integer> it = q.iterator();
            int i24 = 0;
            while (it.hasNext()) {
                c2 = la6.c(gp9.d(this.h[((q55) it).b()]) * f);
                i24 += c2;
            }
            int i25 = i23 - i24;
            int i26 = i;
            i4 = i20;
            int i27 = 0;
            while (i26 < i2) {
                if (this.g[i26] == null) {
                    mb6 mb6Var2 = this.f.get(i26);
                    jp9 jp9Var2 = this.h[i26];
                    float d2 = gp9.d(jp9Var2);
                    if (d2 > 0.0f) {
                        a = la6.a(i25);
                        int i28 = i25 - a;
                        c = la6.c(d2 * f);
                        int max3 = Math.max(0, c + a);
                        if (gp9.b(jp9Var2) && max3 != i3) {
                            i5 = i28;
                            i6 = max3;
                        } else {
                            i5 = i28;
                            i6 = 0;
                        }
                        gb8 E = mb6Var2.E(dm7.f(dm7.a(i6, max3, 0, nr1.m(c3)), this.a));
                        i27 += d(E);
                        int max4 = Math.max(i4, a(E));
                        if (!z3 && !gp9.e(jp9Var2)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        this.g[i26] = E;
                        i25 = i5;
                        i4 = max4;
                        z3 = z;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                }
                i26++;
                i3 = Integer.MAX_VALUE;
            }
            h = i.h(i27 + i22, nr1.n(c3) - i18);
        }
        if (z3) {
            int i29 = 0;
            int i30 = 0;
            for (int i31 = i; i31 < i2; i31++) {
                gb8 gb8Var2 = this.g[i31];
                z65.e(gb8Var2);
                v22 a2 = gp9.a(this.h[i31]);
                if (a2 != null) {
                    num = a2.b(gb8Var2);
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    i29 = Math.max(i29, intValue);
                    int a3 = a(gb8Var2);
                    int intValue2 = num.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = a(gb8Var2);
                    }
                    i30 = Math.max(i30, a3 - intValue2);
                }
            }
            int i32 = i30;
            i8 = i29;
            i7 = i32;
        } else {
            i7 = 0;
            i8 = 0;
        }
        int max5 = Math.max(i18 + h, nr1.p(c3));
        if (nr1.m(c3) != Integer.MAX_VALUE && this.d == jna.Expand) {
            max = nr1.m(c3);
        } else {
            max = Math.max(i4, Math.max(nr1.o(c3), i7 + i8));
        }
        int[] iArr = new int[i13];
        for (int i33 = 0; i33 < i13; i33++) {
            iArr[i33] = 0;
        }
        int[] iArr2 = new int[i13];
        for (int i34 = 0; i34 < i13; i34++) {
            gb8 gb8Var3 = this.g[i34 + i];
            z65.e(gb8Var3);
            iArr2[i34] = d(gb8Var3);
        }
        return new hp9(max, max5, i, i2, i8, c(max5, iArr2, iArr, vb6Var));
    }

    public final void f(gb8.a aVar, hp9 hp9Var, int i, qm5 qm5Var) {
        jp9 jp9Var;
        z65.h(aVar, "placeableScope");
        z65.h(hp9Var, "measureResult");
        z65.h(qm5Var, "layoutDirection");
        int c = hp9Var.c();
        for (int f = hp9Var.f(); f < c; f++) {
            gb8 gb8Var = this.g[f];
            z65.e(gb8Var);
            int[] d = hp9Var.d();
            Object r = this.f.get(f).r();
            if (r instanceof jp9) {
                jp9Var = (jp9) r;
            } else {
                jp9Var = null;
            }
            int b = b(gb8Var, jp9Var, hp9Var.b(), qm5Var, hp9Var.a()) + i;
            if (this.a == kn5.Horizontal) {
                gb8.a.n(aVar, gb8Var, d[f - hp9Var.f()], b, 0.0f, 4, null);
            } else {
                gb8.a.n(aVar, gb8Var, b, d[f - hp9Var.f()], 0.0f, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ip9(kn5 kn5Var, c94<? super Integer, ? super int[], ? super qm5, ? super a03, ? super int[], Unit> c94Var, float f, jna jnaVar, v22 v22Var, List<? extends mb6> list, gb8[] gb8VarArr) {
        z65.h(kn5Var, "orientation");
        z65.h(c94Var, "arrangement");
        z65.h(jnaVar, "crossAxisSize");
        z65.h(v22Var, "crossAxisAlignment");
        z65.h(list, "measurables");
        z65.h(gb8VarArr, "placeables");
        this.a = kn5Var;
        this.b = c94Var;
        this.c = f;
        this.d = jnaVar;
        this.e = v22Var;
        this.f = list;
        this.g = gb8VarArr;
        int size = list.size();
        jp9[] jp9VarArr = new jp9[size];
        for (int i = 0; i < size; i++) {
            jp9VarArr[i] = gp9.c(this.f.get(i));
        }
        this.h = jp9VarArr;
    }
}
