package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.q24;
import defpackage.w24;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: CompositionLocals.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\"\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"(\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\r8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0011\"&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\r8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u0011\"\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011\"\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\r8\u0006¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\r8\u0006¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b'\u0010\u0011\"&\u0010-\u001a\b\u0012\u0004\u0012\u00020)0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u000f\u0012\u0004\b,\u0010\u0017\u001a\u0004\b+\u0010\u0011\"\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020.0\r8\u0006¢\u0006\f\n\u0004\b/\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011\"\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002010\r8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b2\u0010\u0011\"\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002040\r8\u0006¢\u0006\f\n\u0004\b5\u0010\u000f\u001a\u0004\b#\u0010\u0011\"\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002070\r8\u0006¢\u0006\f\n\u0004\b8\u0010\u000f\u001a\u0004\b&\u0010\u0011\"\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\r8\u0006¢\u0006\f\n\u0004\b;\u0010\u000f\u001a\u0004\b<\u0010\u0011\"&\u0010B\u001a\b\u0012\u0004\u0012\u00020>0\r8GX\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010\u000f\u0012\u0004\bA\u0010\u0017\u001a\u0004\b@\u0010\u0011\"\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020C0\r8\u0006¢\u0006\f\n\u0004\bD\u0010\u000f\u001a\u0004\bE\u0010\u0011\"\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\bG\u0010\u000f\u001a\u0004\bH\u0010\u0011\"\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020J0\r8\u0006¢\u0006\f\n\u0004\bK\u0010\u000f\u001a\u0004\b/\u0010\u0011\"\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020M0\r8\u0006¢\u0006\f\n\u0004\bN\u0010\u000f\u001a\u0004\bO\u0010\u0011\"\"\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010\u000f\u001a\u0004\b*\u0010\u0011¨\u0006T"}, d2 = {"Lum7;", "owner", "Lqtb;", "uriHandler", "Lkotlin/Function0;", "", RemoteMessageConst.Notification.CONTENT, "a", "(Lum7;Lqtb;Lkotlin/jvm/functions/Function2;Lqn1;I)V", "", Action.NAME_ATTRIBUTE, "", "i", "Lxr8;", "Lv2;", "Lxr8;", "getLocalAccessibilityManager", "()Lxr8;", "LocalAccessibilityManager", "Lo30;", "b", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "LocalAutofill", "Ll40;", com.huawei.hms.opendevice.c.a, "getLocalAutofillTree", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Lr91;", DateTokenConverter.CONVERTER_KEY, "getLocalClipboardManager", "LocalClipboardManager", "La03;", com.huawei.hms.push.e.a, "LocalDensity", "Lb24;", "f", "getLocalFocusManager", "LocalFocusManager", "Lq24$a;", "g", "getLocalFontLoader", "getLocalFontLoader$annotations", "LocalFontLoader", "Lw24$b;", Image.TYPE_HIGH, "LocalFontFamilyResolver", "Lsm4;", "getLocalHapticFeedback", "LocalHapticFeedback", "Lu35;", "j", "LocalInputModeManager", "Lqm5;", "k", "LocalLayoutDirection", "Lqbb;", "l", "getLocalTextInputService", "LocalTextInputService", "Loc8;", Image.TYPE_MEDIUM, "getLocalPlatformTextInputPluginRegistry", "getLocalPlatformTextInputPluginRegistry$annotations", "LocalPlatformTextInputPluginRegistry", "Lucb;", "n", "getLocalTextToolbar", "LocalTextToolbar", "o", "getLocalUriHandler", "LocalUriHandler", "Lxyb;", "p", "LocalViewConfiguration", "La5c;", "q", "getLocalWindowInfo", "LocalWindowInfo", "Ltd8;", "r", "LocalPointerIconService", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ro1  reason: default package */
/* loaded from: classes.dex */
public final class ro1 {
    private static final xr8<v2> a = oo1.d(a.a);
    private static final xr8<o30> b = oo1.d(b.a);
    private static final xr8<l40> c = oo1.d(c.a);
    private static final xr8<r91> d = oo1.d(d.a);
    private static final xr8<a03> e = oo1.d(e.a);
    private static final xr8<b24> f = oo1.d(f.a);
    private static final xr8<q24.a> g = oo1.d(h.a);
    private static final xr8<w24.b> h = oo1.d(g.a);
    private static final xr8<sm4> i = oo1.d(i.a);
    private static final xr8<u35> j = oo1.d(j.a);
    private static final xr8<qm5> k = oo1.d(k.a);
    private static final xr8<qbb> l = oo1.d(n.a);
    private static final xr8<oc8> m = oo1.d(l.a);
    private static final xr8<ucb> n = oo1.d(o.a);
    private static final xr8<qtb> o = oo1.d(p.a);
    private static final xr8<xyb> p = oo1.d(q.a);
    private static final xr8<a5c> q = oo1.d(r.a);
    private static final xr8<td8> r = oo1.d(m.a);

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv2;", "a", "()Lv2;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<v2> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final v2 invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo30;", "a", "()Lo30;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<o30> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final o30 invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll40;", "a", "()Ll40;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<l40> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final l40 invoke() {
            ro1.i("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lr91;", "a", "()Lr91;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<r91> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final r91 invoke() {
            ro1.i("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La03;", "a", "()La03;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function0<a03> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final a03 invoke() {
            ro1.i("LocalDensity");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb24;", "a", "()Lb24;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function0<b24> {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final b24 invoke() {
            ro1.i("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw24$b;", "a", "()Lw24$b;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$g */
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function0<w24.b> {
        public static final g a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final w24.b invoke() {
            ro1.i("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq24$a;", "a", "()Lq24$a;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$h */
    /* loaded from: classes.dex */
    static final class h extends ej5 implements Function0<q24.a> {
        public static final h a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final q24.a invoke() {
            ro1.i("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsm4;", "a", "()Lsm4;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$i */
    /* loaded from: classes.dex */
    static final class i extends ej5 implements Function0<sm4> {
        public static final i a = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final sm4 invoke() {
            ro1.i("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu35;", "a", "()Lu35;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$j */
    /* loaded from: classes.dex */
    static final class j extends ej5 implements Function0<u35> {
        public static final j a = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final u35 invoke() {
            ro1.i("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqm5;", "a", "()Lqm5;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$k */
    /* loaded from: classes.dex */
    static final class k extends ej5 implements Function0<qm5> {
        public static final k a = new k();

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final qm5 invoke() {
            ro1.i("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loc8;", "a", "()Loc8;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$l */
    /* loaded from: classes.dex */
    static final class l extends ej5 implements Function0<oc8> {
        public static final l a = new l();

        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oc8 invoke() {
            throw new IllegalStateException("No PlatformTextInputPluginRegistry provided".toString());
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltd8;", "a", "()Ltd8;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$m */
    /* loaded from: classes.dex */
    static final class m extends ej5 implements Function0<td8> {
        public static final m a = new m();

        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final td8 invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqbb;", "a", "()Lqbb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$n */
    /* loaded from: classes.dex */
    static final class n extends ej5 implements Function0<qbb> {
        public static final n a = new n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final qbb invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lucb;", "a", "()Lucb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$o */
    /* loaded from: classes.dex */
    static final class o extends ej5 implements Function0<ucb> {
        public static final o a = new o();

        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ucb invoke() {
            ro1.i("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqtb;", "a", "()Lqtb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$p */
    /* loaded from: classes.dex */
    static final class p extends ej5 implements Function0<qtb> {
        public static final p a = new p();

        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final qtb invoke() {
            ro1.i("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxyb;", "a", "()Lxyb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$q */
    /* loaded from: classes.dex */
    static final class q extends ej5 implements Function0<xyb> {
        public static final q a = new q();

        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final xyb invoke() {
            ro1.i("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La5c;", "a", "()La5c;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ro1$r */
    /* loaded from: classes.dex */
    static final class r extends ej5 implements Function0<a5c> {
        public static final r a = new r();

        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final a5c invoke() {
            ro1.i("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompositionLocals.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ro1$s */
    /* loaded from: classes.dex */
    public static final class s extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ um7 a;
        final /* synthetic */ qtb b;
        final /* synthetic */ Function2<qn1, Integer, Unit> c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(um7 um7Var, qtb qtbVar, Function2<? super qn1, ? super Integer, Unit> function2, int i) {
            super(2);
            this.a = um7Var;
            this.b = qtbVar;
            this.c = function2;
            this.d = i;
        }

        public final void a(qn1 qn1Var, int i) {
            ro1.a(this.a, this.b, this.c, qn1Var, f99.a(this.d | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public static final void a(um7 um7Var, qtb qtbVar, Function2<? super qn1, ? super Integer, Unit> function2, qn1 qn1Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        z65.h(um7Var, "owner");
        z65.h(qtbVar, "uriHandler");
        z65.h(function2, RemoteMessageConst.Notification.CONTENT);
        qn1 f2 = qn1Var.f(874662829);
        if ((i2 & 14) == 0) {
            if (f2.K(um7Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (f2.K(qtbVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 896) == 0) {
            if (f2.z(function2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) == 146 && f2.g()) {
            f2.E();
        } else {
            if (tn1.K()) {
                tn1.V(874662829, i3, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:189)");
            }
            oo1.a(new zr8[]{a.c(um7Var.getAccessibilityManager()), b.c(um7Var.getAutofill()), c.c(um7Var.getAutofillTree()), d.c(um7Var.getClipboardManager()), e.c(um7Var.getDensity()), f.c(um7Var.getFocusOwner()), g.d(um7Var.getFontLoader()), h.d(um7Var.getFontFamilyResolver()), i.c(um7Var.getHapticFeedBack()), j.c(um7Var.getInputModeManager()), k.c(um7Var.getLayoutDirection()), l.c(um7Var.getTextInputService()), m.c(um7Var.getPlatformTextInputPluginRegistry()), n.c(um7Var.getTextToolbar()), o.c(qtbVar), p.c(um7Var.getViewConfiguration()), q.c(um7Var.getWindowInfo()), r.c(um7Var.getPointerIconService())}, function2, f2, ((i3 >> 3) & 112) | 8);
            if (tn1.K()) {
                tn1.U();
            }
        }
        xw9 i7 = f2.i();
        if (i7 != null) {
            i7.a(new s(um7Var, qtbVar, function2, i2));
        }
    }

    public static final xr8<a03> c() {
        return e;
    }

    public static final xr8<w24.b> d() {
        return h;
    }

    public static final xr8<u35> e() {
        return j;
    }

    public static final xr8<qm5> f() {
        return k;
    }

    public static final xr8<td8> g() {
        return r;
    }

    public static final xr8<xyb> h() {
        return p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
