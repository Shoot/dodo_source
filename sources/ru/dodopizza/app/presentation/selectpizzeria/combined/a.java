package ru.dodopizza.app.presentation.selectpizzeria.combined;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectCombinedPizzeriaVO.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/a;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lru/dodopizza/app/presentation/selectpizzeria/combined/a$a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/a$b;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/a$c;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class a {

    /* compiled from: SelectCombinedPizzeriaVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/a$a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/a;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0632a extends a {
        public static final C0632a a = new C0632a();

        private C0632a() {
            super(null);
        }
    }

    /* compiled from: SelectCombinedPizzeriaVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/a$b;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/a;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b extends a {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* compiled from: SelectCombinedPizzeriaVO.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0014"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/a$c;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/a;", "", "Lb68;", "a", "Ljava/util/List;", "()Ljava/util/List;", "pizzerias", "Lr88;", "b", "pizzeriasFilters", "", com.huawei.hms.opendevice.c.a, "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "isShortNameEnabled", "isCityTitleEnabled", "<init>", "(Ljava/util/List;Ljava/util/List;ZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c extends a {
        private final List<b68> a;
        private final List<r88> b;
        private final boolean c;
        private final boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<b68> list, List<r88> list2, boolean z, boolean z2) {
            super(null);
            z65.h(list, "pizzerias");
            z65.h(list2, "pizzeriasFilters");
            this.a = list;
            this.b = list2;
            this.c = z;
            this.d = z2;
        }

        public final List<b68> a() {
            return this.a;
        }

        public final List<r88> b() {
            return this.b;
        }

        public final boolean c() {
            return this.d;
        }

        public final boolean d() {
            return this.c;
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
