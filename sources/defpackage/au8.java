package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: QRCode.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001\u0014B%\b\u0007\u0012\u0006\u0010)\u001a\u00020&\u0012\b\b\u0002\u0010,\u001a\u00020*\u0012\b\b\u0002\u0010/\u001a\u00020-¢\u0006\u0004\b<\u0010=J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\b0\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J8\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0002Jc\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\b0\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ_\u0010 \u001a\u00020\u00182\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\b0\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b \u0010!J1\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\b0\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\b\u0010'\u001a\u00020&H\u0016R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R(\u0010;\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b$\u00104\u0012\u0004\b9\u0010:\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006?"}, d2 = {"Lau8;", "", "", MessageAttributes.TYPE, "", DateTokenConverter.CONVERTER_KEY, "Lnb0;", "buffer", "", "Ls39;", "rsBlocks", com.huawei.hms.opendevice.c.a, "(Lnb0;[Ls39;)[I", "cellSize", "margin", "Lgu8;", "rawData", "b", "(II[[Lgu8;)I", "size", "a", "brightColor", "darkColor", "marginColor", "Lcu8;", "g", "qrCodeGraphics", Image.TYPE_HIGH, "(II[[Lgu8;Lcu8;III)Lcu8;", "Lkotlin/Function2;", "", "renderer", "k", "(II[[Lgu8;Lcu8;Lkotlin/jvm/functions/Function2;)Lcu8;", "Lf96;", "maskPattern", e.a, "(ILf96;)[[Lgu8;", "", "toString", "Ljava/lang/String;", "data", "Lgk3;", "Lgk3;", "errorCorrectionLevel", "Lbu8;", "Lbu8;", "dataType", "Lju8;", "Lju8;", "qrCodeData", "Ldu8;", "Ldu8;", "getQrCodeGraphicsFactory", "()Ldu8;", "setQrCodeGraphicsFactory", "(Ldu8;)V", "getQrCodeGraphicsFactory$annotations", "()V", "qrCodeGraphicsFactory", "<init>", "(Ljava/lang/String;Lgk3;Lbu8;)V", "f", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: au8  reason: default package */
/* loaded from: classes3.dex */
public final class au8 {
    public static final a f = new a(null);
    private final String a;
    private final gk3 b;
    private final bu8 c;
    private final ju8 d;
    private du8 e;

