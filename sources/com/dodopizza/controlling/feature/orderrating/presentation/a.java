package com.dodopizza.controlling.feature.orderrating.presentation;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: OrderRatingPresenter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0003\bR\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/controlling/feature/orderrating/presentation/a;", "", "", "a", "()Z", "setChecked", "(Z)V", "checked", "b", "Lcom/dodopizza/controlling/feature/orderrating/presentation/a$a;", "Lcom/dodopizza/controlling/feature/orderrating/presentation/a$b;", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
interface a {

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\"\u0010\u000f\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/controlling/feature/orderrating/presentation/a$a;", "Lcom/dodopizza/controlling/feature/orderrating/presentation/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "()Z", "setChecked", "(Z)V", "checked", "<init>", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.controlling.feature.orderrating.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0119a implements a {
        private boolean a;

        public C0119a(boolean z) {
            this.a = z;
        }

        @Override // com.dodopizza.controlling.feature.orderrating.presentation.a
        public boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0119a) && this.a == ((C0119a) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return a91.a(this.a);
        }

        @Override // com.dodopizza.controlling.feature.orderrating.presentation.a
        public void setChecked(boolean z) {
            this.a = z;
        }

        public String toString() {
            boolean z = this.a;
            return "Hidden(checked=" + z + ")";
        }
    }

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/dodopizza/controlling/feature/orderrating/presentation/a$b;", "Lcom/dodopizza/controlling/feature/orderrating/presentation/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Les1;", "a", "Les1;", "b", "()Les1;", MessageAttributes.TYPE, "Z", "()Z", "setChecked", "(Z)V", "checked", "<init>", "(Les1;Z)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class b implements a {
        private final es1 a;
        private boolean b;

        public b(es1 es1Var, boolean z) {
            z65.h(es1Var, MessageAttributes.TYPE);
            this.a = es1Var;
            this.b = z;
        }

        @Override // com.dodopizza.controlling.feature.orderrating.presentation.a
        public boolean a() {
            return this.b;
        }

        public final es1 b() {
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
            if (this.a == bVar.a && this.b == bVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + a91.a(this.b);
        }

        @Override // com.dodopizza.controlling.feature.orderrating.presentation.a
        public void setChecked(boolean z) {
            this.b = z;
        }

        public String toString() {
            es1 es1Var = this.a;
            boolean z = this.b;
            return "Visible(type=" + es1Var + ", checked=" + z + ")";
        }
    }

    boolean a();

    void setChecked(boolean z);
}
