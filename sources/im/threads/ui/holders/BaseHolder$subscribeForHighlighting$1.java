package im.threads.ui.holders;

import im.threads.business.models.ChatItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseHolder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "streamChatItem", "Lim/threads/business/models/ChatItem;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseHolder$subscribeForHighlighting$1 extends ej5 implements Function1<ChatItem, Unit> {
    final /* synthetic */ BaseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseHolder$subscribeForHighlighting$1(BaseHolder baseHolder) {
        super(1);
        this.this$0 = baseHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChatItem chatItem) {
        invoke2(chatItem);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r0 != false) goto L10;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(im.threads.business.models.ChatItem r2) {
        /*
            r1 = this;
            im.threads.ui.holders.BaseHolder r0 = r1.this$0
            im.threads.business.models.ChatItem r0 = im.threads.ui.holders.BaseHolder.access$getCurrentChatItem$p(r0)
            if (r0 == 0) goto Ld
            boolean r2 = r0.isTheSameItem(r2)
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L18
            im.threads.ui.holders.BaseHolder r0 = r1.this$0
            boolean r0 = im.threads.ui.holders.BaseHolder.access$isThisItemHighlighted$p(r0)
            if (r0 == 0) goto L22
        L18:
            im.threads.ui.holders.BaseHolder r0 = r1.this$0
            boolean r0 = im.threads.ui.holders.BaseHolder.access$isThisItemHighlighted$p(r0)
            if (r0 == 0) goto L27
            if (r2 != 0) goto L27
        L22:
            im.threads.ui.holders.BaseHolder r0 = r1.this$0
            r0.changeHighlighting(r2)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.holders.BaseHolder$subscribeForHighlighting$1.invoke2(im.threads.business.models.ChatItem):void");
    }
}
