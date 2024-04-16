package com.inappstory.sdk.stories.statistic;

import android.os.Handler;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.api.models.SessionResponse;
import com.inappstory.sdk.stories.api.models.StatisticSendObject;
import com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public class OldStatisticManager {
    private static OldStatisticManager INSTANCE = null;
    private static final long statisticUpdateInterval = 15000;
    public StatisticEvent currentEvent;
    public static Object openProcessLock = new Object();
    public static Object previewLock = new Object();
    public static ArrayList<OpenSessionCallback> callbacks = new ArrayList<>();
    public static boolean openProcess = false;
    private Handler handler = new Handler();
    public List<List<Object>> statistic = new ArrayList();
    public Runnable statisticUpdateThread = new a();
    public int eventCount = 0;
    private final Object eventLock = new Object();
    public int articleEventCount = 0;
    public long articleTimer = 0;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!InAppStoryService.isNull() && InAppStoryService.getInstance().getContext() != null) {
                if (OldStatisticManager.this.sendStatistic()) {
                    OldStatisticManager.this.handler.postDelayed(OldStatisticManager.this.statisticUpdateThread, OldStatisticManager.statisticUpdateInterval);
                    return;
                }
                return;
            }
            OldStatisticManager.this.handler.removeCallbacks(OldStatisticManager.this.statisticUpdateThread);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends NetworkCallback<SessionResponse> {
        final /* synthetic */ String a;
        final /* synthetic */ List b;

        b(String str, List list) {
            this.a = str;
            this.b = list;
        }

        @Override // com.inappstory.sdk.network.Callback
        /* renamed from: a */
        public void onSuccess(SessionResponse sessionResponse) {
            ProfilingManager.getInstance().setReady(this.a);
            OldStatisticManager.this.cleanStatistic();
        }

        @Override // com.inappstory.sdk.network.Callback
        public Type getType() {
            return SessionResponse.class;
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onError(int i, String str) {
            super.onError(i, str);
            ProfilingManager.getInstance().setReady(this.a);
            OldStatisticManager.this.cleanStatistic();
            synchronized (OldStatisticManager.openProcessLock) {
                OldStatisticManager.this.statistic.addAll(this.b);
            }
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onTimeout() {
            super.onTimeout();
            ProfilingManager.getInstance().setReady(this.a);
            OldStatisticManager.this.cleanStatistic();
            synchronized (OldStatisticManager.openProcessLock) {
                OldStatisticManager.this.statistic.addAll(this.b);
            }
        }
    }

    public static OldStatisticManager getInstance() {
        if (INSTANCE == null) {
            synchronized (OldStatisticManager.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new OldStatisticManager();
                    }
                } finally {
                }
            }
        }
        return INSTANCE;
    }

    public void addArticleOpenStatistic(int i, int i2) {
        this.articleEventCount = this.eventCount;
        synchronized (this.eventLock) {
            try {
                StatisticEvent statisticEvent = this.currentEvent;
                if (statisticEvent != null) {
                    statisticEvent.eventType = 2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        closeStatisticEvent();
        this.articleTimer = System.currentTimeMillis();
        addArticleStatisticEvent(i, i2);
    }

    public void addArticleStatisticEvent(int i, int i2) {
        synchronized (this.eventLock) {
            this.currentEvent = new StatisticEvent(i, this.articleEventCount, i2, this.articleTimer);
        }
    }

    public void addDeeplinkClickStatistic(int i) {
        closeStatisticEvent();
        addStatisticEvent(1, i, 0);
        closeStatisticEvent(0, false);
        this.eventCount++;
        addStatisticEvent(2, i, 0);
        closeStatisticEvent(0, false);
    }

    public void addLinkOpenStatistic() {
        synchronized (this.eventLock) {
            try {
                StatisticEvent statisticEvent = this.currentEvent;
                if (statisticEvent != null) {
                    statisticEvent.eventType = 2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addStatisticBlock(int i, int i2) {
        boolean z;
        synchronized (this.eventLock) {
            if (this.currentEvent != null) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            closeStatisticEvent();
        }
        addStatisticEvent(1, i, i2);
    }

    public void addStatisticEvent(int i, int i2, int i3) {
        synchronized (this.eventLock) {
            this.currentEvent = new StatisticEvent(i, i2, i3);
        }
    }

    public void cleanStatistic() {
        Session.getInstance();
        Session.updateStatistic();
    }

    public void clear() {
        if (this.statistic == null) {
            this.statistic = new ArrayList();
        }
        this.statistic.clear();
    }

    public void closeStatisticEvent(Integer num, boolean z) {
        StatisticEvent statisticEvent = new StatisticEvent();
        synchronized (this.eventLock) {
            try {
                StatisticEvent statisticEvent2 = this.currentEvent;
                if (statisticEvent2 == null) {
                    return;
                }
                statisticEvent.eventType = statisticEvent2.eventType;
                statisticEvent.storyId = statisticEvent2.storyId;
                statisticEvent.index = statisticEvent2.index;
                statisticEvent.timer = statisticEvent2.timer;
                int i = this.eventCount;
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(statisticEvent.eventType));
                arrayList.add(Integer.valueOf(i));
                arrayList.add(Integer.valueOf(statisticEvent.storyId));
                arrayList.add(Integer.valueOf(statisticEvent.index));
                arrayList.add(Long.valueOf(Math.max(num != null ? num.intValue() : System.currentTimeMillis() - statisticEvent.timer, 0L)));
                putStatistic(arrayList);
                if (z) {
                    return;
                }
                synchronized (this.eventLock) {
                    this.currentEvent = null;
                }
            } finally {
            }
        }
    }

    public ArrayList<Integer> newStatisticPreviews(ArrayList<Integer> arrayList) {
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        synchronized (previewLock) {
            try {
                Iterator<Integer> it = arrayList.iterator();
                while (it.hasNext()) {
                    Integer next = it.next();
                    if (!Session.getInstance().viewed.contains(next)) {
                        arrayList2.add(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList2;
    }

    public void previewStatisticEvent(ArrayList<Integer> arrayList) {
        boolean z;
        if (Session.getInstance().viewed.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(5);
        arrayList2.add(Integer.valueOf(this.eventCount));
        synchronized (previewLock) {
            try {
                Iterator<Integer> it = arrayList.iterator();
                while (it.hasNext()) {
                    Integer next = it.next();
                    if (!Session.getInstance().viewed.contains(next)) {
                        arrayList2.add(next);
                        Session.getInstance().viewed.add(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList2.size() > 2) {
            putStatistic(arrayList2);
            this.eventCount++;
        }
        if (z) {
            sendStatistic();
        }
    }

    public void putStatistic(List<Object> list) {
        synchronized (openProcessLock) {
            try {
                List<List<Object>> list2 = this.statistic;
                if (list2 != null) {
                    list2.add(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void refreshCallbacks() {
        if (this.handler == null) {
            this.handler = new Handler();
        }
        try {
            try {
                this.handler.removeCallbacks(getInstance().statisticUpdateThread);
            } catch (Exception e) {
                InAppStoryService.createExceptionLog(e);
            }
        } finally {
            this.handler.postDelayed(getInstance().statisticUpdateThread, statisticUpdateInterval);
        }
    }

    public void refreshTimer() {
        synchronized (this.eventLock) {
            try {
                StatisticEvent statisticEvent = this.currentEvent;
                if (statisticEvent != null) {
                    statisticEvent.timer = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean sendStatistic() {
        if (!InAppStoryService.isConnected()) {
            return true;
        }
        if (Session.needToUpdate()) {
            return false;
        }
        synchronized (openProcessLock) {
            try {
                List<List<Object>> list = this.statistic;
                if (list != null && (!list.isEmpty() || Session.needToUpdate())) {
                    if (!InAppStoryService.getInstance().getSendStatistic()) {
                        Session.getInstance();
                        Session.updateStatistic();
                        List<List<Object>> list2 = this.statistic;
                        if (list2 != null) {
                            list2.clear();
                        }
                        return true;
                    }
                    try {
                        synchronized (openProcessLock) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(this.statistic);
                            this.statistic.clear();
                            NetworkClient.getApi().sessionUpdate(new StatisticSendObject(Session.getInstance().id, arrayList)).enqueue(new b(ProfilingManager.getInstance().addTask("api_session_update"), arrayList));
                        }
                    } catch (Exception e) {
                        InAppStoryService.createExceptionLog(e);
                    }
                    return true;
                }
                return true;
            } finally {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class StatisticEvent {
        public int eventType;
        public int index;
        public int storyId;
        public long timer;

        public StatisticEvent() {
            this.timer = System.currentTimeMillis();
        }

        public StatisticEvent(int i, int i2, int i3) {
            this.eventType = i;
            this.storyId = i2;
            this.index = i3;
            this.timer = System.currentTimeMillis();
        }

        public StatisticEvent(int i, int i2, int i3, long j) {
            this.eventType = i;
            this.storyId = i2;
            this.index = i3;
            this.timer = j;
        }
    }

    public void closeStatisticEvent() {
        closeStatisticEvent(null, false);
        this.eventCount++;
    }
}
