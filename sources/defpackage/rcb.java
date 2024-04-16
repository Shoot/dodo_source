package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextStyle.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 O2\u00020\u0001:\u0001;B%\b\u0000\u0012\u0006\u0010?\u001a\u00020\u0002\u0012\u0006\u0010C\u001a\u00020\u0004\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b~\u0010\u007fB\u001a\b\u0010\u0012\u0006\u0010?\u001a\u00020\u0002\u0012\u0006\u0010C\u001a\u00020\u0004¢\u0006\u0005\b~\u0010\u0080\u0001B\u008b\u0002\b\u0017\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100ø\u0001\u0001¢\u0006\u0005\b~\u0010\u0081\u0001B£\u0002\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010i\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u0010}\u001a\u0004\u0018\u00010zø\u0001\u0001¢\u0006\u0005\b~\u0010\u0082\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0014\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0007J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0093\u0002\u00102\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00101\u001a\u0004\u0018\u000100H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\u0013\u00105\u001a\u0002042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000e\u00106\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0000J\u000e\u00107\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0000J\b\u00109\u001a\u000208H\u0016J\b\u0010:\u001a\u00020\u0015H\u0016R\u001a\u0010?\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010C\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0013\u0010K\u001a\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001a\u0010\n\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010Q\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010\f\u001a\u00020\u000b8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bR\u0010MR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001a\u0010\u0017\u001a\u00020\u000b8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b]\u0010MR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u001a\u0010\u001e\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bd\u0010MR\u0013\u0010 \u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0013\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0013\u0010l\u001a\u0004\u0018\u00010i8F¢\u0006\u0006\u001a\u0004\bj\u0010kR\u001c\u0010$\u001a\u0004\u0018\u00010#8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bm\u0010nR\u001c\u0010&\u001a\u0004\u0018\u00010%8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bo\u0010pR\u001a\u0010'\u001a\u00020\u000b8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bq\u0010MR\u0013\u0010)\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0013\u0010-\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u001c\u00101\u001a\u0004\u0018\u0001008Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001c\u0010/\u001a\u0004\u0018\u00010.8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0013\u0010}\u001a\u0004\u0018\u00010z8F¢\u0006\u0006\u001a\u0004\b{\u0010|\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0083\u0001"}, d2 = {"Lrcb;", "", "Lvqa;", "K", "Ljq7;", "J", "other", "I", "H", "Luc1;", RemoteMessageConst.Notification.COLOR, "Lwcb;", "fontSize", "Lv34;", "fontWeight", "Lq34;", "fontStyle", "Lr34;", "fontSynthesis", "Lw24;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lv80;", "baselineShift", "Lgbb;", "textGeometricTransform", "Lns5;", "localeList", "background", "Lkab;", "textDecoration", "Loga;", "shadow", "Li9b;", "textAlign", "Loab;", "textDirection", "lineHeight", "Libb;", "textIndent", "Lrc8;", "platformStyle", "Lyp5;", "lineHeightStyle", "Lvp5;", "lineBreak", "Lcr4;", "hyphens", "b", "(JJLv34;Lq34;Lr34;Lw24;Ljava/lang/String;JLv80;Lgbb;Lns5;JLkab;Loga;Li9b;Loab;JLibb;Lrc8;Lyp5;Lvp5;Lcr4;)Lrcb;", "", "equals", "G", "F", "", "hashCode", "toString", "a", "Lvqa;", "y", "()Lvqa;", "spanStyle", "Ljq7;", "v", "()Ljq7;", "paragraphStyle", c.a, "Lrc8;", "w", "()Lrc8;", "Lmg0;", "g", "()Lmg0;", "brush", Image.TYPE_HIGH, "()J", "", DateTokenConverter.CONVERTER_KEY, "()F", "alpha", "l", "o", "()Lv34;", Image.TYPE_MEDIUM, "()Lq34;", "n", "()Lr34;", "j", "()Lw24;", "k", "()Ljava/lang/String;", "q", "f", "()Lv80;", "C", "()Lgbb;", "u", "()Lns5;", e.a, "A", "()Lkab;", "x", "()Loga;", "Lz73;", "i", "()Lz73;", "drawStyle", "z", "()Li9b;", "B", "()Loab;", Image.TYPE_SMALL, "D", "()Libb;", "t", "()Lyp5;", "p", "()Lcr4;", "r", "()Lvp5;", "Lecb;", "E", "()Lecb;", "textMotion", "<init>", "(Lvqa;Ljq7;Lrc8;)V", "(Lvqa;Ljq7;)V", "(JJLv34;Lq34;Lr34;Lw24;Ljava/lang/String;JLv80;Lgbb;Lns5;JLkab;Loga;Li9b;Loab;JLibb;Lrc8;Lyp5;Lvp5;Lcr4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLv34;Lq34;Lr34;Lw24;Ljava/lang/String;JLv80;Lgbb;Lns5;JLkab;Loga;Lz73;Li9b;Loab;JLibb;Lrc8;Lyp5;Lvp5;Lcr4;Lecb;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rcb  reason: default package */
/* loaded from: classes.dex */
public final class rcb {
    public static final a d = new a(null);
    private static final rcb e = new rcb(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, null, 16777215, null);
    private final vqa a;
    private final jq7 b;
    private final rc8 c;

