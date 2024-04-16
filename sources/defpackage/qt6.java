package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: NativeChatInteractor.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020 \u0012\b\b\u0001\u0010%\u001a\u00020#¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$¨\u0006("}, d2 = {"Lqt6;", "", "Ln42;", "f", "customer", "Lyt6;", "topic", "", Image.TYPE_HIGH, "(Ln42;Lyt6;Lcv1;)Ljava/lang/Object;", "g", "(Lyt6;Lcv1;)Ljava/lang/Object;", "Lbfb;", "a", "Lbfb;", "threadsLibInitializer", "Lbo;", "b", "Lbo;", "appInitStateProvider", "Li00;", c.a, "Li00;", "authorizationState", "Lt52;", DateTokenConverter.CONVERTER_KEY, "Lt52;", "customerService", "Lcu6;", e.a, "Lcu6;", "nativeChatUserMapper", "Lbu6;", "Lbu6;", "nativeChatUserInitializer", "Lkx1;", "Lkx1;", "ioDispatcher", "<init>", "(Lbfb;Lbo;Li00;Lt52;Lcu6;Lbu6;Lkx1;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qt6  reason: default package */
/* loaded from: classes.dex */
public final class qt6 {
    private final bfb a;
    private final bo b;
    private final i00 c;
    private final t52 d;
    private final cu6 e;
    private final bu6 f;
    private final kx1 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeChatInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.chat.feature.chat.presentation.NativeChatInteractor$initChatForCurrentUser$2", f = "NativeChatInteractor.kt", l = {36, 41, 43}, m = "invokeSuspend")
    /* renamed from: qt6$a */
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ yt6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(yt6 yt6Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = yt6Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vk9.b(obj);
                        throw new IllegalStateException("User is not authorized".toString());
                    }
                    vk9.b(obj);
                    return Unit.a;
                }
                vk9.b(obj);
            } else {
                vk9.b(obj);
                bo boVar = qt6.this.b;
                this.a = 1;
                if (co.b(boVar, this) == d) {
                    return d;
                }
            }
            qt6.this.a.b();
            if (qt6.this.c.b()) {
                n42 f = qt6.this.f();
                qt6 qt6Var = qt6.this;
                yt6 yt6Var = this.c;
                this.a = 2;
                if (qt6Var.h(f, yt6Var, this) == d) {
                    return d;
                }
                return Unit.a;
            }
            qt6 qt6Var2 = qt6.this;
            n42 a = n42.l.a();
            this.a = 3;
            if (qt6Var2.h(a, null, this) == d) {
                return d;
            }
            throw new IllegalStateException("User is not authorized".toString());
        }
    }

    public qt6(bfb bfbVar, bo boVar, i00 i00Var, t52 t52Var, cu6 cu6Var, bu6 bu6Var, kx1 kx1Var) {
        z65.h(bfbVar, "threadsLibInitializer");
        z65.h(boVar, "appInitStateProvider");
        z65.h(i00Var, "authorizationState");
        z65.h(t52Var, "customerService");
        z65.h(cu6Var, "nativeChatUserMapper");
        z65.h(bu6Var, "nativeChatUserInitializer");
        z65.h(kx1Var, "ioDispatcher");
        this.a = bfbVar;
        this.b = boVar;
        this.c = i00Var;
        this.d = t52Var;
        this.e = cu6Var;
        this.f = bu6Var;
        this.g = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n42 f() {
        n42 f = this.d.f();
        if (!z65.c(f.i(), "1")) {
            return f;
        }
        throw new IllegalStateException(("Current customer is invalid for chat. Customer: " + f).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(n42 n42Var, yt6 yt6Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object a2 = this.f.a(this.e.a(n42Var), yt6Var, cv1Var);
        d = c75.d();
        if (a2 == d) {
            return a2;
        }
        return Unit.a;
    }

    public final Object g(yt6 yt6Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object g = qh0.g(this.g, new a(yt6Var, null), cv1Var);
        d = c75.d();
        if (g == d) {
            return g;
        }
        return Unit.a;
    }
}
