package com.dodopizza.android.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c42;
import defpackage.g42;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CustomTabs.kt */
@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\b*\u0001,\u0018\u00002\u00020\u0001:\u00012B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/dodopizza/android/customtabs/CustomTabs;", "", "", "showTitle", "Lg42;", "j", "", "i", "n", "k", "Lop5;", "lifecycleOwner", Image.TYPE_MEDIUM, "Landroid/net/Uri;", RemoteMessageConst.Notification.URL, "l", "Landroid/content/Context;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Llg0;", "b", "Llg0;", "fallback", "Lf42;", c.a, "Lf42;", "tabsPackage", "Le42;", DateTokenConverter.CONVERTER_KEY, "Le42;", "tabClient", "Lj42;", e.a, "Lj42;", "tabSession", "f", "Z", "isBound", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "g", "Lorg/slf4j/Logger;", "logger", "com/dodopizza/android/customtabs/CustomTabs$a", Image.TYPE_HIGH, "Lcom/dodopizza/android/customtabs/CustomTabs$a;", "tabConnection", "<init>", "(Landroid/content/Context;Llg0;Lf42;)V", "TabsLifecycleObserver", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CustomTabs {
    private final Context a;
    private final lg0 b;
    private final f42 c;
    private e42 d;
    private j42 e;
    private boolean f;
    private final Logger g;
    private final a h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CustomTabs.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/dodopizza/android/customtabs/CustomTabs$TabsLifecycleObserver;", "Lpq2;", "Lop5;", "owner", "", "onStart", "onStop", "<init>", "(Lcom/dodopizza/android/customtabs/CustomTabs;)V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public final class TabsLifecycleObserver implements pq2 {
        public TabsLifecycleObserver() {
        }

        @Override // defpackage.pq2
        public /* synthetic */ void onCreate(op5 op5Var) {
            oq2.a(this, op5Var);
        }

        @Override // defpackage.pq2
        public /* synthetic */ void onDestroy(op5 op5Var) {
            oq2.b(this, op5Var);
        }

        @Override // defpackage.pq2
        public /* synthetic */ void onPause(op5 op5Var) {
            oq2.c(this, op5Var);
        }

        @Override // defpackage.pq2
        public /* synthetic */ void onResume(op5 op5Var) {
            oq2.d(this, op5Var);
        }

        @Override // defpackage.pq2
        public void onStart(op5 op5Var) {
            z65.h(op5Var, "owner");
            CustomTabs.this.i();
        }

        @Override // defpackage.pq2
        public void onStop(op5 op5Var) {
            z65.h(op5Var, "owner");
            CustomTabs.this.n();
        }
    }

    /* compiled from: CustomTabs.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/dodopizza/android/customtabs/CustomTabs$a", "Li42;", "Landroid/content/ComponentName;", Action.NAME_ATTRIBUTE, "", "onServiceDisconnected", "Le42;", "client", "a", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a extends i42 {
        a() {
        }

        @Override // defpackage.i42
        public void a(ComponentName componentName, e42 e42Var) {
            z65.h(componentName, Action.NAME_ATTRIBUTE);
            z65.h(e42Var, "client");
            try {
                CustomTabs.this.d = e42Var;
                e42 e42Var2 = CustomTabs.this.d;
                if (e42Var2 != null) {
                    e42Var2.e(0L);
                }
                CustomTabs customTabs = CustomTabs.this;
                e42 e42Var3 = customTabs.d;
                j42 j42Var = null;
                if (e42Var3 != null) {
                    j42Var = e42Var3.c(null);
                }
                customTabs.e = j42Var;
            } catch (SecurityException e) {
                Logger logger = CustomTabs.this.g;
                String a = CustomTabs.this.c.a();
                logger.error("Custom tabs is failed with " + a, (Throwable) e);
                CustomTabs.this.k();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            CustomTabs.this.d = null;
            CustomTabs.this.e = null;
        }
    }

    public CustomTabs(Context context, lg0 lg0Var, f42 f42Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(lg0Var, "fallback");
        z65.h(f42Var, "tabsPackage");
        this.a = context;
        this.b = lg0Var;
        this.c = f42Var;
        this.g = LoggerFactory.getLogger("CustomTabs");
        this.h = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        String a2 = this.c.a();
        Logger logger = this.g;
        logger.info("Custom tabs package is " + a2);
        if (!z65.c(a2, "")) {
            this.f = e42.a(this.a, a2, this.h);
        }
    }

    private final g42 j(boolean z) {
        c42 a2 = new c42.a().b(iu1.c(this.a, jw8.q)).a();
        z65.g(a2, "build(...)");
        g42 a3 = new g42.a().b(a2).e(z).d(2).f(true).a();
        z65.g(a3, "build(...)");
        a3.a.setFlags(268435456);
        return a3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.d = null;
        this.e = null;
        this.f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        if (this.f && this.d != null && this.e != null) {
            this.a.unbindService(this.h);
            k();
        }
    }

    public final void l(Uri uri, boolean z) {
        z65.h(uri, RemoteMessageConst.Notification.URL);
        if (this.d == null) {
            lg0 lg0Var = this.b;
            String uri2 = uri.toString();
            z65.g(uri2, "toString(...)");
            lg0Var.a(uri2);
            return;
        }
        j(z).a(this.a, uri);
    }

    public final void m(op5 op5Var) {
        z65.h(op5Var, "lifecycleOwner");
        op5Var.getLifecycle().a(new TabsLifecycleObserver());
    }
}
