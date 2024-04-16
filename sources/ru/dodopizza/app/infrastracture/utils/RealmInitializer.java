package ru.dodopizza.app.infrastracture.utils;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.common.PersistenceRealmModule;
import com.dodopizza.persistence.common.RealmModuleWithMigration;
import com.dodopizza.presentation.BaseInitializer;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import io.realm.d0;
import io.realm.exceptions.RealmFileException;
import io.realm.j0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: RealmInitializer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/infrastracture/utils/RealmInitializer;", "Lcom/dodopizza/presentation/BaseInitializer;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "b", "Lrn5;", e.a, "()Lorg/slf4j/Logger;", "logger", "<init>", "()V", c.a, "a", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RealmInitializer extends BaseInitializer {
    public static final a c = new a(null);
    private final rn5 b;

    /* compiled from: RealmInitializer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/infrastracture/utils/RealmInitializer$a;", "", "", "CURRENT_VERSION", "J", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RealmInitializer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("RealmInitializer");
        }
    }

    public RealmInitializer() {
        rn5 b2;
        b2 = yn5.b(b.a);
        this.b = b2;
    }

    private final Logger e() {
        return (Logger) this.b.getValue();
    }

    @Override // com.dodopizza.presentation.BaseInitializer
    public void d(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        wta.a.d(fxa.c);
        d0.M0(context);
        j0 b2 = new j0.a().g(new PersistenceRealmModule(), new RealmModuleWithMigration()).i(136L).d().b();
        d0.S0(b2);
        try {
            d0.x0().close();
        } catch (RealmFileException e) {
            try {
                j0 r0 = d0.r0();
                if (r0 != null) {
                    d0.l(r0);
                } else {
                    e().error("Default Realm configuration is missing");
                    d0.l(b2);
                }
                e().error("Failed to open the default Realm instance", (Throwable) e);
            } catch (Throwable th) {
                e().error("Failed to open the default Realm instance", (Throwable) e);
                throw th;
            }
        }
    }
}
