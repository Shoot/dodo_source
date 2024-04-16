package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.ServerDeltaTimeEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PreferencesAssetsDataSource.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001DB\u000f\u0012\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0006\u0010\u001f\u001a\u00020\u001aJ\u0006\u0010!\u001a\u00020 J\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0004J\u0006\u0010'\u001a\u00020\u0004J\u0006\u0010(\u001a\u00020\u000bJ\u000e\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0004J\u0016\u0010,\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010+\u001a\u00020 J\u0006\u0010-\u001a\u00020\u000bJ\u000e\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0004J\u000e\u00101\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000eJ\b\u00102\u001a\u0004\u0018\u00010\u000eJ\u0006\u00103\u001a\u00020\u000bJ\u0006\u00104\u001a\u00020 J\u0006\u00105\u001a\u00020\u000bJ\u0006\u00106\u001a\u00020\u001aJ\u000e\u00108\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u001aJ\b\u0010:\u001a\u0004\u0018\u000109J\u0006\u0010;\u001a\u00020 J\u000e\u0010=\u001a\u00020\u000b2\u0006\u0010<\u001a\u000209J\u0006\u0010>\u001a\u00020\u000bJ\u0017\u0010?\u001a\u0004\u0018\u00010\u001a2\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\u0016\u0010A\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001aJ\u001a\u0010C\u001a\u00020\u000b2\b\b\u0001\u0010)\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0004H\u0016J\u0014\u0010D\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010)\u001a\u00020\u0004H\u0016J\u000e\u0010F\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u0004J\b\u0010G\u001a\u0004\u0018\u00010\u0004J\u0006\u0010H\u001a\u00020\u000bR\u001c\u0010L\u001a\n J*\u0004\u0018\u00010I0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010K¨\u0006Q"}, d2 = {"Lci8;", "Lvl5;", "Lgz4;", "", "", "Lj17;", "O", "", "o", "Lf28;", "phoneNumber", "", "E", "r", "Ldt5;", "j", "l", "Ltl5;", DateTokenConverter.CONVERTER_KEY, "config", c.a, "Ln42;", Image.TYPE_SMALL, "profile", "F", "L", "", "sleepTime", "I", "blockTime", "H", "u", "", "f", "authToken", "z", "k", "fcmToken", "A", Image.TYPE_MEDIUM, "y", Action.KEY_ATTRIBUTE, "N", "value", "M", "g", RemoteMessageConst.Notification.URL, "J", "locality", "G", "t", "i", "v", e.a, "x", "newAttemptsCount", "B", "Lj37;", "p", "P", "notificationsStatus", "C", "w", "n", "(Ljava/lang/String;)Ljava/lang/Integer;", "K", "id", "b", "a", LocalityEntity.FIELD_COUNTRY_CODE, "D", "q", Image.TYPE_HIGH, "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "userPreferences", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ci8  reason: default package */
/* loaded from: classes3.dex */
public final class ci8 implements vl5, gz4 {
    public static final a b = new a(null);
    private final SharedPreferences a;

