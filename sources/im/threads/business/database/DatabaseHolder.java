package im.threads.business.database;

import im.threads.business.config.BaseConfig;
import im.threads.business.database.DatabaseHolder;
import im.threads.business.models.ChatItem;
import im.threads.business.models.FileDescription;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DatabaseHolder.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lim/threads/business/database/DatabaseHolder;", "", "", "offset", "limit", "", "Lim/threads/business/models/ChatItem;", "getChatItems", "Lim/threads/business/database/ThreadsDbHelper;", "mMyOpenHelper", "Lim/threads/business/database/ThreadsDbHelper;", "Lbma;", "Lim/threads/business/models/FileDescription;", "getAllFileDescriptions", "()Lbma;", "allFileDescriptions", "<init>", "()V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class DatabaseHolder {
    public static final Companion Companion = new Companion(null);
    private static DatabaseHolder instance;
    private final ThreadsDbHelper mMyOpenHelper;

    /* compiled from: DatabaseHolder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lim/threads/business/database/DatabaseHolder$Companion;", "", "()V", "<set-?>", "Lim/threads/business/database/DatabaseHolder;", "instance", "getInstance", "()Lim/threads/business/database/DatabaseHolder;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DatabaseHolder getInstance() {
            if (DatabaseHolder.instance == null) {
                DatabaseHolder.instance = new DatabaseHolder(null);
            }
            return DatabaseHolder.instance;
        }
    }

    public /* synthetic */ DatabaseHolder(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _get_allFileDescriptions_$lambda$0(DatabaseHolder databaseHolder) {
        z65.h(databaseHolder, "this$0");
        return databaseHolder.mMyOpenHelper.getAllFileDescriptions();
    }

    public final bma<List<FileDescription>> getAllFileDescriptions() {
        bma<List<FileDescription>> k = bma.f(new Callable() { // from class: hm2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List _get_allFileDescriptions_$lambda$0;
                _get_allFileDescriptions_$lambda$0 = DatabaseHolder._get_allFileDescriptions_$lambda$0(DatabaseHolder.this);
                return _get_allFileDescriptions_$lambda$0;
            }
        }).k(dw9.b());
        z65.g(k, "fromCallable { mMyOpenHe…scribeOn(Schedulers.io())");
        return k;
    }

    public final List<ChatItem> getChatItems(int i, int i2) {
        return this.mMyOpenHelper.getChatItems(i, i2);
    }

    private DatabaseHolder() {
        this.mMyOpenHelper = new ThreadsDbHelper(BaseConfig.Companion.getInstance().context);
    }
}
