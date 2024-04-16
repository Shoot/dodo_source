package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Arrangement.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0013\u0011\u00149B\t\b\u0002¢\u0006\u0004\b8\u0010\u001cJ\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0010J/\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0010J/\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0010J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0010R \u0010\u001d\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001aR \u0010!\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001aR \u0010&\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010#\u0012\u0004\b%\u0010\u001c\u001a\u0004\b\u001e\u0010$R \u0010)\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010#\u0012\u0004\b(\u0010\u001c\u001a\u0004\b'\u0010$R \u0010.\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010*\u0012\u0004\b-\u0010\u001c\u001a\u0004\b+\u0010,R \u00101\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010*\u0012\u0004\b0\u0010\u001c\u001a\u0004\b/\u0010,R \u00104\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010*\u0012\u0004\b3\u0010\u001c\u001a\u0004\b2\u0010,R \u00107\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010*\u0012\u0004\b6\u0010\u001c\u001a\u0004\b5\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lzq;", "", "Li73;", "space", "Lzq$e;", "j", "(F)Lzq$e;", "", "totalSize", "", "size", "outPosition", "", "reverseInput", "", "f", "(I[I[IZ)V", com.huawei.hms.push.e.a, "([I[IZ)V", DateTokenConverter.CONVERTER_KEY, "i", Image.TYPE_HIGH, "g", "Lzq$d;", "b", "Lzq$d;", "()Lzq$d;", "getStart$annotations", "()V", "Start", com.huawei.hms.opendevice.c.a, "getEnd", "getEnd$annotations", "End", "Lzq$l;", "Lzq$l;", "()Lzq$l;", "getTop$annotations", "Top", "getBottom", "getBottom$annotations", "Bottom", "Lzq$e;", "a", "()Lzq$e;", "getCenter$annotations", "Center", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceEvenly", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceBetween", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "<init>", "l", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zq  reason: default package */
/* loaded from: classes.dex */
public final class zq {
    public static final zq a = new zq();
    private static final d b = new j();
    private static final d c = new c();
    private static final l d = new k();
    private static final l e = new a();
    private static final e f = new b();
    private static final e g = new h();
    private static final e h = new g();
    private static final e i = new f();

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"zq$a", "Lzq$l;", "La03;", "", "totalSize", "", "sizes", "outPositions", "", com.huawei.hms.opendevice.c.a, "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq$a */
    /* loaded from: classes.dex */
    public static final class a implements l {
        a() {
        }

        @Override // defpackage.zq.l
        public /* synthetic */ float a() {
            return br.a(this);
        }

