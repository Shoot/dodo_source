package im.threads.business.secureDatabase;

import im.threads.business.extensions.MutableLazy;
import im.threads.business.models.UserPhrase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lim/threads/business/models/UserPhrase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatabaseHolder$getUnsentUserPhrase$1 extends ej5 implements Function0<List<? extends UserPhrase>> {
    final /* synthetic */ int $count;
    final /* synthetic */ DatabaseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseHolder$getUnsentUserPhrase$1(DatabaseHolder databaseHolder, int i) {
        super(0);
        this.this$0 = databaseHolder;
        this.$count = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends UserPhrase> invoke() {
        MutableLazy mutableLazy;
        mutableLazy = this.this$0.myOpenHelper;
        return ((ThreadsDbHelper) mutableLazy.getValue()).getUnsendUserPhrase(this.$count);
    }
}