    /* compiled from: TextStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lrcb$a;", "", "Lrcb;", "Default", "Lrcb;", "a", "()Lrcb;", "getDefault$annotations", "()V", "<init>", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: rcb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final rcb a() {
            return rcb.e;
        }
    }

    public /* synthetic */ rcb(long j, long j2, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j3, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j4, kab kabVar, oga ogaVar, z73 z73Var, i9b i9bVar, oab oabVar, long j5, ibb ibbVar, rc8 rc8Var, yp5 yp5Var, vp5 vp5Var, cr4 cr4Var, ecb ecbVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, v34Var, q34Var, r34Var, w24Var, str, j3, v80Var, gbbVar, ns5Var, j4, kabVar, ogaVar, z73Var, i9bVar, oabVar, j5, ibbVar, rc8Var, yp5Var, vp5Var, cr4Var, ecbVar);
    }

    public final kab A() {
        return this.a.s();
    }

    public final oab B() {
        return this.b.l();
    }

    public final gbb C() {
        return this.a.u();
    }

    public final ibb D() {
        return this.b.m();
    }

    public final ecb E() {
        return this.b.n();
    }

    public final boolean F(rcb rcbVar) {
        z65.h(rcbVar, "other");
        if (this != rcbVar && !this.a.w(rcbVar.a)) {
            return false;
        }
        return true;
    }

    public final boolean G(rcb rcbVar) {
        z65.h(rcbVar, "other");
        if (this != rcbVar && (!z65.c(this.b, rcbVar.b) || !this.a.v(rcbVar.a))) {
            return false;
        }
        return true;
    }

    public final rcb H(jq7 jq7Var) {
        z65.h(jq7Var, "other");
        return new rcb(K(), J().o(jq7Var));
    }

    public final rcb I(rcb rcbVar) {
        if (rcbVar != null && !z65.c(rcbVar, e)) {
            return new rcb(K().x(rcbVar.K()), J().o(rcbVar.J()));
        }
        return this;
    }

    public final jq7 J() {
        return this.b;
    }

    public final vqa K() {
        return this.a;
    }

    public final /* synthetic */ rcb b(long j, long j2, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j3, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j4, kab kabVar, oga ogaVar, i9b i9bVar, oab oabVar, long j5, ibb ibbVar, rc8 rc8Var, yp5 yp5Var, vp5 vp5Var, cr4 cr4Var) {
        cbb b;
        if (uc1.l(j, this.a.g())) {
            b = this.a.t();
        } else {
            b = cbb.a.b(j);
        }
        cbb cbbVar = b;
        if (rc8Var != null) {
            rc8Var.b();
        }
        return new rcb(new vqa(cbbVar, j2, v34Var, q34Var, r34Var, w24Var, str, j3, v80Var, gbbVar, ns5Var, j4, kabVar, ogaVar, (kc8) null, i(), (DefaultConstructorMarker) null), new jq7(i9bVar, oabVar, j5, ibbVar, rc8Var != null ? rc8Var.a() : null, yp5Var, vp5Var, cr4Var, E(), null), rc8Var);
    }

    public final float d() {
        return this.a.c();
    }

    public final long e() {
        return this.a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcb)) {
            return false;
        }
        rcb rcbVar = (rcb) obj;
        if (z65.c(this.a, rcbVar.a) && z65.c(this.b, rcbVar.b) && z65.c(this.c, rcbVar.c)) {
            return true;
        }
        return false;
    }

    public final v80 f() {
        return this.a.e();
    }

    public final mg0 g() {
        return this.a.f();
    }

    public final long h() {
        return this.a.g();
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        rc8 rc8Var = this.c;
        if (rc8Var != null) {
            i = rc8Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final z73 i() {
        return this.a.h();
    }

    public final w24 j() {
        return this.a.i();
    }

    public final String k() {
        return this.a.j();
    }

    public final long l() {
        return this.a.k();
    }

    public final q34 m() {
        return this.a.l();
    }

    public final r34 n() {
        return this.a.m();
    }

    public final v34 o() {
        return this.a.n();
    }

    public final cr4 p() {
        return this.b.c();
    }

    public final long q() {
        return this.a.o();
    }

    public final vp5 r() {
        return this.b.e();
    }

    public final long s() {
        return this.b.g();
    }

    public final yp5 t() {
        return this.b.h();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) uc1.s(h())) + ", brush=" + g() + ", alpha=" + d() + ", fontSize=" + ((Object) wcb.j(l())) + ", fontWeight=" + o() + ", fontStyle=" + m() + ", fontSynthesis=" + n() + ", fontFamily=" + j() + ", fontFeatureSettings=" + k() + ", letterSpacing=" + ((Object) wcb.j(q())) + ", baselineShift=" + f() + ", textGeometricTransform=" + C() + ", localeList=" + u() + ", background=" + ((Object) uc1.s(e())) + ", textDecoration=" + A() + ", shadow=" + x() + ", drawStyle=" + i() + ", textAlign=" + z() + ", textDirection=" + B() + ", lineHeight=" + ((Object) wcb.j(s())) + ", textIndent=" + D() + ", platformStyle=" + this.c + ", lineHeightStyle=" + t() + ", lineBreak=" + r() + ", hyphens=" + p() + ", textMotion=" + E() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final ns5 u() {
        return this.a.p();
    }

    public final jq7 v() {
        return this.b;
    }

    public final rc8 w() {
        return this.c;
    }

    public final oga x() {
        return this.a.r();
    }

    public final vqa y() {
        return this.a;
    }

    public final i9b z() {
        return this.b.j();
    }

    public /* synthetic */ rcb(long j, long j2, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j3, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j4, kab kabVar, oga ogaVar, i9b i9bVar, oab oabVar, long j5, ibb ibbVar, rc8 rc8Var, yp5 yp5Var, vp5 vp5Var, cr4 cr4Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, v34Var, q34Var, r34Var, w24Var, str, j3, v80Var, gbbVar, ns5Var, j4, kabVar, ogaVar, i9bVar, oabVar, j5, ibbVar, rc8Var, yp5Var, vp5Var, cr4Var);
    }

    public rcb(vqa vqaVar, jq7 jq7Var, rc8 rc8Var) {
        z65.h(vqaVar, "spanStyle");
        z65.h(jq7Var, "paragraphStyle");
        this.a = vqaVar;
        this.b = jq7Var;
        this.c = rc8Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rcb(defpackage.vqa r3, defpackage.jq7 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "spanStyle"
            defpackage.z65.h(r3, r0)
            java.lang.String r0 = "paragraphStyle"
            defpackage.z65.h(r4, r0)
            r3.q()
            hc8 r0 = r4.i()
            r1 = 0
            rc8 r0 = defpackage.tcb.a(r1, r0)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcb.<init>(vqa, jq7):void");
    }

    public /* synthetic */ rcb(long j, long j2, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j3, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j4, kab kabVar, oga ogaVar, i9b i9bVar, oab oabVar, long j5, ibb ibbVar, rc8 rc8Var, yp5 yp5Var, vp5 vp5Var, cr4 cr4Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? uc1.b.e() : j, (i & 2) != 0 ? wcb.b.a() : j2, (i & 4) != 0 ? null : v34Var, (i & 8) != 0 ? null : q34Var, (i & 16) != 0 ? null : r34Var, (i & 32) != 0 ? null : w24Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? wcb.b.a() : j3, (i & 256) != 0 ? null : v80Var, (i & 512) != 0 ? null : gbbVar, (i & 1024) != 0 ? null : ns5Var, (i & 2048) != 0 ? uc1.b.e() : j4, (i & 4096) != 0 ? null : kabVar, (i & 8192) != 0 ? null : ogaVar, (i & 16384) != 0 ? null : i9bVar, (i & 32768) != 0 ? null : oabVar, (i & 65536) != 0 ? wcb.b.a() : j5, (i & 131072) != 0 ? null : ibbVar, (i & 262144) != 0 ? null : rc8Var, (i & 524288) != 0 ? null : yp5Var, (i & 1048576) != 0 ? null : vp5Var, (i & 2097152) != 0 ? null : cr4Var, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private rcb(long j, long j2, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j3, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j4, kab kabVar, oga ogaVar, i9b i9bVar, oab oabVar, long j5, ibb ibbVar, rc8 rc8Var, yp5 yp5Var, vp5 vp5Var, cr4 cr4Var) {
        this(new vqa(j, j2, v34Var, q34Var, r34Var, w24Var, str, j3, v80Var, gbbVar, ns5Var, j4, kabVar, ogaVar, null, null, 32768, null), new jq7(i9bVar, oabVar, j5, ibbVar, rc8Var != null ? rc8Var.a() : null, yp5Var, vp5Var, cr4Var, null, 256, null), rc8Var);
        if (rc8Var != null) {
            rc8Var.b();
        }
    }

    public /* synthetic */ rcb(long j, long j2, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j3, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j4, kab kabVar, oga ogaVar, z73 z73Var, i9b i9bVar, oab oabVar, long j5, ibb ibbVar, rc8 rc8Var, yp5 yp5Var, vp5 vp5Var, cr4 cr4Var, ecb ecbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? uc1.b.e() : j, (i & 2) != 0 ? wcb.b.a() : j2, (i & 4) != 0 ? null : v34Var, (i & 8) != 0 ? null : q34Var, (i & 16) != 0 ? null : r34Var, (i & 32) != 0 ? null : w24Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? wcb.b.a() : j3, (i & 256) != 0 ? null : v80Var, (i & 512) != 0 ? null : gbbVar, (i & 1024) != 0 ? null : ns5Var, (i & 2048) != 0 ? uc1.b.e() : j4, (i & 4096) != 0 ? null : kabVar, (i & 8192) != 0 ? null : ogaVar, (i & 16384) != 0 ? null : z73Var, (i & 32768) != 0 ? null : i9bVar, (i & 65536) != 0 ? null : oabVar, (i & 131072) != 0 ? wcb.b.a() : j5, (i & 262144) != 0 ? null : ibbVar, (i & 524288) != 0 ? null : rc8Var, (i & 1048576) != 0 ? null : yp5Var, (i & 2097152) != 0 ? null : vp5Var, (i & 4194304) != 0 ? null : cr4Var, (i & 8388608) != 0 ? null : ecbVar, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private rcb(long j, long j2, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j3, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j4, kab kabVar, oga ogaVar, z73 z73Var, i9b i9bVar, oab oabVar, long j5, ibb ibbVar, rc8 rc8Var, yp5 yp5Var, vp5 vp5Var, cr4 cr4Var, ecb ecbVar) {
        this(new vqa(j, j2, v34Var, q34Var, r34Var, w24Var, str, j3, v80Var, gbbVar, ns5Var, j4, kabVar, ogaVar, (kc8) null, z73Var, (DefaultConstructorMarker) null), new jq7(i9bVar, oabVar, j5, ibbVar, rc8Var != null ? rc8Var.a() : null, yp5Var, vp5Var, cr4Var, ecbVar, null), rc8Var);
        if (rc8Var != null) {
            rc8Var.b();
        }
    }
}
