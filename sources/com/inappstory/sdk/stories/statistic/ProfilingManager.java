package com.inappstory.sdk.stories.statistic;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.LocaleList;
import android.telephony.TelephonyManager;
import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.network.NetworkHandler;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.api.models.Session;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes3.dex */
public class ProfilingManager {
    private static ProfilingManager INSTANCE;
    private static final ExecutorService netExecutor = Executors.newFixedThreadPool(1);
    private static final ExecutorService runnableExecutor = Executors.newFixedThreadPool(1);
    Context context;
    private Handler handler;
    private HandlerThread thread;
    ArrayList<ProfilingTask> tasks = new ArrayList<>();
    ArrayList<ProfilingTask> readyTasks = new ArrayList<>();
    private final Object tasksLock = new Object();
    private Runnable queueTasksRunnable = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ ProfilingTask a;

        a(ProfilingTask profilingTask) {
            this.a = profilingTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ProfilingManager.this.sendTiming(this.a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            ProfilingTask profilingTask;
            if (ProfilingManager.this.handler != null) {
                synchronized (ProfilingManager.getInstance().tasksLock) {
                    try {
                        if (ProfilingManager.getInstance().readyTasks != null && ProfilingManager.getInstance().readyTasks.size() != 0) {
                            z = false;
                        }
                        z = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z && InAppStoryService.isConnected() && ProfilingManager.this.isAllowToSend()) {
                    synchronized (ProfilingManager.getInstance().tasksLock) {
                        profilingTask = ProfilingManager.getInstance().readyTasks.get(0);
                        ProfilingManager.getInstance().readyTasks.remove(0);
                    }
                    if (profilingTask != null) {
                        try {
                            ProfilingManager.this.sendTiming(profilingTask);
                        } catch (Exception unused) {
                        }
                    }
                    ProfilingManager.this.handler.postDelayed(ProfilingManager.this.queueTasksRunnable, 100L);
                    return;
                }
                ProfilingManager.this.handler.postDelayed(ProfilingManager.this.queueTasksRunnable, 100L);
            }
        }
    }

    private String getCC() {
        LocaleList locales;
        Locale locale;
        Context context = this.context;
        if (context == null) {
            return null;
        }
        String networkCountryIso = ((TelephonyManager) context.getSystemService("phone")).getNetworkCountryIso();
        if (networkCountryIso == null || networkCountryIso.isEmpty()) {
            if (Build.VERSION.SDK_INT >= 24) {
                locales = this.context.getResources().getConfiguration().getLocales();
                locale = locales.get(0);
                networkCountryIso = locale.getCountry();
            } else {
                networkCountryIso = this.context.getResources().getConfiguration().locale.getCountry();
            }
        }
        return networkCountryIso.toUpperCase();
    }

    public static ProfilingManager getInstance() {
        if (INSTANCE == null) {
            ProfilingManager profilingManager = new ProfilingManager();
            INSTANCE = profilingManager;
            profilingManager.init();
        }
        return INSTANCE;
    }

    static URL getURL(String str, Map<String, String> map) throws Exception {
        String str2 = NetworkClient.getInstance().getBaseUrl() + "profiling/" + str;
        String str3 = "";
        if (map != null && map.keySet().size() > 0) {
            for (String str4 : map.keySet()) {
                str3 = str3 + ContainerUtils.FIELD_DELIMITER + ((Object) str4) + ContainerUtils.KEY_VALUE_DELIMITER + map.get(str4);
            }
            str3 = CallerData.NA + str3.substring(1);
        }
        return new URL(str2 + str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAllowToSend() {
        if (!Session.needToUpdate() && Session.getInstance().isAllowProfiling()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int sendTiming(ProfilingTask profilingTask) throws Exception {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = profilingTask.sessionId;
        if (str2 != null && !str2.isEmpty()) {
            str = profilingTask.sessionId;
        } else {
            str = Session.getInstance().id;
        }
        hashMap.put(Image.TYPE_SMALL, str);
        String str3 = profilingTask.userId;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("u", str3);
        String cc = getCC();
        hashMap.put("ts", "" + (System.currentTimeMillis() / 1000));
        if (cc != null) {
            hashMap.put(c.a, cc);
        }
        hashMap.put("n", profilingTask.name);
        hashMap.put("v", "" + (profilingTask.endTime - profilingTask.startTime));
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(getURL("timing", hashMap).openConnection()));
        httpURLConnection.setRequestProperty("User-Agent", NetworkClient.getUAString(this.context));
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setRequestMethod(NetworkHandler.POST);
        int responseCode = httpURLConnection.getResponseCode();
        InAppStoryManager.showDLog("InAppStory_Network", httpURLConnection.getURL().toString() + " \nStatus Code: " + responseCode);
        httpURLConnection.disconnect();
        return responseCode;
    }

    public String addTask(String str, String str2) {
        if (InAppStoryService.isNull()) {
            return "";
        }
        ProfilingTask profilingTask = new ProfilingTask();
        profilingTask.uniqueHash = str2;
        profilingTask.name = str;
        profilingTask.startTime = System.currentTimeMillis();
        profilingTask.isAllowToForceSend = isAllowToSend();
        synchronized (this.tasksLock) {
            try {
                Iterator<ProfilingTask> it = this.tasks.iterator();
                while (it.hasNext()) {
                    ProfilingTask next = it.next();
                    if (next.uniqueHash.equals(str2)) {
                        next.startTime = System.currentTimeMillis();
                        return str2;
                    }
                }
                this.tasks.add(profilingTask);
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cleanTasks() {
        synchronized (this.tasksLock) {
            this.tasks.clear();
        }
    }

    public void init() {
        HandlerThread handlerThread = new HandlerThread("ProfilingThread" + System.currentTimeMillis());
        this.thread = handlerThread;
        handlerThread.start();
        this.context = InAppStoryManager.getInstance().getContext();
        Handler handler = new Handler(this.thread.getLooper());
        this.handler = handler;
        handler.postDelayed(this.queueTasksRunnable, 100L);
    }

    public void setReady(String str, boolean z) {
        ProfilingTask profilingTask;
        if (this.handler == null) {
            return;
        }
        synchronized (this.tasksLock) {
            try {
                Iterator<ProfilingTask> it = this.tasks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        profilingTask = null;
                        break;
                    }
                    profilingTask = it.next();
                    String str2 = profilingTask.uniqueHash;
                    if (str2 == null || !str2.equals(str)) {
                    }
                }
                if (profilingTask == null) {
                    return;
                }
                this.tasks.remove(profilingTask);
                if (str != null && !str.isEmpty()) {
                    profilingTask.endTime = System.currentTimeMillis();
                    profilingTask.isReady = true;
                    if (z && profilingTask.isAllowToForceSend) {
                        this.handler.post(new a(profilingTask));
                    } else {
                        this.readyTasks.add(profilingTask);
                    }
                }
            } finally {
            }
        }
    }

    public String addTask(String str) {
        if (InAppStoryService.isNull()) {
            return "";
        }
        String uuid = UUID.randomUUID().toString();
        ProfilingTask profilingTask = new ProfilingTask();
        profilingTask.sessionId = Session.getInstance().id;
        profilingTask.isAllowToForceSend = isAllowToSend();
        profilingTask.userId = InAppStoryService.getInstance().getUserId();
        profilingTask.uniqueHash = uuid;
        profilingTask.name = str;
        profilingTask.startTime = System.currentTimeMillis();
        synchronized (this.tasksLock) {
            this.tasks.add(profilingTask);
        }
        return uuid;
    }

    public void setReady(String str) {
        setReady(str, false);
    }
}
