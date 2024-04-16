package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: analytics.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001aF\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¨\u0006\u000f"}, d2 = {"", MessageAttributes.TYPE, "Ldc;", "a", "category", Action.NAME_ATTRIBUTE, "", "price", "status", "", "productsCount", ShoppingInfoEntity.FIELD_PRODUCT_ID, "serverMessage", "currency", "b", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: kd  reason: default package */
/* loaded from: classes4.dex */
public final class kd {

    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kd$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, MessageAttributes.TYPE, this.a, false, 4, null);
        }
    }

    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kd$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ double c;
        final /* synthetic */ String d;
        final /* synthetic */ int e;
        final /* synthetic */ String f;
        final /* synthetic */ String g;
        final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, double d, String str3, int i, String str4, String str5, String str6) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = d;
            this.d = str3;
            this.e = i;
            this.f = str4;
            this.g = str5;
            this.h = str6;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.j(bcVar, this.a);
            bc.e(bcVar, Action.NAME_ATTRIBUTE, this.b, false, 4, null);
            bc.e(bcVar, "price", Double.valueOf(this.c), false, 4, null);
            bc.e(bcVar, "status", this.d, false, 4, null);
            bc.e(bcVar, "productsCount", Integer.valueOf(this.e), false, 4, null);
            bc.e(bcVar, ShoppingInfoEntity.FIELD_PRODUCT_ID, this.f, false, 4, null);
            bc.e(bcVar, "server_message", this.g, false, 4, null);
            bc.e(bcVar, "currency", this.h, false, 4, null);
            return bc.e(bcVar, "user_message", "Some products are sold out or we've run out of ingredients", false, 4, null);
        }
    }

    public static final dc a(String str) {
        z65.h(str, MessageAttributes.TYPE);
        return ec.a("user_flow_error", new a(str));
    }

    public static final dc b(String str, String str2, double d, String str3, int i, String str4, String str5, String str6) {
        z65.h(str, "category");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "status");
        z65.h(str4, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str5, "serverMessage");
        z65.h(str6, "currency");
        return ec.a("cart_item_in_stop_error", new b(str, str2, d, str3, i, str4, str5, str6));
    }
}
