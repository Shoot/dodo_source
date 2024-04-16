package com.dodopizza.order.feature.menu.adapters.menuitem;

import android.widget.ImageView;
import com.dodopizza.order.feature.menu.adapters.menuitem.MenuItemVH;
import com.dodopizza.order.feature.menu.adapters.menuitem.b;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.qd6;
import defpackage.ye6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: D extends ye6
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: BaseMenuItemBinder.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 $*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001\u001aB#\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u001d¢\u0006\u0004\b\"\u0010#J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/b;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;", "VH", "Lye6;", "D", "Loyb;", "data", "view", "", "k", "Lnb6;", "measure", "", "l", "", "position", "j", "(Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;Lye6;I)V", Image.TYPE_MEDIUM, "(Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;)V", "", "", "changes", Image.TYPE_HIGH, "(Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;Lye6;ILjava/util/List;)V", "Lrd6;", "a", "Lrd6;", "listener", "Lkotlin/Function1;", "Landroid/widget/ImageView;", "b", "Lkotlin/jvm/functions/Function1;", "animator", "<init>", "(Lrd6;Lkotlin/jvm/functions/Function1;)V", com.huawei.hms.opendevice.c.a, "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class b<VH extends MenuItemVH, D extends ye6> extends oyb<VH, D> {
    public static final a c = new a(null);
    public static final int d = 8;
    private final rd6 a;
    private final Function1<ImageView, Unit> b;

    /* compiled from: BaseMenuItemBinder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/b$a;", "", "", "ANIMATION_DELAY", "J", "", "CIRCLE_ANIMATION", "Ljava/lang/String;", "", "DESCRIPTION_MAX_LINES", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BaseMenuItemBinder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.dodopizza.order.feature.menu.adapters.menuitem.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0178b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[nb6.values().length];
            try {
                iArr[nb6.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nb6.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[nb6.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseMenuItemBinder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;", "VH", "Lye6;", "D", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ b<VH, D> a;
        final /* synthetic */ D b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b<VH, D> bVar, D d, int i) {
            super(0);
            this.a = bVar;
            this.b = d;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((b) this.a).a.b(this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseMenuItemBinder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;", "VH", "Lye6;", "D", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ b<VH, D> a;
        final /* synthetic */ D b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b<VH, D> bVar, D d, int i) {
            super(0);
            this.a = bVar;
            this.b = d;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((b) this.a).a.a(this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseMenuItemBinder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;", "VH", "Lye6;", "D", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function0<Unit> {
        final /* synthetic */ b<VH, D> a;
        final /* synthetic */ D b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b<VH, D> bVar, D d, int i) {
            super(0);
            this.a = bVar;
            this.b = d;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((b) this.a).a.b(this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseMenuItemBinder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuItemVH;", "VH", "Lye6;", "D", "Landroid/widget/ImageView;", "it", "", "a", "(Landroid/widget/ImageView;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function1<ImageView, Unit> {
        public static final f a = new f();

        static {
        }

        f() {
            super(1);
        }

        public final void a(ImageView imageView) {
            z65.h(imageView, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImageView imageView) {
            a(imageView);
            return Unit.a;
        }
    }

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(rd6 rd6Var, Function1<? super ImageView, Unit> function1) {
        z65.h(rd6Var, "listener");
        z65.h(function1, "animator");
        this.a = rd6Var;
        this.b = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(MenuItemVH menuItemVH, b bVar) {
        z65.h(menuItemVH, "$view");
        z65.h(bVar, "this$0");
        menuItemVH.animate(bVar.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        r1 = defpackage.k0b.k(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(defpackage.ye6 r5, com.dodopizza.order.feature.menu.adapters.menuitem.MenuItemVH r6) {
        /*
            r4 = this;
            re6 r0 = r5.H()
            re6 r1 = defpackage.re6.a
            if (r0 != r1) goto L45
            nb6$a r0 = defpackage.nb6.a
            km8 r1 = r5.a()
            if (r1 == 0) goto L21
            java.lang.String r1 = r1.a()
            if (r1 == 0) goto L21
            java.lang.Integer r1 = defpackage.c0b.k(r1)
            if (r1 == 0) goto L21
            int r1 = r1.intValue()
            goto L22
        L21:
            r1 = -1
        L22:
            nb6 r0 = r0.a(r1)
            boolean r0 = r4.l(r0)
            if (r0 == 0) goto L45
            java.lang.String r0 = r5.getName()
            kl8 r1 = r5.z()
            km8 r5 = r5.a()
            if (r5 != 0) goto L41
            km8 r5 = new km8
            r2 = 3
            r3 = 0
            r5.<init>(r3, r3, r2, r3)
        L41:
            r6.setTitleWithMeasure(r0, r1, r5)
            goto L4c
        L45:
            java.lang.String r5 = r5.getName()
            r6.setTitle(r5)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.order.feature.menu.adapters.menuitem.b.k(ye6, com.dodopizza.order.feature.menu.adapters.menuitem.MenuItemVH):void");
    }

    private final boolean l(nb6 nb6Var) {
        int i;
        if (nb6Var == null) {
            i = -1;
        } else {
            i = C0178b.$EnumSwitchMapping$0[nb6Var.ordinal()];
        }
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oyb
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, int i, List list) {
        h((MenuItemVH) obj, (ye6) obj2, i, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oyb
    public /* bridge */ /* synthetic */ void d(Object obj) {
        m((MenuItemVH) obj);
    }

    public void h(final VH vh, D d2, int i, List<? extends Object> list) {
        z65.h(vh, "view");
        z65.h(d2, "data");
        z65.h(list, "changes");
        if (list.contains("circle_animation")) {
            vh.itemView.postDelayed(new Runnable() { // from class: z70
                @Override // java.lang.Runnable
                public final void run() {
                    b.i(MenuItemVH.this, this);
                }
            }, 200L);
        }
    }

    public void j(VH vh, D d2, int i) {
        String o;
        Integer num;
        z65.h(vh, "view");
        z65.h(d2, "data");
        vh.showImage(d2.y(), ff4.a());
        k(d2, vh);
        kl8 z = d2.z();
        kl8 kl8Var = kl8.i;
        if (z != kl8Var) {
            o = l0b.o(d2.getDescription());
        } else {
            o = d2.w();
        }
        vh.setDescription(o);
        if (d2.z() == kl8Var) {
            num = 5;
        } else {
            num = null;
        }
        vh.setMaxLinesDescription(num);
        vh.setClickListener(new c(this, d2, i));
        qd6.a D = d2.D();
        if (D instanceof qd6.a.C0484a) {
            vh.setOnSelectButtonListener(new d(this, d2, i));
            vh.setAnimator(this.b);
        } else if (D instanceof qd6.a.b) {
            vh.setOnSelectButtonListener(new e(this, d2, i));
            vh.setAnimator(f.a);
        }
        vh.setAvailability(!d2.p());
    }

    public void m(VH vh) {
        z65.h(vh, "view");
        vh.releasePersonalPriceTimer();
    }
}
