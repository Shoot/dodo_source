package im.threads.ui.controllers;

import im.threads.business.models.Hidable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0007\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lim/threads/business/models/Hidable;", "item", "Lls8;", "", "kotlin.jvm.PlatformType", "invoke", "(Lim/threads/business/models/Hidable;)Lls8;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatController$subscribeToNewMessage$4 extends ej5 implements Function1<Hidable, ls8<Long>> {
    public static final ChatController$subscribeToNewMessage$4 INSTANCE = new ChatController$subscribeToNewMessage$4();

    ChatController$subscribeToNewMessage$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ls8<Long> invoke(Hidable hidable) {
        z65.h(hidable, "item");
        Long hideAfter = hidable.getHideAfter();
        return l04.Z(hideAfter != null ? hideAfter.longValue() : 0L, TimeUnit.SECONDS);
    }
}
