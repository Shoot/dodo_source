package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.app.R;
/* compiled from: NotificationChannelFactory.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Li17;", "", "Lj17;", "Li17$a;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "channelType", "Lsv0;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: i17  reason: default package */
/* loaded from: classes3.dex */
public final class i17 {
    public static final i17 a = new i17();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationChannelFactory.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Li17$a;", "", "", "a", "I", "k", "()I", "nameResourceId", "b", "i", "descriptionResourceId", "<init>", "(Ljava/lang/String;III)V", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: i17$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final a c = new a("MARKETING", 0, R.string.channel_marketing_name, R.string.channel_marketing_description);
        public static final a d = new a("ORDER_RATING", 1, R.string.channel_order_rating_name, R.string.channel_order_rating_description);
        public static final a e = new a("ORDER_TRACKING", 2, R.string.channel_order_tracking_name, R.string.channel_order_tracking_description);
        public static final a f = new a("NATIVE_CHAT", 3, R.string.channel_chat_name, R.string.channel_chat_description);
        private static final /* synthetic */ a[] g;
        private static final /* synthetic */ kj3 h;
        private final int a;
        private final int b;

        static {
            a[] a = a();
            g = a;
            h = lj3.a(a);
        }

        private a(String str, int i, int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{c, d, e, f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) g.clone();
        }

        public final int i() {
            return this.b;
        }

        public final int k() {
            return this.a;
        }
    }

    /* compiled from: NotificationChannelFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: i17$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j17.values().length];
            try {
                iArr[j17.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j17.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j17.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private i17() {
    }

    private final a b(j17 j17Var) {
        int i = b.$EnumSwitchMapping$0[j17Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return a.f;
                }
                throw new NoWhenBranchMatchedException();
            }
            return a.e;
        }
        return a.c;
    }

    public final sv0 a(Context context, j17 j17Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(j17Var, "channelType");
        a b2 = b(j17Var);
        String id = j17Var.getId();
        String string = context.getString(b2.k());
        z65.g(string, "getString(...)");
        String string2 = context.getString(b2.i());
        z65.g(string2, "getString(...)");
        return new sv0(id, string, string2);
    }
}
