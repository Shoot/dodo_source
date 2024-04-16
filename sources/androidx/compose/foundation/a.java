package androidx.compose.foundation;

import android.view.KeyEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B>\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0001¢\u0006\u0004\b5\u0010\u0010JI\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0004J-\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\rH\u0016J\u001d\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R!\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u00100\u001a\u00020+8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0001\u00017\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/foundation/a;", "Lfu2;", "Lfe8;", "Lhf5;", "Loq6;", "interactionSource", "", "enabled", "", "onClickLabel", "Lgn9;", "role", "Lkotlin/Function0;", "", "onClick", "o1", "(Loq6;ZLjava/lang/String;Lgn9;Lkotlin/jvm/functions/Function0;)V", "Q0", "l1", "Lkd8;", "pointerEvent", "Lmd8;", "pass", "Lw55;", "bounds", "v", "(Lkd8;Lmd8;J)V", "h0", "Lbf5;", "event", "f0", "(Landroid/view/KeyEvent;)Z", "W", "p", "Loq6;", "q", "Z", "r", "Ljava/lang/String;", Image.TYPE_SMALL, "Lgn9;", "t", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/foundation/a$a;", "u", "Landroidx/compose/foundation/a$a;", "n1", "()Landroidx/compose/foundation/a$a;", "interactionData", "Landroidx/compose/foundation/b;", "m1", "()Landroidx/compose/foundation/b;", "clickablePointerInputNode", "<init>", "a", "Landroidx/compose/foundation/f;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class a extends fu2 implements fe8, hf5 {
    private oq6 p;
    private boolean q;
    private String r;
    private gn9 s;
    private Function0<Unit> t;
    private final C0013a u;

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/a$a;", "", "", "Lre5;", "Lgj8;", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "currentKeyPressInteractions", "Lgj8;", com.huawei.hms.opendevice.c.a, "()Lgj8;", com.huawei.hms.push.e.a, "(Lgj8;)V", "pressInteraction", "Ls67;", "J", "()J", DateTokenConverter.CONVERTER_KEY, "(J)V", "centreOffset", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0013a {
        private gj8 b;
        private final Map<re5, gj8> a = new LinkedHashMap();
        private long c = s67.b.c();

        public final long a() {
            return this.c;
        }

        public final Map<re5, gj8> b() {
            return this.a;
        }

        public final gj8 c() {
            return this.b;
        }

        public final void d(long j) {
            this.c = j;
        }

        public final void e(gj8 gj8Var) {
            this.b = gj8Var;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {718}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ gj8 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(gj8 gj8Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = gj8Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                oq6 oq6Var = a.this.p;
                gj8 gj8Var = this.c;
                this.a = 1;
                if (oq6Var.a(gj8Var, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1", f = "Clickable.kt", l = {727}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ gj8 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(gj8 gj8Var, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.c = gj8Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                oq6 oq6Var = a.this.p;
                hj8 hj8Var = new hj8(this.c);
                this.a = 1;
                if (oq6Var.a(hj8Var, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public /* synthetic */ a(oq6 oq6Var, boolean z, String str, gn9 gn9Var, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(oq6Var, z, str, gn9Var, function0);
    }

    @Override // defpackage.fe8
    public /* synthetic */ boolean B() {
        return ee8.a(this);
    }

    @Override // defpackage.sm6.c
    public void Q0() {
        l1();
    }

    @Override // defpackage.hf5
    public boolean W(KeyEvent keyEvent) {
        z65.h(keyEvent, "event");
        return false;
    }

    @Override // defpackage.hf5
    public boolean f0(KeyEvent keyEvent) {
        z65.h(keyEvent, "event");
        if (this.q && c91.f(keyEvent)) {
            if (this.u.b().containsKey(re5.k(ef5.a(keyEvent)))) {
                return false;
            }
            gj8 gj8Var = new gj8(this.u.a(), null);
            this.u.b().put(re5.k(ef5.a(keyEvent)), gj8Var);
            sh0.d(F0(), null, null, new b(gj8Var, null), 3, null);
        } else if (!this.q || !c91.b(keyEvent)) {
            return false;
        } else {
            gj8 remove = this.u.b().remove(re5.k(ef5.a(keyEvent)));
            if (remove != null) {
                sh0.d(F0(), null, null, new c(remove, null), 3, null);
            }
            this.t.invoke();
        }
        return true;
    }

    @Override // defpackage.fe8
    public void h0() {
        m1().h0();
    }

    @Override // defpackage.fe8
    public /* synthetic */ void j0() {
        ee8.b(this);
    }

    protected final void l1() {
        gj8 c2 = this.u.c();
        if (c2 != null) {
            this.p.c(new fj8(c2));
        }
        for (gj8 gj8Var : this.u.b().values()) {
            this.p.c(new fj8(gj8Var));
        }
        this.u.e(null);
        this.u.b().clear();
    }

    public abstract androidx.compose.foundation.b m1();

    /* JADX INFO: Access modifiers changed from: protected */
    public final C0013a n1() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o1(oq6 oq6Var, boolean z, String str, gn9 gn9Var, Function0<Unit> function0) {
        z65.h(oq6Var, "interactionSource");
        z65.h(function0, "onClick");
        if (!z65.c(this.p, oq6Var)) {
            l1();
            this.p = oq6Var;
        }
        if (this.q != z) {
            if (!z) {
                l1();
            }
            this.q = z;
        }
        this.r = str;
        this.s = gn9Var;
        this.t = function0;
    }

    @Override // defpackage.fe8
    public void v(kd8 kd8Var, md8 md8Var, long j) {
        z65.h(kd8Var, "pointerEvent");
        z65.h(md8Var, "pass");
        m1().v(kd8Var, md8Var, j);
    }

    @Override // defpackage.fe8
    public /* synthetic */ boolean v0() {
        return ee8.d(this);
    }

    @Override // defpackage.fe8
    public /* synthetic */ void x0() {
        ee8.c(this);
    }

    private a(oq6 oq6Var, boolean z, String str, gn9 gn9Var, Function0<Unit> function0) {
        z65.h(oq6Var, "interactionSource");
        z65.h(function0, "onClick");
        this.p = oq6Var;
        this.q = z;
        this.r = str;
        this.s = gn9Var;
        this.t = function0;
        this.u = new C0013a();
    }
}
