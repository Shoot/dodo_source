package im.threads.ui.controllers;

import com.huawei.hms.push.e;
import im.threads.business.logger.LoggerEdna;
import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", e.a, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$loadHistory$2$3 extends ej5 implements Function1<Throwable, Unit> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$loadHistory$2$3(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        ChatFragment chatFragment;
        ChatFragment chatFragment2;
        ChatFragment chatFragment3;
        this.this$0.isDownloadingMessages = false;
        weakReference = this.this$0.fragment;
        if (weakReference != null) {
            weakReference2 = this.this$0.fragment;
            if (weakReference2 != null && (chatFragment3 = (ChatFragment) weakReference2.get()) != null) {
                chatFragment3.hideProgressBar();
            }
            weakReference3 = this.this$0.fragment;
            if (weakReference3 != null && (chatFragment2 = (ChatFragment) weakReference3.get()) != null) {
                chatFragment2.showWelcomeScreenIfNeed$threads_release();
            }
            weakReference4 = this.this$0.fragment;
            if (weakReference4 != null && (chatFragment = (ChatFragment) weakReference4.get()) != null) {
                chatFragment.showBottomBar$threads_release();
            }
        }
        LoggerEdna.error(th);
    }
}