    /* compiled from: QRCode.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lau8$a;", "", "", "data", "Lgk3;", "errorCorrectionLevel", "Lbu8;", "dataType", "", "a", "DEFAULT_CELL_SIZE", "I", "DEFAULT_MARGIN", "PAD0", "PAD1", "<init>", "()V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: au8$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: QRCode.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: au8$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0056a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[bu8.values().length];
                try {
                    iArr[bu8.NUMBERS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[bu8.UPPER_ALPHA_NUM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[bu8.DEFAULT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ int b(a aVar, String str, gk3 gk3Var, bu8 bu8Var, int i, Object obj) {
            if ((i & 4) != 0) {
                bu8Var = mu8.a.d(str);
            }
            return aVar.a(str, gk3Var, bu8Var);
        }

        public final int a(String str, gk3 gk3Var, bu8 bu8Var) {
            ju8 lu8Var;
            z65.h(str, "data");
            z65.h(gk3Var, "errorCorrectionLevel");
            z65.h(bu8Var, "dataType");
            int i = C0056a.$EnumSwitchMapping$0[bu8Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        lu8Var = new yt8(str);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    lu8Var = new zt8(str);
                }
            } else {
                lu8Var = new lu8(str);
            }
            int d = lu8Var.d();
            int i2 = gk3Var.i();
            for (int i3 = 1; i3 < i2; i3++) {
                if (d <= mu8.a.g(i3, bu8Var, gk3Var)) {
                    return i3;
                }
            }
            return 40;
        }
    }

    /* compiled from: QRCode.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: au8$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[bu8.values().length];
            try {
                iArr[bu8.NUMBERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bu8.UPPER_ALPHA_NUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bu8.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QRCode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgu8;", "cellData", "Lcu8;", "graphics", "", "a", "(Lgu8;Lcu8;)V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: au8$c */
    /* loaded from: classes3.dex */
    public static final class c extends ej5 implements Function2<gu8, cu8, Unit> {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i, int i2, int i3) {
            super(2);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final void a(gu8 gu8Var, cu8 cu8Var) {
            z65.h(gu8Var, "cellData");
            z65.h(cu8Var, "graphics");
            if (gu8Var.a()) {
                cu8Var.c(this.a);
            } else if (gu8Var.b().a() != iu8.MARGIN) {
                cu8Var.c(this.b);
            } else {
                cu8Var.c(this.c);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(gu8 gu8Var, cu8 cu8Var) {
            a(gu8Var, cu8Var);
            return Unit.a;
        }
    }

    public au8(String str, gk3 gk3Var, bu8 bu8Var) {
        ju8 lu8Var;
        z65.h(str, "data");
        z65.h(gk3Var, "errorCorrectionLevel");
        z65.h(bu8Var, "dataType");
        this.a = str;
        this.b = gk3Var;
        this.c = bu8Var;
        int i = b.$EnumSwitchMapping$0[bu8Var.ordinal()];
        if (i == 1) {
            lu8Var = new lu8(str);
        } else if (i == 2) {
            lu8Var = new zt8(str);
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            lu8Var = new yt8(str);
        }
        this.d = lu8Var;
        this.e = new du8();
    }

    private final int[] c(nb0 nb0Var, s39[] s39VarArr) {
        int i;
        int length = s39VarArr.length;
        int[][] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = new int[0];
        }
        int length2 = s39VarArr.length;
        int[][] iArr2 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr2[i3] = new int[0];
        }
        int length3 = s39VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i4 < length3) {
            s39 s39Var = s39VarArr[i4];
            int i10 = i7 + 1;
            int b2 = s39Var.b();
            int c2 = s39Var.c() - b2;
            i5 += s39Var.c();
            i6 = i.e(i6, b2);
            i8 = i.e(i8, c2);
            int[] iArr3 = new int[b2];
            for (int i11 = 0; i11 < b2; i11++) {
                iArr3[i11] = nb0Var.b()[i11 + i9] & 255;
            }
            iArr[i7] = iArr3;
            i9 += b2;
            ue8 e = mu8.a.e(c2);
            ue8 d = new ue8(iArr[i7], e.c() - 1).d(e);
            int c3 = e.c() - 1;
            int[] iArr4 = new int[c3];
            for (int i12 = 0; i12 < c3; i12++) {
                int c4 = (d.c() + i12) - c3;
                if (c4 >= 0) {
                    i = d.b(c4);
                } else {
                    i = 0;
                }
                iArr4[i12] = i;
            }
            iArr2[i7] = iArr4;
            i4++;
            i7 = i10;
        }
        int[] iArr5 = new int[i5];
        int i13 = 0;
        for (int i14 = 0; i14 < i6; i14++) {
            int length4 = s39VarArr.length;
            for (int i15 = 0; i15 < length4; i15++) {
                int[] iArr6 = iArr[i15];
                if (i14 < iArr6.length) {
                    iArr5[i13] = iArr6[i14];
                    i13++;
                }
            }
        }
        for (int i16 = 0; i16 < i8; i16++) {
            int length5 = s39VarArr.length;
            for (int i17 = 0; i17 < length5; i17++) {
                int[] iArr7 = iArr2[i17];
                if (i16 < iArr7.length) {
                    iArr5[i13] = iArr7[i16];
                    i13++;
                }
            }
        }
        return iArr5;
    }

    private final int[] d(int i) {
        s39[] a2 = s39.c.a(i, this.b);
        nb0 nb0Var = new nb0();
        nb0Var.d(this.d.b().i(), 4);
        nb0Var.d(this.d.d(), this.d.c(i));
        this.d.e(nb0Var);
        int i2 = 0;
        for (s39 s39Var : a2) {
            i2 += s39Var.b();
        }
        int i3 = i2 * 8;
        if (nb0Var.c() <= i3) {
            if (nb0Var.c() + 4 <= i3) {
                nb0Var.d(0, 4);
            }
            while (nb0Var.c() % 8 != 0) {
                nb0Var.e(false);
            }
            while (nb0Var.c() < i3) {
                nb0Var.d(236, 8);
                if (nb0Var.c() >= i3) {
                    break;
                }
                nb0Var.d(17, 8);
            }
            return c(nb0Var, a2);
        }
        throw new IllegalArgumentException("Code length overflow (" + nb0Var.c() + " > " + i3 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public static /* synthetic */ gu8[][] f(au8 au8Var, int i, f96 f96Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = a.b(f, au8Var.a, au8Var.b, null, 4, null);
        }
        if ((i2 & 2) != 0) {
            f96Var = f96.PATTERN000;
        }
        return au8Var.e(i, f96Var);
    }

    public static /* synthetic */ cu8 i(au8 au8Var, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        int i7;
        int i8;
        int i9;
        if ((i6 & 1) != 0) {
            i = 25;
        }
        if ((i6 & 2) != 0) {
            i7 = 0;
        } else {
            i7 = i2;
        }
        int i10 = -1;
        if ((i6 & 4) != 0) {
            i8 = -1;
        } else {
            i8 = i3;
        }
        if ((i6 & 8) != 0) {
            i9 = -16777216;
        } else {
            i9 = i4;
        }
        if ((i6 & 16) == 0) {
            i10 = i5;
        }
        return au8Var.g(i, i7, i8, i9, i10);
    }

    public static /* synthetic */ cu8 j(au8 au8Var, int i, int i2, gu8[][] gu8VarArr, cu8 cu8Var, int i3, int i4, int i5, int i6, Object obj) {
        int i7;
        int i8;
        int i9;
        int i10;
        if ((i6 & 1) != 0) {
            i = 25;
        }
        if ((i6 & 2) != 0) {
            i7 = 0;
        } else {
            i7 = i2;
        }
        if ((i6 & 4) != 0) {
            gu8VarArr = f(au8Var, 0, null, 3, null);
        }
        gu8[][] gu8VarArr2 = gu8VarArr;
        if ((i6 & 8) != 0) {
            cu8Var = au8Var.e.b(au8Var.b(i, i7, gu8VarArr2));
        }
        cu8 cu8Var2 = cu8Var;
        if ((i6 & 16) != 0) {
            i8 = -1;
        } else {
            i8 = i3;
        }
        if ((i6 & 32) != 0) {
            i9 = -16777216;
        } else {
            i9 = i4;
        }
        if ((i6 & 64) != 0) {
            i10 = -1;
        } else {
            i10 = i5;
        }
        return au8Var.h(i, i7, gu8VarArr2, cu8Var2, i8, i9, i10);
    }

    public final int a(int i, int i2, int i3) {
        return (i3 * i) + (i2 * 2);
    }

    public final int b(int i, int i2, gu8[][] gu8VarArr) {
        z65.h(gu8VarArr, "rawData");
        return a(i, i2, gu8VarArr.length);
    }

    public final gu8[][] e(int i, f96 f96Var) {
        z65.h(f96Var, "maskPattern");
        int i2 = (i * 4) + 17;
        gu8[][] gu8VarArr = new gu8[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            gu8[] gu8VarArr2 = new gu8[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                gu8VarArr2[i4] = null;
            }
            gu8VarArr[i3] = gu8VarArr2;
        }
        fu8 fu8Var = fu8.a;
        fu8.n(fu8Var, gu8VarArr, 0, 2, null);
        fu8.p(fu8Var, gu8VarArr, 0, 2, null);
        fu8.i(fu8Var, gu8VarArr, 0, 2, null);
        fu8Var.j(i, gu8VarArr);
        fu8Var.l(i2, gu8VarArr);
        fu8Var.q(this.b, f96Var, i2, gu8VarArr);
        if (i >= 7) {
            fu8Var.r(i, i2, gu8VarArr);
        }
        fu8Var.a(d(i), f96Var, i2, gu8VarArr);
        return gu8VarArr;
    }

    public final cu8 g(int i, int i2, int i3, int i4, int i5) {
        return j(this, i, i2, f(this, 0, null, 3, null), null, i3, i4, i5, 8, null);
    }

    public final cu8 h(int i, int i2, gu8[][] gu8VarArr, cu8 cu8Var, int i3, int i4, int i5) {
        z65.h(gu8VarArr, "rawData");
        z65.h(cu8Var, "qrCodeGraphics");
        return k(i, i2, gu8VarArr, cu8Var, new c(i4, i3, i5));
    }

    public final cu8 k(int i, int i2, gu8[][] gu8VarArr, cu8 cu8Var, Function2<? super gu8, ? super cu8, Unit> function2) {
        z65.h(gu8VarArr, "rawData");
        z65.h(cu8Var, "qrCodeGraphics");
        z65.h(function2, "renderer");
        if (i2 > 0) {
            function2.invoke(new gu8(false, 0, 0, gu8VarArr.length, hu8.c.a()), cu8Var);
        }
        int length = gu8VarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            gu8[] gu8VarArr2 = gu8VarArr[i3];
            int i5 = i4 + 1;
            int length2 = gu8VarArr2.length;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2) {
                gu8 gu8Var = gu8VarArr2[i6];
                int i8 = i7 + 1;
                if (gu8Var != null) {
                    cu8 b2 = this.e.b(i);
                    function2.invoke(gu8Var, b2);
                    cu8Var.b(b2, i2 + (i7 * i), i2 + (i * i4));
                }
                i6++;
                i7 = i8;
            }
            i3++;
            i4 = i5;
        }
        return cu8Var;
    }

    public String toString() {
        return "QRCode(data=" + this.a + ", errorCorrectionLevel=" + this.b + ", dataType=" + this.c + ", qrCodeData=" + bc9.b(this.d.getClass()).d() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ au8(String str, gk3 gk3Var, bu8 bu8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? gk3.M : gk3Var, (i & 4) != 0 ? mu8.a.d(str) : bu8Var);
    }
}
