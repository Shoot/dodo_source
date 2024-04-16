package im.threads.ui.fragments;

import android.net.Uri;
import im.threads.R;
import im.threads.business.config.BaseConfig;
import im.threads.business.models.CampaignMessage;
import im.threads.business.models.FileDescription;
import im.threads.business.models.Quote;
import im.threads.business.models.UpcomingUserMessage;
import im.threads.business.utils.FileProvider;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.fragments.ChatFragment$onExternalCameraPhotoResult$1$1", f = "ChatFragment.kt", l = {1341}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatFragment$onExternalCameraPhotoResult$1$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onExternalCameraPhotoResult$1$1(ChatFragment chatFragment, File file, cv1<? super ChatFragment$onExternalCameraPhotoResult$1$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = chatFragment;
        this.$file = file;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        ChatFragment$onExternalCameraPhotoResult$1$1 chatFragment$onExternalCameraPhotoResult$1$1 = new ChatFragment$onExternalCameraPhotoResult$1$1(this.this$0, this.$file, cv1Var);
        chatFragment$onExternalCameraPhotoResult$1$1.L$0 = obj;
        return chatFragment$onExternalCameraPhotoResult$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatFragment$onExternalCameraPhotoResult$1$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        hs2 b;
        FileProvider fileProvider;
        ChatFragment chatFragment;
        Uri uri;
        String str;
        ta0 ta0Var;
        CampaignMessage campaignMessage;
        Quote quote;
        String str2;
        List e;
        int i;
        boolean z;
        d = c75.d();
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                vk9.b(obj);
                uri = (Uri) this.L$2;
                str = (String) this.L$1;
                chatFragment = (ChatFragment) this.L$0;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            b = sh0.b((qx1) this.L$0, v33.b(), null, new ChatFragment$onExternalCameraPhotoResult$1$1$fileLengthDef$1(this.$file, null), 2, null);
            ChatFragment chatFragment2 = this.this$0;
            String string = chatFragment2.requireContext().getString(R.string.ecc_image);
            fileProvider = this.this$0.getFileProvider();
            Uri uriForFile = fileProvider.getUriForFile(BaseConfig.Companion.getInstance().context, this.$file);
            this.L$0 = chatFragment2;
            this.L$1 = string;
            this.L$2 = uriForFile;
            this.label = 1;
            obj = b.l0(this);
            if (obj == d) {
                return d;
            }
            chatFragment = chatFragment2;
            uri = uriForFile;
            str = string;
        }
        chatFragment.setFileDescription(new FileDescription(str, uri, ((Number) obj).longValue(), System.currentTimeMillis()));
        ta0Var = this.this$0.inputTextObservable;
        String str3 = (String) ta0Var.A();
        ChatFragment chatFragment3 = this.this$0;
        FileDescription fileDescription = chatFragment3.getFileDescription();
        campaignMessage = this.this$0.campaignMessage;
        quote = this.this$0.mQuote;
        if (str3 != null) {
            int length = str3.length() - 1;
            int i3 = 0;
            boolean z2 = false;
            while (i3 <= length) {
                if (!z2) {
                    i = i3;
                } else {
                    i = length;
                }
                if (z65.j(str3.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i3++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            str2 = str3.subSequence(i3, length + 1).toString();
        } else {
            str2 = null;
        }
        e = jc1.e(new UpcomingUserMessage(fileDescription, campaignMessage, quote, str2, false));
        ChatFragment.sendMessage$default(chatFragment3, e, false, 2, null);
        return Unit.a;
    }
}
