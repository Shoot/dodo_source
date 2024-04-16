package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Options.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\f\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0019B!\b\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002R\"\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lzb7;", "Ln1;", "Llk0;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "u", "", "b", "[Llk0;", "x", "()[Llk0;", "byteStrings", "", c.a, "[I", "E", "()[I", "trie", DateTokenConverter.CONVERTER_KEY, "()I", "size", "<init>", "([Llk0;[I)V", "a", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: zb7  reason: default package */
/* loaded from: classes3.dex */
public final class zb7 extends n1<lk0> implements RandomAccess {
    public static final a d = new a(null);
    private final lk0[] b;
    private final int[] c;

    /* compiled from: Options.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0010\"\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u00020\u0002*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lzb7$a;", "", "", "nodeOffset", "Lyg0;", "node", "", "byteStringOffset", "", "Llk0;", "byteStrings", "fromIndex", "toIndex", "indexes", "", "a", "", "Lzb7;", DateTokenConverter.CONVERTER_KEY, "([Llk0;)Lzb7;", c.a, "(Lyg0;)J", "intCount", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zb7$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j, yg0 yg0Var, int i, List<? extends lk0> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            yg0 yg0Var2;
            int i8 = i;
            if (i2 < i3) {
                for (int i9 = i2; i9 < i3; i9++) {
                    if (list.get(i9).n0() < i8) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                lk0 lk0Var = list.get(i2);
                lk0 lk0Var2 = list.get(i3 - 1);
                if (i8 == lk0Var.n0()) {
                    int i10 = i2 + 1;
                    i4 = i10;
                    i5 = list2.get(i2).intValue();
                    lk0Var = list.get(i10);
                } else {
                    i4 = i2;
                    i5 = -1;
                }
                if (lk0Var.s(i8) != lk0Var2.s(i8)) {
                    int i11 = 1;
                    for (int i12 = i4 + 1; i12 < i3; i12++) {
                        if (list.get(i12 - 1).s(i8) != list.get(i12).s(i8)) {
                            i11++;
                        }
                    }
                    long c = j + c(yg0Var) + 2 + (i11 * 2);
                    yg0Var.J(i11);
                    yg0Var.J(i5);
                    for (int i13 = i4; i13 < i3; i13++) {
                        byte s = list.get(i13).s(i8);
                        if (i13 == i4 || s != list.get(i13 - 1).s(i8)) {
                            yg0Var.J(s & 255);
                        }
                    }
                    yg0 yg0Var3 = new yg0();
                    while (i4 < i3) {
                        byte s2 = list.get(i4).s(i8);
                        int i14 = i4 + 1;
                        int i15 = i14;
                        while (true) {
                            if (i15 < i3) {
                                if (s2 != list.get(i15).s(i8)) {
                                    i6 = i15;
                                    break;
                                }
                                i15++;
                            } else {
                                i6 = i3;
                                break;
                            }
                        }
                        if (i14 == i6 && i8 + 1 == list.get(i4).n0()) {
                            yg0Var.J(list2.get(i4).intValue());
                            i7 = i6;
                            yg0Var2 = yg0Var3;
                        } else {
                            yg0Var.J(((int) (c + c(yg0Var3))) * (-1));
                            i7 = i6;
                            yg0Var2 = yg0Var3;
                            a(c, yg0Var3, i8 + 1, list, i4, i6, list2);
                        }
                        yg0Var3 = yg0Var2;
                        i4 = i7;
                    }
                    yg0Var.a1(yg0Var3);
                    return;
                }
                int min = Math.min(lk0Var.n0(), lk0Var2.n0());
                int i16 = 0;
                for (int i17 = i8; i17 < min && lk0Var.s(i17) == lk0Var2.s(i17); i17++) {
                    i16++;
                }
                long c2 = j + c(yg0Var) + 2 + i16 + 1;
                yg0Var.J(-i16);
                yg0Var.J(i5);
                int i18 = i16 + i8;
                while (i8 < i18) {
                    yg0Var.J(lk0Var.s(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i18 == list.get(i4).n0()) {
                        yg0Var.J(list2.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                yg0 yg0Var4 = new yg0();
                yg0Var.J(((int) (c(yg0Var4) + c2)) * (-1));
                a(c2, yg0Var4, i18, list, i4, i3, list2);
                yg0Var.a1(yg0Var4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        static /* synthetic */ void b(a aVar, long j, yg0 yg0Var, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            long j2;
            int i5;
            int i6;
            int i7;
            if ((i4 & 1) != 0) {
                j2 = 0;
            } else {
                j2 = j;
            }
            if ((i4 & 4) != 0) {
                i5 = 0;
            } else {
                i5 = i;
            }
            if ((i4 & 16) != 0) {
                i6 = 0;
            } else {
                i6 = i2;
            }
            if ((i4 & 32) != 0) {
                i7 = list.size();
            } else {
                i7 = i3;
            }
            aVar.a(j2, yg0Var, i5, list, i6, i7, list2);
        }

        private final long c(yg0 yg0Var) {
            return yg0Var.P() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final defpackage.zb7 d(defpackage.lk0... r17) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zb7.a.d(lk0[]):zb7");
        }
    }

    public /* synthetic */ zb7(lk0[] lk0VarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(lk0VarArr, iArr);
    }

    public static final zb7 P(lk0... lk0VarArr) {
        return d.d(lk0VarArr);
    }

    public final int[] E() {
        return this.c;
    }

    public /* bridge */ int G(lk0 lk0Var) {
        return super.indexOf(lk0Var);
    }

    public /* bridge */ int H(lk0 lk0Var) {
        return super.lastIndexOf(lk0Var);
    }

    @Override // defpackage.c1, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof lk0)) {
            return false;
        }
        return k((lk0) obj);
    }

    @Override // defpackage.c1
    public int d() {
        return this.b.length;
    }

    @Override // defpackage.n1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof lk0)) {
            return -1;
        }
        return G((lk0) obj);
    }

    public /* bridge */ boolean k(lk0 lk0Var) {
        return super.contains(lk0Var);
    }

    @Override // defpackage.n1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof lk0)) {
            return -1;
        }
        return H((lk0) obj);
    }

    @Override // defpackage.n1, java.util.List
    /* renamed from: u */
    public lk0 get(int i) {
        return this.b[i];
    }

    public final lk0[] x() {
        return this.b;
    }

    private zb7(lk0[] lk0VarArr, int[] iArr) {
        this.b = lk0VarArr;
        this.c = iArr;
    }
}
