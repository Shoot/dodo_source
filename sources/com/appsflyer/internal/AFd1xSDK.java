package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class AFd1xSDK implements Runnable {
    final ExecutorService valueOf;
    public Executor AFKeystoreWrapper = Executors.newSingleThreadExecutor();
    private Timer afRDLog = new Timer(true);
    public final List<AFd1zSDK> AFInAppEventParameterName = new CopyOnWriteArrayList();
    final Set<AFd1wSDK> AFInAppEventType = new CopyOnWriteArraySet();
    final Set<AFd1wSDK> values = Collections.newSetFromMap(new ConcurrentHashMap());
    final NavigableSet<AFd1tSDK<?>> afInfoLog = new ConcurrentSkipListSet();
    final NavigableSet<AFd1tSDK<?>> AFLogger = new ConcurrentSkipListSet();
    final List<AFd1tSDK<?>> afDebugLog = new ArrayList();
    final Set<AFd1tSDK<?>> afErrorLog = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: com.appsflyer.internal.AFd1xSDK$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {
        private /* synthetic */ AFd1tSDK AFInAppEventParameterName;

        public AnonymousClass2(AFd1tSDK aFd1tSDK) {
            this.AFInAppEventParameterName = aFd1tSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFd1xSDK.this.afInfoLog) {
                try {
                    if (AFd1xSDK.this.afErrorLog.contains(this.AFInAppEventParameterName)) {
                        StringBuilder sb = new StringBuilder("QUEUE: tried to add already running task: ");
                        sb.append(this.AFInAppEventParameterName);
                        AFLogger.afDebugLog(sb.toString());
                        return;
                    }
                    if (!AFd1xSDK.this.afInfoLog.contains(this.AFInAppEventParameterName) && !AFd1xSDK.this.AFLogger.contains(this.AFInAppEventParameterName)) {
                        AFd1xSDK aFd1xSDK = AFd1xSDK.this;
                        AFd1tSDK aFd1tSDK = this.AFInAppEventParameterName;
                        for (AFd1wSDK aFd1wSDK : aFd1tSDK.AFInAppEventParameterName) {
                            if (aFd1xSDK.values.contains(aFd1wSDK)) {
                                aFd1tSDK.values.add(aFd1wSDK);
                            }
                        }
                        if (AFd1xSDK.this.AFInAppEventParameterName(this.AFInAppEventParameterName)) {
                            add = AFd1xSDK.this.afInfoLog.add(this.AFInAppEventParameterName);
                        } else {
                            add = AFd1xSDK.this.AFLogger.add(this.AFInAppEventParameterName);
                            if (add) {
                                StringBuilder sb2 = new StringBuilder("QUEUE: new task was blocked: ");
                                sb2.append(this.AFInAppEventParameterName);
                                AFLogger.afDebugLog(sb2.toString());
                                this.AFInAppEventParameterName.values();
                            }
                        }
                        if (add) {
                            AFd1xSDK aFd1xSDK2 = AFd1xSDK.this;
                            aFd1xSDK2.afInfoLog.addAll(aFd1xSDK2.afDebugLog);
                            AFd1xSDK.this.afDebugLog.clear();
                        } else {
                            StringBuilder sb3 = new StringBuilder("QUEUE: task not added, it's already in the queue: ");
                            sb3.append(this.AFInAppEventParameterName);
                            AFLogger.afDebugLog(sb3.toString());
                        }
                        if (add) {
                            AFd1xSDK.this.values.add(this.AFInAppEventParameterName.AFKeystoreWrapper);
                            StringBuilder sb4 = new StringBuilder("QUEUE: new task added: ");
                            sb4.append(this.AFInAppEventParameterName);
                            AFLogger.afDebugLog(sb4.toString());
                            for (AFd1zSDK aFd1zSDK : AFd1xSDK.this.AFInAppEventParameterName) {
                            }
                            AFd1xSDK aFd1xSDK3 = AFd1xSDK.this;
                            aFd1xSDK3.valueOf.submit(aFd1xSDK3);
                            AFd1xSDK aFd1xSDK4 = AFd1xSDK.this;
                            synchronized (aFd1xSDK4.afInfoLog) {
                                try {
                                    for (int size = (aFd1xSDK4.afInfoLog.size() + aFd1xSDK4.AFLogger.size()) - 40; size > 0; size--) {
                                        boolean z = !aFd1xSDK4.AFLogger.isEmpty();
                                        boolean z2 = !aFd1xSDK4.afInfoLog.isEmpty();
                                        if (z2 && z) {
                                            if (aFd1xSDK4.afInfoLog.first().compareTo(aFd1xSDK4.AFLogger.first()) > 0) {
                                                aFd1xSDK4.values(aFd1xSDK4.afInfoLog);
                                            } else {
                                                aFd1xSDK4.values(aFd1xSDK4.AFLogger);
                                            }
                                        } else if (z2) {
                                            aFd1xSDK4.values(aFd1xSDK4.afInfoLog);
                                        } else if (z) {
                                            aFd1xSDK4.values(aFd1xSDK4.AFLogger);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return;
                        }
                        StringBuilder sb5 = new StringBuilder("QUEUE: tried to add already pending task: ");
                        sb5.append(this.AFInAppEventParameterName);
                        AFLogger.afWarnLog(sb5.toString());
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder("QUEUE: tried to add already scheduled task: ");
                    sb6.append(this.AFInAppEventParameterName);
                    AFLogger.afDebugLog(sb6.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public AFd1xSDK(ExecutorService executorService) {
        this.valueOf = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean AFInAppEventParameterName(AFd1tSDK<?> aFd1tSDK) {
        return this.AFInAppEventType.containsAll(aFd1tSDK.values);
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.afInfoLog) {
            try {
                final AFd1tSDK<?> pollFirst = this.afInfoLog.pollFirst();
                if (pollFirst == null) {
                    return;
                }
                this.afErrorLog.add(pollFirst);
                long AFInAppEventType = pollFirst.AFInAppEventType();
                AFd1vSDK aFd1vSDK = new AFd1vSDK(Thread.currentThread());
                if (AFInAppEventType > 0) {
                    this.afRDLog.schedule(aFd1vSDK, AFInAppEventType);
                }
                this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1xSDK.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (AFd1zSDK aFd1zSDK : AFd1xSDK.this.AFInAppEventParameterName) {
                            aFd1zSDK.AFKeystoreWrapper(pollFirst);
                        }
                    }
                });
                if (!this.afInfoLog.isEmpty()) {
                    this.valueOf.submit(this);
                }
                try {
                    AFLogger.afDebugLog("QUEUE: starting task execution: ".concat(String.valueOf(pollFirst)));
                    final AFc1aSDK call = pollFirst.call();
                    aFd1vSDK.cancel();
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1xSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(call);
                            AFLogger.afDebugLog(sb.toString());
                            AFd1xSDK.this.afErrorLog.remove(pollFirst);
                            for (AFd1zSDK aFd1zSDK : AFd1xSDK.this.AFInAppEventParameterName) {
                                aFd1zSDK.AFInAppEventType(pollFirst, call);
                            }
                            if (call == AFc1aSDK.SUCCESS) {
                                AFd1xSDK.this.AFInAppEventType.add(pollFirst.AFKeystoreWrapper);
                                AFd1xSDK.AFInAppEventParameterName(AFd1xSDK.this);
                            } else if (pollFirst.valueOf()) {
                                synchronized (AFd1xSDK.this.afInfoLog) {
                                    try {
                                        AFd1xSDK.this.afDebugLog.add(pollFirst);
                                        for (AFd1zSDK aFd1zSDK2 : AFd1xSDK.this.AFInAppEventParameterName) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } else {
                                AFd1xSDK.this.AFInAppEventType.add(pollFirst.AFKeystoreWrapper);
                                AFd1xSDK.AFInAppEventParameterName(AFd1xSDK.this);
                            }
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.afDebugLog("QUEUE: task was interrupted: ".concat(String.valueOf(pollFirst)));
                    final AFc1aSDK aFc1aSDK = AFc1aSDK.TIMEOUT;
                    pollFirst.AFInAppEventType = aFc1aSDK;
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1xSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(aFc1aSDK);
                            AFLogger.afDebugLog(sb.toString());
                            AFd1xSDK.this.afErrorLog.remove(pollFirst);
                            for (AFd1zSDK aFd1zSDK : AFd1xSDK.this.AFInAppEventParameterName) {
                                aFd1zSDK.AFInAppEventType(pollFirst, aFc1aSDK);
                            }
                            if (aFc1aSDK == AFc1aSDK.SUCCESS) {
                                AFd1xSDK.this.AFInAppEventType.add(pollFirst.AFKeystoreWrapper);
                                AFd1xSDK.AFInAppEventParameterName(AFd1xSDK.this);
                            } else if (pollFirst.valueOf()) {
                                synchronized (AFd1xSDK.this.afInfoLog) {
                                    try {
                                        AFd1xSDK.this.afDebugLog.add(pollFirst);
                                        for (AFd1zSDK aFd1zSDK2 : AFd1xSDK.this.AFInAppEventParameterName) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } else {
                                AFd1xSDK.this.AFInAppEventType.add(pollFirst.AFKeystoreWrapper);
                                AFd1xSDK.AFInAppEventParameterName(AFd1xSDK.this);
                            }
                        }
                    });
                } catch (Throwable unused2) {
                    aFd1vSDK.cancel();
                    final AFc1aSDK aFc1aSDK2 = AFc1aSDK.FAILURE;
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1xSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(aFc1aSDK2);
                            AFLogger.afDebugLog(sb.toString());
                            AFd1xSDK.this.afErrorLog.remove(pollFirst);
                            for (AFd1zSDK aFd1zSDK : AFd1xSDK.this.AFInAppEventParameterName) {
                                aFd1zSDK.AFInAppEventType(pollFirst, aFc1aSDK2);
                            }
                            if (aFc1aSDK2 == AFc1aSDK.SUCCESS) {
                                AFd1xSDK.this.AFInAppEventType.add(pollFirst.AFKeystoreWrapper);
                                AFd1xSDK.AFInAppEventParameterName(AFd1xSDK.this);
                            } else if (pollFirst.valueOf()) {
                                synchronized (AFd1xSDK.this.afInfoLog) {
                                    try {
                                        AFd1xSDK.this.afDebugLog.add(pollFirst);
                                        for (AFd1zSDK aFd1zSDK2 : AFd1xSDK.this.AFInAppEventParameterName) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } else {
                                AFd1xSDK.this.AFInAppEventType.add(pollFirst.AFKeystoreWrapper);
                                AFd1xSDK.AFInAppEventParameterName(AFd1xSDK.this);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void values(NavigableSet<AFd1tSDK<?>> navigableSet) {
        AFd1tSDK<?> pollFirst = navigableSet.pollFirst();
        this.AFInAppEventType.add(pollFirst.AFKeystoreWrapper);
        for (AFd1zSDK aFd1zSDK : this.AFInAppEventParameterName) {
            aFd1zSDK.valueOf(pollFirst);
        }
    }

    static /* synthetic */ void AFInAppEventParameterName(AFd1xSDK aFd1xSDK) {
        synchronized (aFd1xSDK.afInfoLog) {
            try {
                Iterator<AFd1tSDK<?>> it = aFd1xSDK.AFLogger.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    AFd1tSDK<?> next = it.next();
                    if (aFd1xSDK.AFInAppEventParameterName(next)) {
                        it.remove();
                        aFd1xSDK.afInfoLog.add(next);
                        z = true;
                    }
                }
                if (z) {
                    aFd1xSDK.valueOf.submit(aFd1xSDK);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
