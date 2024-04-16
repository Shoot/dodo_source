package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.mv9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ScheduleStatus.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lqv9;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lqv9$a;", "Lqv9$b;", "Lqv9$c;", "Lqv9$d;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qv9  reason: default package */
/* loaded from: classes4.dex */
public abstract class qv9 {

    /* compiled from: ScheduleStatus.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lqv9$a;", "Lqv9;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lmv9$a;", "a", "Lmv9$a;", "()Lmv9$a;", "currentDaySchedule", "b", "willBeOpenDaySchedule", "<init>", "(Lmv9$a;Lmv9$a;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qv9$a */
    /* loaded from: classes4.dex */
    public static final class a extends qv9 {
        private final mv9.a a;
        private final mv9.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mv9.a aVar, mv9.a aVar2) {
            super(null);
            z65.h(aVar, "currentDaySchedule");
            z65.h(aVar2, "willBeOpenDaySchedule");
            this.a = aVar;
            this.b = aVar2;
        }

        public final mv9.a a() {
            return this.a;
        }

        public final mv9.a b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            mv9.a aVar = this.a;
            mv9.a aVar2 = this.b;
            return "Closed(currentDaySchedule=" + aVar + ", willBeOpenDaySchedule=" + aVar2 + ")";
        }
    }

    /* compiled from: ScheduleStatus.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0014"}, d2 = {"Lqv9$b;", "Lqv9;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lmv9$a;", "a", "Lmv9$a;", "getCurrentDaySchedule", "()Lmv9$a;", "currentDaySchedule", "b", "currentlyOpenSchedule", "<init>", "(Lmv9$a;Lmv9$a;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qv9$b */
    /* loaded from: classes4.dex */
    public static final class b extends qv9 {
        private final mv9.a a;
        private final mv9.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mv9.a aVar, mv9.a aVar2) {
            super(null);
            z65.h(aVar, "currentDaySchedule");
            z65.h(aVar2, "currentlyOpenSchedule");
            this.a = aVar;
            this.b = aVar2;
        }

        public final mv9.a a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            mv9.a aVar = this.a;
            mv9.a aVar2 = this.b;
            return "Open(currentDaySchedule=" + aVar + ", currentlyOpenSchedule=" + aVar2 + ")";
        }
    }

    /* compiled from: ScheduleStatus.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqv9$c;", "Lqv9;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qv9$c */
    /* loaded from: classes4.dex */
    public static final class c extends qv9 {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* compiled from: ScheduleStatus.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqv9$d;", "Lqv9;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qv9$d */
    /* loaded from: classes4.dex */
    public static final class d extends qv9 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    private qv9() {
    }

    public /* synthetic */ qv9(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
