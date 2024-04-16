package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import defpackage.sm6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: SemanticsNode.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010$\u001a\u00020 \u0012\u0006\u0010(\u001a\u00020\n\u0012\u0006\u0010,\u001a\u00020\u0006\u0012\u0006\u00100\u001a\u00020\u0002¢\u0006\u0004\b_\u0010`J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u0004*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0002J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\r2\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0002J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0002J3\u0010\u0017\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\r2\b\b\u0002\u0010\f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010(\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010+R\u001a\u00100\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\"\u00104\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010%\u001a\u0004\b1\u0010'\"\u0004\b2\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00105R\u0017\u0010<\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010'R\u0014\u0010@\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010'R\u0011\u0010D\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010H\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010L\u001a\u00020I8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010N\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bM\u0010GR\u001a\u0010Q\u001a\u00020O8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bP\u0010KR\u0011\u0010S\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bR\u0010GR\u0014\u0010U\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010'R\u0011\u0010W\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bV\u0010/R\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00000\r8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00000\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0013\u0010^\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b]\u0010\u001f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006a"}, d2 = {"Laba;", "", "Ltaa;", "mergedConfig", "", "z", "Len5;", "", StatisticManager.LIST, DateTokenConverter.CONVERTER_KEY, "", "includeReplacedSemantics", "includeFakeNodes", "", "k", "f", "unmergedChildren", "b", "Lgn9;", "role", "Lkotlin/Function1;", "Ljba;", "properties", com.huawei.hms.opendevice.c.a, "(Lgn9;Lkotlin/jvm/functions/Function1;)Laba;", "A", "(Z)Ljava/util/List;", "Loz6;", com.huawei.hms.push.e.a, "()Loz6;", "a", "()Laba;", "Lsm6$c;", "Lsm6$c;", "getOuterSemanticsNode$ui_release", "()Lsm6$c;", "outerSemanticsNode", "Z", "getMergingEnabled", "()Z", "mergingEnabled", "Len5;", "o", "()Len5;", "layoutNode", "Ltaa;", "u", "()Ltaa;", "unmergedConfig", "v", "setFake$ui_release", "(Z)V", "isFake", "Laba;", "fakeNodeParent", "", "g", "I", Image.TYPE_MEDIUM, "()I", "id", "w", "isMergingSemanticsOfDescendants", "y", "isUnmergedLeafNode", "Ltm5;", "n", "()Ltm5;", "layoutInfo", "Lk99;", "t", "()Lk99;", "touchBoundsInRoot", "Lw55;", Image.TYPE_SMALL, "()J", "size", Image.TYPE_HIGH, "boundsInRoot", "Ls67;", "q", "positionInRoot", "i", "boundsInWindow", "x", "isTransparent", "l", "config", "j", "()Ljava/util/List;", "children", "r", "replacedChildren", "p", "parent", "<init>", "(Lsm6$c;ZLen5;Ltaa;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: aba  reason: default package */
/* loaded from: classes.dex */
public final class aba {
    private final sm6.c a;
    private final boolean b;
    private final en5 c;
    private final taa d;
    private boolean e;
    private aba f;
    private final int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljba;", "", "a", "(Ljba;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: aba$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<jba, Unit> {
        final /* synthetic */ gn9 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(gn9 gn9Var) {
            super(1);
            this.a = gn9Var;
        }

        public final void a(jba jbaVar) {
            z65.h(jbaVar, "$this$fakeSemanticsNode");
            hba.j(jbaVar, this.a.n());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(jba jbaVar) {
            a(jbaVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljba;", "", "a", "(Ljba;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: aba$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<jba, Unit> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.a = str;
        }

        public final void a(jba jbaVar) {
            z65.h(jbaVar, "$this$fakeSemanticsNode");
            hba.h(jbaVar, this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(jba jbaVar) {
            a(jbaVar);
            return Unit.a;
        }
    }

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"aba$c", "Lyaa;", "Lsm6$c;", "Ljba;", "", "U", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: aba$c */
    /* loaded from: classes.dex */
    public static final class c extends sm6.c implements yaa {
        final /* synthetic */ Function1<jba, Unit> n;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super jba, Unit> function1) {
            this.n = function1;
        }

        @Override // defpackage.yaa
        public void U(jba jbaVar) {
            z65.h(jbaVar, "<this>");
            this.n.invoke(jbaVar);
        }

        @Override // defpackage.yaa
        public /* synthetic */ boolean x() {
            return xaa.a(this);
        }

        @Override // defpackage.yaa
        public /* synthetic */ boolean y0() {
            return xaa.b(this);
        }
    }

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "it", "", "a", "(Len5;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: aba$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<en5, Boolean> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(en5 en5Var) {
            z65.h(en5Var, "it");
            taa F = en5Var.F();
            boolean z = false;
            if (F != null && F.x()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "it", "", "a", "(Len5;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: aba$e */
    /* loaded from: classes.dex */
    public static final class e extends ej5 implements Function1<en5, Boolean> {
        public static final e a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(en5 en5Var) {
            z65.h(en5Var, "it");
            taa F = en5Var.F();
            boolean z = false;
            if (F != null && F.x()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len5;", "it", "", "a", "(Len5;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: aba$f */
    /* loaded from: classes.dex */
    public static final class f extends ej5 implements Function1<en5, Boolean> {
        public static final f a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(en5 en5Var) {
            z65.h(en5Var, "it");
            return Boolean.valueOf(en5Var.e0().q(qz6.a(8)));
        }
    }

    public aba(sm6.c cVar, boolean z, en5 en5Var, taa taaVar) {
        z65.h(cVar, "outerSemanticsNode");
        z65.h(en5Var, "layoutNode");
        z65.h(taaVar, "unmergedConfig");
        this.a = cVar;
        this.b = z;
        this.c = en5Var;
        this.d = taaVar;
        this.g = en5Var.j0();
    }

    public static /* synthetic */ List B(aba abaVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return abaVar.A(z);
    }

    private final void b(List<aba> list) {
        gn9 h;
        String str;
        Object b0;
        h = bba.h(this);
        if (h != null && this.d.x() && (!list.isEmpty())) {
            list.add(c(h, new a(h)));
        }
        taa taaVar = this.d;
        eba ebaVar = eba.a;
        if (taaVar.h(ebaVar.c()) && (!list.isEmpty()) && this.d.x()) {
            List list2 = (List) uaa.a(this.d, ebaVar.c());
            if (list2 != null) {
                b0 = sc1.b0(list2);
                str = (String) b0;
            } else {
                str = null;
            }
            if (str != null) {
                list.add(0, c(null, new b(str)));
            }
        }
    }

    private final aba c(gn9 gn9Var, Function1<? super jba, Unit> function1) {
        taa taaVar = new taa();
        taaVar.B(false);
        taaVar.A(false);
        function1.invoke(taaVar);
        aba abaVar = new aba(new c(function1), false, new en5(true, gn9Var != null ? bba.i(this) : bba.e(this)), taaVar);
        abaVar.e = true;
        abaVar.f = this;
        return abaVar;
    }

    private final void d(en5 en5Var, List<aba> list) {
        gr6<en5> n0 = en5Var.n0();
        int s = n0.s();
        if (s > 0) {
            en5[] r = n0.r();
            int i = 0;
            do {
                en5 en5Var2 = r[i];
                if (en5Var2.e0().q(qz6.a(8))) {
                    list.add(bba.a(en5Var2, this.b));
                } else {
                    d(en5Var2, list);
                }
                i++;
            } while (i < s);
        }
    }

    private final List<aba> f(List<aba> list) {
        List B = B(this, false, 1, null);
        int size = B.size();
        for (int i = 0; i < size; i++) {
            aba abaVar = (aba) B.get(i);
            if (abaVar.w()) {
                list.add(abaVar);
            } else if (!abaVar.d.v()) {
                abaVar.f(list);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List g(aba abaVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return abaVar.f(list);
    }

    private final List<aba> k(boolean z, boolean z2) {
        List<aba> l;
        if (!z && this.d.v()) {
            l = kc1.l();
            return l;
        } else if (w()) {
            return g(this, null, 1, null);
        } else {
            return A(z2);
        }
    }

    private final boolean w() {
        if (this.b && this.d.x()) {
            return true;
        }
        return false;
    }

    private final void z(taa taaVar) {
        if (!this.d.v()) {
            List B = B(this, false, 1, null);
            int size = B.size();
            for (int i = 0; i < size; i++) {
                aba abaVar = (aba) B.get(i);
                if (!abaVar.w()) {
                    taaVar.z(abaVar.d);
                    abaVar.z(taaVar);
                }
            }
        }
    }

    public final List<aba> A(boolean z) {
        List<aba> l;
        if (this.e) {
            l = kc1.l();
            return l;
        }
        ArrayList arrayList = new ArrayList();
        d(this.c, arrayList);
        if (z) {
            b(arrayList);
        }
        return arrayList;
    }

    public final aba a() {
        return new aba(this.a, true, this.c, this.d);
    }

    public final oz6 e() {
        if (this.e) {
            aba p = p();
            if (p != null) {
                return p.e();
            }
            return null;
        }
        zt2 g = bba.g(this.c);
        if (g == null) {
            g = this.a;
        }
        return au2.h(g, qz6.a(8));
    }

    public final k99 h() {
        k99 b2;
        oz6 e2 = e();
        if (e2 != null) {
            if (!e2.p()) {
                e2 = null;
            }
            if (e2 != null && (b2 = pm5.b(e2)) != null) {
                return b2;
            }
        }
        return k99.e.a();
    }

    public final k99 i() {
        k99 c2;
        oz6 e2 = e();
        if (e2 != null) {
            if (!e2.p()) {
                e2 = null;
            }
            if (e2 != null && (c2 = pm5.c(e2)) != null) {
                return c2;
            }
        }
        return k99.e.a();
    }

    public final List<aba> j() {
        return k(!this.b, false);
    }

    public final taa l() {
        if (w()) {
            taa k = this.d.k();
            z(k);
            return k;
        }
        return this.d;
    }

    public final int m() {
        return this.g;
    }

    public final tm5 n() {
        return this.c;
    }

    public final en5 o() {
        return this.c;
    }

    public final aba p() {
        en5 en5Var;
        aba abaVar = this.f;
        if (abaVar != null) {
            return abaVar;
        }
        if (this.b) {
            en5Var = bba.f(this.c, e.a);
        } else {
            en5Var = null;
        }
        if (en5Var == null) {
            en5Var = bba.f(this.c, f.a);
        }
        if (en5Var == null) {
            return null;
        }
        return bba.a(en5Var, this.b);
    }

    public final long q() {
        oz6 e2 = e();
        if (e2 != null) {
            if (!e2.p()) {
                e2 = null;
            }
            if (e2 != null) {
                return pm5.e(e2);
            }
        }
        return s67.b.c();
    }

    public final List<aba> r() {
        return k(false, true);
    }

    public final long s() {
        oz6 e2 = e();
        if (e2 != null) {
            return e2.a();
        }
        return w55.b.a();
    }

    public final k99 t() {
        zt2 zt2Var;
        if (this.d.x()) {
            zt2Var = bba.g(this.c);
            if (zt2Var == null) {
                zt2Var = this.a;
            }
        } else {
            zt2Var = this.a;
        }
        return zaa.c(zt2Var.I(), zaa.a(this.d));
    }

    public final taa u() {
        return this.d;
    }

    public final boolean v() {
        return this.e;
    }

    public final boolean x() {
        oz6 e2 = e();
        if (e2 != null) {
            return e2.N1();
        }
        return false;
    }

    public final boolean y() {
        if (!this.e && r().isEmpty() && bba.f(this.c, d.a) == null) {
            return true;
        }
        return false;
    }
}
