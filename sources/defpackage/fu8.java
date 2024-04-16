package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: QRCodeSetup.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010/J0\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J \u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J=\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\b2\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0017\u001a\u00020\u00142\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u00112\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00142\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u00112\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0018J-\u0010\u001a\u001a\u00020\u00142\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u00112\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0018J=\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u00112\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00022\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00022\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u0011¢\u0006\u0004\b!\u0010\u001fJ;\u0010&\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00022\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u0011¢\u0006\u0004\b&\u0010'J3\u0010(\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u0011¢\u0006\u0004\b(\u0010)J;\u0010,\u001a\u00020\u00142\u0006\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00022\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u0011¢\u0006\u0004\b,\u0010-¨\u00060"}, d2 = {"Lfu8;", "", "", "row", "rowOffset", "col", "colOffset", "modulesSize", "", c.a, "probeSize", "f", DateTokenConverter.CONVERTER_KEY, e.a, "Leu8;", "b", "value", "", "Lgu8;", "modules", "", "g", "(IIZ[[Lgu8;)V", Image.TYPE_MEDIUM, "([[Lgu8;I)V", "o", Image.TYPE_HIGH, "k", "(II[[Lgu8;I)V", MessageAttributes.TYPE, "j", "(I[[Lgu8;)V", "moduleCount", "l", "Lgk3;", "errorCorrectionLevel", "Lf96;", "maskPattern", "q", "(Lgk3;Lf96;I[[Lgu8;)V", "r", "(II[[Lgu8;)V", "", "data", "a", "([ILf96;I[[Lgu8;)V", "<init>", "()V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: fu8  reason: default package */
/* loaded from: classes3.dex */
public final class fu8 {
    public static final fu8 a = new fu8();

    private fu8() {
    }

    private final eu8 b(int i, int i2, int i3) {
        if (i == 0) {
            if (i2 == 0) {
                return eu8.TOP_LEFT_CORNER;
            }
            if (i2 == i3 - 1) {
                return eu8.TOP_RIGHT_CORNER;
            }
            if (i2 == i3) {
                return eu8.MARGIN;
            }
            return eu8.TOP_MID;
        }
        int i4 = i3 - 1;
        if (i == i4) {
            if (i2 == 0) {
                return eu8.BOTTOM_LEFT_CORNER;
            }
            if (i2 == i4) {
                return eu8.BOTTOM_RIGHT_CORNER;
            }
            if (i2 == i3) {
                return eu8.MARGIN;
            }
            return eu8.BOTTOM_MID;
        } else if (i == i3) {
            return eu8.MARGIN;
        } else {
            if (i2 == 0) {
                return eu8.LEFT_MID;
            }
            if (i2 == i4) {
                return eu8.RIGHT_MID;
            }
            if (i2 == i3) {
                return eu8.MARGIN;
            }
            return eu8.CENTER;
        }
    }

    private final boolean c(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i + i2;
        if (i7 >= 0 && i7 < i5 && (i6 = i3 + i4) >= 0 && i6 < i5) {
            return true;
        }
        return false;
    }

    private final boolean d(int i, int i2, int i3) {
        if (i >= 0 && i < i3 && (i2 == 0 || i2 == i3 - 1)) {
            return true;
        }
        return false;
    }

    private final boolean e(int i, int i2, int i3) {
        if (2 <= i && i < i3 - 2 && 2 <= i2 && i2 <= i3 - 3) {
            return true;
        }
        return false;
    }

    private final boolean f(int i, int i2, int i3) {
        if (i2 >= 0 && i2 < i3 && (i == 0 || i == i3 - 1)) {
            return true;
        }
        return false;
    }

    private final void g(int i, int i2, boolean z, gu8[][] gu8VarArr) {
        gu8[] gu8VarArr2 = gu8VarArr[i];
        gu8 gu8Var = gu8VarArr2[i2];
        if (gu8Var != null) {
            gu8Var.c(z);
        } else {
            gu8VarArr2[i2] = new gu8(z, i, i2, gu8VarArr.length, null, 16, null);
        }
    }

