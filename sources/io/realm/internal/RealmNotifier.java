package io.realm.internal;

import io.realm.internal.e;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
@Keep
/* loaded from: classes3.dex */
public abstract class RealmNotifier implements Closeable {
    private OsSharedRealm sharedRealm;
    private e<b> realmObserverPairs = new e<>();
    private final e.a<b> onChangeCallBack = new a();
    private List<Runnable> transactionCallbacks = new ArrayList();
    private List<Runnable> startSendingNotificationsCallbacks = new ArrayList();
    private List<Runnable> finishedSendingNotificationsCallbacks = new ArrayList();

    /* loaded from: classes3.dex */
    class a implements e.a<b> {
        a() {
        }

        @Override // io.realm.internal.e.a
        /* renamed from: b */
        public void a(b bVar, Object obj) {
            if (RealmNotifier.this.sharedRealm != null && !RealmNotifier.this.sharedRealm.isClosed()) {
                bVar.b(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b<T> extends e.b<T, d89<T>> {
        b(T t, d89<T> d89Var) {
            super(t, d89Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(T t) {
            if (t != null) {
                ((d89) this.b).a(t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RealmNotifier(OsSharedRealm osSharedRealm) {
        this.sharedRealm = osSharedRealm;
    }

    private void removeAllChangeListeners() {
        this.realmObserverPairs.b();
    }

    public void addBeginSendingNotificationsCallback(Runnable runnable) {
        this.startSendingNotificationsCallbacks.add(runnable);
    }

    public <T> void addChangeListener(T t, d89<T> d89Var) {
        this.realmObserverPairs.a(new b(t, d89Var));
    }

    public void addFinishedSendingNotificationsCallback(Runnable runnable) {
        this.finishedSendingNotificationsCallbacks.add(runnable);
    }

    public void addTransactionCallback(Runnable runnable) {
        this.transactionCallbacks.add(runnable);
    }

    void beforeNotify() {
        this.sharedRealm.invalidateIterators();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        removeAllChangeListeners();
        this.startSendingNotificationsCallbacks.clear();
        this.finishedSendingNotificationsCallbacks.clear();
    }

    void didChange() {
        this.realmObserverPairs.c(this.onChangeCallBack);
        if (!this.transactionCallbacks.isEmpty()) {
            List<Runnable> list = this.transactionCallbacks;
            this.transactionCallbacks = new ArrayList();
            for (Runnable runnable : list) {
                runnable.run();
            }
        }
    }

    void didSendNotifications() {
        for (int i = 0; i < this.startSendingNotificationsCallbacks.size(); i++) {
            this.finishedSendingNotificationsCallbacks.get(i).run();
        }
    }

    public int getListenersListSize() {
        return this.realmObserverPairs.g();
    }

    public abstract boolean post(Runnable runnable);

    public <E> void removeChangeListener(E e, d89<E> d89Var) {
        this.realmObserverPairs.e(e, d89Var);
    }

    public <E> void removeChangeListeners(E e) {
        this.realmObserverPairs.f(e);
    }

    void willSendNotifications() {
        for (int i = 0; i < this.startSendingNotificationsCallbacks.size(); i++) {
            this.startSendingNotificationsCallbacks.get(i).run();
        }
    }
}
