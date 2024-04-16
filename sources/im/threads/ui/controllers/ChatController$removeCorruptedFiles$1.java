package im.threads.ui.controllers;

import android.net.Uri;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.FileDescription;
import im.threads.business.models.UserPhrase;
import im.threads.business.utils.FileUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.controllers.ChatController$removeCorruptedFiles$1", f = "ChatController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ChatController$removeCorruptedFiles$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ List<ChatItem> $list;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatController$removeCorruptedFiles$1(List<? extends ChatItem> list, Function0<Unit> function0, cv1<? super ChatController$removeCorruptedFiles$1> cv1Var) {
        super(2, cv1Var);
        this.$list = list;
        this.$callback = function0;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        return new ChatController$removeCorruptedFiles$1(this.$list, this.$callback, cv1Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((ChatController$removeCorruptedFiles$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        ConsultPhrase consultPhrase;
        Uri uri2;
        c75.d();
        if (this.label == 0) {
            vk9.b(obj);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.$list.iterator();
            while (true) {
                UserPhrase userPhrase = null;
                if (!it.hasNext()) {
                    break;
                }
                ChatItem chatItem = (ChatItem) it.next();
                if (chatItem instanceof UserPhrase) {
                    userPhrase = (UserPhrase) chatItem;
                }
                if (userPhrase != null) {
                    arrayList.add(userPhrase);
                }
            }
            ArrayList<UserPhrase> arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                UserPhrase userPhrase2 = (UserPhrase) obj2;
                FileDescription fileDescription = userPhrase2.getFileDescription();
                if (fileDescription != null) {
                    uri2 = fileDescription.getFileUri();
                } else {
                    uri2 = null;
                }
                if (uri2 != null && (FileUtils.isImage(userPhrase2.getFileDescription()) || FileUtils.isVoiceMessage(userPhrase2.getFileDescription()))) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList<FileDescription> arrayList3 = new ArrayList();
            for (UserPhrase userPhrase3 : arrayList2) {
                FileDescription fileDescription2 = userPhrase3.getFileDescription();
                if (fileDescription2 != null) {
                    arrayList3.add(fileDescription2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (ChatItem chatItem2 : this.$list) {
                if (chatItem2 instanceof ConsultPhrase) {
                    consultPhrase = (ConsultPhrase) chatItem2;
                } else {
                    consultPhrase = null;
                }
                if (consultPhrase != null) {
                    arrayList4.add(consultPhrase);
                }
            }
            ArrayList<ConsultPhrase> arrayList5 = new ArrayList();
            for (Object obj3 : arrayList4) {
                ConsultPhrase consultPhrase2 = (ConsultPhrase) obj3;
                FileDescription fileDescription3 = consultPhrase2.getFileDescription();
                if (fileDescription3 != null) {
                    uri = fileDescription3.getFileUri();
                } else {
                    uri = null;
                }
                if (uri != null && (FileUtils.isImage(consultPhrase2.getFileDescription()) || FileUtils.isVoiceMessage(consultPhrase2.getFileDescription()))) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList<FileDescription> arrayList6 = new ArrayList();
            for (ConsultPhrase consultPhrase3 : arrayList5) {
                FileDescription fileDescription4 = consultPhrase3.getFileDescription();
                if (fileDescription4 != null) {
                    arrayList6.add(fileDescription4);
                }
            }
            for (FileDescription fileDescription5 : arrayList3) {
                FileUtils.removeFileIfCorrupted(fileDescription5);
            }
            for (FileDescription fileDescription6 : arrayList6) {
                FileUtils.removeFileIfCorrupted(fileDescription6);
            }
            Function0<Unit> function0 = this.$callback;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