    public static /* synthetic */ void i(fu8 fu8Var, gu8[][] gu8VarArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 7;
        }
        fu8Var.h(gu8VarArr, i);
    }

    public static /* synthetic */ void n(fu8 fu8Var, gu8[][] gu8VarArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 7;
        }
        fu8Var.m(gu8VarArr, i);
    }

    public static /* synthetic */ void p(fu8 fu8Var, gu8[][] gu8VarArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 7;
        }
        fu8Var.o(gu8VarArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (((r17[r10] >>> r11) & 1) == 1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int[] r17, defpackage.f96 r18, int r19, defpackage.gu8[][] r20) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "data"
            defpackage.z65.h(r0, r4)
            java.lang.String r4 = "maskPattern"
            defpackage.z65.h(r1, r4)
            java.lang.String r4 = "modules"
            defpackage.z65.h(r3, r4)
            int r4 = r2 + (-1)
            r5 = -1
            r6 = 7
            r7 = 0
            r8 = r4
            r9 = -1
            r10 = 0
            r11 = 7
        L20:
            if (r4 <= 0) goto L67
            r12 = 6
            if (r4 != r12) goto L27
            int r4 = r4 + (-1)
        L27:
            r12 = 0
        L28:
            r13 = 2
            if (r12 >= r13) goto L5b
            r13 = r3[r8]
            int r14 = r4 - r12
            r13 = r13[r14]
            if (r13 != 0) goto L56
            int r13 = r0.length
            if (r10 >= r13) goto L3e
            r13 = r0[r10]
            int r13 = r13 >>> r11
            r15 = 1
            r13 = r13 & r15
            if (r13 != r15) goto L3e
            goto L3f
        L3e:
            r15 = 0
        L3f:
            mu8 r13 = defpackage.mu8.a
            boolean r13 = r13.f(r1, r8, r14)
            if (r13 == 0) goto L49
            r15 = r15 ^ 1
        L49:
            r13 = r16
            r13.g(r8, r14, r15, r3)
            int r11 = r11 + (-1)
            if (r11 != r5) goto L58
            int r10 = r10 + 1
            r11 = 7
            goto L58
        L56:
            r13 = r16
        L58:
            int r12 = r12 + 1
            goto L28
        L5b:
            r13 = r16
            int r8 = r8 + r9
            if (r8 < 0) goto L62
            if (r2 > r8) goto L27
        L62:
            int r8 = r8 - r9
            int r9 = -r9
            int r4 = r4 + (-2)
            goto L20
        L67:
            r13 = r16
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu8.a(int[], f96, int, gu8[][]):void");
    }

    public final void h(gu8[][] gu8VarArr, int i) {
        z65.h(gu8VarArr, "modules");
        k(0, gu8VarArr.length - i, gu8VarArr, i);
    }

    public final void j(int i, gu8[][] gu8VarArr) {
        boolean z;
        z65.h(gu8VarArr, "modules");
        int[] h = mu8.a.h(i);
        for (int i2 : h) {
            for (int i3 : h) {
                if (gu8VarArr[i2][i3] == null) {
                    int i4 = -2;
                    int i5 = -2;
                    while (i5 < 3) {
                        int i6 = -2;
                        while (i6 < 3) {
                            int i7 = i2 + i5;
                            gu8[] gu8VarArr2 = gu8VarArr[i7];
                            int i8 = i3 + i6;
                            if (i5 != i4 && i5 != 2 && i6 != i4 && i6 != 2 && (i5 != 0 || i6 != 0)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            gu8VarArr2[i8] = new gu8(z, i7, i8, gu8VarArr.length, new hu8(iu8.POSITION_ADJUST, eu8.UNKNOWN));
                            i6++;
                            i4 = -2;
                        }
                        i5++;
                        i4 = -2;
                    }
                }
            }
        }
    }

    public final void k(int i, int i2, gu8[][] gu8VarArr, int i3) {
        int i4;
        boolean z;
        int i5;
        z65.h(gu8VarArr, "modules");
        int length = gu8VarArr.length;
        int i6 = -1;
        if (-1 <= i3) {
            int i7 = -1;
            while (true) {
                if (i6 <= i3) {
                    int i8 = -1;
                    while (true) {
                        if (!c(i7, i, i8, i2, length)) {
                            i5 = i8;
                            i4 = i7;
                        } else {
                            if (!f(i7, i8, i3) && !d(i7, i8, i3) && !e(i7, i8, i3)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            eu8 b = b(i7, i8, i3);
                            int i9 = i7 + i;
                            int i10 = i8 + i2;
                            i5 = i8;
                            i4 = i7;
                            gu8VarArr[i9][i10] = new gu8(z, i9, i10, length, new hu8(iu8.POSITION_PROBE, b));
                        }
                        if (i5 == i3) {
                            break;
                        }
                        i8 = i5 + 1;
                        i7 = i4;
                    }
                } else {
                    i4 = i7;
                }
                if (i4 != i3) {
                    i7 = i4 + 1;
                    i6 = -1;
                } else {
                    return;
                }
            }
        }
    }

    public final void l(int i, gu8[][] gu8VarArr) {
        boolean z;
        z65.h(gu8VarArr, "modules");
        int i2 = i - 8;
        int i3 = 8;
        while (true) {
            boolean z2 = true;
            if (i3 >= i2) {
                break;
            }
            gu8[] gu8VarArr2 = gu8VarArr[i3];
            if (gu8VarArr2[6] == null) {
                if (i3 % 2 != 0) {
                    z2 = false;
                }
                gu8VarArr2[6] = new gu8(z2, i3, 6, gu8VarArr.length, new hu8(iu8.TIMING_PATTERN, eu8.UNKNOWN));
            }
            i3++;
        }
        for (int i4 = 8; i4 < i2; i4++) {
            gu8[] gu8VarArr3 = gu8VarArr[6];
            if (gu8VarArr3[i4] == null) {
                if (i4 % 2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                gu8VarArr3[i4] = new gu8(z, 6, i4, gu8VarArr.length, new hu8(iu8.TIMING_PATTERN, eu8.UNKNOWN));
            }
        }
    }

    public final void m(gu8[][] gu8VarArr, int i) {
        z65.h(gu8VarArr, "modules");
        k(0, 0, gu8VarArr, i);
    }

    public final void o(gu8[][] gu8VarArr, int i) {
        z65.h(gu8VarArr, "modules");
        k(gu8VarArr.length - i, 0, gu8VarArr, i);
    }

    public final void q(gk3 gk3Var, f96 f96Var, int i, gu8[][] gu8VarArr) {
        boolean z;
        z65.h(gk3Var, "errorCorrectionLevel");
        z65.h(f96Var, "maskPattern");
        z65.h(gu8VarArr, "modules");
        int b = mu8.a.b((gk3Var.k() << 3) | f96Var.ordinal());
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= 15) {
                break;
            }
            if (((b >> i2) & 1) != 1) {
                z2 = false;
            }
            if (i2 < 6) {
                g(i2, 8, z2, gu8VarArr);
            } else if (i2 < 8) {
                g(i2 + 1, 8, z2, gu8VarArr);
            } else {
                g((i - 15) + i2, 8, z2, gu8VarArr);
            }
            i2++;
        }
        for (int i3 = 0; i3 < 15; i3++) {
            if (((b >> i3) & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i3 < 8) {
                g(8, (i - i3) - 1, z, gu8VarArr);
            } else if (i3 < 9) {
                g(8, 15 - i3, z, gu8VarArr);
            } else {
                g(8, 14 - i3, z, gu8VarArr);
            }
        }
        g(i - 8, 8, true, gu8VarArr);
    }

    public final void r(int i, int i2, gu8[][] gu8VarArr) {
        boolean z;
        z65.h(gu8VarArr, "modules");
        int c = mu8.a.c(i);
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 >= 18) {
                break;
            }
            if (((c >> i3) & 1) != 1) {
                z2 = false;
            }
            g(i3 / 3, ((i3 % 3) + i2) - 11, z2, gu8VarArr);
            i3++;
        }
        for (int i4 = 0; i4 < 18; i4++) {
            if (((c >> i4) & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            g(((i4 % 3) + i2) - 11, i4 / 3, z, gu8VarArr);
        }
    }
}
