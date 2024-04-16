package com.dodopizza.geo.feature.suggestions.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryLocationSuggestionsLiteResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/b;", "", "<init>", "()V", "a", "b", "Lcom/dodopizza/geo/feature/suggestions/presentation/b$a;", "Lcom/dodopizza/geo/feature/suggestions/presentation/b$b;", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class b {

    /* compiled from: DeliveryLocationSuggestionsLiteResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/b$a;", "Lcom/dodopizza/geo/feature/suggestions/presentation/b;", "Le91;", "a", "Le91;", "()Le91;", "clientDeliveryLocation", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "localityId", "<init>", "(Le91;Ljava/lang/String;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends b {
        private final e91 a;
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e91 e91Var, String str) {
            super(null);
            z65.h(e91Var, "clientDeliveryLocation");
            z65.h(str, "localityId");
            this.a = e91Var;
            this.b = str;
        }

        public final e91 a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }
    }

    /* compiled from: DeliveryLocationSuggestionsLiteResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/b$b;", "Lcom/dodopizza/geo/feature/suggestions/presentation/b;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.geo.feature.suggestions.presentation.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0160b extends b {
        public static final C0160b a = new C0160b();

        private C0160b() {
            super(null);
        }
    }

    private b() {
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
