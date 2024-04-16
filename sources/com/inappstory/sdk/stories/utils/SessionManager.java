package com.inappstory.sdk.stories.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.network.ApiSettings;
import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.stories.api.models.CachedSessionData;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.api.models.SessionResponse;
import com.inappstory.sdk.stories.api.models.StatisticPermissions;
import com.inappstory.sdk.stories.api.models.StatisticSendObject;
import com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback;
import com.inappstory.sdk.stories.cache.Downloader;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.statistic.OldStatisticManager;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public class SessionManager {
    private static final String FEATURES = "animation,data,deeplink,placeholder,webp,resetTimers,gameReader,swipeUpItems,sendApi,imgPlaceholder";
    private static SessionManager INSTANCE = null;
    public static boolean openProcess = false;
    private static final Object lock = new Object();
    public static Object openProcessLock = new Object();
    public static ArrayList<OpenSessionCallback> callbacks = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ SessionResponse a;

        a(SessionResponse sessionResponse) {
            this.a = sessionResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            Session session;
            SessionResponse sessionResponse = this.a;
            if (sessionResponse != null && (session = sessionResponse.session) != null) {
                session.statisticPermissions = new StatisticPermissions(sessionResponse.isAllowProfiling, sessionResponse.isAllowStatV1, sessionResponse.isAllowStatV2, sessionResponse.isAllowCrash);
                SessionResponse sessionResponse2 = this.a;
                Session session2 = sessionResponse2.session;
                session2.editor = sessionResponse2.editor;
                session2.save();
                InAppStoryService.getInstance().saveSessionPlaceholders(this.a.placeholders);
                InAppStoryService.getInstance().saveSessionImagePlaceholders(this.a.imagePlaceholders);
                synchronized (SessionManager.openProcessLock) {
                    try {
                        SessionManager.openProcess = false;
                        Iterator<OpenSessionCallback> it = SessionManager.callbacks.iterator();
                        while (it.hasNext()) {
                            OpenSessionCallback next = it.next();
                            if (next != null) {
                                next.onSuccess();
                            }
                        }
                        SessionManager.callbacks.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                InAppStoryService.getInstance().runStatisticThread();
                Downloader.downloadFonts(this.a.cachedFonts);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends NetworkCallback<SessionResponse> {
        final /* synthetic */ String a;

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<OpenSessionCallback> it = SessionManager.callbacks.iterator();
                while (it.hasNext()) {
                    OpenSessionCallback next = it.next();
                    if (next != null) {
                        next.onError();
                    }
                }
                SessionManager.callbacks.clear();
            }
        }

        /* renamed from: com.inappstory.sdk.stories.utils.SessionManager$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0271b implements Runnable {
            RunnableC0271b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<OpenSessionCallback> it = SessionManager.callbacks.iterator();
                while (it.hasNext()) {
                    OpenSessionCallback next = it.next();
                    if (next != null) {
                        next.onError();
                    }
                }
                SessionManager.callbacks.clear();
            }
        }

        b(String str) {
            this.a = str;
        }

        @Override // com.inappstory.sdk.network.Callback
        /* renamed from: a */
        public void onSuccess(SessionResponse sessionResponse) {
            if (InAppStoryService.isNull()) {
                return;
            }
            OldStatisticManager.getInstance().eventCount = 0;
            ProfilingManager.getInstance().setReady(this.a);
            SessionManager.this.openStatisticSuccess(sessionResponse);
            CachedSessionData cachedSessionData = new CachedSessionData();
            cachedSessionData.userId = InAppStoryService.getInstance().getUserId();
            cachedSessionData.placeholders = sessionResponse.placeholders;
            cachedSessionData.previewAspectRatio = sessionResponse.getPreviewAspectRatio();
            cachedSessionData.sessionId = sessionResponse.session.id;
            cachedSessionData.testKey = ApiSettings.getInstance().getTestKey();
            cachedSessionData.token = ApiSettings.getInstance().getApiKey();
            cachedSessionData.tags = InAppStoryService.getInstance().getTagsString();
            CachedSessionData.setInstance(cachedSessionData);
        }

        @Override // com.inappstory.sdk.network.Callback
        public Type getType() {
            return SessionResponse.class;
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onError(int i, String str) {
            ProfilingManager.getInstance().setReady(this.a);
            if (CallbackManager.getInstance().getErrorCallback() != null) {
                CallbackManager.getInstance().getErrorCallback().sessionError();
            }
            synchronized (SessionManager.openProcessLock) {
                SessionManager.openProcess = false;
                new Handler(Looper.getMainLooper()).post(new a());
            }
            super.onError(i, str);
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onTimeout() {
            ProfilingManager.getInstance().setReady(this.a);
            if (CallbackManager.getInstance().getErrorCallback() != null) {
                CallbackManager.getInstance().getErrorCallback().sessionError();
            }
            synchronized (SessionManager.openProcessLock) {
                SessionManager.openProcess = false;
                new Handler(Looper.getMainLooper()).post(new RunnableC0271b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends NetworkCallback<SessionResponse> {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.inappstory.sdk.network.Callback
        /* renamed from: a */
        public void onSuccess(SessionResponse sessionResponse) {
            ProfilingManager.getInstance().setReady(this.a, true);
            if (this.b && InAppStoryService.isNotNull()) {
                InAppStoryService.getInstance().getListReaderConnector().changeUserId();
            }
        }

        @Override // com.inappstory.sdk.network.Callback
        public Type getType() {
            return SessionResponse.class;
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onError(int i, String str) {
            ProfilingManager.getInstance().setReady(this.a);
            if (this.b && InAppStoryService.isNotNull()) {
                InAppStoryService.getInstance().getListReaderConnector().changeUserId();
            }
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onTimeout() {
            super.onTimeout();
            ProfilingManager.getInstance().setReady(this.a);
        }
    }

    private void clearCaches() {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService != null) {
            inAppStoryService.listStoriesIds.clear();
            inAppStoryService.clearGames();
        }
    }

    public static SessionManager getInstance() {
        SessionManager sessionManager;
        synchronized (lock) {
            try {
                if (INSTANCE == null) {
                    INSTANCE = new SessionManager();
                }
                sessionManager = INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sessionManager;
    }

    public boolean checkOpenStatistic(OpenSessionCallback openSessionCallback) {
        boolean z;
        synchronized (openProcessLock) {
            z = openProcess;
        }
        if (InAppStoryService.isConnected()) {
            if (!Session.needToUpdate() && !z) {
                return true;
            }
            openSession(openSessionCallback);
            return false;
        }
        if (openSessionCallback != null) {
            openSessionCallback.onError();
        }
        return false;
    }

    public void closeSession(boolean z, boolean z2) {
        List arrayList;
        clearCaches();
        if (Session.getInstance().id != null) {
            ArrayList arrayList2 = new ArrayList();
            if (z) {
                arrayList = OldStatisticManager.getInstance().statistic;
            } else {
                arrayList = new ArrayList();
            }
            arrayList2.addAll(arrayList);
            if (OldStatisticManager.getInstance() != null) {
                OldStatisticManager.getInstance().clear();
            }
            NetworkClient.getApi().sessionClose(new StatisticSendObject(Session.getInstance().id, arrayList2)).enqueue(new c(ProfilingManager.getInstance().addTask("api_session_close"), z2));
        }
        Session.clear();
    }

    public void openSession(OpenSessionCallback openSessionCallback) {
        PackageInfo packageInfo;
        String str;
        String str2;
        synchronized (openProcessLock) {
            try {
                if (openProcess) {
                    if (openSessionCallback != null) {
                        callbacks.add(openSessionCallback);
                    }
                    return;
                }
                synchronized (openProcessLock) {
                    try {
                        callbacks.clear();
                        openProcess = true;
                        if (openSessionCallback != null) {
                            callbacks.add(openSessionCallback);
                        }
                    } finally {
                        th = th;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                    }
                }
                Context context = InAppStoryService.getInstance().getContext();
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                String str3 = Build.MODEL;
                String str4 = Build.MANUFACTURER;
                String str5 = Build.BRAND;
                String num = Integer.toString(Sizes.getScreenSize(context).x);
                String num2 = Integer.toString(Sizes.getScreenSize(context).y);
                String f = Float.toString(context.getResources().getDisplayMetrics().density * 160.0f);
                String str6 = Build.VERSION.CODENAME;
                String num3 = Integer.toString(Build.VERSION.SDK_INT);
                String packageName = context.getPackageName();
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException e) {
                    InAppStoryService.createExceptionLog(e);
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    str = packageInfo.versionName;
                } else {
                    str = "";
                }
                String str7 = str;
                if (packageInfo != null) {
                    str2 = Integer.toString(packageInfo.versionCode);
                } else {
                    str2 = "";
                }
                String str8 = str2;
                if (!InAppStoryService.isConnected()) {
                    synchronized (openProcessLock) {
                        openProcess = false;
                    }
                    return;
                }
                NetworkClient.getApi().sessionOpen("cache", FEATURES, "android", string, str3, str4, str5, num, num2, f, str6, num3, packageName, str7, str8, InAppStoryService.getInstance().getUserId()).enqueue(new b(ProfilingManager.getInstance().addTask("api_session_open")));
            } finally {
                th = th;
                while (true) {
                    try {
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
    }

    public void openStatisticSuccess(SessionResponse sessionResponse) {
        new Handler(Looper.getMainLooper()).post(new a(sessionResponse));
    }

    public void useOrOpenSession(OpenSessionCallback openSessionCallback) {
        if (checkOpenStatistic(openSessionCallback)) {
            openSessionCallback.onSuccess();
        }
    }
}
