package defpackage;

import im.threads.business.core.UnreadMessagesCountListener;
import kotlin.Metadata;
/* compiled from: ThreadsLibUnreadMessagesCount.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Ljfb;", "Lzt6;", "Lim/threads/business/core/UnreadMessagesCountListener;", "", "count", "", "onUnreadMessagesCountChanged", "Lfr6;", "a", "Lfr6;", "_unreadChatMessagesCount", "Loz3;", "b", "Loz3;", "()Loz3;", "unreadChatMessagesCount", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jfb  reason: default package */
/* loaded from: classes.dex */
public final class jfb implements zt6, UnreadMessagesCountListener {
    private final fr6<Integer> a;
    private final oz3<Integer> b;

    public jfb() {
        fr6<Integer> a = mua.a(0);
        this.a = a;
        this.b = a;
    }

    @Override // defpackage.zt6
    public oz3<Integer> a() {
        return this.b;
    }

    @Override // im.threads.business.core.UnreadMessagesCountListener
    public void onUnreadMessagesCountChanged(int i) {
        this.a.setValue(Integer.valueOf(i));
    }
}
