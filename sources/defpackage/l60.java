package defpackage;

import com.huawei.hms.push.e;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: BackwardsCompatNode.kt */
@Metadata(d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\" \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\" \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lk60;", "", e.a, "l60$a", "a", "Ll60$a;", "DetachedModifierLocalReadScope", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "onDrawCacheReadsChanged", com.huawei.hms.opendevice.c.a, "updateModifierLocalConsumer", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: l60  reason: default package */
/* loaded from: classes.dex */
public final class l60 {
    private static final a a = new a();
    private static final Function1<k60, Unit> b = b.a;
    private static final Function1<k60, Unit> c = c.a;

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R$\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"l60$a", "Ldn6;", "T", "Lum6;", "E", "(Lum6;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: l60$a */
    /* loaded from: classes.dex */
    public static final class a implements dn6 {
        a() {
        }

        @Override // defpackage.dn6
        public <T> T E(um6<T> um6Var) {
            z65.h(um6Var, "<this>");
            return um6Var.a().invoke();
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk60;", "it", "", "a", "(Lk60;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: l60$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<k60, Unit> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final void a(k60 k60Var) {
            z65.h(k60Var, "it");
            k60Var.j1();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k60 k60Var) {
            a(k60Var);
            return Unit.a;
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk60;", "it", "", "a", "(Lk60;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: l60$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<k60, Unit> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final void a(k60 k60Var) {
            z65.h(k60Var, "it");
            k60Var.n1();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k60 k60Var) {
            a(k60Var);
            return Unit.a;
        }
    }

    public static final /* synthetic */ a a() {
        return a;
    }

    public static final /* synthetic */ Function1 b() {
        return b;
    }

    public static final /* synthetic */ Function1 c() {
        return c;
    }

    public static final /* synthetic */ boolean d(k60 k60Var) {
        return e(k60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(k60 k60Var) {
        sm6.c o = au2.i(k60Var).e0().o();
        z65.f(o, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((h6b) o).f1();
    }
}
