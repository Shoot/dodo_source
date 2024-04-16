package ru.dodopizza.app.presentation.selectlocation.landing.smsinput;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Ticker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/b;", "", "<init>", "()V", "a", "b", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/b$a;", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/b$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class b {

    /* compiled from: Ticker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/b$a;", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/b;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends b {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: Ticker.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/b$b;", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "()J", "millisUntilFinished", "<init>", "(J)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.selectlocation.landing.smsinput.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0613b extends b {
        private final long a;

        public C0613b() {
            this(0L, 1, null);
        }

        public final long a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0613b) && this.a == ((C0613b) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ax1.a(this.a);
        }

        public String toString() {
            long j = this.a;
            return "TickerInProgress(millisUntilFinished=" + j + ")";
        }

        public C0613b(long j) {
            super(null);
            this.a = j;
        }

        public /* synthetic */ C0613b(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j);
        }
    }

    private b() {
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
