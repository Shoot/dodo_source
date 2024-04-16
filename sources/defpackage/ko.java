package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
/* compiled from: AppResourceLocalesFactoryImpl.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0007H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u001c\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b\u0016\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\b\u000f\u0010*¨\u0006/"}, d2 = {"Lko;", "Ljo;", "Landroid/content/res/Configuration;", "configuration", "", "Ljava/util/Locale;", "k", "Los5;", "l", "Landroid/content/res/Resources;", "resources", Image.TYPE_HIGH, "", "onConfigurationChanged", "Landroid/content/Context;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "Lrn5;", "()Ljava/util/List;", "appLocales", com.huawei.hms.opendevice.c.a, "j", "initialUserLocales", DateTokenConverter.CONVERTER_KEY, "i", "()Ljava/util/Locale;", "initialCurrentLocale", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", e.a, "Lorg/slf4j/Logger;", "logger", "Lfr6;", "f", "Lfr6;", "_userLocalesFlow", "g", "_currentLocaleFlow", "Lkua;", "Lkua;", "()Lkua;", "userLocalesFlow", "currentLocaleFlow", "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ko  reason: default package */
/* loaded from: classes4.dex */
public final class ko implements jo {
    public static final a j = new a(null);
    private final Context a;
    private final rn5 b;
    private final rn5 c;
    private final rn5 d;
    private final Logger e;
    private final fr6<List<Locale>> f;
    private final fr6<Locale> g;
    private final kua<List<Locale>> h;
    private final kua<Locale> i;

    /* compiled from: AppResourceLocalesFactoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¨\u0006\t"}, d2 = {"Lko$a;", "", "", "Ljava/util/Locale;", "userLocales", "appLocales", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ko$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Locale a(List<Locale> list, List<Locale> list2) {
            Object b0;
            Locale locale;
            Object obj;
            Object obj2;
            z65.h(list, "userLocales");
            z65.h(list2, "appLocales");
            for (Locale locale2 : list) {
                List<Locale> list3 = list2;
                Iterator<T> it = list3.iterator();
                while (true) {
                    locale = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (z65.c((Locale) obj, locale2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Locale locale3 = (Locale) obj;
                if (locale3 == null) {
                    Iterator<T> it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            Locale locale4 = (Locale) obj2;
                            if (z65.c(locale4.getLanguage(), locale2.getLanguage())) {
                                String country = locale4.getCountry();
                                z65.g(country, "getCountry(...)");
                                if (country.length() == 0) {
                                    break;
                                }
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    locale3 = (Locale) obj2;
                    if (locale3 == null) {
                        Iterator<T> it3 = list3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next = it3.next();
                            if (z65.c(((Locale) next).getLanguage(), locale2.getLanguage())) {
                                locale = next;
                                break;
                            }
                        }
                        locale3 = locale;
                        continue;
                    } else {
                        continue;
                    }
                }
                if (locale3 != null) {
                    return locale3;
                }
            }
            b0 = sc1.b0(list2);
            Locale locale5 = (Locale) b0;
            if (locale5 == null) {
                Locale locale6 = Locale.getDefault();
                z65.g(locale6, "getDefault(...)");
                return locale6;
            }
            return locale5;
        }
    }

    /* compiled from: AppResourceLocalesFactoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/util/Locale;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ko$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<List<? extends Locale>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Locale> invoke() {
            ko koVar = ko.this;
            Resources resources = koVar.a.getResources();
            z65.g(resources, "getResources(...)");
            return koVar.h(resources);
        }
    }

    /* compiled from: AppResourceLocalesFactoryImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/Locale;", "a", "()Ljava/util/Locale;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ko$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<Locale> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Locale invoke() {
            return ko.j.a(ko.this.j(), ko.this.b());
        }
    }

    /* compiled from: AppResourceLocalesFactoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/util/Locale;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ko$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function0<List<? extends Locale>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Locale> invoke() {
            ko koVar = ko.this;
            Configuration configuration = koVar.a.getResources().getConfiguration();
            z65.g(configuration, "getConfiguration(...)");
            return koVar.k(configuration);
        }
    }

    public ko(Context context) {
        rn5 b2;
        rn5 b3;
        rn5 b4;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
        b2 = yn5.b(new b());
        this.b = b2;
        b3 = yn5.b(new d());
        this.c = b3;
        b4 = yn5.b(new c());
        this.d = b4;
        this.e = LoggerFactory.getLogger("AppResourceLocalesFactoryImpl");
        fr6<List<Locale>> a2 = mua.a(j());
        this.f = a2;
        fr6<Locale> a3 = mua.a(i());
        this.g = a3;
        this.h = a2;
        this.i = a3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Locale> h(Resources resources) {
        ArrayList arrayList = new ArrayList();
        try {
            XmlResourceParser xml = resources.getXml(R.xml.locales_config);
            z65.g(xml, "getXml(...)");
            while (xml.next() != 1) {
                if (xml.getEventType() == 2 && z65.c(xml.getName(), "locale")) {
                    Locale forLanguageTag = Locale.forLanguageTag(xml.getAttributeValue("http://schemas.android.com/apk/res/android", Action.NAME_ATTRIBUTE));
                    z65.g(forLanguageTag, "forLanguageTag(...)");
                    arrayList.add(forLanguageTag);
                }
            }
        } catch (Exception e) {
            this.e.error("Error while parsing locales_config.xml", (Throwable) e);
        }
        return arrayList;
    }

    private final Locale i() {
        return (Locale) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Locale> j() {
        return (List) this.c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Locale> k(Configuration configuration) {
        os5 a2 = eq1.a(configuration);
        z65.g(a2, "getLocales(...)");
        return l(a2);
    }

    private final List<Locale> l(os5 os5Var) {
        List<Locale> W;
        int d2 = os5Var.d();
        ArrayList arrayList = new ArrayList(d2);
        for (int i = 0; i < d2; i++) {
            arrayList.add(os5Var.c(i));
        }
        W = sc1.W(arrayList);
        return W;
    }

    @Override // defpackage.jo
    public kua<Locale> a() {
        return this.i;
    }

    @Override // defpackage.jo
    public List<Locale> b() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.jo
    public kua<List<Locale>> c() {
        return this.h;
    }

    @Override // defpackage.jo
    public void onConfigurationChanged(Configuration configuration) {
        z65.h(configuration, "configuration");
        List<Locale> k = k(configuration);
        this.f.setValue(k);
        this.g.setValue(j.a(k, b()));
    }
}
