package im.threads.ui.controllers;

import android.net.Uri;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ChatPhrase;
import im.threads.business.models.FileDescription;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.transport.models.Attachment;
import im.threads.ui.fragments.ChatFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", MessageAttributes.ATTACHMENTS, "", "Lim/threads/business/transport/models/Attachment;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$subscribeToUpdateAttachments$1 extends ej5 implements Function1<List<? extends Attachment>, Unit> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeToUpdateAttachments$1(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Attachment> list) {
        invoke2((List<Attachment>) list);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Attachment> list) {
        DatabaseHolder database;
        boolean O;
        boolean z;
        WeakReference weakReference;
        ChatFragment chatFragment;
        FileDescription fileDescription;
        DatabaseHolder database2;
        WeakReference weakReference2;
        ChatFragment chatFragment2;
        boolean z2;
        Uri fileUri;
        String uri;
        String downloadPath;
        z65.h(list, MessageAttributes.ATTACHMENTS);
        for (Attachment attachment : list) {
            database = this.this$0.getDatabase();
            for (ChatItem chatItem : database.getChatItems(0, 100)) {
                if (chatItem instanceof ChatPhrase) {
                    ChatPhrase chatPhrase = (ChatPhrase) chatItem;
                    if (chatPhrase.getFileDescription() != null) {
                        String name = attachment.getName();
                        if (name == null) {
                            name = "";
                        }
                        FileDescription fileDescription2 = chatPhrase.getFileDescription();
                        boolean c = z65.c(fileDescription2 != null ? fileDescription2.getIncomingName() : null, name);
                        FileDescription fileDescription3 = chatPhrase.getFileDescription();
                        O = m0b.O(String.valueOf(fileDescription3 != null ? fileDescription3.getFileUri() : null), name, false, 2, null);
                        String originalUrl = attachment.getOriginalUrl();
                        if (originalUrl != null) {
                            FileDescription fileDescription4 = chatPhrase.getFileDescription();
                            boolean O2 = (fileDescription4 == null || (downloadPath = fileDescription4.getDownloadPath()) == null) ? false : m0b.O(downloadPath, originalUrl, false, 2, null);
                            FileDescription fileDescription5 = chatPhrase.getFileDescription();
                            if (fileDescription5 == null || (fileUri = fileDescription5.getFileUri()) == null || (uri = fileUri.toString()) == null) {
                                z2 = false;
                            } else {
                                z65.g(uri, "toString()");
                                z2 = m0b.O(uri, originalUrl, false, 2, null);
                            }
                            if (O2 || z2) {
                                z = true;
                                if (!c || O || z) {
                                    weakReference = this.this$0.fragment;
                                    if (weakReference != null && (chatFragment = (ChatFragment) weakReference.get()) != null && chatFragment.isAdded() && (fileDescription = chatPhrase.getFileDescription()) != null) {
                                        ChatController chatController = this.this$0;
                                        fileDescription.setState(attachment.getState());
                                        fileDescription.setErrorCode(attachment.getErrorCodeState());
                                        fileDescription.setDownloadPath(attachment.getResult());
                                        database2 = chatController.getDatabase();
                                        database2.updateFileDescription(fileDescription);
                                        weakReference2 = chatController.fragment;
                                        if (weakReference2 != null && (chatFragment2 = (ChatFragment) weakReference2.get()) != null) {
                                            chatFragment2.updateProgress(fileDescription);
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                        if (!c) {
                        }
                        weakReference = this.this$0.fragment;
                        if (weakReference != null) {
                            ChatController chatController2 = this.this$0;
                            fileDescription.setState(attachment.getState());
                            fileDescription.setErrorCode(attachment.getErrorCodeState());
                            fileDescription.setDownloadPath(attachment.getResult());
                            database2 = chatController2.getDatabase();
                            database2.updateFileDescription(fileDescription);
                            weakReference2 = chatController2.fragment;
                            if (weakReference2 != null) {
                                chatFragment2.updateProgress(fileDescription);
                            }
                        }
                    }
                }
            }
        }
    }
}
