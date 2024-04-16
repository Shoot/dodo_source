package im.threads.business.utils.messenger;

import im.threads.business.models.UserPhrase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: MessengerImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lim/threads/business/models/UserPhrase;", "invoke", "(Lim/threads/business/models/UserPhrase;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MessengerImpl$removeUserMessageFromQueue$1 extends ej5 implements Function1<UserPhrase, Boolean> {
    final /* synthetic */ UserPhrase $userPhrase;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerImpl$removeUserMessageFromQueue$1(UserPhrase userPhrase) {
        super(1);
        this.$userPhrase = userPhrase;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UserPhrase userPhrase) {
        z65.h(userPhrase, "it");
        return Boolean.valueOf(userPhrase.isTheSameItem(this.$userPhrase));
    }
}
