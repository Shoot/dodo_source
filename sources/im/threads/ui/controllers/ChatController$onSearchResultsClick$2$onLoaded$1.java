package im.threads.ui.controllers;

import im.threads.R;
import im.threads.business.models.ChatItem;
import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$onSearchResultsClick$2$onLoaded$1", f = "ChatController.kt", l = {364}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChatController$onSearchResultsClick$2$onLoaded$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ String $uuid;
    int label;
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$onSearchResultsClick$2$onLoaded$1(ChatController chatController, String str, cv1<? super ChatController$onSearchResultsClick$2$onLoaded$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatController;
        this.$uuid = str;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatController$onSearchResultsClick$2$onLoaded$1(this.this$0, this.$uuid, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatController$onSearchResultsClick$2$onLoaded$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        WeakReference weakReference;
        List<ChatItem> list;
        int itemPositionByUuid;
        WeakReference weakReference2;
        ChatFragment chatFragment;
        WeakReference weakReference3;
        ChatFragment chatFragment2;
        ChatFragment chatFragment3;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                vk9.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            this.label = 1;
            if (xt2.a(500L, this) == d) {
                return d;
            }
        }
        ChatController chatController = this.this$0;
        weakReference = chatController.fragment;
        if (weakReference != null && (chatFragment3 = (ChatFragment) weakReference.get()) != null) {
            list = chatFragment3.getElements();
        } else {
            list = null;
        }
        itemPositionByUuid = chatController.getItemPositionByUuid(list, this.$uuid);
        if (itemPositionByUuid >= 0) {
            weakReference3 = this.this$0.fragment;
            if (weakReference3 != null && (chatFragment2 = (ChatFragment) weakReference3.get()) != null) {
                chatFragment2.scrollToPosition$threads_release(itemPositionByUuid, true);
            }
        } else {
            weakReference2 = this.this$0.fragment;
            if (weakReference2 != null && (chatFragment = (ChatFragment) weakReference2.get()) != null) {
                chatFragment.showBalloon$threads_release(R.string.ecc_request_failed);
            }
        }
        return Unit.a;
    }
}
