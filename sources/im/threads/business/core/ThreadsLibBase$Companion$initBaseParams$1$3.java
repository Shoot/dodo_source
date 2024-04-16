package im.threads.business.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadsLibBase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.core.ThreadsLibBase$Companion$initBaseParams$1$3", f = "ThreadsLibBase.kt", l = {246}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ThreadsLibBase$Companion$initBaseParams$1$3 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ UnreadMessagesCountListener $unreadMessagesCountListener;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadsLibBase$Companion$initBaseParams$1$3(UnreadMessagesCountListener unreadMessagesCountListener, cv1<? super ThreadsLibBase$Companion$initBaseParams$1$3> cv1Var) {
        super(2, cv1Var);
        this.$unreadMessagesCountListener = unreadMessagesCountListener;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        ThreadsLibBase$Companion$initBaseParams$1$3 threadsLibBase$Companion$initBaseParams$1$3 = new ThreadsLibBase$Companion$initBaseParams$1$3(this.$unreadMessagesCountListener, cv1Var);
        threadsLibBase$Companion$initBaseParams$1$3.L$0 = obj;
        return threadsLibBase$Companion$initBaseParams$1$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ThreadsLibBase$Companion$initBaseParams$1$3) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        hs2 b;
        UnreadMessagesCountListener unreadMessagesCountListener;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                unreadMessagesCountListener = (UnreadMessagesCountListener) this.L$0;
                vk9.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            b = sh0.b((qx1) this.L$0, v33.b(), null, new ThreadsLibBase$Companion$initBaseParams$1$3$task$1(null), 2, null);
            UnreadMessagesCountListener unreadMessagesCountListener2 = this.$unreadMessagesCountListener;
            this.L$0 = unreadMessagesCountListener2;
            this.label = 1;
            obj = b.l0(this);
            if (obj == d) {
                return d;
            }
            unreadMessagesCountListener = unreadMessagesCountListener2;
        }
        unreadMessagesCountListener.onUnreadMessagesCountChanged(((Number) obj).intValue());
        return Unit.a;
    }
}
