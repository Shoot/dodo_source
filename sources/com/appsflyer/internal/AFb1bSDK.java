package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class AFb1bSDK implements AFc1xSDK {
    private ExecutorService AFInAppEventType;
    private ExecutorService AFKeystoreWrapper;
    private AFb1fSDK AFLogger;
    private AFe1xSDK AFLogger$LogLevel;
    private AFd1xSDK AFVersionDeclaration;
    private AFe1nSDK afDebugLog;
    private CreateOneLinkHttpTask afErrorLog;
    private AFf1sSDK afErrorLogForExcManagerOnly;
    private PurchaseHandler afInfoLog;
    private AFb1vSDK afRDLog;
    private AFc1wSDK afWarnLog;
    private AFa1lSDK getLevel;
    private AFc1cSDK onAppOpenAttributionNative;
    private ScheduledExecutorService values;
    private final int AFInAppEventParameterName = (int) TimeUnit.SECONDS.toMillis(30);
    public final AFc1ySDK valueOf = new AFc1ySDK();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class AFa1wSDK implements ThreadFactory {
        private static final AtomicInteger AFKeystoreWrapper = new AtomicInteger();
        private final AtomicInteger AFInAppEventParameterName = new AtomicInteger();

        public AFa1wSDK() {
            AFKeystoreWrapper.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = AFKeystoreWrapper.get();
            int incrementAndGet = this.AFInAppEventParameterName.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i);
            sb.append("-");
            sb.append(incrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }

    private synchronized CreateOneLinkHttpTask onAppOpenAttributionNative() {
        try {
            if (this.afErrorLog == null) {
                this.afErrorLog = new CreateOneLinkHttpTask(new AFc1mSDK(this.AFInAppEventParameterName), AFInAppEventParameterName());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afErrorLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    /* renamed from: onInstallConversionFailureNative */
    public synchronized AFc1wSDK onInstallConversionDataLoadedNative() {
        try {
            if (this.afWarnLog == null) {
                this.afWarnLog = new AFc1wSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized ExecutorService AFInAppEventParameterName() {
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = Executors.newCachedThreadPool();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFKeystoreWrapper;
    }

    @NonNull
    public final synchronized ScheduledExecutorService AFInAppEventType() {
        try {
            if (this.values == null) {
                this.values = Executors.newScheduledThreadPool(2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final AFc1pSDK AFKeystoreWrapper() {
        return new AFc1pSDK(onAppOpenAttributionNative(), values(), AppsFlyerProperties.getInstance(), AppsFlyer2dXConversionCallback());
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized PurchaseHandler AFLogger() {
        try {
            if (this.afInfoLog == null) {
                this.afInfoLog = new PurchaseHandler(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized AFb1uSDK AFLogger$LogLevel() {
        return AFb1uSDK.AFInAppEventType();
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFe1xSDK AFVersionDeclaration() {
        try {
            if (this.AFLogger$LogLevel == null) {
                this.AFLogger$LogLevel = new AFe1xSDK(afErrorLogForExcManagerOnly(), new AFe1vSDK());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFc1cSDK AppsFlyer2dXConversionCallback() {
        try {
            if (this.onAppOpenAttributionNative == null) {
                this.onAppOpenAttributionNative = new AFc1cSDK(values(), afErrorLog());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.onAppOpenAttributionNative;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized AFd1xSDK afDebugLog() {
        try {
            if (this.AFVersionDeclaration == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFb1bSDK.4
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* renamed from: AFInAppEventParameterName */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1wSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.b
                    @Override // java.util.concurrent.RejectedExecutionHandler
                    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                        AFb1bSDK.valueOf(runnable, threadPoolExecutor2);
                    }
                });
                this.AFVersionDeclaration = new AFd1xSDK(threadPoolExecutor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFVersionDeclaration;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final AFb1gSDK afErrorLog() {
        Context context = this.valueOf.values;
        if (context != null) {
            return new AFb1eSDK(AFb1zSDK.AFInAppEventType(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFc1ySDK afErrorLogForExcManagerOnly() {
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized AFb1vSDK afInfoLog() {
        try {
            if (this.afRDLog == null) {
                AFe1wSDK aFe1wSDK = new AFe1wSDK(afErrorLog());
                this.afRDLog = new AFb1vSDK(new AFe1zSDK(), values(), AFVersionDeclaration(), aFe1wSDK, new AFc1pSDK(onAppOpenAttributionNative(), values(), AppsFlyerProperties.getInstance(), AppsFlyer2dXConversionCallback()), new AFe1uSDK(values(), aFe1wSDK), afDebugLog());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized AFe1nSDK afRDLog() {
        try {
            if (this.afDebugLog == null) {
                this.afDebugLog = new AFe1nSDK(afErrorLog());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFa1lSDK afWarnLog() {
        try {
            if (this.getLevel == null) {
                this.getLevel = new AFa1lSDK(afErrorLogForExcManagerOnly());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized AFf1sSDK getLevel() {
        try {
            if (this.afErrorLogForExcManagerOnly == null) {
                this.afErrorLogForExcManagerOnly = new AFf1sSDK();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @NonNull
    public final synchronized ExecutorService valueOf() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = Executors.newSingleThreadExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    public final synchronized AFb1fSDK values() {
        try {
            if (this.AFLogger == null) {
                AFc1ySDK afErrorLogForExcManagerOnly = afErrorLogForExcManagerOnly();
                Context context = this.valueOf.values;
                if (context != null) {
                    this.AFLogger = new AFb1fSDK(afErrorLogForExcManagerOnly, new AFb1eSDK(AFb1zSDK.AFInAppEventType(context)));
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void valueOf(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
            Thread.currentThread().interrupt();
        }
    }
}
