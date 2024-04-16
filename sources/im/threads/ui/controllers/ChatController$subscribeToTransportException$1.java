package im.threads.ui.controllers;

import im.threads.business.transport.TransportException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lim/threads/business/transport/TransportException;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$subscribeToTransportException$1 extends ej5 implements Function1<TransportException, Unit> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeToTransportException$1(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TransportException transportException) {
        invoke2(transportException);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        r0 = r2.this$0.fragment;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(im.threads.business.transport.TransportException r3) {
        /*
            r2 = this;
            im.threads.ui.controllers.ChatController r0 = r2.this$0
            java.lang.ref.WeakReference r0 = im.threads.ui.controllers.ChatController.access$getFragment$p(r0)
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r0.get()
            im.threads.ui.fragments.ChatFragment r0 = (im.threads.ui.fragments.ChatFragment) r0
            if (r0 == 0) goto L2e
            boolean r0 = r0.isResumed()
            r1 = 1
            if (r0 != r1) goto L2e
            im.threads.ui.controllers.ChatController r0 = r2.this$0
            java.lang.ref.WeakReference r0 = im.threads.ui.controllers.ChatController.access$getFragment$p(r0)
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r0.get()
            im.threads.ui.fragments.ChatFragment r0 = (im.threads.ui.fragments.ChatFragment) r0
            if (r0 == 0) goto L2e
            java.lang.String r1 = r3.getMessage()
            r0.showErrorView$threads_release(r1)
        L2e:
            java.lang.String r0 = "subscribeToTransportException "
            im.threads.business.logger.LoggerEdna.error(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.controllers.ChatController$subscribeToTransportException$1.invoke2(im.threads.business.transport.TransportException):void");
    }
}
