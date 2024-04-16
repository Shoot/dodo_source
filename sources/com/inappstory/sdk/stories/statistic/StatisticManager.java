package com.inappstory.sdk.stories.statistic;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.network.ApiInterface;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.stories.api.models.CurrentState;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/* loaded from: classes3.dex */
public class StatisticManager {
    public static final String APPCLOSE = "app-close";
    public static final String AUTO = "auto-close";
    public static final String BACK = "back";
    public static final String CLICK = "button-close";
    public static final String CUSTOM = "custom-close";
    public static final String DIRECT = "direct";
    public static final String FAKE_TASKS_KEY = "fakeStatisticTasks";
    public static final String FAVORITE = "favorite";
    private static StatisticManager INSTANCE = null;
    public static final String LIST = "list";
    public static final String NEXT = "next";
    public static final String ONBOARDING = "onboarding";
    public static final String PREV = "prev";
    public static final String SWIPE = "swipe-close";
    public static final String TASKS_KEY = "statisticTasks";
    HashMap<Integer, Long> cTimes;
    public CurrentState currentState;
    private HandlerThread thread;
    private static final ExecutorService netExecutor = Executors.newFixedThreadPool(1);
    private static final ExecutorService runnableExecutor = Executors.newFixedThreadPool(1);
    static Object csLock = new Object();
    private Object statisticTasksLock = new Object();
    private ArrayList<StatisticTask> tasks = new ArrayList<>();
    private ArrayList<StatisticTask> faketasks = new ArrayList<>();
    private Handler handler = new Handler();
    long pauseTimer = -1;
    boolean isBackgroundPause = false;
    boolean backPaused = false;
    private Runnable queueTasksRunnable = new a();
    public ArrayList<Integer> viewed = new ArrayList<>();
    String prefix = "";
    public long currentTime = -1;
    public long pauseTime = 0;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StatisticTask statisticTask;
            if (StatisticManager.getInstance().tasks != null && StatisticManager.getInstance().tasks.size() != 0 && !InAppStoryService.isNull() && InAppStoryService.isConnected()) {
                synchronized (StatisticManager.getInstance().statisticTasksLock) {
                    statisticTask = (StatisticTask) StatisticManager.getInstance().tasks.get(0);
                    StatisticManager.getInstance().tasks.remove(0);
                    StatisticManager.saveTasksSP();
                }
                if (statisticTask != null) {
                    StatisticManager.this.sendTask(statisticTask);
                    return;
                }
                return;
            }
            StatisticManager.this.handler.postDelayed(StatisticManager.this.queueTasksRunnable, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Callable<Boolean> {
        final /* synthetic */ StatisticTask a;

        b(StatisticTask statisticTask) {
            this.a = statisticTask;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            ApiInterface statApi = NetworkClient.getStatApi();
            StatisticTask statisticTask = this.a;
            int i = statApi.sendStat(statisticTask.event, statisticTask.sessionId, statisticTask.userId, statisticTask.timestamp, statisticTask.feedId, statisticTask.storyId, statisticTask.whence, statisticTask.cause, statisticTask.slideIndex, statisticTask.slideTotal, statisticTask.durationMs, statisticTask.widgetId, statisticTask.widgetLabel, statisticTask.widgetValue, statisticTask.widgetAnswer, statisticTask.widgetAnswerLabel, statisticTask.widgetAnswerScore, statisticTask.layoutIndex, statisticTask.target, statisticTask.mode).execute().code;
            if (i > 199 && i < 210) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        final /* synthetic */ Future a;

        c(Future future) {
            this.a = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.get();
                StatisticManager.this.handler.postDelayed(StatisticManager.this.queueTasksRunnable, 100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
                StatisticManager.this.handler.postDelayed(StatisticManager.this.queueTasksRunnable, 100L);
            } catch (ExecutionException e2) {
                e2.printStackTrace();
                StatisticManager.this.handler.postDelayed(StatisticManager.this.queueTasksRunnable, 100L);
            } catch (Exception e3) {
                e3.printStackTrace();
                StatisticManager.this.handler.postDelayed(StatisticManager.this.queueTasksRunnable, 100L);
            }
        }
    }

    public static StatisticManager getInstance() {
        if (INSTANCE == null) {
            StatisticManager statisticManager = new StatisticManager();
            INSTANCE = statisticManager;
            statisticManager.init();
        }
        return INSTANCE;
    }

    public static void saveFakeTasksSP() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(getInstance().faketasks);
            SharedPreferencesAPI.saveString(FAKE_TASKS_KEY, JsonParser.getJson(arrayList));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveTasksSP() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(getInstance().tasks);
            SharedPreferencesAPI.saveString(TASKS_KEY, JsonParser.getJson(arrayList));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendTask(StatisticTask statisticTask) {
        try {
            runnableExecutor.submit(new c(netExecutor.submit(new b(statisticTask))));
        } catch (Exception e) {
            e.printStackTrace();
            this.handler.postDelayed(this.queueTasksRunnable, 100L);
        }
    }

    public void addFakeEvents(int i, Integer num, Integer num2, String str) {
        long j;
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + "slide";
        statisticTask.storyId = Integer.toString(i);
        statisticTask.slideIndex = num;
        long currentTimeMillis = System.currentTimeMillis();
        CurrentState currentState = this.currentState;
        long j2 = 0;
        if (currentState != null) {
            j = currentState.startTime;
        } else {
            j = 0;
        }
        statisticTask.durationMs = Long.valueOf(currentTimeMillis - j);
        statisticTask.isFake = true;
        statisticTask.feedId = str;
        generateBase(statisticTask);
        addFakeTask(statisticTask);
        if (this.cTimes == null) {
            this.cTimes = new HashMap<>();
        }
        if (this.cTimes.get(Integer.valueOf(i)) != null) {
            j2 = this.cTimes.get(Integer.valueOf(i)).longValue();
        }
        Long valueOf = Long.valueOf(j2);
        StatisticTask statisticTask2 = new StatisticTask();
        statisticTask2.event = this.prefix + "close";
        statisticTask2.storyId = Integer.toString(i);
        statisticTask2.cause = APPCLOSE;
        statisticTask2.slideIndex = num;
        statisticTask2.isFake = true;
        statisticTask2.slideTotal = num2;
        statisticTask2.feedId = str;
        statisticTask2.durationMs = Long.valueOf((System.currentTimeMillis() - valueOf.longValue()) - this.pauseTime);
        generateBase(statisticTask2);
        addFakeTask(statisticTask2);
    }

    public void addFakeTask(StatisticTask statisticTask) {
        if (InAppStoryService.isNotNull() && !InAppStoryService.getInstance().getSendNewStatistic()) {
            return;
        }
        synchronized (this.statisticTasksLock) {
            this.faketasks.add(statisticTask);
            saveFakeTasksSP();
        }
    }

    public void addTask(StatisticTask statisticTask) {
        addTask(statisticTask, false);
    }

    public void cleanFakeEvents() {
        synchronized (this.statisticTasksLock) {
            this.faketasks.clear();
            SharedPreferencesAPI.remove(FAKE_TASKS_KEY);
        }
    }

    public void cleanTasks() {
        synchronized (this.statisticTasksLock) {
            this.tasks.clear();
            SharedPreferencesAPI.remove(TASKS_KEY);
            this.faketasks.clear();
            SharedPreferencesAPI.remove(FAKE_TASKS_KEY);
        }
    }

    public void createCurrentState(int i, int i2, String str) {
        synchronized (csLock) {
            this.pauseTime = 0L;
            CurrentState currentState = new CurrentState();
            this.currentState = currentState;
            currentState.storyId = i;
            currentState.slideIndex = i2;
            currentState.feedId = str;
            currentState.startTime = System.currentTimeMillis();
        }
    }

    public void generateBase(StatisticTask statisticTask) {
        statisticTask.sessionId = Session.getInstance().id;
        if (InAppStoryService.isNotNull()) {
            statisticTask.userId = InAppStoryService.getInstance().getUserId();
        }
        statisticTask.timestamp = Long.valueOf(System.currentTimeMillis() / 1000);
    }

    public ArrayList<StatisticTask> getFaketasks() {
        return this.faketasks;
    }

    public ArrayList<StatisticTask> getTasks() {
        return this.tasks;
    }

    public void init() {
        HandlerThread handlerThread = new HandlerThread("SSMThread" + System.currentTimeMillis());
        this.thread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.thread.getLooper());
        String string = SharedPreferencesAPI.getString(TASKS_KEY);
        String string2 = SharedPreferencesAPI.getString(FAKE_TASKS_KEY);
        synchronized (this.statisticTasksLock) {
            try {
                if (string != null) {
                    this.tasks = JsonParser.listFromJson(string, StatisticTask.class);
                } else {
                    this.tasks = new ArrayList<>();
                }
                if (string2 != null) {
                    this.tasks.addAll(JsonParser.listFromJson(string2, StatisticTask.class));
                }
                Iterator<StatisticTask> it = this.tasks.iterator();
                while (it.hasNext()) {
                    it.next().isFake = false;
                }
                SharedPreferencesAPI.remove(FAKE_TASKS_KEY);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.handler.postDelayed(this.queueTasksRunnable, 100L);
    }

    public void pauseStoryEvent(boolean z) {
        if (INSTANCE == this && z) {
            this.isBackgroundPause = true;
            this.pauseTimer = System.currentTimeMillis();
        }
    }

    public void resumeStoryEvent(boolean z) {
        if (INSTANCE == this && z) {
            if (this.isBackgroundPause) {
                this.pauseTime += System.currentTimeMillis() - this.pauseTimer;
            }
            this.isBackgroundPause = false;
        }
    }

    public void sendClickLink(int i) {
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + "w-link";
        generateBase(statisticTask);
        addTask(statisticTask);
    }

    public void sendCloseStory(int i, String str, Integer num, Integer num2, String str2) {
        long j;
        sendCurrentState();
        if (this.cTimes == null) {
            this.cTimes = new HashMap<>();
        }
        if (this.cTimes.get(Integer.valueOf(i)) != null) {
            j = this.cTimes.get(Integer.valueOf(i)).longValue();
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(j);
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + "close";
        statisticTask.storyId = Integer.toString(i);
        statisticTask.cause = str;
        statisticTask.slideIndex = num;
        statisticTask.feedId = str2;
        statisticTask.slideTotal = num2;
        statisticTask.durationMs = Long.valueOf((System.currentTimeMillis() - valueOf.longValue()) - this.pauseTime);
        generateBase(statisticTask);
        addTask(statisticTask);
        this.pauseTime = 0L;
    }

    public void sendCurrentState() {
        synchronized (csLock) {
            try {
                CurrentState currentState = this.currentState;
                if (currentState != null) {
                    int i = currentState.storyId;
                    int i2 = currentState.slideIndex;
                    long currentTimeMillis = System.currentTimeMillis();
                    CurrentState currentState2 = this.currentState;
                    sendViewSlide(i, i2, Long.valueOf((currentTimeMillis - currentState2.startTime) - currentState2.storyPause), this.currentState.feedId);
                }
                this.currentState = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sendDeeplinkStory(int i, String str, String str2) {
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + ElementGenerator.TYPE_LINK;
        statisticTask.storyId = Integer.toString(i);
        statisticTask.target = str;
        statisticTask.feedId = str2;
        generateBase(statisticTask);
        addTask(statisticTask);
    }

    public void sendDislikeStory(int i, int i2, String str) {
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + "dislike";
        statisticTask.feedId = str;
        statisticTask.storyId = Integer.toString(i);
        statisticTask.slideIndex = Integer.valueOf(i2);
        generateBase(statisticTask);
        addTask(statisticTask);
    }

    public void sendFavoriteStory(int i, int i2, String str) {
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + FAVORITE;
        statisticTask.storyId = Integer.toString(i);
        statisticTask.feedId = str;
        statisticTask.slideIndex = Integer.valueOf(i2);
        generateBase(statisticTask);
        addTask(statisticTask);
    }

    public void sendGameEvent(String str, String str2, String str3) {
        StatisticTask statisticTask = (StatisticTask) JsonParser.fromJson(str2, StatisticTask.class);
        statisticTask.event = str;
        statisticTask.feedId = str3;
        generateBase(statisticTask);
        addTask(statisticTask);
    }

    public void sendGoodsClick(int i, int i2, String str, String str2, String str3) {
        boolean z;
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + "w-goods-click";
        statisticTask.storyId = Integer.toString(i);
        statisticTask.slideIndex = Integer.valueOf(i2);
        statisticTask.feedId = str3;
        statisticTask.widgetId = str;
        statisticTask.widgetValue = str2;
        generateBase(statisticTask);
        if (InAppStoryManager.getInstance() != null && InAppStoryManager.getInstance().isSendStatistic()) {
            z = true;
        } else {
            z = false;
        }
        addTask(statisticTask, z);
    }

    public void sendGoodsOpen(int i, int i2, String str, String str2) {
        boolean z;
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + "w-goods-open";
        statisticTask.storyId = Integer.toString(i);
        statisticTask.slideIndex = Integer.valueOf(i2);
        statisticTask.widgetId = str;
        statisticTask.feedId = str2;
        generateBase(statisticTask);
        if (InAppStoryManager.getInstance() != null && InAppStoryManager.getInstance().isSendStatistic()) {
            z = true;
        } else {
            z = false;
        }
        addTask(statisticTask, z);
    }

    public void sendLikeStory(int i, int i2, String str) {
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + "like";
        statisticTask.storyId = Integer.toString(i);
        statisticTask.slideIndex = Integer.valueOf(i2);
        statisticTask.feedId = str;
        generateBase(statisticTask);
        addTask(statisticTask);
    }

    public void sendOpenStory(int i, String str, String str2) {
        if (this.cTimes == null) {
            this.cTimes = new HashMap<>();
        }
        this.cTimes.put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()));
        this.pauseTime = 0L;
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.feedId = str2;
        statisticTask.event = this.prefix + "open";
        statisticTask.storyId = Integer.toString(i);
        statisticTask.whence = str;
        generateBase(statisticTask);
        addTask(statisticTask);
    }

    public void sendReadStory(int i, String str) {
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + "read";
        statisticTask.storyId = Integer.toString(i);
        statisticTask.feedId = str;
        generateBase(statisticTask);
        addTask(statisticTask);
    }

    public void sendShareStory(int i, int i2, int i3, String str) {
        boolean z;
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + "share";
        statisticTask.storyId = Integer.toString(i);
        statisticTask.slideIndex = Integer.valueOf(i2);
        statisticTask.feedId = str;
        statisticTask.mode = Integer.valueOf(i3);
        generateBase(statisticTask);
        if (InAppStoryManager.getInstance() != null && InAppStoryManager.getInstance().isSendStatistic()) {
            z = true;
        } else {
            z = false;
        }
        addTask(statisticTask, z);
    }

    public void sendStoryWidgetEvent(String str, String str2, String str3) {
        StatisticTask statisticTask = (StatisticTask) JsonParser.fromJson(str2, StatisticTask.class);
        statisticTask.event = str;
        statisticTask.feedId = str3;
        generateBase(statisticTask);
        addTask(statisticTask);
    }

    public void sendViewSlide(int i, int i2, Long l, String str) {
        if (l.longValue() <= 0) {
            return;
        }
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + "slide";
        statisticTask.storyId = Integer.toString(i);
        statisticTask.slideIndex = Integer.valueOf(i2);
        statisticTask.durationMs = l;
        statisticTask.feedId = str;
        generateBase(statisticTask);
        addTask(statisticTask);
    }

    public void sendViewStory(int i, String str, String str2) {
        if (this.viewed.contains(Integer.valueOf(i))) {
            return;
        }
        StatisticTask statisticTask = new StatisticTask();
        statisticTask.event = this.prefix + "view";
        statisticTask.storyId = Integer.toString(i);
        statisticTask.feedId = str2;
        statisticTask.whence = str;
        generateBase(statisticTask);
        addTask(statisticTask);
        this.viewed.add(Integer.valueOf(i));
    }

    public void addTask(StatisticTask statisticTask, boolean z) {
        if (z || !InAppStoryService.isNotNull() || InAppStoryService.getInstance().getSendNewStatistic()) {
            synchronized (this.statisticTasksLock) {
                this.tasks.add(statisticTask);
                saveTasksSP();
            }
        }
    }

    public void sendViewStory(ArrayList<Integer> arrayList, String str, String str2) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (!this.viewed.contains(Integer.valueOf(intValue))) {
                arrayList2.add(Integer.toString(intValue));
                this.viewed.add(Integer.valueOf(intValue));
            }
        }
        if (arrayList2.size() > 0) {
            StatisticTask statisticTask = new StatisticTask();
            statisticTask.feedId = str2;
            statisticTask.event = this.prefix + "view";
            statisticTask.storyId = TextUtils.join(",", arrayList2);
            statisticTask.whence = str;
            generateBase(statisticTask);
            addTask(statisticTask);
        }
    }
}
