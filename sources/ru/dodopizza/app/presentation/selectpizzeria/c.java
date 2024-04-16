package ru.dodopizza.app.presentation.selectpizzeria;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectPizzeriaPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/c;", "", "<init>", "()V", "a", "b", "Lru/dodopizza/app/presentation/selectpizzeria/c$a;", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class c {

    /* compiled from: SelectPizzeriaPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/c$a;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a extends c {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: SelectPizzeriaPresenter.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "Lo8a;", "pizzeriaVOData", "Ld88;", "tappedPizzeria", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lo8a;", com.huawei.hms.opendevice.c.a, "()Lo8a;", "b", "Ld88;", DateTokenConverter.CONVERTER_KEY, "()Ld88;", "<init>", "(Lo8a;Ld88;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b extends c {
        private final o8a a;
        private final d88 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o8a o8aVar, d88 d88Var) {
            super(null);
            z65.h(o8aVar, "pizzeriaVOData");
            this.a = o8aVar;
            this.b = d88Var;
        }

        public static /* synthetic */ b b(b bVar, o8a o8aVar, d88 d88Var, int i, Object obj) {
            if ((i & 1) != 0) {
                o8aVar = bVar.a;
            }
            if ((i & 2) != 0) {
                d88Var = bVar.b;
            }
            return bVar.a(o8aVar, d88Var);
        }

        public final b a(o8a o8aVar, d88 d88Var) {
            z65.h(o8aVar, "pizzeriaVOData");
            return new b(o8aVar, d88Var);
        }

        public final o8a c() {
            return this.a;
        }

        public final d88 d() {
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

    private c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
