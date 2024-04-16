package im.threads.ui.controllers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$subscribeOnMessageError$1 extends ej5 implements Function1<Long, Unit> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeOnMessageError$1(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l) {
        invoke2(l);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        r0 = r5.this$0.fragment;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(java.lang.Long r6) {
        /*
            r5 = this;
            im.threads.ui.controllers.ChatController r6 = r5.this$0
            java.lang.ref.WeakReference r6 = im.threads.ui.controllers.ChatController.access$getFragment$p(r6)
            r0 = 0
            if (r6 == 0) goto L1a
            java.lang.Object r6 = r6.get()
            im.threads.ui.fragments.ChatFragment r6 = (im.threads.ui.fragments.ChatFragment) r6
            if (r6 == 0) goto L1a
            int r6 = r6.getLastVisibleItemPosition$threads_release()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L1b
        L1a:
            r6 = r0
        L1b:
            im.threads.ui.controllers.ChatController r1 = r5.this$0
            java.lang.ref.WeakReference r1 = im.threads.ui.controllers.ChatController.access$getFragment$p(r1)
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r1.get()
            im.threads.ui.fragments.ChatFragment r1 = (im.threads.ui.fragments.ChatFragment) r1
            if (r1 == 0) goto L2f
            java.util.List r0 = r1.getElements()
        L2f:
            if (r6 == 0) goto L66
            if (r0 == 0) goto L66
            java.lang.Object r1 = defpackage.ic1.k0(r0)
            im.threads.business.models.ChatItem r1 = (im.threads.business.models.ChatItem) r1
            long r1 = r1.getTimeStamp()
            int r3 = r6.intValue()
            java.lang.Object r0 = r0.get(r3)
            im.threads.business.models.ChatItem r0 = (im.threads.business.models.ChatItem) r0
            long r3 = r0.getTimeStamp()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L66
            im.threads.ui.controllers.ChatController r0 = r5.this$0
            java.lang.ref.WeakReference r0 = im.threads.ui.controllers.ChatController.access$getFragment$p(r0)
            if (r0 == 0) goto L66
            java.lang.Object r0 = r0.get()
            im.threads.ui.fragments.ChatFragment r0 = (im.threads.ui.fragments.ChatFragment) r0
            if (r0 == 0) goto L66
            int r6 = r6.intValue()
            r0.scrollToElementByIndex(r6)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.controllers.ChatController$subscribeOnMessageError$1.invoke2(java.lang.Long):void");
    }
}
