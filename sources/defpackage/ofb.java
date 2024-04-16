package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.UserInfoBuilder;
import im.threads.business.core.ThreadsLibBase;
import im.threads.ui.core.ThreadsLib;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ThreadsLibUserInitializer.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b%\u0010&J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lofb;", "Lbu6;", "Lau6;", "user", "Lyt6;", "topic", "", "a", "(Lau6;Lyt6;Lcv1;)Ljava/lang/Object;", "Lmfb;", "Lmfb;", "threadsLibUserInfoBuilder", "Las8;", "Lim/threads/ui/core/ThreadsLib;", "b", "Las8;", "threadsLibProvider", "Lut8;", c.a, "Lut8;", "pushTokenProvider", "Lhfb;", DateTokenConverter.CONVERTER_KEY, "Lhfb;", "threadsLibPushService", "Lkx1;", e.a, "Lkx1;", "mainDispatcher", "Lim/threads/business/UserInfoBuilder;", "f", "Lim/threads/business/UserInfoBuilder;", "currentUserInfo", "", "g", "Ljava/lang/String;", "currentPushToken", "<init>", "(Lmfb;Las8;Lut8;Lhfb;Lkx1;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ofb  reason: default package */
/* loaded from: classes.dex */
public final class ofb implements bu6 {
    private final mfb a;
    private final as8<ThreadsLib> b;
    private final ut8 c;
    private final hfb d;
    private final kx1 e;
    private UserInfoBuilder f;
    private String g;

    /* compiled from: ThreadsLibUserInitializer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.chat.domain.threads.ThreadsLibUserInitializer$initUser$2", f = "ThreadsLibUserInitializer.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: ofb$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        int b;
        final /* synthetic */ String d;
        final /* synthetic */ UserInfoBuilder e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, UserInfoBuilder userInfoBuilder, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.d = str;
            this.e = userInfoBuilder;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.d, this.e, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            ThreadsLib threadsLib;
            d = c75.d();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    threadsLib = (ThreadsLib) this.a;
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                ThreadsLib threadsLib2 = (ThreadsLib) ofb.this.b.get();
                threadsLib2.logoutClient();
                hfb hfbVar = ofb.this.d;
                String str = this.d;
                this.a = threadsLib2;
                this.b = 1;
                if (hfbVar.a(str, this) == d) {
                    return d;
                }
                threadsLib = threadsLib2;
            }
            z65.e(threadsLib);
            ThreadsLibBase.initUser$default(threadsLib, this.e, false, 2, null);
            ofb.this.f = this.e;
            ofb.this.g = this.d;
            return Unit.a;
        }
    }

    public ofb(mfb mfbVar, as8<ThreadsLib> as8Var, ut8 ut8Var, hfb hfbVar, kx1 kx1Var) {
        z65.h(mfbVar, "threadsLibUserInfoBuilder");
        z65.h(as8Var, "threadsLibProvider");
        z65.h(ut8Var, "pushTokenProvider");
        z65.h(hfbVar, "threadsLibPushService");
        z65.h(kx1Var, "mainDispatcher");
        this.a = mfbVar;
        this.b = as8Var;
        this.c = ut8Var;
        this.d = hfbVar;
        this.e = kx1Var;
    }

    @Override // defpackage.bu6
    public Object a(au6 au6Var, yt6 yt6Var, cv1<? super Unit> cv1Var) {
        String str;
        Object d;
        UserInfoBuilder b = this.a.b(au6Var, yt6Var);
        try {
            str = this.c.a();
        } catch (Exception unused) {
            str = null;
        }
        if (z65.c(this.f, b) && z65.c(this.g, str)) {
            return Unit.a;
        }
        Object g = qh0.g(this.e, new a(str, b, null), cv1Var);
        d = c75.d();
        if (g == d) {
            return g;
        }
        return Unit.a;
    }

    public /* synthetic */ ofb(mfb mfbVar, as8 as8Var, ut8 ut8Var, hfb hfbVar, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mfbVar, as8Var, ut8Var, hfbVar, (i & 16) != 0 ? v33.c() : kx1Var);
    }
}