    /* compiled from: PreferencesAssetsDataSource.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b)\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u001a\u0010%\u001a\u00020\u00028\u0002X\u0083T¢\u0006\f\n\u0004\b%\u0010\u0004\u0012\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0004¨\u0006+"}, d2 = {"Lci8$a;", "", "", "APP_RATED", "Ljava/lang/String;", "APP_RATE_ATTEMPTS", "AUTH_TOKEN", "BASE_URL", "BIRTH_DAY", "BIRTH_MONTH", "BIRTH_YEAR", "EMAIL_ELECTRONIC_CHECK", "FCM_TOKEN", "FIRST_NAME", ServerDeltaTimeEntity.ID_VALUE, "IS_SUBSCRIBED_ON_SMS", "IS_SUBSCRIBE_NEWS", "LAST_NAME", "LOYALTY_PROGRAM_BALANCE", "NOTIFICATION_DISABLED_CHANNELS", "NOTIFICATION_ENABLED_CHANNELS", "NOTIFICATION_ENABLE_STATUS", "ONBOARDING_SELECTED_COUNTRY_CODE", "ON_PAUSE_APP_TIME", "ORDER_HISTORY_COUNT", "PHONE_NUMBER", "PHONE_PREFIX", "SAVED_COUNTRY", "SAVED_LANGUAGE", "SELECTED_LOCALITY_COUNTRY_CODE", "SELECTED_LOCALITY_ID", "SELECTED_LOCALITY_ISTOP", "SELECTED_LOCALITY_NAME", "SELECTED_LOCALITY_POSTCODE", "SELECTED_LOCALITY_UUID", "TEMPORARILY_BLOCKED", "TEMPORARILY_SLEEP_TIME", "TOKEN", "getTOKEN$annotations", "()V", "USER_PROFILE", "WAS_INSTANT_APP_STATUS_TRACKED", "<init>", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ci8$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ci8(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context.getSharedPreferences("user_profile", 0);
    }

    private final void E(f28 f28Var) {
        this.a.edit().putString("phone_prefix", f28Var.b()).putString("phone", f28Var.a()).apply();
    }

    private final Set<j17> O(Set<String> set) {
        Set<j17> e;
        if (set == null) {
            e = sfa.e();
            return e;
        }
        j17[] values = j17.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (j17 j17Var : values) {
            if (set.contains(j17Var.getId())) {
                linkedHashSet.add(j17Var);
            }
        }
        return linkedHashSet;
    }

    private final dt5 j() {
        String string = this.a.getString("locality_id", "");
        z65.e(string);
        String string2 = this.a.getString("locality_uuid", "");
        z65.e(string2);
        String string3 = this.a.getString("selected_locality_name", "");
        z65.e(string3);
        String string4 = this.a.getString("selected_locality_country_code", "643");
        z65.e(string4);
        return new ila(string, string2, string3, string4, Integer.MAX_VALUE, this.a.getBoolean("selected_locality_istop", false));
    }

    private final double o() {
        try {
            SharedPreferences sharedPreferences = this.a;
            z65.g(sharedPreferences, "userPreferences");
            return eia.a(sharedPreferences, "loyaltyProgramBalance", 0.0d);
        } catch (ClassCastException unused) {
            return 0.0d;
        }
    }

    private final f28 r() {
        String string = this.a.getString("phone", "");
        String string2 = this.a.getString("phone_prefix", "+7");
        z65.e(string2);
        z65.e(string);
        return new f28(string2, string);
    }

    public final void A(String str) {
        z65.h(str, "fcmToken");
        this.a.edit().putString("fcm_token", str).apply();
    }

    public final void B(int i) {
        this.a.edit().putInt("app_rate_attempts", i).apply();
    }

    public final void C(j37 j37Var) {
        z65.h(j37Var, "notificationsStatus");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (j17 j17Var : j37Var.b()) {
            linkedHashSet.add(j17Var.getId());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (j17 j17Var2 : j37Var.a()) {
            linkedHashSet2.add(j17Var2.getId());
        }
        this.a.edit().putBoolean("notification_enable_status", j37Var.c()).putStringSet("notification_enabled_channels", linkedHashSet).putStringSet("notification_disabled_channels", linkedHashSet2).apply();
    }

    public final void D(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        this.a.edit().putString("onboarding_selected_country_code", str).commit();
    }

    public final void F(n42 n42Var) {
        z65.h(n42Var, "profile");
        E(n42Var.m());
        SharedPreferences.Editor putInt = this.a.edit().putString("id", n42Var.i()).putString("first_name", n42Var.h()).putString("last_name", n42Var.h()).putInt("birthDay", ((Number) mh5.c(n42Var.d(), 0)).intValue()).putInt("birthMonth", ((Number) mh5.c(n42Var.e(), 0)).intValue()).putInt("birthYear", ((Number) mh5.c(n42Var.f(), 0)).intValue());
        z65.g(putInt, "putInt(...)");
        eia.b(putInt, "loyaltyProgramBalance", n42Var.k()).putString("emailElectronicCheck", n42Var.g()).putBoolean("isSubscribedOnNews", n42Var.n()).putBoolean("isSubscribedOnSms", n42Var.n()).putInt("orderHistoryCount", n42Var.l()).apply();
    }

    public final void G(dt5 dt5Var) {
        z65.h(dt5Var, "locality");
        this.a.edit().putString("locality_id", dt5Var.getId()).putString("locality_uuid", dt5Var.d()).putString("selected_locality_name", dt5Var.getName()).putString("selected_locality_country_code", dt5Var.a()).putBoolean("selected_locality_istop", dt5Var.e()).apply();
        this.a.edit().remove("selected_locality_postcode").apply();
    }

    public final void H(int i) {
        this.a.edit().putInt("temporarilyBlocked", i).apply();
    }

    public final void I(int i) {
        this.a.edit().putInt("temporarilySleepTime", i).apply();
    }

    public final void J(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        this.a.edit().putString("base_url", str).commit();
    }

    public final void K(String str, int i) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        this.a.edit().putInt(str, i).apply();
    }

    public final void L() {
        this.a.edit().putLong("onPauseAppTime", System.currentTimeMillis()).apply();
    }

    public final void M(String str, boolean z) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        this.a.edit().putBoolean(str, z).apply();
    }

    public final boolean N(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        return this.a.getBoolean(str, true);
    }

    public final boolean P() {
        return this.a.getBoolean("was_instant_app_status_tracked", false);
    }

    @Override // defpackage.gz4
    public String a(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        return this.a.getString(str, "");
    }

    @Override // defpackage.gz4
    public void b(String str, String str2) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(str2, "id");
        this.a.edit().putString(str, str2).apply();
    }

    @Override // defpackage.vl5
    public void c(tl5 tl5Var) {
        z65.h(tl5Var, "config");
        this.a.edit().putString("saved_language", tl5Var.b()).putString("saved_country", tl5Var.a()).apply();
    }

    @Override // defpackage.vl5
    public tl5 d() {
        if (this.a.contains("saved_language")) {
            String string = this.a.getString("saved_language", "en");
            String string2 = this.a.getString("saved_country", "");
            z65.e(string);
            z65.e(string2);
            return new tl5(string, string2);
        }
        return null;
    }

    public final void e() {
        this.a.edit().putBoolean("app_rated", true).apply();
    }

    public final boolean f() {
        if (System.currentTimeMillis() - this.a.getLong("onPauseAppTime", 0L) > TimeUnit.SECONDS.toMillis(this.a.getInt("temporarilySleepTime", 1800))) {
            return true;
        }
        return false;
    }

    public final void g() {
        this.a.edit().clear().apply();
    }

    public final void h() {
        this.a.edit().remove("onboarding_selected_country_code").apply();
    }

    public final void i() {
        this.a.edit().remove("locality_id").remove("locality_uuid").remove("selected_locality_name").remove("selected_locality_country_code").remove("selected_locality_istop").commit();
    }

    public final String k() {
        String string;
        if (this.a.contains("token")) {
            string = this.a.getString("token", "");
            if (string == null) {
                return "";
            }
        } else {
            string = this.a.getString("auth_token", "");
            if (string == null) {
                return "";
            }
        }
        return string;
    }

    public final String l() {
        return this.a.getString("base_url", null);
    }

    public final String m() {
        String string = this.a.getString("fcm_token", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public final Integer n(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        int i = this.a.getInt(str, -1);
        if (i != -1) {
            return Integer.valueOf(i);
        }
        return null;
    }

    public final j37 p() {
        if (!this.a.contains("notification_enable_status")) {
            return null;
        }
        return new j37(this.a.getBoolean("notification_enable_status", false), O(this.a.getStringSet("notification_enabled_channels", null)), O(this.a.getStringSet("notification_disabled_channels", null)));
    }

    public final String q() {
        return this.a.getString("onboarding_selected_country_code", null);
    }

    public final n42 s() {
        Integer num;
        Integer num2;
        Integer num3;
        String string = this.a.getString("id", "");
        f28 r = r();
        String string2 = this.a.getString("first_name", "");
        String string3 = this.a.getString("last_name", "");
        String string4 = this.a.getString("emailElectronicCheck", "");
        boolean z = this.a.getBoolean("isSubscribedOnNews", false);
        int i = this.a.getInt("birthDay", 0);
        int i2 = this.a.getInt("birthMonth", 0);
        int i3 = this.a.getInt("birthYear", 0);
        int i4 = this.a.getInt("orderHistoryCount", 0);
        double o = o();
        z65.e(string);
        z65.e(string2);
        z65.e(string3);
        if (i != 0) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        if (i2 != 0) {
            num2 = Integer.valueOf(i2);
        } else {
            num2 = null;
        }
        if (i3 != 0) {
            num3 = Integer.valueOf(i3);
        } else {
            num3 = null;
        }
        z65.e(string4);
        return new n42(string, r, string2, string3, num, num2, num3, i4, o, string4, z);
    }

    public final dt5 t() {
        if (this.a.contains("locality_id")) {
            return j();
        }
        return null;
    }

    public final int u() {
        return this.a.getInt("temporarilyBlocked", 0);
    }

    public final boolean v() {
        return this.a.getBoolean("app_rated", false);
    }

    public final void w() {
        this.a.edit().putBoolean("was_instant_app_status_tracked", true).apply();
    }

    public final int x() {
        return this.a.getInt("app_rate_attempts", 0);
    }

    public final void y() {
        this.a.edit().remove("fcm_token").apply();
    }

    public final void z(String str) {
        z65.h(str, "authToken");
        this.a.edit().putString("auth_token", str).remove("token").apply();
    }
}
