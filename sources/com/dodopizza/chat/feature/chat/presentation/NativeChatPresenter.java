package com.dodopizza.chat.feature.chat.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.dy0;
import defpackage.h37;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: NativeChatPresenter.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BC\b\u0007\u0012\b\u00107\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\b8\u00109J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0006R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00104\u001a\n 2*\u0004\u0018\u000101018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00103R\u0016\u00106\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00105¨\u0006:"}, d2 = {"Lcom/dodopizza/chat/feature/chat/presentation/NativeChatPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lfu6;", "Lh37$a;", "", "x", "", "y", "D", "z", "Lvt6;", "newState", "E", "C", "v", "w", "view", "u", "Lry7;", "status", "g", Image.TYPE_HIGH, "onBackPressed", "A", "B", "Lgt6;", "a", "Lgt6;", "data", "Lst6;", "b", "Lst6;", "messenger", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lqt6;", e.a, "Lqt6;", "nativeChatInteractor", "Lm37;", "f", "Lm37;", "notificationsStatusInteractor", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "Lvt6;", "state", "restoredState", "<init>", "(Lvt6;Lgt6;Lst6;Lf63;Lgc;Lqt6;Lm37;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NativeChatPresenter extends BasePresenter<fu6> implements h37.a {
    private final gt6 a;
    private final st6 b;
    private final f63 c;
    private final gc d;
    private final qt6 e;
    private final m37 f;
    private final Logger g;
    private vt6 h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeChatPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.chat.feature.chat.presentation.NativeChatPresenter$attachView$1", f = "NativeChatPresenter.kt", l = {48}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
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
                qt6 qt6Var = NativeChatPresenter.this.e;
                yt6 c = NativeChatPresenter.this.a.c();
                this.a = 1;
                if (qt6Var.g(c, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeChatPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.chat.feature.chat.presentation.NativeChatPresenter$attachView$2", f = "NativeChatPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((b) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((fu6) NativeChatPresenter.this.getViewState()).X(ck1.n);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeChatPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.chat.feature.chat.presentation.NativeChatPresenter$attachView$3", f = "NativeChatPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                NativeChatPresenter.this.g.error("Failed to init chat user", (Throwable) this.b);
                NativeChatPresenter.this.w();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public NativeChatPresenter(vt6 vt6Var, gt6 gt6Var, st6 st6Var, f63 f63Var, gc gcVar, qt6 qt6Var, m37 m37Var) {
        z65.h(gt6Var, "data");
        z65.h(st6Var, "messenger");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(qt6Var, "nativeChatInteractor");
        z65.h(m37Var, "notificationsStatusInteractor");
        this.a = gt6Var;
        this.b = st6Var;
        this.c = f63Var;
        this.d = gcVar;
        this.e = qt6Var;
        this.f = m37Var;
        this.g = LoggerFactory.getLogger("NativeChatPresenter");
        this.h = vt6Var == null ? new vt6(false, false, 3, null) : vt6Var;
    }

    private final void C() {
        D();
        v();
    }

    private final void D() {
        if (this.a.a() != null && !this.h.d()) {
            this.b.a(this.a.a());
            z();
        }
    }

    private final void E(vt6 vt6Var) {
        this.h = vt6Var;
        ((fu6) getViewState()).w6(vt6Var);
    }

    private final void v() {
        ((fu6) getViewState()).R4();
        this.d.a(new dy0.d(dy0.b.b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        ((fu6) getViewState()).f5();
        this.c.d();
    }

    private final boolean x() {
        if (this.a.b() && !this.h.c()) {
            return true;
        }
        return false;
    }

    private final void y() {
        E(vt6.b(this.h, true, false, 2, null));
    }

    private final void z() {
        E(vt6.b(this.h, false, true, 1, null));
    }

    public final void B() {
        this.c.d();
        this.d.a(new dy0.c(dy0.b.b));
    }

    @Override // defpackage.h37.a
    public void g(ry7 ry7Var) {
        z65.h(ry7Var, "status");
        C();
        this.f.f(ck1.n);
    }

    @Override // defpackage.h37.a
    public void h(ry7 ry7Var) {
        z65.h(ry7Var, "status");
        C();
    }

    public final void onBackPressed() {
        ((fu6) getViewState()).Ug();
    }

    @Override // moxy.MvpPresenter
    /* renamed from: u */
    public void attachView(fu6 fu6Var) {
        z65.h(fu6Var, "view");
        super.attachView(fu6Var);
        if (x()) {
            y();
        } else {
            p(z77.a(y87.a(hy.a(new a(null)), new b(null)), new c(null)));
        }
    }

    public final void A() {
    }
}
