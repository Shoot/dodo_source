package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CountryNameService.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\f"}, d2 = {"Lqy1;", "Lpy1;", "", "isoName", "a", "Lkotlin/Function1;", "Ljava/util/Locale;", "Lkotlin/jvm/functions/Function1;", "localeFor", "<init>", "()V", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qy1  reason: default package */
/* loaded from: classes4.dex */
public final class qy1 implements py1 {
    public static final a b = new a(null);
    private static final Map<String, Locale> c;
    private final Function1<String, Locale> a = b.a;

    /* compiled from: CountryNameService.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lqy1$a;", "", "", "", "Ljava/util/Locale;", "CUSTOM_COUNTRY_NAME_MAP", "Ljava/util/Map;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qy1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CountryNameService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", LocalityEntity.FIELD_COUNTRY_CODE, "Ljava/util/Locale;", "a", "(Ljava/lang/String;)Ljava/util/Locale;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qy1$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<String, Locale> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Locale invoke(String str) {
            z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
            Map map = qy1.c;
            String language = Locale.getDefault().getLanguage();
            Locale locale = (Locale) map.get(language + "-" + str);
            if (locale == null) {
                Locale locale2 = Locale.getDefault();
                z65.g(locale2, "getDefault(...)");
                return locale2;
            }
            return locale;
        }
    }

    static {
        Map<String, Locale> f;
        f = f86.f(lnb.a("ru-KG", new Locale("ky", "KG")));
        c = f;
    }

    @Override // defpackage.py1
    public String a(String str) {
        z65.h(str, "isoName");
        String displayCountry = new Locale("", str).getDisplayCountry(this.a.invoke(str));
        z65.g(displayCountry, "getDisplayCountry(...)");
        return displayCountry;
    }
}
