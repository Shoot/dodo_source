package im.threads.ui.fragments;

import android.content.Context;
import android.net.Uri;
import im.threads.business.utils.FileUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "value", "Landroid/net/Uri;", "invoke", "(Landroid/net/Uri;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatFragment$onSendClick$1$1 extends ej5 implements Function1<Uri, Boolean> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onSendClick$1$1(ChatFragment chatFragment) {
        super(1);
        this.this$0 = chatFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Uri uri) {
        Context requireContext = this.this$0.requireContext();
        z65.g(requireContext, "requireContext()");
        z65.e(uri);
        return Boolean.valueOf(FileUtils.canBeSent(requireContext, uri));
    }
}
