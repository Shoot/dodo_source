package ru.dodopizza.app.di.modules;

import android.app.Application;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.RealmInteger;
import com.dodopizza.persistence.entity.RealmString;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.models.CampaignMessageKt;
import io.realm.k0;
import java.lang.reflect.Field;
import kotlin.Metadata;
import ru.dodopizza.app.data.deserializer.PromoCodeDeserializer;
import ru.dodopizza.app.data.deserializer.RealmIntegerDeserializer;
import ru.dodopizza.app.data.deserializer.RealmListSerializer;
import ru.dodopizza.app.data.deserializer.RealmStringDeserializer;
/* compiled from: DataSourceModule.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\nH\u0007J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006H\u0007J\b\u0010\u001c\u001a\u00020\u001bH\u0007¨\u0006\u001f"}, d2 = {"Lru/dodopizza/app/di/modules/DataSourceModule;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lci8;", Image.TYPE_HIGH, "Li60;", "a", "Lf89;", "g", "Lvc6;", "f", "memoryDataSource", "Lxu8;", "i", "Ljk2;", "daoFactory", "Lul0;", c.a, "cacheTimestampRepository", "Lml0;", "b", "Landroid/app/Application;", "appContext", "backupPrefs", "Ls13;", DateTokenConverter.CONVERTER_KEY, "Lcom/google/gson/Gson;", e.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DataSourceModule {
    public static final DataSourceModule a = new DataSourceModule();

    /* compiled from: DataSourceModule.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lru/dodopizza/app/di/modules/DataSourceModule$a;", "Lks3;", "Ljava/lang/reflect/Field;", "field", "", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    private static final class a implements ks3 {
        @Override // defpackage.ks3
        public String a(Field field) {
            z65.h(field, "field");
            String a = js3.d.a(field);
            z65.e(a);
            String substring = a.substring(2, a.length());
            z65.g(substring, "substring(...)");
            String lowerCase = substring.toLowerCase();
            z65.g(lowerCase, "toLowerCase(...)");
            z65.e(lowerCase);
            return lowerCase;
        }
    }

    private DataSourceModule() {
    }

    public final i60 a(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new i60(context);
    }

    public final ml0 b(ul0 ul0Var) {
        z65.h(ul0Var, "cacheTimestampRepository");
        return new nl0(ul0Var);
    }

    public final ul0 c(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return new wl0(jk2Var);
    }

    public final s13 d(Application application, i60 i60Var) {
        z65.h(application, "appContext");
        z65.h(i60Var, "backupPrefs");
        return new t13(application, i60Var);
    }

    public final Gson e() {
        Gson b = new com.google.gson.a().g(js3.b).h(new a()).j().i().f(CampaignMessageKt.CAMPAIGN_DATE_FORMAT_PARSE).c(RealmString.class, new RealmStringDeserializer()).c(RealmInteger.class, new RealmIntegerDeserializer()).c(new TypeToken<k0<RealmString>>() { // from class: ru.dodopizza.app.di.modules.DataSourceModule$provideGson$realmType$1
        }.getType(), new RealmListSerializer()).c(DataPromoCodeEntity.class, new PromoCodeDeserializer()).b();
        z65.g(b, "create(...)");
        return b;
    }

    public final vc6 f() {
        return new vc6();
    }

    public final f89 g() {
        return new f89();
    }

    public final ci8 h(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new ci8(context);
    }

    public final xu8 i(vc6 vc6Var) {
        z65.h(vc6Var, "memoryDataSource");
        return new xu8(vc6Var);
    }
}
