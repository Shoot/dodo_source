package im.threads.ui.adapters.utils;

import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.ui.adapters.ChatAdapter;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
/* compiled from: SendingStatusObserver.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lim/threads/ui/adapters/utils/SendingStatusObserver;", "", "", "startObserving", "pauseObserving", "finishObserving", "Ljava/lang/ref/WeakReference;", "Lim/threads/ui/adapters/ChatAdapter;", "chatAdapterRef", "Ljava/lang/ref/WeakReference;", "", "interval", "J", "Lim/threads/business/secureDatabase/DatabaseHolder;", "database$delegate", "Lrn5;", "getDatabase", "()Lim/threads/business/secureDatabase/DatabaseHolder;", "database", "Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor$delegate", "getChatUpdateProcessor", "()Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor", "Lqx1;", "coroutineScope", "Lqx1;", "", "isObserving", "Z", "<init>", "(Ljava/lang/ref/WeakReference;J)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SendingStatusObserver {
    private final WeakReference<ChatAdapter> chatAdapterRef;
    private final rn5 chatUpdateProcessor$delegate;
    private final qx1 coroutineScope;
    private final rn5 database$delegate;
    private final long interval;
    private boolean isObserving;

    public SendingStatusObserver(WeakReference<ChatAdapter> weakReference, long j) {
        rn5 b;
        rn5 b2;
        z65.h(weakReference, "chatAdapterRef");
        this.chatAdapterRef = weakReference;
        this.interval = j;
        b = yn5.b(SendingStatusObserver$special$$inlined$inject$1.INSTANCE);
        this.database$delegate = b;
        b2 = yn5.b(SendingStatusObserver$special$$inlined$inject$2.INSTANCE);
        this.chatUpdateProcessor$delegate = b2;
        this.coroutineScope = rx1.a(v33.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatUpdateProcessor getChatUpdateProcessor() {
        return (ChatUpdateProcessor) this.chatUpdateProcessor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DatabaseHolder getDatabase() {
        return (DatabaseHolder) this.database$delegate.getValue();
    }

    public final void finishObserving() {
        this.isObserving = false;
        rx1.d(this.coroutineScope, null, 1, null);
    }

    public final void pauseObserving() {
        this.isObserving = false;
    }

    public final void startObserving() {
        if (!this.isObserving) {
            this.isObserving = true;
            sh0.d(this.coroutineScope, null, null, new SendingStatusObserver$startObserving$1(this, null), 3, null);
        }
    }
}
