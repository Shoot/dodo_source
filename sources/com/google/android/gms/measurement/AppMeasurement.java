package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.u5;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import im.threads.business.transport.PushMessageAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {
    private static volatile AppMeasurement b;
    private final a a;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
    /* loaded from: classes2.dex */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @NonNull
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @NonNull
        @Keep
        public String mExpiredEventName;
        @NonNull
        @Keep
        public Bundle mExpiredEventParams;
        @NonNull
        @Keep
        public String mName;
        @NonNull
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @NonNull
        @Keep
        public String mTimedOutEventName;
        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;
        @NonNull
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @NonNull
        @Keep
        public String mTriggeredEventName;
        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @NonNull
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(@NonNull Bundle bundle) {
            gh8.j(bundle);
            this.mAppId = (String) b1d.a(bundle, HiAnalyticsConstant.BI_KEY_APP_ID, String.class, null);
            this.mOrigin = (String) b1d.a(bundle, PushMessageAttributes.ORIGIN, String.class, null);
            this.mName = (String) b1d.a(bundle, Action.NAME_ATTRIBUTE, String.class, null);
            this.mValue = b1d.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) b1d.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) b1d.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) b1d.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) b1d.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) b1d.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) b1d.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) b1d.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) b1d.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) b1d.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) b1d.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) b1d.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) b1d.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
    /* loaded from: classes2.dex */
    public static abstract class a implements u2d {
        private a() {
        }
    }

    private AppMeasurement(u5 u5Var) {
        this.a = new com.google.android.gms.measurement.a(u5Var);
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (b == null) {
                        u2d b2 = b(context, null);
                        if (b2 != null) {
                            b = new AppMeasurement(b2);
                        } else {
                            b = new AppMeasurement(u5.a(context, new zzdd(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return b;
    }

    private static u2d b(Context context, Bundle bundle) {
        return (u2d) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    @NonNull
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(@NonNull Context context) {
        return a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(@NonNull String str) {
        this.a.e(str);
    }

    @Keep
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.a.b(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull String str) {
        this.a.p(str);
    }

    @Keep
    public long generateEventId() {
        return this.a.zza();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.a.g();
    }

    @NonNull
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull String str2) {
        int size;
        List<Bundle> c = this.a.c(str, str2);
        if (c == null) {
            size = 0;
        } else {
            size = c.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (Bundle bundle : c) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.a.a();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.a.h();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.a.i();
    }

    @Keep
    public int getMaxUserProperties(@NonNull String str) {
        return this.a.k(str);
    }

    @NonNull
    @Keep
    protected Map<String, Object> getUserProperties(@NonNull String str, @NonNull String str2, boolean z) {
        return this.a.f(str, str2, z);
    }

    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.a.d(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        gh8.j(conditionalUserProperty);
        a aVar = this.a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(PushMessageAttributes.ORIGIN, str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(Action.NAME_ATTRIBUTE, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            b1d.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.q(bundle);
    }

    private AppMeasurement(u2d u2dVar) {
        this.a = new b(u2dVar);
    }
}
