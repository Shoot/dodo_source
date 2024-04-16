package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LanguageService.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lwl5;", "", "Ltl5;", "a", "", LocalityEntity.FIELD_COUNTRY_CODE, "b", c.a, "newLanguageConfig", "Lwl5$a;", DateTokenConverter.CONVERTER_KEY, "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wl5  reason: default package */
/* loaded from: classes4.dex */
public interface wl5 {

    /* compiled from: LanguageService.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lwl5$a;", "", "<init>", "()V", "a", "b", "Lwl5$a$a;", "Lwl5$a$b;", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wl5$a */
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* compiled from: LanguageService.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwl5$a$a;", "Lwl5$a;", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: wl5$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0724a extends a {
            public static final C0724a a = new C0724a();

            private C0724a() {
                super(null);
            }
        }

        /* compiled from: LanguageService.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwl5$a$b;", "Lwl5$a;", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: wl5$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    tl5 a();

    tl5 b(String str);

    tl5 c();

    a d(tl5 tl5Var);
}
