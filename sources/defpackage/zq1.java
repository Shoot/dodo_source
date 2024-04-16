package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ad1;
import defpackage.ge9;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Connector.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\b\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0002\u0006\u0005B>\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eB$\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\u0014ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010 J8\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR \u0010\u0018\u001a\u00020\u00148\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lzq1;", "", "", "r", "g", "b", "a", "Luc1;", e.a, "(FFFF)J", "Ljd1;", "Ljd1;", "getSource", "()Ljd1;", KustoStorage.KustoTable.COLUMN_SOURCE, DateTokenConverter.CONVERTER_KEY, "destination", c.a, "transformSource", "transformDestination", "Lge9;", "I", "getRenderIntent-uksYyKA", "()I", "renderIntent", "", "f", "[F", "transform", "<init>", "(Ljd1;Ljd1;Ljd1;Ljd1;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "(Ljd1;Ljd1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zq1  reason: default package */
/* loaded from: classes.dex */
public class zq1 {
    public static final a g;
    private static final zq1 h;
    private static final zq1 i;
    private static final zq1 j;
    private final jd1 a;
    private final jd1 b;
    private final jd1 c;
    private final jd1 d;
    private final int e;
    private final float[] f;

    /* compiled from: Connector.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lzq1$a;", "", "Ljd1;", KustoStorage.KustoTable.COLUMN_SOURCE, "destination", "Lge9;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "", "b", "(Ljd1;Ljd1;I)[F", "Lzq1;", "f", "(Ljd1;)Lzq1;", "SrgbIdentity", "Lzq1;", DateTokenConverter.CONVERTER_KEY, "()Lzq1;", "SrgbToOklabPerceptual", e.a, "OklabToSrgbPerceptual", c.a, "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: Connector.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J8\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"zq1$a$a", "Lzq1;", "", "r", "g", "b", "a", "Luc1;", e.a, "(FFFF)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: zq1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0767a extends zq1 {
            C0767a(jd1 jd1Var, int i) {
                super(jd1Var, jd1Var, i, null);
            }

            @Override // defpackage.zq1
            public long e(float f, float f2, float f3, float f4) {
                return yc1.a(f, f2, f3, f4, d());
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(jd1 jd1Var, jd1 jd1Var2, int i) {
            float[] c;
            float[] c2;
            if (!ge9.e(i, ge9.a.a())) {
                return null;
            }
            long g = jd1Var.g();
            ad1.a aVar = ad1.a;
            boolean e = ad1.e(g, aVar.b());
            boolean e2 = ad1.e(jd1Var2.g(), aVar.b());
            if (e && e2) {
                return null;
            }
            if (!e && !e2) {
                return null;
            }
            if (!e) {
                jd1Var = jd1Var2;
            }
            z65.f(jd1Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            om9 om9Var = (om9) jd1Var;
            if (e) {
                c = om9Var.R().c();
            } else {
                c = au4.a.c();
            }
            if (e2) {
                c2 = om9Var.R().c();
            } else {
                c2 = au4.a.c();
            }
            return new float[]{c[0] / c2[0], c[1] / c2[1], c[2] / c2[2]};
        }

        public final zq1 c() {
            return zq1.j;
        }

        public final zq1 d() {
            return zq1.h;
        }

        public final zq1 e() {
            return zq1.i;
        }

        public final zq1 f(jd1 jd1Var) {
            z65.h(jd1Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            return new C0767a(jd1Var, ge9.a.c());
        }
    }

    /* compiled from: Connector.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B$\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ8\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0010ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lzq1$b;", "Lzq1;", "Lom9;", KustoStorage.KustoTable.COLUMN_SOURCE, "destination", "Lge9;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "", "f", "(Lom9;Lom9;I)[F", "", "r", "g", "b", "a", "Luc1;", e.a, "(FFFF)J", "k", "Lom9;", "mSource", "l", "mDestination", Image.TYPE_MEDIUM, "[F", "mTransform", "<init>", "(Lom9;Lom9;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq1$b */
    /* loaded from: classes.dex */
    public static final class b extends zq1 {
        private final om9 k;
        private final om9 l;
        private final float[] m;

        public /* synthetic */ b(om9 om9Var, om9 om9Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(om9Var, om9Var2, i);
        }

        private final float[] f(om9 om9Var, om9 om9Var2, int i) {
            if (kd1.f(om9Var.R(), om9Var2.R())) {
                return kd1.k(om9Var2.K(), om9Var.Q());
            }
            float[] Q = om9Var.Q();
            float[] K = om9Var2.K();
            float[] c = om9Var.R().c();
            float[] c2 = om9Var2.R().c();
            n4c R = om9Var.R();
            au4 au4Var = au4.a;
            if (!kd1.f(R, au4Var.b())) {
                float[] b = i6.b.a().b();
                float[] c3 = au4Var.c();
                float[] copyOf = Arrays.copyOf(c3, c3.length);
                z65.g(copyOf, "copyOf(this, size)");
                Q = kd1.k(kd1.e(b, c, copyOf), om9Var.Q());
            }
            if (!kd1.f(om9Var2.R(), au4Var.b())) {
                float[] b2 = i6.b.a().b();
                float[] c4 = au4Var.c();
                float[] copyOf2 = Arrays.copyOf(c4, c4.length);
                z65.g(copyOf2, "copyOf(this, size)");
                K = kd1.j(kd1.k(kd1.e(b2, c2, copyOf2), om9Var2.Q()));
            }
            if (ge9.e(i, ge9.a.a())) {
                Q = kd1.l(new float[]{c[0] / c2[0], c[1] / c2[1], c[2] / c2[2]}, Q);
            }
            return kd1.k(K, Q);
        }

        @Override // defpackage.zq1
        public long e(float f, float f2, float f3, float f4) {
            float a = (float) this.k.I().a(f);
            float a2 = (float) this.k.I().a(f2);
            float a3 = (float) this.k.I().a(f3);
            return yc1.a((float) this.l.M().a(kd1.n(this.m, a, a2, a3)), (float) this.l.M().a(kd1.o(this.m, a, a2, a3)), (float) this.l.M().a(kd1.p(this.m, a, a2, a3)), f4, this.l);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private b(om9 om9Var, om9 om9Var2, int i) {
            super(om9Var, om9Var2, om9Var, om9Var2, i, null, null);
            z65.h(om9Var, "mSource");
            z65.h(om9Var2, "mDestination");
            this.k = om9Var;
            this.l = om9Var2;
            this.m = f(om9Var, om9Var2, i);
        }
    }

    static {
        a aVar = new a(null);
        g = aVar;
        lf1 lf1Var = lf1.a;
        h = aVar.f(lf1Var.w());
        om9 w = lf1Var.w();
        jd1 t = lf1Var.t();
        ge9.a aVar2 = ge9.a;
        i = new zq1(w, t, aVar2.b(), null);
        j = new zq1(lf1Var.t(), lf1Var.w(), aVar2.b(), null);
    }

    public /* synthetic */ zq1(jd1 jd1Var, jd1 jd1Var2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jd1Var, jd1Var2, i2);
    }

    public final jd1 d() {
        return this.b;
    }

    public long e(float f, float f2, float f3, float f4) {
        long j2 = this.c.j(f, f2, f3);
        gz3 gz3Var = gz3.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        float m = this.c.m(f, f2, f3);
        float[] fArr = this.f;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            m *= fArr[2];
        }
        float f5 = intBitsToFloat2;
        float f6 = intBitsToFloat;
        return this.d.n(f6, f5, m, f4, this.b);
    }

    public /* synthetic */ zq1(jd1 jd1Var, jd1 jd1Var2, jd1 jd1Var3, jd1 jd1Var4, int i2, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jd1Var, jd1Var2, jd1Var3, jd1Var4, i2, fArr);
    }

    private zq1(jd1 jd1Var, jd1 jd1Var2, jd1 jd1Var3, jd1 jd1Var4, int i2, float[] fArr) {
        z65.h(jd1Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(jd1Var2, "destination");
        z65.h(jd1Var3, "transformSource");
        z65.h(jd1Var4, "transformDestination");
        this.a = jd1Var;
        this.b = jd1Var2;
        this.c = jd1Var3;
        this.d = jd1Var4;
        this.e = i2;
        this.f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zq1(defpackage.jd1 r13, defpackage.jd1 r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = "source"
            defpackage.z65.h(r13, r0)
            java.lang.String r0 = "destination"
            defpackage.z65.h(r14, r0)
            long r0 = r13.g()
            ad1$a r2 = defpackage.ad1.a
            long r3 = r2.b()
            boolean r0 = defpackage.ad1.e(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L28
            au4 r0 = defpackage.au4.a
            n4c r0 = r0.b()
            jd1 r0 = defpackage.kd1.d(r13, r0, r3, r1, r3)
            r7 = r0
            goto L29
        L28:
            r7 = r13
        L29:
            long r4 = r14.g()
            long r8 = r2.b()
            boolean r0 = defpackage.ad1.e(r4, r8)
            if (r0 == 0) goto L43
            au4 r0 = defpackage.au4.a
            n4c r0 = r0.b()
            jd1 r0 = defpackage.kd1.d(r14, r0, r3, r1, r3)
            r8 = r0
            goto L44
        L43:
            r8 = r14
        L44:
            zq1$a r0 = defpackage.zq1.g
            float[] r10 = defpackage.zq1.a.a(r0, r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq1.<init>(jd1, jd1, int):void");
    }
}
