package im.threads.business.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ThreadsLibBase.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "count", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ThreadsLibBase$Companion$initBaseParams$1$1 extends ej5 implements Function1<Integer, Unit> {
    final /* synthetic */ UnreadMessagesCountListener $unreadMessagesCountListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadsLibBase$Companion$initBaseParams$1$1(UnreadMessagesCountListener unreadMessagesCountListener) {
        super(1);
        this.$unreadMessagesCountListener = unreadMessagesCountListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.a;
    }

    public final void invoke(int i) {
        this.$unreadMessagesCountListener.onUnreadMessagesCountChanged(i);
    }
}
