package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bV\u0010+R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\r\u0010\bR \u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b'\u0010\bR&\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u0012\u0004\b*\u0010+\u001a\u0004\b#\u0010\bR\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020-0\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b6\u0010\bR\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\bR \u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b3\u0010\bR\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b=\u0010\bR#\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00030\u00028\u0006¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b@\u0010\bR\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020?0\u00028\u0006¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\b\u0010\u0010\bR \u0010F\u001a\b\u0012\u0004\u0012\u00020D0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bB\u0010\bR \u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b \u0010\bR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020&0\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b8\u0010\bR\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020J0\u00028\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bE\u0010\bR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\b.\u0010\bR\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\b\u0014\u0010\bR)\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020R0Q0\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"Leba;", "", "Liba;", "", "", "b", "Liba;", com.huawei.hms.opendevice.c.a, "()Liba;", "ContentDescription", "t", "StateDescription", "Lbp8;", DateTokenConverter.CONVERTER_KEY, "p", "ProgressBarRangeInfo", com.huawei.hms.push.e.a, "n", "PaneTitle", "", "f", "r", "SelectableGroup", "Lzb1;", "g", "a", "CollectionInfo", "Lbc1;", Image.TYPE_HIGH, "CollectionItemInfo", "i", "Heading", "j", "Disabled", "Lrr5;", "k", Image.TYPE_MEDIUM, "LiveRegion", "", "l", "Focused", "IsTraversalGroup", "getInvisibleToUser$annotations", "()V", "InvisibleToUser", "", "o", "y", "TraversalIndex", "Lnx9;", "HorizontalScrollAxisRange", "q", "z", "VerticalScrollAxisRange", "getIsPopup", "IsPopup", Image.TYPE_SMALL, "getIsDialog", "IsDialog", "Lgn9;", "Role", "u", "TestTag", "Lml;", "v", "Text", "w", "EditableText", "Ljcb;", "x", "TextSelectionRange", "Lqw4;", "ImeAction", "Selected", "Ldib;", "A", "ToggleableState", "B", "Password", "C", "Error", "Lkotlin/Function1;", "", "D", "getIndexForKey", "IndexForKey", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: eba  reason: default package */
/* loaded from: classes.dex */
public final class eba {
    public static final eba a = new eba();
    private static final iba<List<String>> b = new iba<>("ContentDescription", a.a);
    private static final iba<String> c = new iba<>("StateDescription", null, 2, null);
    private static final iba<bp8> d = new iba<>("ProgressBarRangeInfo", null, 2, null);
    private static final iba<String> e = new iba<>("PaneTitle", e.a);
    private static final iba<Unit> f = new iba<>("SelectableGroup", null, 2, null);
    private static final iba<zb1> g = new iba<>("CollectionInfo", null, 2, null);
    private static final iba<bc1> h = new iba<>("CollectionItemInfo", null, 2, null);
    private static final iba<Unit> i = new iba<>("Heading", null, 2, null);
    private static final iba<Unit> j = new iba<>("Disabled", null, 2, null);
    private static final iba<rr5> k = new iba<>("LiveRegion", null, 2, null);
    private static final iba<Boolean> l = new iba<>("Focused", null, 2, null);
    private static final iba<Boolean> m = new iba<>("IsTraversalGroup", null, 2, null);
    private static final iba<Unit> n = new iba<>("InvisibleToUser", b.a);
    private static final iba<Float> o = new iba<>("TraversalIndex", i.a);
    private static final iba<nx9> p = new iba<>("HorizontalScrollAxisRange", null, 2, null);
    private static final iba<nx9> q = new iba<>("VerticalScrollAxisRange", null, 2, null);
    private static final iba<Unit> r = new iba<>("IsPopup", d.a);
    private static final iba<Unit> s = new iba<>("IsDialog", c.a);
    private static final iba<gn9> t = new iba<>("Role", f.a);
    private static final iba<String> u = new iba<>("TestTag", g.a);
    private static final iba<List<ml>> v = new iba<>("Text", h.a);
    private static final iba<ml> w = new iba<>("EditableText", null, 2, null);
    private static final iba<jcb> x = new iba<>("TextSelectionRange", null, 2, null);
    private static final iba<qw4> y = new iba<>("ImeAction", null, 2, null);
    private static final iba<Boolean> z = new iba<>("Selected", null, 2, null);
    private static final iba<dib> A = new iba<>("ToggleableState", null, 2, null);
    private static final iba<Unit> B = new iba<>("Password", null, 2, null);
    private static final iba<String> C = new iba<>("Error", null, 2, null);
    private static final iba<Function1<Object, Integer>> D = new iba<>("IndexForKey", null, 2, null);

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "parentValue", "childValue", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: eba$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function2<List<? extends String>, List<? extends String>, List<? extends String>> {
        public static final a a = new a();

        a() {
            super(2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
            r2 = defpackage.sc1.I0(r2);
         */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<java.lang.String> invoke(java.util.List<java.lang.String> r2, java.util.List<java.lang.String> r3) {
            /*
                r1 = this;
                java.lang.String r0 = "childValue"
                defpackage.z65.h(r3, r0)
                if (r2 == 0) goto L15
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.List r2 = defpackage.ic1.I0(r2)
                if (r2 == 0) goto L15
                java.util.Collection r3 = (java.util.Collection) r3
                r2.addAll(r3)
                r3 = r2
            L15:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.eba.a.invoke(java.util.List, java.util.List):java.util.List");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: eba$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function2<Unit, Unit, Unit> {
        public static final b a = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Unit invoke(Unit unit, Unit unit2) {
            z65.h(unit2, "<anonymous parameter 1>");
            return unit;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: eba$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function2<Unit, Unit, Unit> {
        public static final c a = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Unit invoke(Unit unit, Unit unit2) {
            z65.h(unit2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: eba$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function2<Unit, Unit, Unit> {
        public static final d a = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Unit invoke(Unit unit, Unit unit2) {
            z65.h(unit2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: eba$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function2<String, String, String> {
        public static final e a = new e();

        e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final String invoke(String str, String str2) {
            z65.h(str2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: eba$g */
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function2<String, String, String> {
        public static final g a = new g();

        g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final String invoke(String str, String str2) {
            z65.h(str2, "<anonymous parameter 1>");
            return str;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lml;", "parentValue", "childValue", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: eba$h */
    /* loaded from: classes.dex */
    static final class h extends ej5 implements Function2<List<? extends ml>, List<? extends ml>, List<? extends ml>> {
        public static final h a = new h();

        h() {
            super(2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
            r2 = defpackage.sc1.I0(r2);
         */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<defpackage.ml> invoke(java.util.List<defpackage.ml> r2, java.util.List<defpackage.ml> r3) {
            /*
                r1 = this;
                java.lang.String r0 = "childValue"
                defpackage.z65.h(r3, r0)
                if (r2 == 0) goto L15
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.List r2 = defpackage.ic1.I0(r2)
                if (r2 == 0) goto L15
                java.util.Collection r3 = (java.util.Collection) r3
                r2.addAll(r3)
                r3 = r2
            L15:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.eba.h.invoke(java.util.List, java.util.List):java.util.List");
        }
    }

    private eba() {
    }

    public final iba<zb1> a() {
        return g;
    }

    public final iba<bc1> b() {
        return h;
    }

    public final iba<List<String>> c() {
        return b;
    }

    public final iba<Unit> d() {
        return j;
    }

    public final iba<ml> e() {
        return w;
    }

    public final iba<String> f() {
        return C;
    }

    public final iba<Boolean> g() {
        return l;
    }

    public final iba<Unit> h() {
        return i;
    }

    public final iba<nx9> i() {
        return p;
    }

    public final iba<qw4> j() {
        return y;
    }

    public final iba<Unit> k() {
        return n;
    }

    public final iba<Boolean> l() {
        return m;
    }

    public final iba<rr5> m() {
        return k;
    }

    public final iba<String> n() {
        return e;
    }

    public final iba<Unit> o() {
        return B;
    }

    public final iba<bp8> p() {
        return d;
    }

    public final iba<gn9> q() {
        return t;
    }

    public final iba<Unit> r() {
        return f;
    }

    public final iba<Boolean> s() {
        return z;
    }

    public final iba<String> t() {
        return c;
    }

    public final iba<String> u() {
        return u;
    }

    public final iba<List<ml>> v() {
        return v;
    }

    public final iba<jcb> w() {
        return x;
    }

    public final iba<dib> x() {
        return A;
    }

    public final iba<Float> y() {
        return o;
    }

    public final iba<nx9> z() {
        return q;
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgn9;", "parentValue", "<anonymous parameter 1>", "a", "(Lgn9;I)Lgn9;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: eba$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function2<gn9, gn9, gn9> {
        public static final f a = new f();

        f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ gn9 invoke(gn9 gn9Var, gn9 gn9Var2) {
            return a(gn9Var, gn9Var2.n());
        }

        public final gn9 a(gn9 gn9Var, int i) {
            return gn9Var;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Ljava/lang/Float;F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: eba$i */
    /* loaded from: classes.dex */
    static final class i extends ej5 implements Function2<Float, Float, Float> {
        public static final i a = new i();

        i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Float invoke(Float f, Float f2) {
            return a(f, f2.floatValue());
        }

        public final Float a(Float f, float f2) {
            return f;
        }
    }
}
