package com.dodopizza.geo.feature.deliveryaddresslist.presentation;

import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import kotlin.Metadata;
/* compiled from: OnDeliveryLocationSetToStateListener.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH&\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d;", "", "Le91;", "clientDeliveryLocation", "", "setDeliveryOrderType", "Lsk9;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d$a;", "a", "(Le91;Z)Ljava/lang/Object;", "", "b", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface d {

    /* compiled from: OnDeliveryLocationSetToStateListener.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "a", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", "<init>", "(Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private final a.b a;

        public a(a.b bVar) {
            z65.h(bVar, "stateError");
            this.a = bVar;
        }

        public final a.b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && z65.c(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            a.b bVar = this.a;
            return "SetToStateResult(stateError=" + bVar + ")";
        }
    }

    Object a(e91 e91Var, boolean z);

    void b();
}
