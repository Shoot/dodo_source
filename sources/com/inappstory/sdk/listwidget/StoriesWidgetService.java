package com.inappstory.sdk.listwidget;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.widget.RemoteViewsService;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.R;
import com.inappstory.sdk.network.ApiSettings;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.stories.api.models.CachedSessionData;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.api.models.StoryListType;
import com.inappstory.sdk.stories.statistic.SharedPreferencesAPI;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class StoriesWidgetService extends RemoteViewsService {
    public static final String CLICK_ITEM = "ias_w.CLICK_ITEM";
    public static final String ID = "item_id";
    private static StoriesWidgetService INSTANCE = null;
    public static final String POSITION = "item_position";
    private static final String PRODUCT_DOMAIN = "https://api.inappstory.ru/";
    private static final String TEST_DOMAIN = "https://api.test.inappstory.com/";
    public static final String UPDATE = "ias_w.UPDATE_WIDGETS";
    public static final String UPDATE_AUTH = "ias_w.UPDATE_AUTH";
    public static final String UPDATE_EMPTY = "ias_w.UPDATE_EMPTY_WIDGETS";
    public static final String UPDATE_NO_CONNECTION = "ias_w.UPDATE_NO_CONNECTION";
    public static final String UPDATE_SUCCESS = "ias_w.UPDATE_SUCCESS_WIDGETS";
    WeakReference<StoriesWidgetFactory> factory;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a extends NetworkCallback<List<Story>> {
        final /* synthetic */ Context a;
        final /* synthetic */ Class b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.inappstory.sdk.listwidget.StoriesWidgetService$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0257a implements Runnable {
            RunnableC0257a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                StoriesWidgetService.loadSuccess(aVar.a, aVar.b);
            }
        }

        a(Context context, Class cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // com.inappstory.sdk.network.Callback
        public Type getType() {
            return new StoryListType();
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onError(int i, String str) {
            Toast.makeText(this.a, str, 1).show();
        }

        @Override // com.inappstory.sdk.network.Callback
        public void onSuccess(List<Story> list) {
            if (list.size() > 0) {
                if (!SharedPreferencesAPI.hasContext()) {
                    SharedPreferencesAPI.setContext(this.a);
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < Math.min(list.size(), 4); i++) {
                    arrayList.add(list.get(i));
                }
                try {
                    SharedPreferencesAPI.saveString("widgetStories", JsonParser.getJson(arrayList));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (StoriesWidgetService.INSTANCE != null) {
                    StoriesWidgetService.INSTANCE.refreshFactory();
                }
                new Handler().postDelayed(new RunnableC0257a(), 500L);
                return;
            }
            StoriesWidgetService.loadEmpty(this.a, this.b);
        }
    }

    public static StoriesWidgetService getInstance() {
        return INSTANCE;
    }

    static boolean isConnected(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (Build.VERSION.SDK_INT >= 23) {
                activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(2))) {
                    return true;
                }
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static void loadAuth(Context context, Class cls) {
        sendBroadcast(UPDATE_AUTH, cls, context);
    }

    public static void loadData(@NonNull Context context) {
        String str;
        if (AppearanceManager.csWidgetAppearance() != null && AppearanceManager.csWidgetAppearance().getWidgetClass() != null) {
            if (ApiSettings.getInstance().getCmsUrl() == null) {
                ApiSettings apiKey = ApiSettings.getInstance().cacheDirPath(context.getCacheDir().getAbsolutePath()).apiKey(context.getResources().getString(R.string.csApiKey));
                boolean isSandbox = AppearanceManager.csWidgetAppearance().isSandbox();
                String str2 = PRODUCT_DOMAIN;
                if (isSandbox) {
                    str = TEST_DOMAIN;
                } else {
                    str = PRODUCT_DOMAIN;
                }
                ApiSettings webUrl = apiKey.setWebUrl(str);
                if (AppearanceManager.csWidgetAppearance().isSandbox()) {
                    str2 = TEST_DOMAIN;
                }
                webUrl.cmsUrl(str2);
            }
            if (isConnected(context)) {
                loadList(context, AppearanceManager.csWidgetAppearance().getWidgetClass());
                return;
            } else {
                loadNoConnection(context, AppearanceManager.csWidgetAppearance().getWidgetClass());
                return;
            }
        }
        InAppStoryManager.showELog(InAppStoryManager.IAS_ERROR_TAG, "'widgetClass' must not be null");
    }

    public static void loadEmpty(Context context, Class cls) {
        sendBroadcast(UPDATE_EMPTY, cls, context);
    }

    private static void loadList(Context context, Class cls) {
        CachedSessionData cachedSessionData = CachedSessionData.getInstance(context);
        if (cachedSessionData == null) {
            loadAuth(context, cls);
            return;
        }
        if (NetworkClient.getAppContext() == null) {
            NetworkClient.setContext(context);
        }
        NetworkClient.getApi().getStories(cachedSessionData.testKey, 0, cachedSessionData.tags, null).enqueue(new a(context, cls));
    }

    public static void loadNoConnection(Context context, Class cls) {
        sendBroadcast(UPDATE_NO_CONNECTION, cls, context);
    }

    public static void loadSuccess(Context context, Class cls) {
        sendBroadcast(UPDATE_SUCCESS, cls, context);
    }

    private static void sendBroadcast(String str, Class cls, Context context) {
        Intent intent = new Intent(context, cls);
        intent.setAction(str);
        context.sendBroadcast(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        INSTANCE = null;
    }

    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        WeakReference<StoriesWidgetFactory> weakReference = new WeakReference<>(new StoriesWidgetFactory(getApplicationContext(), intent));
        this.factory = weakReference;
        return weakReference.get();
    }

    public void refreshFactory() {
        WeakReference<StoriesWidgetFactory> weakReference = this.factory;
        if (weakReference != null && weakReference.get() != null) {
            this.factory.get().refreshData();
        }
    }
}
