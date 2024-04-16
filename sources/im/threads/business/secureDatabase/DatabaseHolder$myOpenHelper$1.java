package im.threads.business.secureDatabase;

import android.content.Context;
import im.threads.business.secureDatabase.ThreadsDbHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseHolder.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/business/secureDatabase/ThreadsDbHelper;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatabaseHolder$myOpenHelper$1 extends ej5 implements Function0<ThreadsDbHelper> {
    final /* synthetic */ DatabaseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseHolder$myOpenHelper$1(DatabaseHolder databaseHolder) {
        super(0);
        this.this$0 = databaseHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ThreadsDbHelper invoke() {
        Context context;
        ThreadsDbHelper.Companion companion = ThreadsDbHelper.Companion;
        context = this.this$0.context;
        return companion.getInstance(context);
    }
}
