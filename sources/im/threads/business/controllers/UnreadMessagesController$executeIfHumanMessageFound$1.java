package im.threads.business.controllers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnreadMessagesController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.business.controllers.UnreadMessagesController$executeIfHumanMessageFound$1", f = "UnreadMessagesController.kt", l = {70, 75}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UnreadMessagesController$executeIfHumanMessageFound$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $block;
    int label;
    final /* synthetic */ UnreadMessagesController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnreadMessagesController$executeIfHumanMessageFound$1(UnreadMessagesController unreadMessagesController, Function0<Unit> function0, cv1<? super UnreadMessagesController$executeIfHumanMessageFound$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = unreadMessagesController;
        this.$block = function0;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new UnreadMessagesController$executeIfHumanMessageFound$1(this.this$0, this.$block, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((UnreadMessagesController$executeIfHumanMessageFound$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        r10 = defpackage.v33.c();
        r1 = new im.threads.business.controllers.UnreadMessagesController$executeIfHumanMessageFound$1$1$1(r4, null);
        r9.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (defpackage.qh0.g(r10, r1, r9) != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
        return r0;
     */
    @Override // defpackage.e70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = defpackage.a75.d()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            defpackage.vk9.b(r10)
            goto L93
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            defpackage.vk9.b(r10)
            goto L7a
        L1f:
            defpackage.vk9.b(r10)
            r10 = 0
        L23:
            im.threads.business.controllers.UnreadMessagesController r1 = r9.this$0
            im.threads.business.secureDatabase.DatabaseHolder r1 = im.threads.business.controllers.UnreadMessagesController.access$getDatabase(r1)
            r4 = 50
            java.util.List r1 = r1.getChatItems(r10, r4)
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L38
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L38:
            int r4 = r1.size()
            int r10 = r10 + r4
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r9.$block
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L23
            java.lang.Object r5 = r1.next()
            im.threads.business.models.ChatItem r5 = (im.threads.business.models.ChatItem) r5
            boolean r6 = r5 instanceof im.threads.business.models.ConsultPhrase
            r7 = 0
            if (r6 == 0) goto L7d
            im.threads.business.models.ConsultPhrase r5 = (im.threads.business.models.ConsultPhrase) r5
            im.threads.business.models.ConsultRole r6 = r5.getRole()
            im.threads.business.models.ConsultRole r8 = im.threads.business.models.ConsultRole.OPERATOR
            if (r6 == r8) goto L68
            im.threads.business.models.ConsultRole r5 = r5.getRole()
            im.threads.business.models.ConsultRole r6 = im.threads.business.models.ConsultRole.SUPERVISOR
            if (r5 != r6) goto L45
        L68:
            t46 r10 = defpackage.v33.c()
            im.threads.business.controllers.UnreadMessagesController$executeIfHumanMessageFound$1$1$1 r1 = new im.threads.business.controllers.UnreadMessagesController$executeIfHumanMessageFound$1$1$1
            r1.<init>(r4, r7)
            r9.label = r3
            java.lang.Object r10 = defpackage.qh0.g(r10, r1, r9)
            if (r10 != r0) goto L7a
            return r0
        L7a:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L7d:
            boolean r5 = r5 instanceof im.threads.business.models.UserPhrase
            if (r5 == 0) goto L45
            t46 r10 = defpackage.v33.c()
            im.threads.business.controllers.UnreadMessagesController$executeIfHumanMessageFound$1$1$2 r1 = new im.threads.business.controllers.UnreadMessagesController$executeIfHumanMessageFound$1$1$2
            r1.<init>(r4, r7)
            r9.label = r2
            java.lang.Object r10 = defpackage.qh0.g(r10, r1, r9)
            if (r10 != r0) goto L93
            return r0
        L93:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.controllers.UnreadMessagesController$executeIfHumanMessageFound$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
