package defpackage;

import im.threads.ui.ChatCenterPushMessageHelper;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: ThreadsLibPushServiceImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lifb;", "Lhfb;", "", "token", "", "a", "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Lim/threads/ui/ChatCenterPushMessageHelper;", "Lim/threads/ui/ChatCenterPushMessageHelper;", "chatCenterPushMessageHelper", "<init>", "(Lim/threads/ui/ChatCenterPushMessageHelper;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ifb  reason: default package */
/* loaded from: classes.dex */
public final class ifb implements hfb {
    private final ChatCenterPushMessageHelper a;

    public ifb(ChatCenterPushMessageHelper chatCenterPushMessageHelper) {
        z65.h(chatCenterPushMessageHelper, "chatCenterPushMessageHelper");
        this.a = chatCenterPushMessageHelper;
    }

    @Override // defpackage.hfb
    public Object a(String str, cv1<? super Unit> cv1Var) {
        this.a.setFcmToken(str);
        return Unit.a;
    }
}
