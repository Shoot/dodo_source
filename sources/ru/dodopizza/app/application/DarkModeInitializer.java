package ru.dodopizza.app.application;

import android.content.Context;
import androidx.appcompat.app.d;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.BaseInitializer;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.infrastracture.utils.RealmInitializer;
/* compiled from: DarkModeInitializer.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lru/dodopizza/app/application/DarkModeInitializer;", "Lcom/dodopizza/presentation/BaseInitializer;", "", "Ljava/lang/Class;", "Lru/dodopizza/app/infrastracture/utils/RealmInitializer;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "b", "Lrn5;", e.a, "()Lorg/slf4j/Logger;", "logger", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DarkModeInitializer extends BaseInitializer {
    private final rn5 b;

    /* compiled from: DarkModeInitializer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("DarkModeInitializer");
        }
    }

    public DarkModeInitializer() {
        rn5 b;
        b = yn5.b(a.a);
        this.b = b;
    }

    private final Logger e() {
        return (Logger) this.b.getValue();
    }

    @Override // com.dodopizza.presentation.BaseInitializer, defpackage.y25
    public List<Class<RealmInitializer>> a() {
        List<Class<RealmInitializer>> e;
        e = jc1.e(RealmInitializer.class);
        return e;
    }

    @Override // com.dodopizza.presentation.BaseInitializer
    public void d(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            if (((AppComponent) getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).z0().a(bq3.p6)) {
                d.H(-1);
            } else {
                d.H(1);
            }
        } catch (Exception e) {
            e().error("Failed to init dark mode", (Throwable) e);
        }
    }
}
