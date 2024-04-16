package ru.dodopizza.app.presentation.addresslist;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AddressListPresenter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/b;", "Lok3;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lru/dodopizza/app/presentation/addresslist/b$a;", "Lru/dodopizza/app/presentation/addresslist/b$b;", "Lru/dodopizza/app/presentation/addresslist/b$c;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class b extends ok3 {

    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/b$a;", "Lru/dodopizza/app/presentation/addresslist/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends b {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/b$b;", "Lru/dodopizza/app/presentation/addresslist/b;", "", "a", "I", com.huawei.hms.opendevice.c.a, "()I", "selectedAddressIndex", "b", "addressListSize", "Lou2;", "Lou2;", "()Lou2;", "deliverablePlace", "<init>", "(IILou2;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.addresslist.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0511b extends b {
        private final int a;
        private final int b;
        private final ou2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0511b(int i, int i2, ou2 ou2Var) {
            super(null);
            z65.h(ou2Var, "deliverablePlace");
            this.a = i;
            this.b = i2;
            this.c = ou2Var;
        }

        public final int a() {
            return this.b;
        }

        public final ou2 b() {
            return this.c;
        }

        public final int c() {
            return this.a;
        }
    }

    /* compiled from: AddressListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/addresslist/b$c;", "Lru/dodopizza/app/presentation/addresslist/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c extends b {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
