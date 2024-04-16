package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: AssistantSettingsInteractor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Lwv;", "", "", "stateId", "Lsv;", "b", "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Lyv;", "a", "Lyv;", "service", "Lkx1;", "Lkx1;", "ioDispatcher", "<init>", "(Lyv;Lkx1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wv  reason: default package */
/* loaded from: classes2.dex */
public final class wv {
    private final yv a;
    private final kx1 b;

    /* compiled from: AssistantSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lsv;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.settings.presentation.AssistantSettingsInteractor$get$2", f = "AssistantSettingsInteractor.kt", l = {18}, m = "invokeSuspend")
    /* renamed from: wv$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super sv>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super sv> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                yv yvVar = wv.this.a;
                String str = this.c;
                this.a = 1;
                obj = yvVar.a(str, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    public wv(yv yvVar, kx1 kx1Var) {
        z65.h(yvVar, "service");
        z65.h(kx1Var, "ioDispatcher");
        this.a = yvVar;
        this.b = kx1Var;
    }

    public final Object b(String str, cv1<? super sv> cv1Var) {
        return qh0.g(this.b, new a(str, null), cv1Var);
    }
}
