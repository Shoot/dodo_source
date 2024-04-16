package im.threads.business.core;

import im.threads.business.logger.LoggerEdna;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadsLibBase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.core.ThreadsLibBase$Companion$changeServerSettings$1", f = "ThreadsLibBase.kt", l = {344}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ThreadsLibBase$Companion$changeServerSettings$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ Exception $exc;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadsLibBase$Companion$changeServerSettings$1(Exception exc, cv1<? super ThreadsLibBase$Companion$changeServerSettings$1> cv1Var) {
        super(2, cv1Var);
        this.$exc = exc;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ThreadsLibBase$Companion$changeServerSettings$1(this.$exc, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ThreadsLibBase$Companion$changeServerSettings$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vk9.b(obj);
        } else {
            vk9.b(obj);
            LoggerEdna.error(this.$exc);
            this.label = 1;
            if (xt2.a(500L, this) == d) {
                return d;
            }
        }
        throw this.$exc;
    }
}
