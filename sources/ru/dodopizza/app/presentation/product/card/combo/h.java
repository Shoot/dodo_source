package ru.dodopizza.app.presentation.product.card.combo;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SummaryVO.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\bB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/h;", "", "Lhn6;", "a", "()Lhn6;", "price", "<init>", "()V", "b", "Lru/dodopizza/app/presentation/product/card/combo/h$a;", "Lru/dodopizza/app/presentation/product/card/combo/h$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class h {

    /* compiled from: SummaryVO.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/h$a;", "Lru/dodopizza/app/presentation/product/card/combo/h;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lhn6;", "Lhn6;", "()Lhn6;", "price", "<init>", "(Ljava/lang/String;Lhn6;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends h {
        private final String a;
        private final hn6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, hn6 hn6Var) {
            super(null);
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(hn6Var, "price");
            this.a = str;
            this.b = hn6Var;
        }

        @Override // ru.dodopizza.app.presentation.product.card.combo.h
        public hn6 a() {
            return this.b;
        }

        public String b() {
            return this.a;
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
            String str = this.a;
            hn6 hn6Var = this.b;
            return "ComboSlotSummaryVO(name=" + str + ", price=" + hn6Var + ")";
        }
    }

    /* compiled from: SummaryVO.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/h$b;", "Lru/dodopizza/app/presentation/product/card/combo/h;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lhn6;", "Lhn6;", "()Lhn6;", "price", "<init>", "(Ljava/lang/String;Lhn6;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b extends h {
        private final String a;
        private final hn6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, hn6 hn6Var) {
            super(null);
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(hn6Var, "price");
            this.a = str;
            this.b = hn6Var;
        }

        @Override // ru.dodopizza.app.presentation.product.card.combo.h
        public hn6 a() {
            return this.b;
        }

        public String b() {
            return this.a;
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
            String str = this.a;
            hn6 hn6Var = this.b;
            return "ComboSummaryVO(name=" + str + ", price=" + hn6Var + ")";
        }
    }

    private h() {
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract hn6 a();
}
