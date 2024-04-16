package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
@Keep
/* loaded from: classes2.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, sx3> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final r13 cache;
    private final Executor executor;
    private com.google.firebase.remoteconfig.a firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private bs8<com.google.firebase.remoteconfig.c> firebaseRemoteConfigProvider;
    private static final sh logger = sh.e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(r13.e(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS) + MIN_APP_START_CONFIG_FETCH_DELAY_MS, getInitialStartupMillis());
    }

    static long getInitialStartupMillis() {
        xta xtaVar = (xta) qv3.l().j(xta.class);
        if (xtaVar != null) {
            return xtaVar.c();
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private sx3 getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            sx3 sx3Var = this.allRcConfigMap.get(str);
            if (sx3Var.b() == 2) {
                logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", sx3Var.a(), str);
                return sx3Var;
            }
            return null;
        }
        return null;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        if (j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs) {
            return true;
        }
        return false;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        if (j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.k("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return true;
        }
        return false;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.k().h(this.executor, new a97() { // from class: id9
            @Override // defpackage.a97
            public final void onSuccess(Object obj) {
                RemoteConfigManager.this.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
            }
        }).f(this.executor, new a87() { // from class: jd9
            @Override // defpackage.a87
            public final void onFailure(Exception exc) {
                RemoteConfigManager.this.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (!isFirebaseRemoteConfigAvailable()) {
            return;
        }
        if (this.allRcConfigMap.isEmpty()) {
            this.allRcConfigMap.putAll(this.firebaseRemoteConfig.l());
        }
        if (shouldFetchAndActivateRemoteConfigValues()) {
            triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
        }
    }

    public qb7<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return qb7.a();
        }
        sx3 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return qb7.e(Boolean.valueOf(remoteConfigValue.e()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.a().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.a(), str);
                }
            }
        }
        return qb7.a();
    }

    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public qb7<Double> getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return qb7.a();
        }
        sx3 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return qb7.e(Double.valueOf(remoteConfigValue.d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.a().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.a(), str);
                }
            }
        }
        return qb7.a();
    }

    public qb7<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return qb7.a();
        }
        sx3 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return qb7.e(Long.valueOf(remoteConfigValue.c()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.a().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.a(), str);
                }
            }
        }
        return qb7.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        Object obj;
        sx3 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    obj = Boolean.valueOf(remoteConfigValue.e());
                } else if (t instanceof Double) {
                    obj = Double.valueOf(remoteConfigValue.d());
                } else {
                    if (!(t instanceof Long) && !(t instanceof Integer)) {
                        if (t instanceof String) {
                            obj = remoteConfigValue.a();
                        } else {
                            T t2 = (T) remoteConfigValue.a();
                            try {
                                logger.b("No matching type found for the defaultValue: '%s', using String.", t);
                                return t2;
                            } catch (IllegalArgumentException unused) {
                                t = t2;
                                if (!remoteConfigValue.a().isEmpty()) {
                                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.a(), str);
                                    return t;
                                }
                                return t;
                            }
                        }
                    }
                    obj = Long.valueOf(remoteConfigValue.c());
                }
                return obj;
            } catch (IllegalArgumentException unused2) {
            }
        } else {
            return t;
        }
    }

    public qb7<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return qb7.a();
        }
        sx3 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return qb7.e(remoteConfigValue.a());
        }
        return qb7.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        bs8<com.google.firebase.remoteconfig.c> bs8Var;
        com.google.firebase.remoteconfig.c cVar;
        if (this.firebaseRemoteConfig == null && (bs8Var = this.firebaseRemoteConfigProvider) != null && (cVar = bs8Var.get()) != null) {
            this.firebaseRemoteConfig = cVar.e(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        com.google.firebase.remoteconfig.a aVar = this.firebaseRemoteConfig;
        if (aVar == null || aVar.n().a() == 1 || this.firebaseRemoteConfig.n().a() == 2) {
            return true;
        }
        return false;
    }

    public void setFirebaseRemoteConfigProvider(bs8<com.google.firebase.remoteconfig.c> bs8Var) {
        this.firebaseRemoteConfigProvider = bs8Var;
    }

    protected void syncConfigValues(Map<String, sx3> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        d e = d.e();
        sx3 sx3Var = this.allRcConfigMap.get(e.c());
        if (sx3Var != null) {
            try {
                this.cache.m(e.a(), sx3Var.e());
                return;
            } catch (Exception unused) {
                logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
                return;
            }
        }
        logger.a("ExperimentTTID remote config flag does not exist.");
    }

    RemoteConfigManager(r13 r13Var, Executor executor, com.google.firebase.remoteconfig.a aVar, long j, long j2) {
        ConcurrentHashMap<String, sx3> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = r13Var;
        this.executor = executor;
        this.firebaseRemoteConfig = aVar;
        if (aVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(aVar.l());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j2;
        this.appStartConfigFetchDelayInMs = j;
    }
}
