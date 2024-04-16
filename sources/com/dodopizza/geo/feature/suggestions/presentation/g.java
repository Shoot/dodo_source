package com.dodopizza.geo.feature.suggestions.presentation;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SuggestedLocation.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/g;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Lcom/dodopizza/geo/feature/suggestions/presentation/g$a;", "Lcom/dodopizza/geo/feature/suggestions/presentation/g$b;", "Lcom/dodopizza/geo/feature/suggestions/presentation/g$c;", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class g {

    /* compiled from: SuggestedLocation.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/g$a;", "Lcom/dodopizza/geo/feature/suggestions/presentation/g;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ldt5;", "a", "Ldt5;", "b", "()Ldt5;", "locality", "Le91;", "Le91;", "()Le91;", "clientDeliveryLocation", com.huawei.hms.opendevice.c.a, "Z", "()Z", "needToEmptyCart", "<init>", "(Ldt5;Le91;Z)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends g implements Serializable {
        private final dt5 a;
        private final e91 b;
        private final boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dt5 dt5Var, e91 e91Var, boolean z) {
            super(null);
            z65.h(dt5Var, "locality");
            z65.h(e91Var, "clientDeliveryLocation");
            this.a = dt5Var;
            this.b = e91Var;
            this.c = z;
        }

        public final e91 a() {
            return this.b;
        }

        public final dt5 b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c);
        }

        public String toString() {
            dt5 dt5Var = this.a;
            e91 e91Var = this.b;
            boolean z = this.c;
            return "DeliverableLocation(locality=" + dt5Var + ", clientDeliveryLocation=" + e91Var + ", needToEmptyCart=" + z + ")";
        }
    }

    /* compiled from: SuggestedLocation.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/g$b;", "Lcom/dodopizza/geo/feature/suggestions/presentation/g;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "formattedAddress", "<init>", "(Ljava/lang/String;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b extends g {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            z65.h(str, "formattedAddress");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && z65.c(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "IncompleteDeliverableLocation(formattedAddress=" + str + ")";
        }
    }

    /* compiled from: SuggestedLocation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/g$c;", "Lcom/dodopizza/geo/feature/suggestions/presentation/g;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c extends g {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    private g() {
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
