package im.threads.ui.fragments;

import android.net.Uri;
import im.threads.R;
import im.threads.business.models.CampaignMessage;
import im.threads.business.models.Quote;
import im.threads.business.models.UpcomingUserMessage;
import im.threads.business.utils.FileUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "Lim/threads/business/models/UpcomingUserMessage;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.fragments.ChatFragment$onSendClick$2$1$messagesDef$1", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChatFragment$onSendClick$2$1$messagesDef$1 extends f3b implements Function2<qx1, cv1<? super List<? extends UpcomingUserMessage>>, Object> {
    final /* synthetic */ List<Uri> $filteredPhotos;
    final /* synthetic */ String $inputText;
    int label;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatFragment$onSendClick$2$1$messagesDef$1(List<? extends Uri> list, String str, ChatFragment chatFragment, cv1<? super ChatFragment$onSendClick$2$1$messagesDef$1> cv1Var) {
        super(2, cv1Var);
        this.$filteredPhotos = list;
        this.$inputText = str;
        this.this$0 = chatFragment;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatFragment$onSendClick$2$1$messagesDef$1(this.$filteredPhotos, this.$inputText, this.this$0, cv1Var);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(qx1 qx1Var, cv1<? super List<UpcomingUserMessage>> cv1Var) {
        return ((ChatFragment$onSendClick$2$1$messagesDef$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        CampaignMessage campaignMessage;
        Quote quote;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            List<Uri> list = this.$filteredPhotos;
            String str = this.$inputText;
            String string = this.this$0.requireContext().getString(R.string.ecc_I);
            z65.g(string, "requireContext().getString(R.string.ecc_I)");
            campaignMessage = this.this$0.campaignMessage;
            quote = this.this$0.mQuote;
            return FileUtils.getUpcomingUserMessagesFromSelection(list, str, string, campaignMessage, quote);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super List<? extends UpcomingUserMessage>> cv1Var) {
        return invoke2(qx1Var, (cv1<? super List<UpcomingUserMessage>>) cv1Var);
    }
}
