package com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.adapter;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProductImage.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\tB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/b;", "", "", "a", "I", "()I", "placeholderResId", "<init>", "(I)V", "b", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/b$a;", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/b$b;", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class b {
    private final int a;

    /* compiled from: ProductImage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/b$a;", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/b;", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "firstImageUrl", c.a, DateTokenConverter.CONVERTER_KEY, "secondImageUrl", "Lb78;", "Lb78;", "()Lb78;", "pizzaConcept", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb78;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends b {
        private final String b;
        private final String c;
        private final b78 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, b78 b78Var) {
            super(ff4.a(), null);
            z65.h(str, "firstImageUrl");
            z65.h(str2, "secondImageUrl");
            z65.h(b78Var, "pizzaConcept");
            this.b = str;
            this.c = str2;
            this.d = b78Var;
        }

        public final String b() {
            return this.b;
        }

        public final b78 c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }
    }

    /* compiled from: ProductImage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/b$b;", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistory/adapter/b;", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "imageUrl", "", "placeholderResId", "<init>", "(Ljava/lang/String;I)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.adapter.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0210b extends b {
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0210b(String str, int i) {
            super(i, null);
            z65.h(str, "imageUrl");
            this.b = str;
        }

        public final String b() {
            return this.b;
        }
    }

    public /* synthetic */ b(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int a() {
        return this.a;
    }

    private b(int i) {
        this.a = i;
    }
}
