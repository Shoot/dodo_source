package im.threads.ui.controllers;

import android.net.Uri;
import im.threads.business.models.FileDescription;
import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "fileDescription", "Lim/threads/business/models/FileDescription;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$subscribeOnFileUploadResult$1 extends ej5 implements Function1<FileDescription, Unit> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeOnFileUploadResult$1(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FileDescription fileDescription) {
        invoke2(fileDescription);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FileDescription fileDescription) {
        WeakReference weakReference;
        ChatFragment chatFragment;
        HashMap hashMap;
        Uri fileUri = fileDescription.getFileUri();
        if (fileUri != null) {
            hashMap = this.this$0.attachmentsHistory;
            String uri = fileUri.toString();
            z65.g(uri, "it.toString()");
            hashMap.put(uri, fileDescription.getState());
        }
        weakReference = this.this$0.fragment;
        if (weakReference == null || (chatFragment = (ChatFragment) weakReference.get()) == null) {
            return;
        }
        chatFragment.updateProgress(fileDescription);
    }
}
