package im.threads.ui.adapters.utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SendingStatusObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.adapters.utils.SendingStatusObserver$startObserving$1", f = "SendingStatusObserver.kt", l = {43, 79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SendingStatusObserver$startObserving$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SendingStatusObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendingStatusObserver$startObserving$1(SendingStatusObserver sendingStatusObserver, cv1<? super SendingStatusObserver$startObserving$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = sendingStatusObserver;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        SendingStatusObserver$startObserving$1 sendingStatusObserver$startObserving$1 = new SendingStatusObserver$startObserving$1(this.this$0, cv1Var);
        sendingStatusObserver$startObserving$1.L$0 = obj;
        return sendingStatusObserver$startObserving$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((SendingStatusObserver$startObserving$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006b -> B:22:0x006f). Please submit an issue!!! */
    @Override // defpackage.e70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = defpackage.a75.d()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r11.L$0
            qx1 r1 = (defpackage.qx1) r1
            defpackage.vk9.b(r12)
            r4 = r11
            goto L6f
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            java.lang.Object r1 = r11.L$0
            qx1 r1 = (defpackage.qx1) r1
            defpackage.vk9.b(r12)
            r12 = r1
            r1 = r11
            goto L3e
        L29:
            defpackage.vk9.b(r12)
            java.lang.Object r12 = r11.L$0
            qx1 r12 = (defpackage.qx1) r12
            r1 = r11
        L31:
            r1.L$0 = r12
            r1.label = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r4 = defpackage.xt2.a(r4, r1)
            if (r4 != r0) goto L3e
            return r0
        L3e:
            im.threads.ui.adapters.utils.SendingStatusObserver r4 = r1.this$0
            boolean r4 = im.threads.ui.adapters.utils.SendingStatusObserver.access$isObserving$p(r4)
            if (r4 == 0) goto L9c
            boolean r4 = defpackage.rx1.g(r12)
            if (r4 == 0) goto L9c
            kx1 r5 = defpackage.v33.b()
            r6 = 0
            im.threads.ui.adapters.utils.SendingStatusObserver$startObserving$1$observedMessagesDef$1 r7 = new im.threads.ui.adapters.utils.SendingStatusObserver$startObserving$1$observedMessagesDef$1
            im.threads.ui.adapters.utils.SendingStatusObserver r4 = r1.this$0
            r8 = 0
            r7.<init>(r4, r8)
            r8 = 2
            r9 = 0
            r4 = r12
            hs2 r4 = defpackage.qh0.b(r4, r5, r6, r7, r8, r9)
            r1.L$0 = r12
            r1.label = r2
            java.lang.Object r4 = r4.l0(r1)
            if (r4 != r0) goto L6b
            return r0
        L6b:
            r10 = r1
            r1 = r12
            r12 = r4
            r4 = r10
        L6f:
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 == 0) goto L99
            im.threads.ui.adapters.utils.SendingStatusObserver r5 = r4.this$0
            java.util.Iterator r12 = r12.iterator()
        L79:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L99
            java.lang.Object r6 = r12.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.ref.WeakReference r7 = im.threads.ui.adapters.utils.SendingStatusObserver.access$getChatAdapterRef$p(r5)
            java.lang.Object r7 = r7.get()
            im.threads.ui.adapters.ChatAdapter r7 = (im.threads.ui.adapters.ChatAdapter) r7
            if (r7 == 0) goto L79
            r7.notifyItemChanged(r6)
            goto L79
        L99:
            r12 = r1
            r1 = r4
            goto L31
        L9c:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.adapters.utils.SendingStatusObserver$startObserving$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
