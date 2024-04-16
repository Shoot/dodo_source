package im.threads.ui.fragments;

import android.text.Editable;
import android.widget.ImageButton;
import im.threads.business.models.FileDescription;
import im.threads.databinding.EccFragmentChatBinding;
import im.threads.ui.widget.CustomFontEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrb7;", "Lim/threads/business/models/FileDescription;", "files", "", "invoke", "(Lrb7;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatFragment$subscribeToFileDescription$1 extends ej5 implements Function1<rb7<FileDescription>, Unit> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeToFileDescription$1(ChatFragment chatFragment) {
        super(1);
        this.this$0 = chatFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(rb7<FileDescription> rb7Var) {
        invoke2(rb7Var);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(rb7<FileDescription> rb7Var) {
        Boolean bool;
        CustomFontEditText customFontEditText;
        Editable text;
        boolean y;
        boolean z = false;
        boolean z2 = (rb7Var == null || rb7Var.c()) ? false : true;
        EccFragmentChatBinding eccFragmentChatBinding = this.this$0.binding;
        if (eccFragmentChatBinding == null || (customFontEditText = eccFragmentChatBinding.inputEditView) == null || (text = customFontEditText.getText()) == null) {
            bool = null;
        } else {
            y = l0b.y(text);
            bool = Boolean.valueOf(!y);
        }
        z = (z2 || z65.c(bool, Boolean.TRUE)) ? true : true;
        EccFragmentChatBinding eccFragmentChatBinding2 = this.this$0.binding;
        ImageButton imageButton = eccFragmentChatBinding2 != null ? eccFragmentChatBinding2.sendMessage : null;
        if (imageButton == null) {
            return;
        }
        imageButton.setEnabled(z);
    }
}
