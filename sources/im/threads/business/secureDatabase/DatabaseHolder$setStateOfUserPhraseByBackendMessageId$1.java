package im.threads.business.secureDatabase;

import im.threads.business.extensions.MutableLazy;
import im.threads.business.models.MessageStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseHolder.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatabaseHolder$setStateOfUserPhraseByBackendMessageId$1 extends ej5 implements Function0<Unit> {
    final /* synthetic */ String $messageId;
    final /* synthetic */ MessageStatus $messageStatus;
    final /* synthetic */ DatabaseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseHolder$setStateOfUserPhraseByBackendMessageId$1(DatabaseHolder databaseHolder, String str, MessageStatus messageStatus) {
        super(0);
        this.this$0 = databaseHolder;
        this.$messageId = str;
        this.$messageStatus = messageStatus;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableLazy mutableLazy;
        mutableLazy = this.this$0.myOpenHelper;
        ((ThreadsDbHelper) mutableLazy.getValue()).setUserPhraseStateByBackendMessageId(this.$messageId, this.$messageStatus);
    }
}
