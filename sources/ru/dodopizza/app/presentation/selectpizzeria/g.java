package ru.dodopizza.app.presentation.selectpizzeria;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectPizzeriaVO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/g;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/app/presentation/selectpizzeria/g$a;", "Lru/dodopizza/app/presentation/selectpizzeria/g$b;", "Lru/dodopizza/app/presentation/selectpizzeria/g$c;", "Lru/dodopizza/app/presentation/selectpizzeria/g$d;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class g {

    /* compiled from: SelectPizzeriaVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/g$a;", "Lru/dodopizza/app/presentation/selectpizzeria/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends g {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/g$b;", "Lru/dodopizza/app/presentation/selectpizzeria/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b extends g {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaVO.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/g$c;", "Lru/dodopizza/app/presentation/selectpizzeria/g;", "", "Lb68;", "a", "Ljava/util/List;", "()Ljava/util/List;", "pizzerias", "", "b", "Z", com.huawei.hms.opendevice.c.a, "()Z", "isShortNameEnabled", "isCityTitleEnabled", "<init>", "(Ljava/util/List;ZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c extends g {
        private final List<b68> a;
        private final boolean b;
        private final boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<b68> list, boolean z, boolean z2) {
            super(null);
            z65.h(list, "pizzerias");
            this.a = list;
            this.b = z;
            this.c = z2;
        }

        public final List<b68> a() {
            return this.a;
        }

        public final boolean b() {
            return this.c;
        }

        public final boolean c() {
            return this.b;
        }
    }

    /* compiled from: SelectPizzeriaVO.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/g$d;", "Lru/dodopizza/app/presentation/selectpizzeria/g;", "", "Lb68;", "a", "Ljava/util/List;", "()Ljava/util/List;", "pizzerias", "<init>", "(Ljava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d extends g {
        private final List<b68> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<b68> list) {
            super(null);
            z65.h(list, "pizzerias");
            this.a = list;
        }

        public final List<b68> a() {
            return this.a;
        }
    }

    private g() {
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