        @Override // defpackage.zq.l
        public void c(a03 a03Var, int i, int[] iArr, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(iArr2, "outPositions");
            zq.a.f(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"zq$b", "Lzq$e;", "La03;", "", "totalSize", "", "sizes", "Lqm5;", "layoutDirection", "outPositions", "", "b", com.huawei.hms.opendevice.c.a, "", "toString", "Li73;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq$b */
    /* loaded from: classes.dex */
    public static final class b implements e {
        private final float a = i73.o(0);

        b() {
        }

        @Override // defpackage.zq.d, defpackage.zq.l
        public float a() {
            return this.a;
        }

        @Override // defpackage.zq.d
        public void b(a03 a03Var, int i, int[] iArr, qm5 qm5Var, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(qm5Var, "layoutDirection");
            z65.h(iArr2, "outPositions");
            if (qm5Var == qm5.Ltr) {
                zq.a.d(i, iArr, iArr2, false);
            } else {
                zq.a.d(i, iArr, iArr2, true);
            }
        }

        @Override // defpackage.zq.l
        public void c(a03 a03Var, int i, int[] iArr, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(iArr2, "outPositions");
            zq.a.d(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"zq$c", "Lzq$d;", "La03;", "", "totalSize", "", "sizes", "Lqm5;", "layoutDirection", "outPositions", "", "b", "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq$c */
    /* loaded from: classes.dex */
    public static final class c implements d {
        c() {
        }

        @Override // defpackage.zq.d, defpackage.zq.l
        public /* synthetic */ float a() {
            return ar.a(this);
        }

        @Override // defpackage.zq.d
        public void b(a03 a03Var, int i, int[] iArr, qm5 qm5Var, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(qm5Var, "layoutDirection");
            z65.h(iArr2, "outPositions");
            if (qm5Var == qm5.Ltr) {
                zq.a.f(i, iArr, iArr2, false);
            } else {
                zq.a.e(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&R\u001d\u0010\u000f\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lzq$d;", "", "La03;", "", "totalSize", "", "sizes", "Lqm5;", "layoutDirection", "outPositions", "", "b", "Li73;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq$d */
    /* loaded from: classes.dex */
    public interface d {
        float a();

        void b(a03 a03Var, int i, int[] iArr, qm5 qm5Var, int[] iArr2);
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lzq$e;", "Lzq$d;", "Lzq$l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq$e */
    /* loaded from: classes.dex */
    public interface e extends d, l {
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"zq$f", "Lzq$e;", "La03;", "", "totalSize", "", "sizes", "Lqm5;", "layoutDirection", "outPositions", "", "b", com.huawei.hms.opendevice.c.a, "", "toString", "Li73;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq$f */
    /* loaded from: classes.dex */
    public static final class f implements e {
        private final float a = i73.o(0);

        f() {
        }

        @Override // defpackage.zq.d, defpackage.zq.l
        public float a() {
            return this.a;
        }

        @Override // defpackage.zq.d
        public void b(a03 a03Var, int i, int[] iArr, qm5 qm5Var, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(qm5Var, "layoutDirection");
            z65.h(iArr2, "outPositions");
            if (qm5Var == qm5.Ltr) {
                zq.a.g(i, iArr, iArr2, false);
            } else {
                zq.a.g(i, iArr, iArr2, true);
            }
        }

        @Override // defpackage.zq.l
        public void c(a03 a03Var, int i, int[] iArr, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(iArr2, "outPositions");
            zq.a.g(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"zq$g", "Lzq$e;", "La03;", "", "totalSize", "", "sizes", "Lqm5;", "layoutDirection", "outPositions", "", "b", com.huawei.hms.opendevice.c.a, "", "toString", "Li73;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq$g */
    /* loaded from: classes.dex */
    public static final class g implements e {
        private final float a = i73.o(0);

        g() {
        }

        @Override // defpackage.zq.d, defpackage.zq.l
        public float a() {
            return this.a;
        }

        @Override // defpackage.zq.d
        public void b(a03 a03Var, int i, int[] iArr, qm5 qm5Var, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(qm5Var, "layoutDirection");
            z65.h(iArr2, "outPositions");
            if (qm5Var == qm5.Ltr) {
                zq.a.h(i, iArr, iArr2, false);
            } else {
                zq.a.h(i, iArr, iArr2, true);
            }
        }

        @Override // defpackage.zq.l
        public void c(a03 a03Var, int i, int[] iArr, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(iArr2, "outPositions");
            zq.a.h(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"zq$h", "Lzq$e;", "La03;", "", "totalSize", "", "sizes", "Lqm5;", "layoutDirection", "outPositions", "", "b", com.huawei.hms.opendevice.c.a, "", "toString", "Li73;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq$h */
    /* loaded from: classes.dex */
    public static final class h implements e {
        private final float a = i73.o(0);

        h() {
        }

        @Override // defpackage.zq.d, defpackage.zq.l
        public float a() {
            return this.a;
        }

        @Override // defpackage.zq.d
        public void b(a03 a03Var, int i, int[] iArr, qm5 qm5Var, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(qm5Var, "layoutDirection");
            z65.h(iArr2, "outPositions");
            if (qm5Var == qm5.Ltr) {
                zq.a.i(i, iArr, iArr2, false);
            } else {
                zq.a.i(i, iArr, iArr2, true);
            }
        }

        @Override // defpackage.zq.l
        public void c(a03 a03Var, int i, int[] iArr, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(iArr2, "outPositions");
            zq.a.i(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\u001a\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001eø\u0001\u0000¢\u0006\u0004\b%\u0010&J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R \u0010\u0019\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR+\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R#\u0010$\u001a\u00020\u00148\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Lzq$i;", "Lzq$e;", "La03;", "", "totalSize", "", "sizes", "Lqm5;", "layoutDirection", "outPositions", "", "b", com.huawei.hms.opendevice.c.a, "", "toString", "hashCode", "", "other", "", "equals", "Li73;", "a", "F", "getSpace-D9Ej5fM", "()F", "space", "Z", "getRtlMirror", "()Z", "rtlMirror", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "getAlignment", "()Lkotlin/jvm/functions/Function2;", "alignment", DateTokenConverter.CONVERTER_KEY, "spacing", "<init>", "(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq$i */
    /* loaded from: classes.dex */
    public static final class i implements e {
        private final float a;
        private final boolean b;
        private final Function2<Integer, qm5, Integer> c;
        private final float d;

        public /* synthetic */ i(float f, boolean z, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, z, function2);
        }

        @Override // defpackage.zq.d, defpackage.zq.l
        public float a() {
            return this.d;
        }

        @Override // defpackage.zq.d
        public void b(a03 a03Var, int i, int[] iArr, qm5 qm5Var, int[] iArr2) {
            boolean z;
            int i2;
            int i3;
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(qm5Var, "layoutDirection");
            z65.h(iArr2, "outPositions");
            if (iArr.length == 0) {
                return;
            }
            int O = a03Var.O(this.a);
            if (this.b && qm5Var == qm5.Rtl) {
                z = true;
            } else {
                z = false;
            }
            zq zqVar = zq.a;
            if (!z) {
                int length = iArr.length;
                int i4 = 0;
                i2 = 0;
                i3 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = iArr[i4];
                    int min = Math.min(i2, i - i6);
                    iArr2[i5] = min;
                    int min2 = Math.min(O, (i - min) - i6);
                    int i7 = iArr2[i5] + i6 + min2;
                    i4++;
                    i5++;
                    i3 = min2;
                    i2 = i7;
                }
            } else {
                i2 = 0;
                i3 = 0;
                for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                    int i8 = iArr[length2];
                    int min3 = Math.min(i2, i - i8);
                    iArr2[length2] = min3;
                    i3 = Math.min(O, (i - min3) - i8);
                    i2 = iArr2[length2] + i8 + i3;
                }
            }
            int i9 = i2 - i3;
            Function2<Integer, qm5, Integer> function2 = this.c;
            if (function2 != null && i9 < i) {
                int intValue = function2.invoke(Integer.valueOf(i - i9), qm5Var).intValue();
                int length3 = iArr2.length;
                for (int i10 = 0; i10 < length3; i10++) {
                    iArr2[i10] = iArr2[i10] + intValue;
                }
            }
        }

        @Override // defpackage.zq.l
        public void c(a03 a03Var, int i, int[] iArr, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(iArr2, "outPositions");
            b(a03Var, i, iArr, qm5.Ltr, iArr2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (i73.q(this.a, iVar.a) && this.b == iVar.b && z65.c(this.c, iVar.c)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int s = i73.s(this.a) * 31;
            boolean z = this.b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (s + i) * 31;
            Function2<Integer, qm5, Integer> function2 = this.c;
            if (function2 == null) {
                hashCode = 0;
            } else {
                hashCode = function2.hashCode();
            }
            return i2 + hashCode;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            if (this.b) {
                str = "";
            } else {
                str = "Absolute";
            }
            sb.append(str);
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) i73.t(this.a));
            sb.append(", ");
            sb.append(this.c);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private i(float f, boolean z, Function2<? super Integer, ? super qm5, Integer> function2) {
            this.a = f;
            this.b = z;
            this.c = function2;
            this.d = f;
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"zq$j", "Lzq$d;", "La03;", "", "totalSize", "", "sizes", "Lqm5;", "layoutDirection", "outPositions", "", "b", "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq$j */
    /* loaded from: classes.dex */
    public static final class j implements d {
        j() {
        }

        @Override // defpackage.zq.d, defpackage.zq.l
        public /* synthetic */ float a() {
            return ar.a(this);
        }

        @Override // defpackage.zq.d
        public void b(a03 a03Var, int i, int[] iArr, qm5 qm5Var, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(qm5Var, "layoutDirection");
            z65.h(iArr2, "outPositions");
            if (qm5Var == qm5.Ltr) {
                zq.a.e(iArr, iArr2, false);
            } else {
                zq.a.f(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"zq$k", "Lzq$l;", "La03;", "", "totalSize", "", "sizes", "outPositions", "", com.huawei.hms.opendevice.c.a, "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq$k */
    /* loaded from: classes.dex */
    public static final class k implements l {
        k() {
        }

        @Override // defpackage.zq.l
        public /* synthetic */ float a() {
            return br.a(this);
        }

        @Override // defpackage.zq.l
        public void c(a03 a03Var, int i, int[] iArr, int[] iArr2) {
            z65.h(a03Var, "<this>");
            z65.h(iArr, "sizes");
            z65.h(iArr2, "outPositions");
            zq.a.e(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&R\u001d\u0010\r\u001a\u00020\n8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lzq$l;", "", "La03;", "", "totalSize", "", "sizes", "outPositions", "", com.huawei.hms.opendevice.c.a, "Li73;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zq$l */
    /* loaded from: classes.dex */
    public interface l {
        float a();

        void c(a03 a03Var, int i, int[] iArr, int[] iArr2);
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "Lqm5;", "layoutDirection", "a", "(ILqm5;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: zq$m */
    /* loaded from: classes.dex */
    static final class m extends ej5 implements Function2<Integer, qm5, Integer> {
        public static final m a = new m();

        m() {
            super(2);
        }

        public final Integer a(int i, qm5 qm5Var) {
            z65.h(qm5Var, "layoutDirection");
            return Integer.valueOf(gb.a.d().a(0, i, qm5Var));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, qm5 qm5Var) {
            return a(num.intValue(), qm5Var);
        }
    }

    private zq() {
    }

    public final e a() {
        return f;
    }

    public final d b() {
        return b;
    }

    public final l c() {
        return d;
    }

    public final void d(int i2, int[] iArr, int[] iArr2, boolean z) {
        int c2;
        int c3;
        z65.h(iArr, "size");
        z65.h(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                c3 = la6.c(f2);
                iArr2[i6] = c3;
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i8 = iArr[length2];
                c2 = la6.c(f2);
                iArr2[length2] = c2;
                f2 += i8;
            } else {
                return;
            }
        }
    }

    public final void e(int[] iArr, int[] iArr2, boolean z) {
        z65.h(iArr, "size");
        z65.h(iArr2, "outPosition");
        int i2 = 0;
        if (!z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i6 = iArr[length2];
                iArr2[length2] = i2;
                i2 += i6;
            } else {
                return;
            }
        }
    }

    public final void f(int i2, int[] iArr, int[] iArr2, boolean z) {
        z65.h(iArr, "size");
        z65.h(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i2 - i4;
        if (!z) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i9 = iArr[length2];
                iArr2[length2] = i6;
                i6 += i9;
            } else {
                return;
            }
        }
    }

    public final void g(int i2, int[] iArr, int[] iArr2, boolean z) {
        boolean z2;
        float f2;
        int c2;
        int c3;
        z65.h(iArr, "size");
        z65.h(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        if (iArr.length == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            f2 = (i2 - i4) / iArr.length;
        } else {
            f2 = 0.0f;
        }
        float f3 = f2 / 2;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                c3 = la6.c(f3);
                iArr2[i6] = c3;
                f3 += i7 + f2;
                i3++;
                i6++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i8 = iArr[length2];
            c2 = la6.c(f3);
            iArr2[length2] = c2;
            f3 += i8 + f2;
        }
    }

    public final void h(int i2, int[] iArr, int[] iArr2, boolean z) {
        int E;
        float f2;
        int c2;
        int c3;
        z65.h(iArr, "size");
        z65.h(iArr2, "outPosition");
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        E = yr.E(iArr);
        float max = (i2 - i4) / Math.max(E, 1);
        if (z && iArr.length == 1) {
            f2 = max;
        } else {
            f2 = 0.0f;
        }
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                c3 = la6.c(f2);
                iArr2[i6] = c3;
                f2 += i7 + max;
                i3++;
                i6++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i8 = iArr[length2];
            c2 = la6.c(f2);
            iArr2[length2] = c2;
            f2 += i8 + max;
        }
    }

    public final void i(int i2, int[] iArr, int[] iArr2, boolean z) {
        int c2;
        int c3;
        z65.h(iArr, "size");
        z65.h(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (!z) {
            int length2 = iArr.length;
            float f2 = length;
            int i6 = 0;
            while (i3 < length2) {
                int i7 = iArr[i3];
                c3 = la6.c(f2);
                iArr2[i6] = c3;
                f2 += i7 + length;
                i3++;
                i6++;
            }
            return;
        }
        float f3 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i8 = iArr[length3];
            c2 = la6.c(f3);
            iArr2[length3] = c2;
            f3 += i8 + length;
        }
    }

    public final e j(float f2) {
        return new i(f2, true, m.a, null);
    }
}
