package ru.dodopizza.app.presentation.checkout.taxpayerid;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TaxPayerIdPresenter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/b;", "Lok3;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/app/presentation/checkout/taxpayerid/b$a;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/b$b;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/b$c;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/b$d;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class b extends ok3 {

    /* compiled from: TaxPayerIdPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/b$a;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends b {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: TaxPayerIdPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/b$b;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.taxpayerid.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0561b extends b {
        public static final C0561b a = new C0561b();

        private C0561b() {
            super(null);
        }
    }

    /* compiled from: TaxPayerIdPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/b$c;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c extends b {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* compiled from: TaxPayerIdPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/b$d;", "Lru/dodopizza/app/presentation/checkout/taxpayerid/b;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "newTaxPayerId", "<init>", "(Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class d extends b {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            z65.h(str, "newTaxPayerId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
