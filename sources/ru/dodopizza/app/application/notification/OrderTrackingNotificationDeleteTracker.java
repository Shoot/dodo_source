package ru.dodopizza.app.application.notification;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.di.AppComponent;
/* compiled from: OrderTrackingNotificationDeleteTracker.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lru/dodopizza/app/application/notification/OrderTrackingNotificationDeleteTracker;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "", "onReceive", "<init>", "()V", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OrderTrackingNotificationDeleteTracker extends BroadcastReceiver {
    public static final a a = new a(null);

    /* compiled from: OrderTrackingNotificationDeleteTracker.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/dodopizza/app/application/notification/OrderTrackingNotificationDeleteTracker$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lru/dodopizza/app/application/notification/OrderTrackingNotificationDeleteTracker$b;", "notificationInfo", "Landroid/app/PendingIntent;", "a", "", "EXTRA_NOTIFICATION_INFO", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PendingIntent a(Context context, b bVar) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(bVar, "notificationInfo");
            Intent putExtra = new Intent(context, OrderTrackingNotificationDeleteTracker.class).putExtra("notification_info", bVar);
            z65.g(putExtra, "putExtra(...)");
            return new to9(context).b(putExtra);
        }
    }

    /* compiled from: OrderTrackingNotificationDeleteTracker.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/dodopizza/app/application/notification/OrderTrackingNotificationDeleteTracker$b;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "orderId", "Lmi7;", "b", "Lmi7;", "()Lmi7;", "orderState", "<init>", "(Ljava/lang/String;Lmi7;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class b implements Serializable {
        private final String a;
        private final mi7 b;

        public b(String str, mi7 mi7Var) {
            z65.h(str, "orderId");
            z65.h(mi7Var, "orderState");
            this.a = str;
            this.b = mi7Var;
        }

        public final String a() {
            return this.a;
        }

        public final mi7 b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && this.b == bVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            mi7 mi7Var = this.b;
            return "NotificationInfo(orderId=" + str + ", orderState=" + mi7Var + ")";
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        b bVar;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        Serializable serializableExtra = intent.getSerializableExtra("notification_info");
        if (serializableExtra instanceof b) {
            bVar = (b) serializableExtra;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return;
        }
        ((AppComponent) eu2.b(context).a(bc9.b(AppComponent.class))).a().a(rs8.a.j(bVar.a(), bVar.b()));
    }
}
