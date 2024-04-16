package ru.dodopizza.app.presentation.selectpizzeria.combined;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "", "<init>", "()V", "a", "b", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class f {

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/f$a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends f {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lo8a;", "a", "Lo8a;", "()Lo8a;", "pizzeriaVOData", "Ld88;", "b", "Ld88;", "()Ld88;", "tappedPizzeria", "<init>", "(Lo8a;Ld88;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b extends f {
        private final o8a a;
        private final d88 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o8a o8aVar, d88 d88Var) {
            super(null);
            z65.h(o8aVar, "pizzeriaVOData");
            this.a = o8aVar;
            this.b = d88Var;
        }

        public final o8a a() {
            return this.a;
        }

        public final d88 b() {
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
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            d88 d88Var = this.b;
            if (d88Var == null) {
                hashCode = 0;
            } else {
                hashCode = d88Var.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            o8a o8aVar = this.a;
            d88 d88Var = this.b;
            return "PizzeriaListData(pizzeriaVOData=" + o8aVar + ", tappedPizzeria=" + d88Var + ")";
        }
    }

    private f() {
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
