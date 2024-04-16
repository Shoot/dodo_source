package cloud.mindbox.mobile_sdk.managers;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LifecycleManager.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000f\b\u0000\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001 B\u0091\u0001\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010%\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010(\u001a\u00020\u000b\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030)\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030)\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030)\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030)\u0012\u001c\u00102\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00030/¢\u0006\u0004\bE\u0010FJ\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0003J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\u001a\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\u001e\u001a\u00020\u000bJ\u0006\u0010\u001f\u001a\u00020\u0003R\u0018\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010+R,\u00102\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00030/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010'R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0010098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010B\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010'\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010'¨\u0006H"}, d2 = {"Lcloud/mindbox/mobile_sdk/managers/LifecycleManager;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lnp5;", "", "onAppMovedToBackground", "onAppMovedToForeground", "Landroid/app/Activity;", "activity", "D", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "", "areActivitiesEqual", "z", "", "B", "", "code", "E", "C", "w", "Landroid/os/Bundle;", "p1", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed", "y", "F", "a", "Ljava/lang/String;", "currentActivityName", "b", "Landroid/content/Intent;", "currentIntent", com.huawei.hms.opendevice.c.a, "Z", "isAppInBackground", "Lkotlin/Function1;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", com.huawei.hms.push.e.a, "f", "g", "Lkotlin/Function2;", Image.TYPE_HIGH, "Lkotlin/jvm/functions/Function2;", "onTrackVisitReady", "i", "isIntentChanged", "Ljava/util/Timer;", "j", "Ljava/util/Timer;", "timer", "", "k", "Ljava/util/List;", "intentHashes", "l", "x", "()Z", "setCurrentActivityResumed", "(Z)V", "isCurrentActivityResumed", Image.TYPE_MEDIUM, "skipSendingTrackVisit", "<init>", "(Ljava/lang/String;Landroid/content/Intent;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "n", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LifecycleManager implements Application.ActivityLifecycleCallbacks, np5 {
    public static final a n = new a(null);
    private String a;
    private Intent b;
    private boolean c;
    private Function1<? super Activity, Unit> d;
    private Function1<? super Activity, Unit> e;
    private Function1<? super Activity, Unit> f;
    private Function1<? super Activity, Unit> g;
    private Function2<? super String, ? super String, Unit> h;
    private boolean i;
    private Timer j;
    private final List<Integer> k;
    private boolean l;
    private boolean m;

    /* compiled from: LifecycleManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcloud/mindbox/mobile_sdk/managers/LifecycleManager$a;", "", "", "MAX_INTENT_HASHES_SIZE", "I", "", "SCHEMA_HTTP", "Ljava/lang/String;", "SCHEMA_HTTPS", "", "TIMER_PERIOD", "J", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifecycleManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Timer timer = LifecycleManager.this.j;
            if (timer != null) {
                timer.cancel();
            }
            LifecycleManager.this.j = null;
        }
    }

    /* compiled from: LifecycleManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ Activity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity) {
            super(0);
            this.b = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            boolean z;
            fk6 fk6Var = fk6.a;
            LifecycleManager lifecycleManager = LifecycleManager.this;
            fk6Var.d(lifecycleManager, "onActivityStarted. activity: " + this.b.getClass().getSimpleName());
            LifecycleManager.this.f.invoke(this.b);
            boolean c = z65.c(LifecycleManager.this.a, this.b.getClass().getName());
            Intent intent = this.b.getIntent();
            LifecycleManager lifecycleManager2 = LifecycleManager.this;
            if (z65.c(lifecycleManager2.b, intent)) {
                z = false;
            } else {
                LifecycleManager.this.D(this.b);
                if (intent != null) {
                    z = LifecycleManager.this.E(intent.hashCode());
                } else {
                    z = true;
                }
            }
            lifecycleManager2.i = z;
            if (LifecycleManager.this.c || !LifecycleManager.this.i) {
                LifecycleManager.this.c = false;
                return;
            }
            LifecycleManager lifecycleManager3 = LifecycleManager.this;
            Intent intent2 = this.b.getIntent();
            z65.g(intent2, "activity.intent");
            lifecycleManager3.z(intent2, c);
        }
    }

    /* compiled from: LifecycleManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            fk6.a.d(LifecycleManager.this, "onAppMovedToBackground");
            LifecycleManager.this.c = true;
            LifecycleManager.this.w();
        }
    }

    /* compiled from: LifecycleManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            fk6.a.d(LifecycleManager.this, "onAppMovedToForeground");
            if (!LifecycleManager.this.m) {
                Intent intent = LifecycleManager.this.b;
                if (intent != null) {
                    LifecycleManager.A(LifecycleManager.this, intent, false, 2, null);
                    return Unit.a;
                }
                return null;
            }
            LifecycleManager.this.m = false;
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifecycleManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ Intent b;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Intent intent, boolean z) {
            super(0);
            this.b = intent;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Uri data;
            String B = LifecycleManager.this.i ? LifecycleManager.this.B(this.b) : StatisticManager.DIRECT;
            if (this.c || !z65.c(B, StatisticManager.DIRECT)) {
                String str = null;
                if (z65.c(B, ElementGenerator.TYPE_LINK) && (data = this.b.getData()) != null) {
                    str = data.toString();
                }
                LifecycleManager.this.h.invoke(B, str);
                LifecycleManager.this.C();
                fk6 fk6Var = fk6.a;
                LifecycleManager lifecycleManager = LifecycleManager.this;
                fk6Var.d(lifecycleManager, "Track visit event with source " + B + " and url " + str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifecycleManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class g extends ej5 implements Function0<String> {
        final /* synthetic */ Intent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Intent intent) {
            super(0);
            this.a = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String str;
            Bundle extras;
            Intent intent = this.a;
            String str2 = null;
            if (intent != null) {
                str = intent.getScheme();
            } else {
                str = null;
            }
            if (!z65.c(str, "http")) {
                Intent intent2 = this.a;
                if (intent2 != null) {
                    str2 = intent2.getScheme();
                }
                if (!z65.c(str2, "https")) {
                    Intent intent3 = this.a;
                    if (intent3 != null && (extras = intent3.getExtras()) != null && extras.getBoolean("isOpenedFromPush")) {
                        return "push";
                    }
                    return StatisticManager.DIRECT;
                }
            }
            return ElementGenerator.TYPE_LINK;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifecycleManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class h extends ej5 implements Function0<Unit> {

        /* compiled from: Timer.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"cloud/mindbox/mobile_sdk/managers/LifecycleManager$h$a", "Ljava/util/TimerTask;", "", "run", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public static final class a extends TimerTask {
            final /* synthetic */ LifecycleManager a;

            public a(LifecycleManager lifecycleManager) {
                this.a = lifecycleManager;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                this.a.h.invoke(null, null);
            }
        }

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LifecycleManager.this.w();
            LifecycleManager lifecycleManager = LifecycleManager.this;
            Timer a2 = bhb.a(null, false);
            a2.schedule(new a(lifecycleManager), 1200000L, 1200000L);
            lifecycleManager.j = a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifecycleManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class i extends ej5 implements Function0<Unit> {
        final /* synthetic */ Activity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Activity activity) {
            super(0);
            this.b = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LifecycleManager.this.a = this.b.getClass().getName();
            LifecycleManager.this.b = this.b.getIntent();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifecycleManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class j extends ej5 implements Function0<Boolean> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i) {
            super(0);
            this.b = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z = false;
            if (!LifecycleManager.this.k.contains(Integer.valueOf(this.b))) {
                if (LifecycleManager.this.k.size() >= 50) {
                    LifecycleManager.this.k.remove(0);
                }
                LifecycleManager.this.k.add(Integer.valueOf(this.b));
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public LifecycleManager(String str, Intent intent, boolean z, Function1<? super Activity, Unit> function1, Function1<? super Activity, Unit> function12, Function1<? super Activity, Unit> function13, Function1<? super Activity, Unit> function14, Function2<? super String, ? super String, Unit> function2) {
        z65.h(function1, "onActivityResumed");
        z65.h(function12, "onActivityPaused");
        z65.h(function13, "onActivityStarted");
        z65.h(function14, "onActivityStopped");
        z65.h(function2, "onTrackVisitReady");
        this.a = str;
        this.b = intent;
        this.c = z;
        this.d = function1;
        this.e = function12;
        this.f = function13;
        this.g = function14;
        this.h = function2;
        this.i = true;
        this.k = new ArrayList();
        this.l = true;
    }

    static /* synthetic */ void A(LifecycleManager lifecycleManager, Intent intent, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        lifecycleManager.z(intent, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String B(Intent intent) {
        return (String) yx5.a.b(null, new g(intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        yx5.a.d(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(Activity activity) {
        yx5.a.d(new i(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E(int i2) {
        return ((Boolean) yx5.a.b(Boolean.TRUE, new j(i2))).booleanValue();
    }

    @androidx.lifecycle.j(d.a.ON_STOP)
    private final void onAppMovedToBackground() {
        yx5.a.d(new d());
    }

    @androidx.lifecycle.j(d.a.ON_START)
    private final void onAppMovedToForeground() {
        yx5.a.d(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        yx5.a.d(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(Intent intent, boolean z) {
        yx5.a.d(new f(intent, z));
    }

    public final void F() {
        this.m = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        z65.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        z65.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        z65.h(activity, "activity");
        fk6 fk6Var = fk6.a;
        fk6Var.d(this, "onActivityPaused. activity: " + activity.getClass().getSimpleName());
        this.l = false;
        this.e.invoke(activity);
        this.l = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        z65.h(activity, "activity");
        fk6 fk6Var = fk6.a;
        fk6Var.d(this, "onActivityResumed. activity: " + activity.getClass().getSimpleName());
        this.l = true;
        this.d.invoke(activity);
        this.l = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        z65.h(activity, "activity");
        z65.h(bundle, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        z65.h(activity, "activity");
        yx5.a.d(new c(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        z65.h(activity, "activity");
        fk6 fk6Var = fk6.a;
        fk6Var.d(this, "onActivityStopped. activity: " + activity.getClass().getSimpleName());
        if (this.b == null || this.a == null) {
            D(activity);
        }
        this.g.invoke(activity);
    }

    public final boolean x() {
        return this.l;
    }

    public final boolean y() {
        Intent intent = this.b;
        if (intent != null && E(intent.hashCode())) {
            A(this, intent, false, 2, null);
        }
        if (this.b == null) {
            return false;
        }
        return true;
    }
}
