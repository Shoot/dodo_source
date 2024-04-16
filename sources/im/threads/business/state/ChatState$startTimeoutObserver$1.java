package im.threads.business.state;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.state.ChatState$startTimeoutObserver$1", f = "ChatState.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatState$startTimeoutObserver$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ long $delayTime;
    final /* synthetic */ long $startTime;
    final /* synthetic */ ChatStateEnum $state;
    final /* synthetic */ long $timeout;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatState$startTimeoutObserver$1(ChatStateEnum chatStateEnum, ChatState chatState, long j, long j2, long j3, cv1<? super ChatState$startTimeoutObserver$1> cv1Var) {
        super(2, cv1Var);
        this.$state = chatStateEnum;
        this.this$0 = chatState;
        this.$delayTime = j;
        this.$startTime = j2;
        this.$timeout = j3;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        ChatState$startTimeoutObserver$1 chatState$startTimeoutObserver$1 = new ChatState$startTimeoutObserver$1(this.$state, this.this$0, this.$delayTime, this.$startTime, this.$timeout, cv1Var);
        chatState$startTimeoutObserver$1.L$0 = obj;
        return chatState$startTimeoutObserver$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatState$startTimeoutObserver$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:18:0x0053). Please submit an issue!!! */
    @Override // defpackage.e70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = defpackage.a75.d()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r8.L$0
            qx1 r1 = (defpackage.qx1) r1
            defpackage.vk9.b(r9)
            r9 = r8
            goto L53
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            defpackage.vk9.b(r9)
            java.lang.Object r9 = r8.L$0
            qx1 r9 = (defpackage.qx1) r9
            im.threads.business.state.ChatStateEnum r1 = r8.$state
            boolean r1 = r1.isLastObservableState()
            if (r1 != 0) goto L76
            r1 = r9
            r9 = r8
        L2d:
            im.threads.business.state.ChatState r3 = r9.this$0
            im.threads.business.state.ChatStateEnum r3 = r3.getCurrentState()
            int r3 = r3.getValue()
            im.threads.business.state.ChatStateEnum r4 = r9.$state
            int r4 = r4.getValue()
            int r4 = r4 + r2
            if (r3 > r4) goto L76
            boolean r3 = defpackage.rx1.g(r1)
            if (r3 == 0) goto L76
            long r3 = r9.$delayTime
            r9.L$0 = r1
            r9.label = r2
            java.lang.Object r3 = defpackage.xt2.a(r3, r9)
            if (r3 != r0) goto L53
            return r0
        L53:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r9.$startTime
            long r3 = r3 - r5
            long r5 = r9.$timeout
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2d
            boolean r3 = defpackage.rx1.g(r1)
            if (r3 == 0) goto L2d
            im.threads.business.state.ChatState r0 = r9.this$0
            im.threads.business.state.ChatStateEvent r1 = new im.threads.business.state.ChatStateEvent
            im.threads.business.state.ChatStateEnum r3 = r0.getCurrentState()
            r1.<init>(r3, r2)
            long r2 = r9.$timeout
            im.threads.business.state.ChatState.access$changeState(r0, r1, r2)
        L76:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.state.ChatState$startTimeoutObserver$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
