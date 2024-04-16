package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k17;
import defpackage.rs8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CommunicationNotification.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 \u001c2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b)\u0010*J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\f\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0014\u0010$\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0014\u0010&\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0014\u0010(\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001d¨\u0006+"}, d2 = {"Lgk1;", "Lvw1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/NotificationManager;", "notificationManager", "Landroid/graphics/Bitmap;", "bitmap", "", "k", "b", "Lu27;", "a", "Lu27;", "notificationMessage", "Lgc;", "Lgc;", "analytics", "Lj17;", c.a, "Lj17;", "()Lj17;", "channelType", "", "g", "()I", "notificationId", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "clickUrl", e.a, "imageUrl", "j", "uniqueKey", "i", "title", "f", "message", Image.TYPE_HIGH, "payload", "<init>", "(Lu27;Lgc;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gk1  reason: default package */
/* loaded from: classes3.dex */
public final class gk1 extends vw1 {
    public static final a d = new a(null);
    private final u27 a;
    private final gc b;
    private final j17 c;

    /* compiled from: CommunicationNotification.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lgk1$a;", "", "", "CLICK_URL_KEY", "Ljava/lang/String;", "IMAGE_URL_KEY", "MESSAGE_KEY", "PAYLOAD_KEY", "SOURCE_KEY", "TITLE_KEY", "UNIQUE_KEY_KEY", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gk1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public gk1(u27 u27Var, gc gcVar) {
        z65.h(u27Var, "notificationMessage");
        z65.h(gcVar, "analytics");
        this.a = u27Var;
        this.b = gcVar;
        this.c = j17.b;
    }

    private final String d() {
        String str = this.a.a().get("clickUrl");
        if (str == null) {
            return "";
        }
        return str;
    }

    private final String e() {
        String str = this.a.a().get("imageUrl");
        if (str == null) {
            return "";
        }
        return str;
    }

    private final String f() {
        String str = this.a.a().get("message");
        if (str == null) {
            return "";
        }
        return str;
    }

    private final int g() {
        return b37.b.i();
    }

    private final String h() {
        String str = this.a.a().get("payload");
        if (str == null) {
            return "";
        }
        return str;
    }

    private final String i() {
        String str = this.a.a().get("title");
        if (str == null) {
            return "";
        }
        return str;
    }

    private final String j() {
        String str = this.a.a().get("uniqueKey");
        if (str == null) {
            return "";
        }
        return str;
    }

    private final void k(Context context, NotificationManager notificationManager, Bitmap bitmap) {
        k17.g r;
        so9 d2 = new so9(context).f(d()).e(i()).d(f());
        v27 v27Var = v27.e;
        PendingIntent a2 = new to9(context).a(d2.c(v27Var.getValue()).b("uniq_key", j()).b("mindbox_message_extra", f()).b("mindbox_payload_extra", h()).a());
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        if (bitmap == null) {
            r = new k17.c().q(f());
            z65.e(r);
        } else {
            r = new k17.b().r(bitmap);
            z65.e(r);
        }
        k17.e p = c37.a.a(context, a()).r(i()).q(f()).I(defaultUri).J(r).l(true).p(a2);
        z65.g(p, "setContentIntent(...)");
        notificationManager.notify(g(), p.b());
        this.b.a(new rs8.c(d(), rs8.a.i(context), i(), f(), v27Var, null, null, j(), 96, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(gk1 gk1Var, Context context, NotificationManager notificationManager, Bitmap bitmap) {
        z65.h(gk1Var, "this$0");
        z65.h(context, "$context");
        z65.h(notificationManager, "$notificationManager");
        gk1Var.k(context, notificationManager, bitmap);
    }

    @Override // defpackage.vw1
    public j17 a() {
        return this.c;
    }

    @Override // defpackage.vw1
    public void b(final Context context, final NotificationManager notificationManager) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(notificationManager, "notificationManager");
        if (e().length() == 0) {
            k(context, notificationManager, null);
        } else {
            new p27(context).a(e(), new tr5() { // from class: fk1
                @Override // defpackage.tr5
                public final void a(Bitmap bitmap) {
                    gk1.l(gk1.this, context, notificationManager, bitmap);
                }
            });
        }
    }
}
